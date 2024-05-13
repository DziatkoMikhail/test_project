package hw4;

import java.util.Arrays;

public class QA27_4_1_Dyatko {
    public static void main (String[] args){
        char[][] chessDesk = new char[8][8];

        for (int i = 0; i<chessDesk.length; i++){
            for (int j = 0; j< chessDesk[i].length; j++){
                if ((i+j) % 2 == 0) {
                    chessDesk[i][j] = 'W';
                }else {
                    chessDesk[i][j] = 'B';
                }
                }
            System.out.println(Arrays.toString(chessDesk[i]));
            }
    }
}
