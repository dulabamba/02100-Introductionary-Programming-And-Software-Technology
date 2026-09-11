/*
Opgave 5
*/

public class Brev {
    public static void main(String[] args) {
        ForældreBrev();
        System.out.println("\n");
        VenneBrev();
    }

      public static void StudieStart() {
      System.out.println("Studiet på DTU skal nok gå?");
      }

      public static void ForældreBrev() {
        Forældre1();
        StudieStart();
        Forældre2();
      }

        public static void Forældre1() {
            System.out.println("Hej Mamãe og Far\nJeg er en broke studerende og har brug for penge - please.");
        }

        public static void Forældre2() {
            System.out.println("Elsker jer rigtig meget.\nKnus og kram,\nTotô");
        }

      public static void VenneBrev() {
        Venner1();
        StudieStart();
        Venner2();
      }

        public static void Venner1() {
            System.out.println("Hej Drengene\nJeg har afinstalleret League, og er blevet en funktionel del af samfundet.");
        }

        public static void Venner2() {
            System.out.println("Vi ses på Temple Bar.");
        }
}