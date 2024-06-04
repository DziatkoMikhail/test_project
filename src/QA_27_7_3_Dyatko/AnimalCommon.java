package QA_27_7_3_Dyatko;

public class AnimalCommon implements AnimalAction {
    private String name;
    private int id;

    public AnimalCommon(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getEat() {
        return "";
    }

    @Override
    public String getFly() {
        return "";
    }

    @Override
    public String getRun() {
        return "";
    }

    @Override
    public String getSound() {
        return "";
    }

    @Override
    public String getSwim() {
        return "";
    }
}
