// Opgave 3

// a)
/*
public class NestedLoop {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 3; i++) { // Opretter 3 rækker
            for (int j = 0; j <= 9; j++) { // Opretter at der skal printes tallene 0-9
                for (int k = 1; k <= 3; k++) { // Angiver at der skal printes 3 gange af det vilkårlige tal i j
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
*/
// b)
/*
public class NestedLoop {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 5; i++) { // Opretter 5 rækker
            for (int j = 9; j >= 0; j--) { // Opretter at der skal printes tallene 9-0
                for (int k = 1; k <= 5; k++) { // Angiver at der skal printes 5 gange af det vilkårlige tal i j
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
*/
// c)
public class NestedLoop {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 4; i++) { // Opretter 4 rækker
            for (int j = 9; j >= 0; j--) { // Opretter at der skal printes tallene 9-0
                for (int k = 1; k <= j; k++) { // Angiver at der skal printes 3 gange af det vilkårlige tal i j
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}