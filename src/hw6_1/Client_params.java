package hw6_1;

public class Client_params {
    int id;
    String name;
    int age;
    boolean isClientAttached;

    public Client_params(int id, String name, int age, boolean isClientAttached) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.isClientAttached = isClientAttached;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isClientAttached() {
        return isClientAttached;
    }

    public void setClientAttached(boolean clientAttached) {
        isClientAttached = clientAttached;
    }

    public void clientInfo() {
        System.out.println("Client with id " + id + " has name " + name + " and age " + age + " and is attached: " + isClientAttached);
    }
}
