package pl.sdacademy.polafigur.model;

public class FieldCalculate {

    public double calculateCircleField(Circle circle) {
        return Math.PI * circle.getRadius() * circle.getRadius();
    }

    public double calculateRectangleField(Rectangle rectangle) {
        return rectangle.getA() * rectangle.getB();
    }

    public double calculateTrapezeField(Trapeze trapeze) {
        return 0.5 * (trapeze.getP1() + trapeze.getP2()) * trapeze.getH();
    }
}
