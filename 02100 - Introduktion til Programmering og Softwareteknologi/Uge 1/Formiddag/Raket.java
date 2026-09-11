/* 
Opgave 4
*/

public class Raket {
    public static void main(String[] args) {
        printTrekant();
        printKvadrat();
        printUSA();
        printKvadrat();
        printTrekant();
}

public static void printTrekant() {
    System.out.println("   /\\         /\\\n  /  \\       /  \\\n /    \\     /    \\");
}

public static void printKvadrat() {
    System.out.println("+------+   +------+\n|      |   |      |\n|      |   |      |\n+------+   +------+");
}  
    
public static void printUSA() {
    System.out.println("|United|   |United|\n|States|   |States|");
}
}