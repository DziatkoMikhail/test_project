package QA_27_7_2_Dyatko;

public class Main {
    public static void main(String[] args) {
        Accountant accountant = new Accountant("John", 1000);
        Head head = new Head("Jack", 2000);
        Worker worker = new Worker("Jim", 500);
        head.getPos();
        accountant.getPos();
        worker.getPos();
    }
}
