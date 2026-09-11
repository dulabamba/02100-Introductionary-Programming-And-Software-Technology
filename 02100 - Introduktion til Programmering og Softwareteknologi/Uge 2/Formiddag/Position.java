// Opgave 1

public class Position {
    public static void main(String[] args) {
        double s0 = 1.4;
        double v0 = 4.1;
        double a = 3.5;
        double t = 20.0;

        double s = s0 + v0 * t + 0.5 * a * t * t;

        System.out.println(s);
    }
}