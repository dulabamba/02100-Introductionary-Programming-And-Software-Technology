/*
Opgave 2 + 3
*/

public class VictoryIsMine {
    public static void main(String[] args) {
        printDel1();
        printDel2og3();
        printDel2og3();
        printDel2og3();
        printDel2og3();
        printDel2og3();
}

    public static void printDel1() {
        System.out.println("/////////////////////");
    }

    public static void printDel2() {
        System.out.println("|| Victory is mine! ||");
    }  
    
    public static void printDel3() {
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
    }

    public static void printDel2og3() {
        printDel2();
        printDel3();
    }
}