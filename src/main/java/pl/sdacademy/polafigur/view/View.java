package pl.sdacademy.polafigur.view;

import org.w3c.dom.css.Rect;
import pl.sdacademy.polafigur.model.Circle;
import pl.sdacademy.polafigur.model.Rectangle;

import java.util.Scanner;

public class View {

    public int showMenuAndReturnSelectedPosition() {
        System.out.println("Wyliczamy pola figur");
        System.out.println("--------------------");
        System.out.println("[1] Pole koła");
        System.out.println("[2] Pole prostokąta");
        System.out.println("[0] Wyjdź");

        System.out.println("Wybierz opcję: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public Circle getCircleParameters() {
        System.out.println("Podaj promień koła: ");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();

        return new Circle(r);
    }

    public Rectangle getRectangleParameters() {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Podaj wartośc boku a: ");
        rectangle.setA(scanner.nextDouble());

        System.out.println("Podaj długość boku b: ");
        rectangle.setB(scanner.nextDouble());

        return rectangle;
    }

    public void showCircleField(double field) {

    }

    public void showRectangleField(double field) {
        System.out.println("Pole prostokąta wynosi: " + field);
    }
}
