Un exemplu de cod Java pentru a accesa API POSF pentru a citi si publica mesaje precum si pentru a completa un fisier PDF cu continutul unui mesaj de tip contract.

In fisierele .BAT gasiti exemple de apelare a programului pentru cele 3 cazuri de utilizare.
(Pentru cazul receive exista parametrul -Down=true/false pentru a citi mesajele trimise de alta companie(false) sau propriile mesaje trimise(true) )

Un caz de utilizare simplu ar fi ca furnizorii si operatorii care doresc sa incarce contracte sau locuri de consum existente s-ar rezuma astfel:
1. Se va crea cate un fisier XML pentru fiecare contract cu structura de mesaj definita in standard
2. Se copiaza fisierul XML in directorul IN 
3. Sa lanseze programul execute-java-send.bat care transmite mesajele in POSF. 
4. Programul citeste fisier cu fisier, le transmite in API POSF folosind user/parola si salveaza rezultatul in directorul OUT.

