package hw1;
import java.util.Scanner;

public class QA27_1_1_Dyatko {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your phone brand: ");
        if (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println("I want new " + name);
        }
        scanner.close();
    }
}