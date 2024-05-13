package hw3;
import java.util.Scanner;
import java.util.Random;
public class QA27_3_4_Dyatko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arraySize;
        do {
            System.out.print("Enter array arraySize (should be more than 5 and less then 10 inc.): ");
            arraySize = scanner.nextInt();
        } while (arraySize < 6 || arraySize > 10);


        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println("First array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();


        int[] newArray = new int[arraySize];
        int evenNumber = 0;
        for (int i = 0; i < arraySize; i++) {
            if (array[i] % 2 == 0) {
                newArray[evenNumber] = array[i];
                evenNumber++;
            }
        }


        if (evenNumber > 0) {
            System.out.println("Second array of even elements:");
            for (int i = 0; i < evenNumber; i++) {
                System.out.print(newArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("The first array has no even elements.");
        }

        scanner.close();
    }
}
