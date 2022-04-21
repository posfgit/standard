# Instructiuni de folosire a mediului de test

Pentru a pune la dispozitia furnizorilor si operatorilor a unei modalitati de verificare a implementarii standardului POSF, am configurat la adresa https://posf-beta.anre.ro/broker un API de acces la un sistem de test.

## Scurta prezentare a mediului de test

Mediul de test este compus din urmatoarele subsisteme:
- subsistem de management al identitatii Keycloak https://posf-beta.anre.ro/auth/
- subsistem de gestiune a cozilor de mesaje Kafka (accesibil doar prin API)
- API REST pentru 

Documentatia generata in format PDF poate fi accesata aici [Schema PDF](./ANRESchema.pdf)

Schema de ansamblu prezentata in cadrul sedintei tehnice o regasim mai jos.  Mentionez ca aceasta schema este cu titlu de concept de schimb de mesaje, fluxurile desenate ne fiind cele finale care vor fi implementate conform regulamentului.

![BigPicture](images/bigpicture.png)

.


In fisierul [ANRESchema.xsd](ANRESchema.xsd) este definitia schemei entitatilor si mesajelor propuse, primul mesaj care are o schema aproape completa este ilustrat in imagidea nde mai jos.
```
PlaceCreatedByOperator
```
![PlaceCreatedByOperator](doc/ANRESchema_p43.png)

