package hw4;

import java.util.Random;

public class QA27_4_4_Dyatko {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] newArray = new int[5][5];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                newArray[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length - 1; j++) {
                for (int k = 0; k < newArray[i].length - j - 1; k++) {
                    if (newArray[i][k] > newArray[i][k + 1]) {

                        int descSort = newArray[i][k];
                        newArray[i][k] = newArray[i][k + 1];
                        newArray[i][k + 1] = descSort;
                    }
                }
            }
        }

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
