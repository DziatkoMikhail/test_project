package QA_27_7_2_Dyatko;

public class Head implements NameInt {
    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Head(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }
    public String getPos() {
        System.out.println("Position: Head\nHead's Salary: " + salary);
        return "";
    }
    public String gotPosition() {
        return name;
    }
}
