package QA_27_7_3_Dyatko;

public class Fish extends AnimalCommon implements AnimalAction {
    public Fish (String name, int id){
        super (name, id);
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
