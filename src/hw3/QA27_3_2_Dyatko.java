package hw3;
import java.util.Scanner;
        import java.util.Random;
public class QA27_3_2_Dyatko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arraySize = random.nextInt(50);

        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(222);
        }
        System.out.println("Array : ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        int max = array[0];
        int min = array[0];
        int sum = array[0];
        for (int i = 1; i < arraySize; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }
        double average = (double) sum / arraySize;

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
        System.out.println("Averege number: " + average);


        int[] newArray = new int[arraySize];
        int newCount = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0) {
                newArray[newCount] = array[i];
                newCount++;
            }
        }

        if (newCount > 0) {
            System.out.println("New Array:");
            for (int i = 0; i < newCount; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("First array has 0 even elements.");
        }

        scanner.close();
    }
}
