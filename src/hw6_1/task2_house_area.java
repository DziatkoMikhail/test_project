package hw6_1;

public class task2_house_area {
    int areaId;
    double areaSize;
    double rentalPrice;
    public Owner_params owner;
    public Client_params client;

    public task2_house_area(int areaId, double areaSize, double rentalPrice) {
        this.areaId = areaId;
        this.areaSize = areaSize;
        this.rentalPrice = rentalPrice;
    }

    public task2_house_area(int areaId, double areaSize, double rentalPrice, Owner_params owner, Client_params client) {
        this.areaId = areaId;
        this.areaSize = areaSize;
        this.rentalPrice = rentalPrice;
        this.owner = owner;
        this.client = client;
    }

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public double getAreaSize() {
        return areaSize;
    }

    public void setAreaSize(double areaSize) {
        this.areaSize = areaSize;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Owner_params getOwner() {
        return owner;
    }

    public void setOwner(Owner_params owner) {
        this.owner = owner;
    }

    public Client_params getClient() {
        return client;
    }

    public void setClient(Client_params client) {
        this.client = client;
    }
    public void firstAreaInfo(){
        System.out.println("Area with id " + areaId + " has size " + areaSize + " and rental price " + rentalPrice);

}
    public void secondAreaInfo(){

        System.out.println("Area with id " + areaId + " has size " + areaSize + " and rental price " + rentalPrice + " and is owned by: " + owner.getName() + " and is rented by: " + client.getName());
    }
}