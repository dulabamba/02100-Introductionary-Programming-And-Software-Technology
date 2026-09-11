// Opgave 4

public class FibonacciLoop {
    public static void main(String[] args) {
        
        int n1 = 1; // Definere F(k-2)
        int n2 = 1; // Definere F(k-1)

            System.out.print(n1 + " " + n2); // Printer de to første Fibonacci tal

            for (int i = 3; i <= 12; i++) {
                int n3 = n1 + n2; // Definere F(k) = F(k-1) + F(k-2)
                    System.out.print(" " + n3); // Printer det nyeste Fibonacci tal; F(k)
                n1 = n2; // Tilskriver en ny værdi til F(k-2)
                n2 = n3; // Tilskriver en ny værdi til F(k-1)
            }
    System.out.println();
    }
}