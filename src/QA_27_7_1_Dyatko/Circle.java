package QA_27_7_1_Dyatko;

public class Circle implements PerimeterInt, SquareInt {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;

}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return (radius*2)*Math.PI;
    }

    public double getSquare() {
        return 2*Math.PI*radius;
    }
}