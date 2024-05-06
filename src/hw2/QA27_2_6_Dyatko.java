package hw2;

import java.util.Scanner;

public class QA27_2_6_Dyatko {
    public  static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        System.out.print("Введите первое значение: ");
        int firstNumber = newScanner.nextInt();

        System.out.print("Введите шаг: ");
        int step = newScanner.nextInt();

        System.out.print("Введите критическое значение: ");
        int critValue = newScanner.nextInt();

   //Infinite cycle checks
        if ((step > 0 && critValue < firstNumber) || (step < 0 && critValue > firstNumber)) {
            System.out.println("Ошибка: Критическое значение не в диапазоне");
        } else {
            int currentValue = firstNumber;
            while ((step > 0 && currentValue <= critValue) || (step < 0 && currentValue >= critValue)) {
                System.out.print(currentValue + " ");
                currentValue += step;
            }
        }
        newScanner.close();
    }
}
