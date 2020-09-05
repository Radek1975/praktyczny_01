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
        double field = model.calculateFigureField(trapeze);
        view.showTrapezeField(field);
    }

    private void handleRectangleOption() {
        Rectangle rectangle = view.getRectangleParameters();
        double field = model.calculateFigureField(rectangle);
        view.showRectangleField(field);
    }

    private void handleCircleOption() {
        Circle circle = view.getCircleParameters();
        if(circle.getRadius() <= 0) {
            view.invalidRadiusValue();
        } else {
            double field = model.calculateFigureField(circle);
            view.showCircleField(field);
        }
    }
}
