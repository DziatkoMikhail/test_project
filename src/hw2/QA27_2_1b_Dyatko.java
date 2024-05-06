package hw2;

import java.util.Scanner;

public class QA27_2_1b_Dyatko {
public static void main (String[] args) {
    Scanner secondScannerValue = new Scanner(System.in);
    System.out.print("Enter Month Number: ");
    int month = secondScannerValue.nextInt();
    String NewSeason = "";

    boolean winterSeason = month >= 12 || month <=2;
    boolean springSeason = month >=3 && month <=5;
    boolean summerSeason = month >=6 && month <=8;

    if (winterSeason) {
        NewSeason = "Winter";
    } else {
        if (springSeason) {
            NewSeason = "Spring";
        } else {
            if (summerSeason) {
                NewSeason = "Summer";
            } else {
                NewSeason = "Autumn";
            }
        }
    }
    System.out.println("Your month " + month + " is in " + NewSeason);
}
}