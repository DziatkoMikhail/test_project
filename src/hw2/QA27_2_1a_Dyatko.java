package hw2;

import java.util.Scanner;

public class QA27_2_1a_Dyatko {
    public static void main(String[] args) {
        Scanner Newscannervalue = new Scanner(System.in);
        System.out.print("Enter Month number: ");
        int month = Newscannervalue.nextInt();
        String NewSeasonString = "";

        switch (month) {
            case 12:
            case 1:
            case 2:
                NewSeasonString = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                NewSeasonString = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                NewSeasonString = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                NewSeasonString = "Autumn";
        }
        System.out.println(NewSeasonString);
    }
}
