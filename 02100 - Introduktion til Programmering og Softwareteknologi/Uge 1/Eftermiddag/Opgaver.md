## 1 Entydighed af specifikation 1

Problemstilling: 

"Betragt følgende specifikation.
The program prints the numbers 1 through 4
Er specifikationen utvetydig, dvs. vil alle programmer, der følger specifikationen, give det samme output?
Hvis ikke, giv en utvetydig specifikation."

Besvarelse:

Nej, fordi der specificeres ikke om hvilken rækkefølge tallene 1 til 4 printes i, samt om tallene er hel-eller brøktal.
Man kunne printe både [1,2,3,4] v [3,1,4,2] og udsagnet ville stadig være korrekt.
Man kunne også printe alle værdier mellem 1 og 4 med brøkker, og udsagnet ville stadig være korrekt.

## 2 Entydighed af specifikation 2

Problemstilling:

"Direktøren beder sin webdesigner om følgende: “Farv baggrunden af alle firmaets websider skinnende rød
(RAL 3024). Andet skal ikke ændres”. Er det en veldefineret opgave"

Besvarelse:

Ja, fordi der specificeres både hvad der skal arbejdes med specifikt, hvad der skal udføres og med præcis hvilken farve.

## 3 Entydighed af specifikation 3

Problemstilling:

"Lyngby-Taarbæk kommune har en ny programmerbar affaldssorteringsmaskine. Direktøren for affaldsvirk-
somheden siger til programmøren: “Sørg for at maskinen adskiller glas og metal”. Er det en veldefineret
opgave?"

Besvarelse:

Det afhænger om hvorvidt maskinen på forhånd ved hvad glas og metal er.

## 4 Verifikation

Problemstilling:

"En ven har skrevet et program og påstar, at det sorterer tal i stigende rækkefølge. Du kan ikke se selve pro-
grammets kode, men kan kun se programmets output på inputs, som du selv må vælge. Mere formelt påstår
din ven: Hvis inputtet er en sekvens af tal a0, a1, . . . , an, så vil outputtet være en sortering b0, b1, . . . , bn af
inputtet i stigende rækkefølge.
Forslå en metode, der verificerer (eller modbeviser) din vens påstand."

Besvarelse:

Jeg ville give min ven et datasæt af en række værdier med vidt forskellige numeriske værdier i en tilfældig rækkefølge,
på den måde kan det be-eller afkræftes om hvorvidt programmet kan sortere værdierne i stigende rækkefølge.

## 5 Konkretisering af specifikation og design af løsning

Problemstilling:

Givet er n datasæt. Hvert sæt består af m elementer. Alle datasættene har samme struktur, dvs. typen af
elementerne og deres rækkefølge er ens.

Opgave: Givet et datasæt A, find alle datasæt blandt de n sæt, som har mindst k elementer til fælles
med A.

• Er problemet veldefineret?
• Vi kigger på følgende eksempel: Datasættene består af information om personer: et unikt ID-nummer,
hobby 1, hobby 2, yndlingssport, bopæl. Datasættene A og B med 5 elementer ser således ud:

A = 1265,svømning,musik,basket,Roskilde
B = 7409,musik,basket,fodbold,Aarhus

Spørgsmål:
– Hvor mange elementer har datasættene A og B til fælles?

De har to elementer til fælles; musik og basket

– Giv forskellige definitioner af at “have til fælles”.

Det afhænger af hvor specifik man er både grammatisk, og hvor specifikt man taler om hobbyer

– Er der noget, der ikke er væsentligt for definitionen?

Eksempelvis om dataen er skrevet med eller uden uppercase, vil det resultere i at det ikke er ens 

– Beskriv, hvordan din definition af at “have til fælles” ser ud på datasættene A og B.

Jeg vil mene om der står det samme (med eller uden uppercase) i det enkelte element, som man kan sammenligne med 
det andede datasæts information

– Design en løsning ift. din definition af at “have til fælles"

Jeg ville opstille en metode der gennemgår et vilkårligt datasæt, hvert element sammenlignes så med alle
elementer i det andede datasæt, hvortil man så kan øge tælleren (k), med en 1 hver gang datasættende har
et element til fælles.