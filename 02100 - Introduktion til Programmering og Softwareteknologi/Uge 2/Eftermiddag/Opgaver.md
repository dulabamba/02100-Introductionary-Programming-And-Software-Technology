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

