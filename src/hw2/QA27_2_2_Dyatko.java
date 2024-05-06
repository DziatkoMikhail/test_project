package hw2;

import java.util.Scanner;

public class QA27_2_2_Dyatko {
    public static void main (String[] args){
        Scanner newScanner = new Scanner (System.in);
        System.out.print("Пожалуйста введите темпатуру: ");
        double newTemp = newScanner.nextDouble();
        boolean warm = newTemp > -5.0;
        boolean average = newTemp >= -5.0 && newTemp <= 20.0;
        boolean cold = newTemp >= -20.0;

        String weatherCondition = "";

        if (warm) {
            weatherCondition = "тепло";
        } else if (average) {
            weatherCondition = "относительно нормально";
        } else weatherCondition = "холодно";

        System.out.println("Сегодня на улице " + weatherCondition);
        }
    }
