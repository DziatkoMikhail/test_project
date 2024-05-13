package hw3;
import java.util.Scanner;
import java.util.Random;

public class QA27_3_0_Dyatko {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int size = random.nextInt(31) + 10;
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = random.nextInt(100);
            }
            System.out.println("Array: ");
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Enter number to check: ");
            int result = scanner.nextInt();

            boolean trueOrFalse = false;
            for (int num : array) {
                if (num == result) {
                    trueOrFalse = true;
                    break;
                }
            }

            if (trueOrFalse) {
                System.out.println("Number " + result + " is in array.");
            } else {
                System.out.println("Number " + result + " is not in array.");
            }

            scanner.close();
        }
}
