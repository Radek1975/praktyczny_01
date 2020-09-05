package pl.sdacademy.polafigur.model;

public class Trapeze {
    private double p1;
    private double p2;
    private double h;

    public Trapeze() {
    }

    public Trapeze(double p1, double p2, double h) {
        this.p1 = p1;
        this.p2 = p2;
        this.h = h;
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
