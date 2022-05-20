# Propunere de lucru pentru specificatia tehnica de interconectare a sistemului POSF cu furnizorii si operatorii

Documentatia detaliata a tuturor tipurilor de elemente o puteti descarca in format PDF de aici [Schema PDF](./ANRESchema.pdf)

Schema de ansamblu prezentata in cadrul sedintei tehnice o regasim mai jos.  Mentionez ca aceasta schema este cu titlu de concept de schimb de mesaje, fluxurile desenate ne fiind cele finale care vor fi implementate conform regulamentului.

![BigPicture](images/bigpicture.png)

.


In fisierul [ANRESchema.xsd](ANRESchema.xsd) este definitia schemei entitatilor si mesajelor propuse, primul mesaj care are o schema aproape completa este ilustrat in imagidea nde mai jos. 
```
PlaceCreatedByOperator
```
![PlaceCreatedByOperator](doc/ANRESchema_p43.png)

Tipurile de elemente definite in fisierul XSD va fi folosit pentru comunicarea prin mesaje in format XML sau JSON cu sistemul POSF. Prezentam o diagrama a acestor tipuri.

![Diagrama tipuri de elemente](img/typesdiagram.png) 

# Tipuri de cozi de mesaje in POSF

Pentru fiecare actor care interactioneaza cu API POSF se vor crea 2 cozi de mesaje prin care se va comunica, cozi de mesaje gestionate in tehnologia Kafka.
![Kafka pub/sub](https://docs.cloudera.com/documentation/enterprise/6/6.3/images/kafka_topics.png)

- POSF.Operator1.IN - este o coada de mesaje unde scrie Operator1 iar POSF  citeste
- POSF.Operator1.OUT - este o coada de mesaje unde scrie POSF iar Operator1 citeste

Unde Operator1 este codul individualizat al fiecarui actor de tip furnizor sau operator.

Cozile de mesaje sunt accesate folosind un API de interogare (post/pool) pentru care exista un sample care poate fi instalat local [aici SAMPLE API](samples/python/). Metoda push va scrie in coada .IN iar metoda pool va citi din coada .OUT. Recomandam instalarea locala a sample-ului si exersarea metodelor pentru a transmite feedback cu privire la necesitatile tehnologice identificare.

![API sistem](images/apiInterface.png) 

Sistemul POSF va fi responsabil cu rutarea mesajelor intre cozile de mesaje ale furnizorilor, operatorilor precum si interfata Web pusa la dispozitie clientilor. 

## Exemplu in Java

Gasiti [aici un exemplu](samples/java/)  de conectare la API POSF prin intermediul limbajului de programare Java. In cod veti vedea cum se introduce user/parola, se obtine un token de acces si apoi se inteogheaza lista furnizorilor. 

# Mesajele vehiculate in sistem

Toate mesajele au o structura comuna derivata din tipul **Message** care reprezinta un header comun compus din urmatoarele campuri

|Camp|Explicatie|
|:--|:--|
|authorID|ID asignat de POSF pentru sistemul IT care emite mesajul|
|authorName|Nume de cod asignat de POSF pentru sistemul IT care emite mesajul|
|correlationID|ID unic (guid) atribuit de cel care initiaza sesiunea de comunicare cu POSF, folosit ulterior de cei care raspund la mesaje din cadrul aceleiasi discutii virtuale. De exemplu cand se publica un contract semnat de client, pentru o usoara urmarire a tranzactiei pe termen lung, se va genere un ID unic care va fi utilizat in raspunsul din partea sistemelor furnizorului sau operatorului. Un ID de corelare, cunoscut și sub numele de ID de tranzit, este o valoare de identificare unică care este atașată solicitărilor și mesajelor care permit referirea la o anumită tranzacție sau lanț de evenimente.|
|description|Descriere in text liber al mesajului|
|messageID|identificator unic al mesajului in format GUID|
|timestamp|data ora minut secunda la care a fost emis creat mesajul|
|type|Tipul mesajului, va fi identic cu numele tag-ului Root al mesajului XML: ContractSignedByClient, PlaceCreatedByOperator, etc.|


# Tipuri de mesaje, emitatori si receptori

Diagrama de mai jos prezinta tipurile de mesaje care pot fi trimise/receptionate prin POSF. Detaliem pentru detaliem fiecare clasa de mesaje in tebele mai jos.

![tipurilor de mesaje](img/messagesdiagram.png)

## Mesaje pe tema locuri de consum

| Denumire mesaj | Scop | Sursa | Redirectionat la | Observatii |
|:--|:------|:--|:--|:--|
|PlaceCreatedByOperator|Instiintare trimisa catre POSF despre crearea unui nou loc de consum|Operatorul|Nimeni|Art 25, literia i |
|PlaceUpdatedByOperator|Instiintare trimisa catre POSF despre actualizare loc de consum|Operatorul|Nimeni|Art 25, literia j |
|PlaceDisconnectedByOperator|Instiintare trimisa catre POSF despre deconectare loc de consum|Operatorul|Nimeni|Art 25, literia j |

## Mesaje pe tema contracte de furnizare

| Denumire mesaj | Scop | Sursa |  Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|ContractSignedBySupplier|Instiintare despre contract semnat de furnizor, dupa ce a semnat in prealabil si clientul fie la ghiseu fie prin aplicatia furnizorului. Se emite si cand furnizorul deruleaza procesul de semnare in afara platformei POSF, doar cand contractul a fost semnat semnat de ambele parti.| Furnizor,WebPOSF | Operator, WebPOSF|Art 27, litera g |
|ContractSignedByClient|Instiintare despre contract semnat de client in aplicatia WebPOSF| WebPOSF | Furnizor| |
|ContractCancelledByClient|Se emite din aplicatia WebPOSF cand un utilizator s-a razgandit in timp ce trimisese deja semnat la furnizor un contract sau daca vrea sa renunte la un contract existent.| WebPOSF | Furnizor| |
|ContractCancelledBySupplier|Se emite din aplicatia WebPOSF sau sistemul furnizorului cand un furnizor s-a razgandit pe un contract semnat sau vrea sa anuleze un contract existent.| Furnizor, WebPOSF | Operator, WebPOSF| |
|ContractMoreInfo|Trimis de furnizor/operator care solicita mai multe informatii de la cealalta parte.| Furnizor, WebPOSF | Furnizor, WebPOSF| |
|ContractChangedInfo|Emis de oricare din partile contractului la momentul actualizarii de informatii care nu au impact in fluxurile informatice|Oricine este prezent in contract|Toti cei mentionati in contract| |

## Mesaje pe tema contracte de retea exclusiv pentru cazul in care clientul opteaza o relatie directa cu operatorul

| Denumire mesaj | Scop | Sursa  | Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|ContractNetworkSignedByClient|Emis din WebPOSF cand se semneaza contractul de retea de catre Client|WebPOSF, Operator|WebPOSF, Furnizor| |
|ContractNetworkSignedByOperator|Emis din WebPOSF/platforma Operator cand se semneaza contractul de retea de catre Operator. Pentru tipul de contract TRANSPORT doar operatorul emite, ceilalti doar iau nota de mesaj.|Operator|WebPOSF, Furnizor| |
|ContractNetworkSignedBySupplier|Emis de Furnizor din sistemul propriu sau WebPOSF cand se semneaza contractul de retea de catre Furnizor|WebPOSF, Supplier|WebPOSF,Operator| |
|ContractNetworkCancelledByOperator|Emis din WebPOSF/platforma Operator cand se doreste anularea contractului de retea cu clientul sau cu Furnizorul|WebPOSF, Operator|WebPOSF, Operator, Supplier| |
|ContractNetworkChangedInfo|Emis de oricare din partile contractului de retea la momentul actualizarii de informatii care nu au impact in fluxurile informatice|Oricine este prezent in contractul de retea|Toti cei mentionati in contractul de retea| |

## Mesaje pe tema FUI

| Denumire mesaj | Scop | Sursa |  Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|ContractSuspendedByAnre|Emis de WebPOSF cand un key user al ANRE introduce faptul ca unui furnizor i s-a suspendat licenta|WebPOSF|WebPOSF, Furnizor, Operator| |
|ContractActivatedByANRE|Emis de WebPOSF cand un key user al ANRE introduce faptul ca unui furnizor i s-a activat licenta|WebPOSF|WebPOSF, Furnizor, Operator| |
|ContractTransferredToFUIByOperator|Emis de WebPOSF / platforma operator cand un angajat al operatorului introduce faptul ca un furnizor se afla in imposibilitate de furnizare|WebPOSF, Operator|WebPOSF, Furnizor, Operator| |
|ContractTransferredToFUIByAnre|Emis de WebPOSF cand un key user ANRE introduce faptul ca in contract se transfera la FUI|WebPOSF|WebPOSF, Furnizor, Operator| |

## Mesaje pe tema conventiilor

| Denumire mesaj | Scop | Sursa |  Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|ConventionSignedByOperator|Emis de WebPOSF/platforma operatorului cand a semnat operatorul conventia|WebPOSF, Operator|WebPOSF, Furnizor, Operator| |
|ConventionSignedByClient|Emis de WebPOSF cand a semnat clientul conventia|WebPOSF|WebPOSF, Furnizor, Operator| |
|ConventionSignedBySupplier|Emis de WebPOSF.platforma furnizor cand a semnat furnizorul conventia|WebPOSF, Furnizor|WebPOSF, Furnizor, Operator| |
|ConventionChangedInfo|Emis de oricare din partile conventiei la momentul actualizarii de informatii care nu au impact in fluxurile informatice|Oricine este prezent in conventie|Toti cei mentionati in conventie| |

## Mesaje specifice furnizorilor/operatorilor

| Denumire mesaj | Scop | Sursa |  Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|SupplierChangedInfo|Emis de WebPOSF/platforma furnizorului cand s-au schimbat date de identificare/persoane/adresa|WebPOSF, Furnizor|WebPOSF,  toti operatorii, toti furnizorii| |
|OperatorChangedInfo|Emis de platforma operatorului cand s-au schimbat date de identificare/persoane/adresa|Operator|WebPOSF,  toti operatorii, toti furnizorii| |


# Mesajul ContractNetworkSignedBySupplier

Diagrama de mai jos prezinta fluxul pe care mesajul ContractNetworkSignedBySupplier il parcurge in interiorul sistemului POSF, de la receptie in coada POSF.Supplier.IN pana cand este transmis in cozile de mesaje ale aplicatiei Web si ale operatorului respectiv.

![ContractNEtworkSignedBySupplier diagram](images/messagepath.png)

# Inrolarea in sistem, migrarea datelor existente

Inrolarea unui nou operator/furnizor in sistem presupune optinerea datelor de conectare pentru persoana juridica (user/parola/identificator unic) urmata de introducerea in sistem a datelor pe care ecesta le detine, date care se afla sub incidenta regulamentului, cum ar fi: contracte, locuri de consum, etc.

Procedura de migrare date existente presupune transmiterea de mesaje pentru toate informatiile pe care furnizorul/operatorul le detine, unul cate unul, folosind cateva mesaje specifice care se presupune ca nu vor genera fluxuri informationale in sistemele tertilor.

De exemplu, se vor trimite toate locurile de consum existente ale unui operator care se inroleaza in sistem, prin intermediul mesajului PlaceUpdatedByOperator, unul cate unul. Pentru fiecare din aceste mesaje trimise, sistemul informatic al furnizorului/operatorului va memora identificatorul unic returnat de POSF ca dovada a transmisiei ("responseID"). 
Pentru a marca mesajele care provin din procesul de inrolare/migrare recomandam ca pe mesajele care incarca date existente in sistemul informatic, sa se foloseasca campul "info" din structura mesajului unde se va completa cu textul "INIT". 

Mesaje folosite pentru a incarca date in sistem, fara a presupune ca aceste mesaje declanseaza fluxuri in POSF sau in alte sisteme:

|Eveniment|Mesaj folosit|Observatii|
|:--|:--|:--|
|Incarcare contract existent|ContractChangedInfo|Se completeaza campul "info" cu textul "INIT"|
|Incarcare loc de consum existent|PlaceUpdatedByOperator|Se completeaza campul "info" cu textul "INIT"|
|Incarcare contract de retea existent|ContractNetworkChangedInfo|Se completeaza campul "info" cu textul "INIT"|
|Incarcare conventie existenta|ConventionChangedInfo|Se completeaza campul "info" cu textul "INIT"|

# Fisiere atasate entitatilor

Tipurile de date Contract si Place pot fi insotite de fisiere atasate. Recomandam folosirea de fisiere in standard deschis care sa poata fi vizualizate pe orice dispozitiv electronic fara a instala software suplimentar.
Fisiere acceptate sunt: PDF, PNG, JPG, ZIP

Pentru a atasa un fisier la un mesaj se va scrie in campul URL al entitatilor Place sau Contract adresa de unde acest fisier se poate descarca. Adresa este de forma https://adresa.emitent.mesaj/adresa/unde/este/fisierul/idunicgeneratsiobfuscatpentrudownload.zip

## Conventii de stocare si acces la fisiere

1. Fisierele atasate la mesajele emise vor fi stocate pe sistemul IT al emitentului.
2. Fisierele stocate pe platforma POSF pot fi accesate de browsere/clienti autentificati si autorizati sa acceseze informatiile respective, conform emitentului si regulilor de securitate implementate in POSF.
3. Fisierele stocate pe platformele IT ale furnizorilor/operatorilor vor fi protejate prin limitarea accesului de la adresa IP a POSF si obligativitatea prezentarii unui certificat digital client pentru orice solicitare de acces. Certificatul va fi unic, emis de POSF si prezentat in format cheie publica tuturor furnizorilor/operatorilor il gasiti aici [CERTIFICAT ACCES FISIERE](samples/client-posf.pem)
4. Durata de stocare a fisierelor este de minim 120 de zile astfel incat sa poata fi descarcate de sistemele care interactioneaza cu aceste mesaje.
5. POSF va intermedia printr-un API de tip reverse-proxy accesul la fisierele stocate de catre furnizori in sistemele lor, astfel incat sa garantam accesul persoanelor autorizate prin POSF la orice document atasat mesajelor din POSF.
6. Accesul la porxy va fi limitat la adresele de IP ale furnizorilor inregistrati in POSF.

## Adresa pentru descarcarea fisierelor atasate entitatilor

Daca in entitatea Contract regasim url: https://electricandgas-romania.eu/somefolder/otherfolder/file.zip , atunci orice furnizor care doreste sa descarce acest fisier va apela url-ul urmator, dupa ce s-a autentificat in POSF, pe canal SSL: https://posf-beta.anre.ro/broker/file/electricandgas-romania.eu/somefolder/otherfolder/file.zip

Aceasta adresa din sistemele IT ale furnizorilor (https://electricandgas-romania.eu/somefolder/otherfolder/file.zip) nu va returna nimic pentru o solicitare de acces de la un tert (HTTP 400) care nu are adresa de IP a POSF si care nu prezinta certificatul digital al POSF.

# Formatul valorilor

|Tip camp|Format|Exemplu|Observatii|
|:---|:---|:------|:------|
|date|YYYY-MM-DD|2022-03-14| |
|datetime|ISO-8601|2022-03-14T05:51:28+0000||
|decimal|numar cu zecimale|123.456, +1234.456, -1234.456, -.456, or -456.|Numar cu separator de zecimale . si fara separator la mii sau spatii|
|boolean|sir de caractere|true, false|cu litere mici, fara spatii|
|string|sir de carcatere|Strada Morii, Calea Floreasca, |Fara spatii la inceput sau la sfarsit|
|uuid/guid|xxxxxxxx-xxxx-Mxxx-Nxxx-xxxxxxxxxxxx|123e4567-e89b-12d3-a456-426614174000|In its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens). |




