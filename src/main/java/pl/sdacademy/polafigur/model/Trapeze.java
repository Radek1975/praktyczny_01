package pl.sdacademy.polafigur.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Trapeze implements Figure {
    private double p1;
    private double p2;
    private double h;

    public double field() {
        return 0.5 * (p1 + p2) * h;
    }
}
