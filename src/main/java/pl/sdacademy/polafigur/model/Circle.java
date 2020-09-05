package pl.sdacademy.polafigur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Circle implements Figure {
    private double radius;

    public double field() {
        return Math.PI * radius * radius;
    }
}
