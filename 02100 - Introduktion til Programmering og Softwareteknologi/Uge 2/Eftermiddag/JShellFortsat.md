## 1 JShell

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

