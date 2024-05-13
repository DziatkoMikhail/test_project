package hw4;

import java.util.Arrays;
import java.util.Random;

public class QA27_4_2_Dyatko {
    public static void main (String[] args){
        Random random = new Random();
        int[][] arrayForSum = new int[8][8];
        int newSum = 0;

        for (int i = 0; i<arrayForSum.length; i++){
            for (int j = 0; j<arrayForSum[i].length; j++){
                arrayForSum[i][j] = random.nextInt(3);

                newSum += arrayForSum[i][j];
            }
            System.out.println(Arrays.toString(arrayForSum[i]));
        }
        System.out.println("Sum of new massive is: " + newSum);
    }
}