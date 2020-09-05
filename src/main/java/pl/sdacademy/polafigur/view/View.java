package pl.sdacademy.polafigur.view;

import org.w3c.dom.css.Rect;
import pl.sdacademy.polafigur.model.Circle;
import pl.sdacademy.polafigur.model.Rectangle;
import pl.sdacademy.polafigur.model.Trapeze;

import java.util.Scanner;

public class View {

    public int showMenuAndReturnSelectedPosition() {
        System.out.println("Wyliczamy pola figur");
        System.out.println("--------------------");
        System.out.println("[1] Pole koła");
        System.out.println("[2] Pole prostokąta");
        System.out.println("[3] Pole trapezu");
        System.out.println("[0] Wyjdź");

        System.out.println("Wybierz opcję: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public Circle getCircleParameters() {
        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Podaj promień koła: ");
        circle.setRadius(scanner.nextDouble());

        return circle;
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

    public Trapeze getTrapezeParameters() {
        Scanner scanner = new Scanner(System.in);
        Trapeze trapeze = new Trapeze();

        System.out.println("Podaj pierwszą podstawę ");
        trapeze.setP1(scanner.nextDouble());

        System.out.println("Podaj drugą podstawę");
        trapeze.setP2(scanner.nextDouble());

        System.out.println("Podaj wysokość trapezu ");
        trapeze.setH(scanner.nextDouble());

        return trapeze;
    }

    public void showCircleField(double field) {
        System.out.println("Pole koła wynosi " + field);
    }

    public void showRectangleField(double field) {
        System.out.println("Pole prostokąta wynosi: " + field);
    }

    public void showTrapezeField(double field) {
        System.out.println("Pole trapezu wynosi: " + field);
    }

    public void invalidRadiusValue() {
        System.out.println("Niepoprawa wartość promienia koła");
    }
}
