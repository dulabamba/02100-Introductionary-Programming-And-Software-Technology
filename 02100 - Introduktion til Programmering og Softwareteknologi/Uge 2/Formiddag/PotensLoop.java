// Opgave 2

public class PotensLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i * i);

            if (i < 10) {
                System.out.print(" "); // Tilføjer et mellemrum efter hver .print pånær 10 * 10
            }
        }
    }
}