package QA_27_7_1_Dyatko;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(5, 6);
        triangle triangle = new triangle(3, 4, 5, 4);
        Circle circle = new Circle(5);
        System.out.println("Figures area is: Rectangle=" + rectangle.getSquare() + ", Triangle=" + triangle.getSquare() + ", Circle=" + circle.getSquare());

        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        PerimeterInt[] perimeterInts = new PerimeterInt[size];
        for (int i = 0; i < perimeterInts.length; i++) {
            perimeterInts[i] = calculate();


        }
        int sum = 0;
        for (int i = 0; i < perimeterInts.length; i++) {
            sum += perimeterInts[i].getPerimeter();

        }
        System.out.println("Sum of perimeters is: " + sum);

    }

    public static PerimeterInt calculate() {
        Random random = new Random();
        int randomFigure = random.nextInt(3);

        switch (randomFigure) {
            case 0:
                return new Rectangle(5, 6);
            case 1:
                return new triangle(3, 4, 5, 4);
            case 2:
                return new Circle(5);
            default:
                return null; // or throw an exception
        }
    }
}