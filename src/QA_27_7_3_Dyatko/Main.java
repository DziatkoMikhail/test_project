package QA_27_7_3_Dyatko;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select array size: ");

        int size = scanner.nextInt();
        AnimalCommon[] animals = new AnimalCommon[size];
        for (int i = 0; i < size; i++) {
            animals[i] = animalChoose();
        }
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i].getName());
            System.out.println("Choose your action for " + animals[i].getName() + ": 1. Eat 2. Fly 3. Run 4. Sound 5. Swim");
            int actionChoose = scanner.nextInt();
            if (actionChoose == 1) {
                System.out.println(animals[i].getEat());
            } else if (actionChoose == 2) {
                System.out.println(animals[i].getFly());
            } else if (actionChoose == 3) {
                System.out.println(animals[i].getRun());
            } else if (actionChoose == 4) {
                System.out.println(animals[i].getSound());
            } else if (actionChoose == 5) {
                System.out.println(animals[i].getSwim());
            }
        }
    }

    public static AnimalCommon animalChoose() {
        Random random = new Random();
        int animal = random.nextInt(6);
        if (animal == 0) {
            return new Cat("Cat", 1);
        } else if (animal == 1) {
            return new Dog("Dog", 2);
        } else if (animal == 2) {
            return new Fish("Fish", 3);
        } else if (animal == 3) {
            return new Monkey("Monkey", 4);
        } else if (animal == 4) {
            return new Raven("Raven", 5);
        } else {
            return new Worm("Worm", 6);
        }
    }
}