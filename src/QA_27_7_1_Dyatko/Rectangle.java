package QA_27_7_1_Dyatko;

public class Rectangle implements PerimeterInt, SquareInt {
    double aSide;
    double bSide;

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    public double getbSide() {
        return bSide;
    }

    public void setbSide(double bSide) {
        this.bSide = bSide;
    }

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }
    public double getPerimeter() {
        return 2 * (aSide + bSide);
    }
    public double getSquare() {
        return aSide * bSide;
    }
}
