package hw6_0;

import java.util.Scanner;

public class CreditCardOperations {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            task1_credit_card firstCreditCard = new task1_credit_card(1, "123456789", 1000);
            task1_credit_card secondCreditCard = new task1_credit_card(2, "987654321", 2000);
            task1_credit_card thirdCreditCard = new task1_credit_card(3, "123123123", 3000);

            firstCreditCard.cardInfo();
            secondCreditCard.cardInfo();
            thirdCreditCard.cardInfo();
            System.out.println("Enter the amount to deposit to the first credit card: ");
            firstCreditCard.deposit(scanner.nextDouble());
            System.out.println("Enter the amount to deposit to the second credit card: ");
            secondCreditCard.deposit(scanner.nextDouble());
            System.out.println("Enter the amount to withdraw from the third credit card: ");
            thirdCreditCard.withdraw(scanner.nextDouble());

            scanner.close();
        }
    }

