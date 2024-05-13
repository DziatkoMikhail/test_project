package hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QA27_4_0_Dyatko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter massive lenght: ");
        int sizeOfArray = scanner.nextInt();
        int[][][] multiDArray = new int[sizeOfArray][sizeOfArray][sizeOfArray];

        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                for (int k = 0; k < multiDArray[i][j].length; k++) {
                    multiDArray[i][j][k] = random.nextInt(99);
                }
                System.out.println(Arrays.toString(multiDArray[i][j]));


            }
        }
        System.out.print("Enter a number to enhance seed from massive: ");
        int newArray = scanner.nextInt();

        for (int i = 0; i < multiDArray.length; i++) {
            for (int j = 0; j < multiDArray[i].length; j++) {
                for (int k = 0; k < multiDArray[i][j].length; k++) {
                    multiDArray[i][j][k] += newArray;
                }
                scanner.close();
                System.out.println(Arrays.toString(multiDArray[i][j]));
            }
        }
    }
}

