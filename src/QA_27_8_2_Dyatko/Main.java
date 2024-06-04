package QA_27_8_2_Dyatko;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung", 200);
        Phone phone2 = new Phone("987654321", "Apple", 300);
        Phone phone3 = new Phone("723951011", "Xiaomi", 150);
        System.out.println("model: " + phone1.model + " number: " + phone1.number + " weight: " + phone1.weight);
        System.out.println("model: " + phone2.model + " number: " + phone2.number + " weight: " + phone2.weight);
        System.out.println("model: " + phone3.model + " number: " + phone3.number + " weight: " + phone3.weight);

        phone1.incomingCall();
        phone2.incomingCall();
        phone3.incomingCall();
        phone1.getNumber();
        phone2.getNumber();
        phone3.getNumber();

        phone1.incomingCall();
        phone1.sendMessage(phone1.number, phone2.number, phone3.number);
    }
}
