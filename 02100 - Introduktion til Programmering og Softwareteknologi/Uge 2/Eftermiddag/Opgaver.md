## 1 JShell Fortsat

1) Gå ind i JShell:
    Skriv "jshell" i terminal

2) Skriv 2 + 3:
    Returnere $1 ==> 5

3) Skriv 2 + 3 og derefter /list:
    
    Returnere $2 ==> 5

    1 : 2+3
    2 : 2+3

4) Initialiser en variabel a og derefter kald a og 
en uinitialiseret variabel b:

    int a = 8*7
        a ==> 56

    b // Returnere fejl, fordi den ikke er oprettet

5) Definer funktionen int dobbel(int a) { return 2*a; }:

    Ved at kalde dobbel (4), returneres:
        $6 ==> 8

6) Test casting i ved at bruge (int) og (double):

    3.14 som et int, (int) 3.14, returneres:
        $7 ==> 3

    3 som en double, (double) 3, returneres:
        $8 ==> 3.0

7) Prøv at definer a som et brøktal:

    a=6.02252e23, returnerer:
        Error:
        incompatible types: possible lossy conversion from 
        double to int
        a=6.02252e23
        ^--------^

    Dette opstår fordi vi prøver at tilskrive en heltals
    variabel, a, en brøktalsværdi som 6.02252e23

8) Definer char c=’D’ og prøv derefter c+’T’+’U’ og forklar:

    char c='D':
        c ==> 'D'

    c+'T'+'U':
        $11 ==> 237

    Variabler med char definition behandles som et numerisk
    tegn når det anvendes sammen med en matematisk operation
    som "+", og med ''.

    Java omdanner så bogstaver til deres numeriske Unicode-
    værdier, som for D er 68.

9) Skriv noget kode så der outputtes DTU:

    c + "T" + "U":
        $14 ==> "DTU"

10) Prøv 13 * 2 + 239 / 10 % 5 - 2 * 2 og forklar:

    13 * 2 + 239 / 10 % 5 - 2 * 2, returnere:
        $15 ==> 25

    Rækkefølgen er:
        1. *, /, %, *
        2. +, -
    
    13 * 2 = 26,
    239 / 10 = 23; fordi de er ints,
    23 % 5 = 3, fordi Modulo,
    2 * 2 = 4,

    26 + 3 - 4 = 5

11) Undersøg outputtet af /vars:

    /vars returnere alle de oprettede variabler og deres 
    tilskrævede værdier i den givne instant jshell har 
    været åben.

12) Skriv en for-løkke der skriver alle værdier fra 1
til værdien af variablen; $1:

    for (int i = 1; i <= $1; i++) {
        System.out.println(i);
    }

    Ovenstående kode returnerer:
    1
    2
    3
    4
    5

13) Undersøg outputtet af /list:

    /list returnere alle kodeudsnit der er kørt i den
    givne instant af jshell.

14) Undersøg filer med /open

    /open tillader at man kan køre Java-kode fra en fil
    inde i JShell,

    Eksempelvis kan jeg; /open DrawStairs.java, hvorefter
    jeg kan kalde DrawStairs.main(new String[0]);, og
    aktivere metoden .main til klassen DrawStairs.

15) Forlad JShell ved brug af rette kommando

    /exit, folader JShell

## 2 Problemløsning Fortsat

### 2.1 Skakprogram

Problemstilling:

"Du vil gerne skrive et skakprogram. Hvordan kan du repræsentere skabrættet, brikkerner og deres positioner?
Hvordan ville du repræsentere tingene, hvis dit bræt var paa 2000 × 2000 filter, men stadigvæk kun havde
32 brikker placeret som i normal skak i midten af de 2 yderste rækker paa modsatte sider, jf. figur 1"

Besvarelse:

Hvis mit bræt er 2000x2000, men der stadigvæk kun er 32 brikker, kan jeg reducere behoved for hukommelse
ved blot at huske positionen for de 32 brikker. For hver brik ville jeg gemme; farve, type, position (x,y):

    farve: sort
    type: tårn
    position: (1324, 49)

Hele brættet ville så kunne repræsenteret som en liste af alle brikker; board = [piece1, piece2, (...)]

På denne måde reduceres redundans af tomme positioner/felter, og der kan stadigvæk senere laves metoder hvor 
brikker kan slå hinanden.


### 2.2 Byttepenge

Problemstilling:

"Design et program til at udbetale byttepenge i butikker. Inputtet er købsbeløbet og pengene givet til
betaling. Specific´er opgaven og design en løsning til din specifikation"

Besvarelse:

Vi antager at der findes mønter og sedler med n forskellige værdier:

    0 < v(1) = 1 < v(2) = 2 < v(3) = 5 < v(4) = 10 < v(5) = 20 < v(6) = 50 < v(7) = 100

Alle beløb skal angives som heltal, ellers kunne vi tilføje endnu mindre mønter med decimal-værdier
der repræsentere øre.

Vi definere:

    b, 'bought amount' købsbeløbbet
    p, 'paid amount' betalt beløb
    c, 'change' bytte penge

    Hvis Hvis p<b, har kunden betalt for lidt, og kunden skal betale flere penge.
    Hvis p≥b, beregnes byttepengene som:

    c = p - b

Derefter finder programmet den største mønt-eller seddelværdi, som er mindre end eller lig med c.
Programmet giver så kunden så mange af disse mønter eller sedler som muligt og trækker beløbbet fra
byttepengene. Dette gentages indtil byttepengene er lig 0:

    1. Beregn c

    2. Så længe c > 0 gentages:

        2.1 Find den største værdi v(i), hvor v(i) =< c
        2.2 Beregn k, antal gange værdien v(i) kan være i c: k = (v(i)/c)
        2.3 Giv kunden k mønter eller sedler med værdien v(i)
        2.4 Opdater byttepengene: c = c - k * v(i)


### 2.3 Køsystem

Problemstilling: 

En restaurant har et fast antal borde og siddepladser paa borde og kan ikke tage flere gæster ind, naar alle
siddepladser er optaget. Restauranten er eftertragtet og gæster staar i kø. Gæsterne har ikke noget imod
at blive tildelt en plads ved et bord med fremmede. Design et system og de tilhørende komponenter, der
tildeler gæsterne fra køen til bordene.

Besvarelse:

Der antages:

    En metode at registrere hvordan gæster ankommer eller forlader restauranten,
    En måde at tilskrive en ventende gæst et kø-nummer,
    Kø-numre er unikke og tildeles i stigende rækkefølge (k = 1; k++),
    Der altid vides antallet af gæster i restauranten,
    Det laveste kønummer, som er blevet udstedt, men endnu ikke er blevet brugt, er altid kendt

Et par fejl der kunne forekomme:

    Fejltælling på en gæsts ankomst,
    Gæst forlader før deres kø-nummer kaldes,

Design:

    variabel s, tæller antal sæder i brug,
    variabel m, maks antal siddepladser i restauranten,
    variabel k, tæller det sidst kaldte kønummer,
    variabel n, som det laveste kø-nummer der endnu ikke er kaldt

1. Før restauranten åbner:

    s = 0
    k = 0
    n = 1

2. Når en gæst ankommer i restauraten, tjekkes der om der er en ledig plads 

    s < m

3. Hvis der er en ledig plads, kaldes gæsten med det laveste ubrugte kønummer

4. Når gæsten sætter sig:

    s = s + 1

5. Kønummeret markeres som behandlet, og systemet går videre til det næste kønummer. 

    n++

6. Hvis alle siddepladser er optaget, må den næste gæst vente. 

7. Når en gæst forlader restauranten: 

        s = s - 1

8. Når der igen er en ledig plads, kaldes den næste gæst i køen.

### 2.4 Korrekthed af algoritme

Problemstilling: 

Betrag følgende algoritme for udbetalingen af byttepenge. Vi antager, at valutaen har mønter af følgende
værdier:

    0 < v(1) < v(2) < (...) < v(n)

De udbetalte byttepenge skal bestaa af saa faa mønter som muligt. Lad c være det beløb, der skal udbetales. 
Antag derudover, at alle vi og c er heltal. Algoritmen er som følger: Find den største møntværdi mindre end 
eller lige med c. Udbetal saa mange mønter af denne værdi som muligt og opdater c til de resterende 
byttepenge. Fortsat paa denne maade, indtil c er nul. Her er en formel beskrivelse:

    Lad c være beløbet til udbetaling.

    Saa længe c > 0 gør følgende

        Find det største v(i) ≤ c.
        Beregn k = (c/v(i))
        Udbetal k gange v(i).
        Opdater c = c − k · v(i).

Bevis eller modbevis, at algoritmen er korrekt, herunder, at den bestemmer det mindst mulige antal af
mønter til udbetaling.

Besvarelse:

Der er to mulige scenarier hvor jeg kan forvente at algoritmen ikke er korrekt:

1. Der kan forekomme et beløb som mønterne muligvis ikke kan give byttepenge på, eksemeplvis hvis det 
er et beløb med øre, og man kun har mønter med kroner.

2.  Der understreges at der skal angives det mindst mulige antal mønter til udbetaling, men dette er
nok ikke muligt med den type algoritme der er opstilt. Eksempelvis ville algoritmen med
startbeskrivelsen: "Saa længe c > 0 gør følgende" agere således hvis præsenteret med at skulle give
8 kroner i byttepenge, givet:

v(1): 1,
v(2): 4,
v(3): 5

c = 8
c = 8 - v(3)
c = 3 - v(1)
c = 2 - v(1)
c = 1 - v(1)
c = 0

I stedet for at give 4 mønter, kunne 2 v(2) vlre givet, derfor kan der ikke garanteres at det mindst
mulige antal mønter er til udbetaling.

### 2.5 Fletning af databaser

Problemstilling: 

Der er to databaser der indeholder den samme type data, dvs. de enkelte data i databasen har samme 
struktur. Opgaven er, at flette databaserne sammen til en ny database ved at fjerne dubletter. Mere 
specifikt skalden nye database indeholde præcis en kopi af hvert element, der dukker op i en af databaserne. 
Databaserne stiller følgende funktioner til r˚adighed: antallet af elementer i databasen, hentning af elementet
paa position i, tilføjelse af et element som sidste element i databasen. Hvis du føler, at der mangler noget, 
tilføj egenskaber og specifikationer. Dernæst beskriv en metode, der løser opgaven. Argument´er for, at metoden 
er korrekt. Hvad kan du siger om køretiden (hvad er problemstørrelsen og hvilke operationer tæller du)?

Besvarelse:

### 2.6 Plæneklipning

Problemstilling: 


Besvarelse:


## 3 Python Opstart