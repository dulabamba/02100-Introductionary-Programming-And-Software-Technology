// Opgave 4

public class FibonacciLoop {
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