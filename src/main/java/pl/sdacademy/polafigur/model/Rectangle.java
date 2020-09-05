package pl.sdacademy.polafigur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Rectangle implements Figure {
    private double a;
    private double b;

    public double field() {
        return a * b;
    }
}
