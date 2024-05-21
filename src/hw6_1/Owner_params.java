package hw6_1;

public class Owner_params {
    int id;
    String name;
    String phoneNumber;

    public Owner_params(int id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void ownerInfo() {
        System.out.println("Owner with id " + id + " has name " + name + " and phone number " + phoneNumber);

    }
}