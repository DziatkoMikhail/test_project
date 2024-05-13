package hw4;
import java.util.Arrays;
import java.util.Random;

public class QA27_4_3_Dyatko {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] massiveForDiagonals = new int[5][5];

        for (int i = 0; i < massiveForDiagonals.length; i++) {
            for (int j = 0; j < massiveForDiagonals[i].length; j++) {
                massiveForDiagonals[i][j] = random.nextInt(10);
            }
            System.out.println(Arrays.toString(massiveForDiagonals[i]));
        }

        System.out.print("Main diagonal: ");
        for (int i = 0; i < massiveForDiagonals.length; i++) {
            System.out.print(massiveForDiagonals[i][i] + " ");
        }
        System.out.println();

        System.out.print("Secondary Diagonal: ");
        for (int i = 0; i < massiveForDiagonals.length; i++) {
            System.out.print(massiveForDiagonals[i][massiveForDiagonals.length - i - 1] + " ");
        }
    }
}