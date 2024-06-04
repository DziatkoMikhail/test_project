package QA_27_7_1_Dyatko;

public class triangle implements PerimeterInt, SquareInt {
    double aSide;
    double bSide;
    double cSide;
    double height;

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

    public double getcSide() {
        return cSide;
    }

    public void setcSide(double cSide) {
        this.cSide = cSide;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public triangle(double aSide, double bSide, double cSide, double height) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
        this.height = height;
    }

    public double getPerimeter() {
        return aSide + bSide + cSide;

    }
    public double getSquare() {
        return 0.5 * aSide * height;
    }
}