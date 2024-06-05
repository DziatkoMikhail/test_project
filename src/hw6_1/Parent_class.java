package hw6_1;

public class Parent_class {
    public static void main(String[] args) {
        Owner_params owner = new Owner_params(1, "Svetlana", "+37527788991");
        Client_params client = new Client_params(1, "Dmitriy", 25, true);


        task2_house_area firstAppartment = new task2_house_area(1, 50, 250);
        task2_house_area secondAppartment = new task2_house_area(2, 70, 350, owner, client);
        client.clientInfo();
        owner.ownerInfo();

        firstAppartment.firstAreaInfo();
        secondAppartment.secondAreaInfo();
    }
}
