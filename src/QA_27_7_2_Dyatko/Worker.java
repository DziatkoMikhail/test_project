package QA_27_7_2_Dyatko;

public class Worker implements NameInt {
    private String name;
    private int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Worker(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getPos() {
        System.out.println("Positon: Worker\nWorker's Salary: " + salary);
        return "";

    }
    public String gotPosition() {
        return name;
    }
}
