// Opgave 6

public class DrawStairs {

    // Definerer antallet af trapper
    public static final int TOTAL_STAIRS = 5;

    public static void main(String[] args) {

        // Gentager løkken for hver trappe
        for (int stairs = 1; stairs <= TOTAL_STAIRS; stairs++) {

            // Første linje på hver trappe
            // Printer mellemrum før personen
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }

            System.out.print("  o  ******");

            // Printer mellemrum mellem personen og højre side
            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }

            System.out.println("*");


            // Anden linje på hver trappe
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }

            System.out.print(" /|\\ * ");

            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }

            System.out.println("    *");


            // Tredje linje på hver trappe
            for (int i = 1; i <= 5 * TOTAL_STAIRS - 5 * stairs; i++) {
                System.out.print(" ");
            }

            System.out.print(" / \\ * ");

            for (int i = 1; i <= stairs * 5 - 5; i++) {
                System.out.print(" ");
            }

            System.out.println("    *");
        }

        // Printer den nederste linje af stjerner
        for (int i = 1; i <= 5 * TOTAL_STAIRS + 7; i++) {
            System.out.print("*");
        }

        System.out.println();
    }
}