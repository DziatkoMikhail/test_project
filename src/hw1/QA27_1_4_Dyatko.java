package hw1;

public class QA27_1_4_Dyatko {
    public static void main(String[] args) {
        double a = 5;
        double c = 100;
        double x = c - a - 10;
        final double MAX_X = 75;
        boolean constLOEThanMaxX = x <= MAX_X;
        System.out.println("Значение a= " + a);
        System.out.println("Значение с= " + c);
        System.out.println("Значение х= " + x);
        System.out.println("x less or equal MAX_X: " + constLOEThanMaxX);
    }
}