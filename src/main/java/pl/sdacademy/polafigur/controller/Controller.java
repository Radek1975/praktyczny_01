package pl.sdacademy.polafigur.controller;

import pl.sdacademy.polafigur.model.Circle;
import pl.sdacademy.polafigur.model.FieldCalculate;
import pl.sdacademy.polafigur.model.Rectangle;
import pl.sdacademy.polafigur.model.Trapeze;
import pl.sdacademy.polafigur.view.View;

public class Controller {
    private View view;
    private FieldCalculate model;

    public Controller() {
        view = new View();
        model = new FieldCalculate();
    }

    public void start() {
        int option = -1;
        while(option != 0) {
            option = view.showMenuAndReturnSelectedPosition();
            switch (option) {
                case 1: handleCircleOption(); break;
                case 2: handleRectangleOption(); break;
                case 3: handleTrapezeOption(); break;
            }
        }
    }

    private void handleTrapezeOption() {
        Trapeze trapeze = view.getTrapezeParameters();
        double field = model.calculateTrapezeField(trapeze);
        view.showTrapezeField(field);
    }

    private void handleRectangleOption() {
        Rectangle rectangle = view.getRectangleParameters();
        double field = model.calculateRectangleField(rectangle);
        view.showRectangleField(field);
    }

    private void handleCircleOption() {
        Circle circle = view.getCircleParameters();
        double field = model.calculateCircleField(circle);
        view.showCircleField(field);
    }
}
