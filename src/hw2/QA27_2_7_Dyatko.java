package hw2;

import java.util.Scanner;
public class QA27_2_7_Dyatko {
    public static void main(String[] args){
        while (true) {
            System.out.print("Enter a number to form Fibonacci sequence: ");
            Scanner scanner = new Scanner(System.in);
            int koll = scanner.nextInt();
            int n0 = 1;
            int n1 = 1;
            int n2;
            System.out.print(n0 + " " + n1 + " ");
            for (int i = 3; i <= koll; i++) {
                n2 = n0 + n1;
                System.out.print(n2 + " ");
                n0 = n1;
                n1 = n2;
            }
            System.out.println(" - Result");
        }
    }
}
