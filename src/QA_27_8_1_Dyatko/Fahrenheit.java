package QA_27_8_1_Dyatko;

public class Fahrenheit implements ConvertInt {
    public Fahrenheit() {
    }
    @Override
    public double getConvertInt(double temp) {
        return 1.8*temp + 32;
    }
}
