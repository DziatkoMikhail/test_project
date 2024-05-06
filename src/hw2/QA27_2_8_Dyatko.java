package hw2;

import java.util.Scanner;
public class QA27_2_8_Dyatko {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.print("Enter deposit value: ");
        float newValue = newScanner.nextFloat();
        System.out.print("Enter deposit term value in months: ");
        int depositPeriod = newScanner.nextInt();

        for(int i = 1; i <= depositPeriod; i++){
            newValue += newValue * 0.07;
        }
        System.out.printf("After " + depositPeriod + " month new deposit value will be " + newValue);
        newScanner.close();
    }
}
