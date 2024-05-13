package hw3;

import java.util.Arrays;
import java.util.Random;

public class QA27_3_6_Dyatko {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        int finalSeed = array.length - 1;
        for (int i = 0; i < finalSeed; i++) {
            for (int j = 0; j < finalSeed; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
