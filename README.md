# Propunere de lucru pentru specificatia tehnica de interconectare a sistemului POSF cu furnizorii si operatorii

Documentatia generata in format PDF poate fi accesata aici [Schema PDF](./ANRESchema.pdf)

Schema de ansamblu prezentata in cadrul sedintei tehnice o regasim mai jos.  Mentionez ca aceasta schema este cu titlu de concept de schimb de mesaje, fluxurile desenate ne fiind cele finale care vor fi implementate conform regulamentului.

![BigPicture](images/bigpicture.png)

.


In fisierul [ANRESchema.xsd](ANRESchema.xsd) este definitia schemei entitatilor si mesajelor propuse, primul mesaj care are o schema aproape completa este ilustrat in imagidea nde mai jos.
```
PlaceCreatedByOperator
```
![PlaceCreatedByOperator](doc/ANRESchema_p43.png)


# Tipuri de cozi de mesaje in POSF

Pentru fiecare actor care interactioneaza cu API POSF se vor crea 2 cozi de mesaje prin care se va comunica, cozi de mesaje gestionate in tehnologia Kafka.
![Kafka pub/sub](https://docs.cloudera.com/documentation/enterprise/6/6.3/images/kafka_topics.png)

- POSF.Operator1.IN - este o coada de mesaje unde scrie Operator1 iar POSF  citeste
- POSF.Operator1.OUT - este o coada de mesaje unde scrie POSF iar Operator1 citeste

Unde Operator1 este codul individualizat al fiecarui actor de tip furnizor sau operator.

Cozile de mesaje sunt accesate folosind un API de interogare (post/pool) pentru care exista un sample care poate fi instalat local [aici SAMPLE API](samples/python/). Metoda push va scrie in coada .IN iar metoda pool va citi din coada .OUT. Recomandam instalarea locala a sample-ului si exersarea metodelor pentru a transmite feedback cu privire la necesitatile tehnologice identificare.

![API sistem](images/apiInterface.png) 

Sistemul POSF va fi responsabil cu rutarea mesajelor intre cozile de mesaje ale furnizorilor, operatorilor precum si interfata Web pusa la dispozitie clientilor. 

# Mesajele vehiculate in sistem

Toate mesajele au o structura comuna derivata din tipul **Message** care reprezinta un header comun compus din urmatoarele campuri

|Camp|Explicatie|
|:--|:--|
|authorID|ID asignat de POSF pentru sistemul IT care emite mesajul|
|authorName|Nume de cod asignat de POSF pentru sistemul IT care emite mesajul|
|description|Descriere in text liber al mesajului|
|messageID|identificator unic al mesajului in format GUID|
|timestamp|data ora minut secunda la care a fost emis creat mesajul|

# Tipuri de mesaje, emitatori si receptori

| Denumire mesaj | Scop | Sursa | Destinatie | Redirectionat la | Observatii |
|:--|:------|:--|:--|:--| :--|
|PlaceCreatedByOperator|Instiintare POSF despre un nou loc de consum|Operatorul|POSF|Nimeni| |
|ContractSignedBySupplier|Instiintare despre contract semnat de furnizor, dupa ce a semnat clientul| Furnizor,WebPOSF | POSF | Operator, WebPOSF| |
|ContractNetworkSignedByClient|Contract de retea semnat de client|WebPOSF, Operator|POSF|WebPOSF,Furnizor| |
|ContractNetworkSignedByOperator|Contract de retea semnat de client|Operator|POSF|WebPOSF,Furnizor| |
|ContractNetworkSignedBySupplier|Contract de retea semnat de client|WebPOSF, Supplier|POSF|WebPOSF,Operator| |


# Mesajul ContractNetworkSignedBySupplier

Diagrama de mai jos prezinta fluxul pe care mesajul ContractNetworkSignedBySupplier il parcurge in interiorul sistemului POSF, de la receptie in coada POSF.Supplier.IN pana cand este transmis in cozile de mesaje ale aplicatiei Web si ale operatorului respectiv.

![ContractNEtworkSignedBySupplier diagram](images/messagepath.png)

# Formatul valorilor

|Tip camp|Format|Exemplu|Observatii|
|:---|:---|:------|:------|
|date|YYYY-MM-DD|2022-03-14| |
|datetime|ISO-8601|2022-03-14T05:51:28+0000||
|decimal|numar cu zecimale|123.456, +1234.456, -1234.456, -.456, or -456.|Numar cu separator de zecimale . si fara separator la mii sau spatii|
|boolean|sir de caractere|true, false|cu litere mici, fara spatii|
|string|sir de carcatere|Strada Morii, Calea Floreasca, |Fara spatii la inceput sau la sfarsit|




