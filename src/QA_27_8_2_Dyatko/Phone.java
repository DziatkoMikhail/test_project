package QA_27_8_2_Dyatko;

import java.util.Arrays;

public class Phone {
    public String number;
    public String model;
    public int weight;
    public String name = "Svetlana";

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }
    public Phone (String number, String model, int weight, String name) {
        this(number, model, weight);
        this.name = name;
    }
    public void incomingCall(String name) {
        System.out.println(name + " is calling");
    }
    public void incomingCall() {
        System.out.println(name + " is calling " + number);
    }
    public void getNumber() {
        System.out.println("Number: " + number);
    }
    public void sendMessage(String... number) {
        System.out.println(Arrays.toString(number));
    }
}
