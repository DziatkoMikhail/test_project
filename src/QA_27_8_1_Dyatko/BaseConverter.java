package QA_27_8_1_Dyatko;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Celsius celsius = new Celsius();
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin = new Kelvin();
        System.out.println("Enter value to convert: ");
        double temp = scanner.nextDouble();

        System.out.println("Current value: " + Degrees.getConvert(temp));
        System.out.println("The temprature in Celsius: " + celsius.getConvertInt(temp));
        System.out.println("The temprature in Fahrenheit: " + fahrenheit.getConvertInt(temp));
        System.out.println("The temprature in Kelvin: " + kelvin.getConvertInt(temp));
        scanner.close();
    }
}
