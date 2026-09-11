// Opgave 5

public class PrintDesign {
    public static void main(String[] args) {
        int width = 11; // Definere bredde af rækker
        for (int i = 0; i < width / 2; i++) { // Definere antal rækker
            int numDashes = width / 2 - i; // Variabel der beregner antal dashes på hver side af tallet
            for (int j = 1; j <= numDashes; j++) {
                System.out.print("-"); // Printer dashes på venstre side af tallet
            }
            int number = width - (2 * numDashes); // Beregner tal, afhængig af bredde og dashes
        for (int j = 1; j <= number; j++) {
            System.out.print(number); // Printer tallet antal gange dets værdi angiver
        }
        for (int j = 1; j <= numDashes; j++) {
            System.out.print("-"); // Printer dashes på højre side af tallet
        }
        System.out.println(); // Opretter en ny linje, i dette tilfælde række, hver gang loopet kører
        }
    }
}