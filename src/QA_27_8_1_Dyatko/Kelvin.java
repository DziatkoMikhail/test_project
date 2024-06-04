package QA_27_8_1_Dyatko;

public class Kelvin implements ConvertInt {
    public Kelvin() {
    }
    @Override
    public double getConvertInt(double temp) {
        return temp + 273.15;
    }
}
