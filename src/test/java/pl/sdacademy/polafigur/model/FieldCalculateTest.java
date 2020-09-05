package pl.sdacademy.polafigur.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FieldCalculateTest {

    private FieldCalculate calculate = new FieldCalculate();

    @Test
    void calculateCircleField() {
        Circle circle = new Circle(1);
        assertEquals(Math.PI, calculate.calculateFigureField(circle));
    }

    @Test
    void calculateRectangleField() {
        Rectangle rectangle = new Rectangle(2, 2);
        assertEquals(4, calculate.calculateFigureField(rectangle));
    }

    @Test
    void calculateTrapezeField() {
        Trapeze trapeze = new Trapeze(1, 1, 1);
        assertEquals(1, calculate.calculateFigureField(trapeze));
    }
}