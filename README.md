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
|ContractSignedBySupplier|Instiintare despre contract semnat de furnizor, dupa ce a semnat in prealabil si clientul fie la ghiseu fie prin aplicatia furnizorului. Se emite si cand furnizorul deruleaza procesul de semnare in afara platformei POSF, doar cand contractul a fost semnat semnat de ambele parti.| Furnizor,WebPOSF | Operator, WebPOSF, Furnizor vechi|Art 27, litera g |
|ContractSignedByClient|Instiintare despre contract semnat de client in aplicatia WebPOSF| WebPOSF | Furnizor nou, Furnizor vechi, Operator| |
|ContractCancelledByClient|Se emite din aplicatia WebPOSF cand un utilizator s-a razgandit in timp ce trimisese deja semnat la furnizor un contract sau daca vrea sa renunte la un contract existent.| WebPOSF | Furnizor| |
|ContractCancelledBySupplier|Se emite din aplicatia WebPOSF sau sistemul furnizorului cand un furnizor s-a razgandit pe un contract semnat sau vrea sa anuleze un contract existent.| Furnizor, WebPOSF | Furnizor vechi, Operator, WebPOSF| |
|ContractMoreInfo|Trimis de furnizor care solicita mai multe informatii de la cealalta parte.| Furnizor, WebPOSF modul furnizor | WebPOSF modul client| |
|ContractChangedInfo|Emis de oricare din partile contractului la momentul actualizarii de informatii care nu au impact in fluxurile informatice|Oricine este prezent in contract|Toti cei mentionati in contract| |

## Mesaje pe tema contracte de retea exclusiv pentru cazul in care clientul opteaza o relatie directa cu operatorul

| Denumire mesaj | Scop | Sursa  | Redirectionat la | Observatii |
|:-|:---------|:-|:-|:-|
|ContractNetworkSignedByClient|Emis din WebPOSF cand se semneaza contractul de retea de catre Client|WebPOSF, Operator|WebPOSF, Furnizor| |
|ContractNetworkSignedByOperator|Emis din WebPOSF/platforma Operator cand se semneaza contractul de retea de catre Operator. Pentru tipul de contract TRANSPORT doar operatorul emite, ceilalti doar iau nota de mesaj.|Operator|WebPOSF, Furnizor| |
|ContractNetworkSignedBySupplier|Emis de Furnizor din sistemul propriu sau WebPOSF cand se semneaza contractul de retea de catre Furnizor|WebPOSF, Supplier|WebPOSF,Operator| |
|ContractNetworkCancelledByOperator|Emis din WebPOSF/platforma Operator cand se doreste anularea contractului de retea cu clientul sau cu Furnizorul|WebPOSF, Operator|WebPOSF, Operator, Supplier| |
|ContractNetworkChangedInfo|Emis de oricare din partile contractului de retea la momentul actualizarii de informatii. De exemplu cand intre Operator si Furnizor exista deja un contract de retea, adaugarea unui loc de consum in cadrul contractului respectiv se va face prin emiterea de catre operator a acestui mesaj completand supplier si previousSupplier. [A se vedea discutia din sedinta Zoom la minutul 53 ](https://youtu.be/UfvUjwTwRrA?t=3221).|Oricine este prezent in contractul de retea. |Toti cei mentionati in contractul de retea (CA daca are contract direct, FA, FN)| |

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

# Exemplu de flux pornind de la ContractSignedBySupplier

Dupa ce se emite mesajul ContractSignedBySupplier, avem urmatoarele mesaje:

1. Daca exista contract de retea intre CF si OR sau FN si OR, se emite ContractNetworkChangedInfo, adica se adauga locul de consum la contractul de retea existent
2. Daca nu exista contract de retea intre CF si OR sau FN si OR, iar CF vrea direct cu OR, se emit mesajele 
ContractNetworkSignedByClient si ContractNetworkSignedByOperator
3. Daca nu exista contract de retea intre CF si OR sau FN si OR, iar serviciul de retea se realizeaza prin FN, se emit mesajele ContractNetworkSignedBySupplier si ContractNetworkSignedByOperator


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

# Medii de testare/staging/productie

POSF este alcătuit din 3 medii:
|Denumire	|Descriere|	Date continue|
|:--|:--|:--|
|Mediu de test|	un sistem IT de încercări, teste si instruire pentru oricine dorește sa își pregătească societatea in vederea înrolării in POSF.|	Date de test, anonimizate|
|Mediu de staging|	un sistem IT in care societățile economice înrolate in POSF își pot conecta propriile sisteme IT in vederea testării  finale înaintea operaționalizării propriilor sisteme sau a modificărilor aduse acestora in decursul timpului| 	Locuri de consum reale, câteva contracte (nu toate), societăți economice reale|
|Mediul de producție|	Un sistem IT in care societățile economice licențiate si autorizate de ANRE sa publice in POSF pot interacționa cu acesta.|	Datele la zi publicate de toate societățile interconectate|

# Componente mediu POSF

|Denumire|	Descriere|
|:--|:--|
|Broker API (denumit in documentație si POSF)|	Expune către sistemele IT ale societăților comerciale o tehnologie de interconectare standard REST/XML/JSON|
|Aplicație Web (denumita in documentație WebPOSF)| compusa din:|	
|-	Modul Client|	Destinat clienților finali|
|-	Modul Furnizor|	Destinat furnizorilor mici care nu doresc interconectarea cu Broker API|
|-	Modul Operator|	Destinat operatorilor mici care nu doresc interconectarea cu Broker API|
|-	Modul ANRE|	Destinat personalului ANRE|

# Din ce este compus un sistem IT al unei societăți care dorește sa interacționeze cu POSF prin Broker API 

|Modul|	Scop|
|:--|:--|
|Receptor de mesaje|	Interoghează periodic sistemul POSF pentru a verifica daca exista mesaje pentru societate si le salvează într-o baza de date proprie.|
|Transmițător de mesaje|	Transmite mesaje in POSF la apariția evenimentelor specifice in cadrul organizației societății comerciale (semnare contract, înființare loc de consum, etc.)|
|Formulare PDF|	Se încarcă odată cu fiecare oferta din comparatorul ANRE pentru a fi completate automat de aplicația WebPOSF la momentul semnării contractului de către client (format PDF)|
|Mediu de stocare fișiere expus la POSF|	Expune către POSF contractele si anexele semnate de către angajații societății astfel încât sa poată fi descărcate printr-un canal securizat.|


# Etape de parcurs pentru integrarea in POSF prin Broker API :

|Etapa|	Descriere|
|:--|:-----|
|1.	Consultare documentație tehnica publica|	Documentația tehnica de acces este disponibil ala adresa https://github.com/posfgit/standard/ unde regăsiți un forum de discuții numit Issues. In cadrul forumului sunt multe întrebări si răspunsuri prin care va invitam sa căutați răspunsuri înainte sa adresați întrebări noi.|
|2.	Solicitare utilizator/parola de acces in mediul de test|Solicitarea pentru mediul de acces se face conform instrucțiunilor disponibile public aici https://github.com/posfgit/standard/issues/18|
|3.	Publicare mesaje in POSF|	Se vor publica mesaje in mediul de test conform instrucțiunilor disponibile la adresa https://github.com/posfgit/standard/blob/main/TestEnvironment.md, in vederea încărcării bazei de date de test cu elemente de tip Locuri de consum si Contracte semnate.|
|4.	Citire mesaje din POSF|	Se vor citi mesaje in mediul de test conform instrucțiunilor disponibile la adresa https://github.com/posfgit/standard/blob/main/TestEnvironment.md si se vor verifica fluxurile interne ale sistemelor IT proprii in vederea verificării ca acestea răspund corespunzător si declanșează sau nu fluxuri specifice |
|5.	Teste încrucișate|	In perechi (furnizor-furnizor) sau (furnizor-operator) se fac teste de transmitere si recepție mesaje de tipul ContractSignedBySupplier in vederea verificării faptului ca mesajele transmise de FN ajung la FA si OR.|
|6.	Teste cu ANRE|	Se solicita ANRE verificarea testelor efectuate la pasul 5.|
|7.	Încărcare mediu staging|	Se solicita acces ANRE in vederea conectării cu mediul de staging unde societatea comerciala își conectează propriul sistem de staging si publica in POSF toate contractele si locurile de consum active|
|8.	Verificare finala staging|	Se solicita ANRE o verificare finala a integrării pe mediul de staging dupa ce baza de date a societății comerciale a ajuns la zi cu informațiile de transmis in POSF|
|9.	Avizare tehnica interconectare API|	ANRE avizeaza din punct de vedere tehnic societatea comerciala sa integreze sistemul in mediul de producție POSF, modifica ofertele comerciale din comparator pentru a fi transferate prin sistemul Broker API, transmite credentiale pentru API la mediul de productie. Societatea se conecteaza la mediul de productie si incepe transmiterea contractelor active si a locurilor de consum active precum si orice noua informatie care apare.|


# Cateva consideratii despre Adrese 

Informatiile de tip adresa au campurile descrise in schema XSD. Adresele presupun urmatoarele elemente obligatorii:
1. Judet
2. Oras (conform codificare SIRUTA)
3. Nume drum (strada, cale, bulevard)
4. Numar drum (12B, 15A)

si urmatoarele elemente optionale
1. Cladire (bloc, pavilion, corp)
2. Scara
3. Etaj
4. Apartament
5. Cod postal
6. Pozitie (coordonare GPS)

informatii de identificare unica
1. cua (cod unic adresa - string)
2. authorId - id unic al autorului acestei adrese
3. cuaAuthor - id unic al adresei din sistemul IT al autorului

Adresele vor fi incarcate in sistemul POSF din urmatoarele surse:
1. Furnizori/Operatori
2. Aplicatia WebPOSF avand ca sursa principala RENNS de la ANCPI sau free text.

Aplicatia WebPOSF va completa campul "cua" - cod unic de adresa conform nomenclatorului RENNS astfel incat sa garanteze unicitatea oricarei adrese.

ATENTIE! In situatia in care Operatorii/Furnizorii doresc ca aplicatia WebPOSF sa prezinte potentialilor clienti adrese astfel incat sa fie alese si nu scrise "free text" solicitam furnizorilor / operatorilor sa incarce adresele din bazele lor de date in sistemul POSF folosind mesajele AddresChangedInfo completand campurile authorId si cuaAuthor. Astfel sistemul POSF va marca campul adresa cu identificatorul guid al autorului pentru o regasire usoara. Sistemul POSF va prelua adresele transmise de furnizori in mesajele ContractSignedBySupplier si ContractChangedInfo daca adresele au completate authorId si cuaAuthor.

Stabilim urmatoarele conventii:
1. Daca o adresa are "cua" completat ea este originara din sistem RENNS.
2. Daca o adresa are authorId ea este orginara din sistemul cu ID-ul respectiv (furnizor/operator/etc.) iar pentru a stabili unicitatea se foloseste campul cuaAuthor
3. Adresele care au authorId id-ul aplicatiei WebPOSF sunt adrese scrise free text, probabil pentru ca utilizatorul nu le-a regasit in RENNS si nici printre adresele introduse de furnizori in prealabil.

# Formatul valorilor

|Tip camp|Format|Exemplu|Observatii|
|:---|:---|:------|:------|
|date|YYYY-MM-DD|2022-03-14| |
|datetime|ISO-8601|2022-03-14T05:51:28+0000||
|decimal|numar cu zecimale|123.456, +1234.456, -1234.456, -.456, or -456.|Numar cu separator de zecimale . si fara separator la mii sau spatii|
|boolean|sir de caractere|true, false|cu litere mici, fara spatii|
|string|sir de carcatere|Strada Morii, Calea Floreasca, |Fara spatii la inceput sau la sfarsit|
|uuid/guid|xxxxxxxx-xxxx-Mxxx-Nxxx-xxxxxxxxxxxx|123e4567-e89b-12d3-a456-426614174000|In its canonical textual representation, the 16 octets of a UUID are represented as 32 hexadecimal (base-16) digits, displayed in five groups separated by hyphens, in the form 8-4-4-4-12 for a total of 36 characters (32 hexadecimal characters and 4 hyphens). |




