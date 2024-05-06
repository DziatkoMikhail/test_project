package hw2;

import java.util.Scanner;

public class QA27_2_5_Dyatko {
    public static void main (String [] args){
        Scanner newScanner = new Scanner(System.in);
        System.out.println("Введите положительное число: ");
        int newNumber = newScanner.nextInt();

        if (newNumber < 1) {
            System.out.println("Число" + newNumber + "меньше чем 1");
        } else if (newNumber >= 1) {
            int newSum = 0;

            for (int i = 0; i <= newNumber; i++) {
                newSum += i;
            }
            System.out.println("Сумма всех чисел от 1 до " + newNumber + " составляет: " + newSum);
            }
        newScanner.close();
        }
    }
