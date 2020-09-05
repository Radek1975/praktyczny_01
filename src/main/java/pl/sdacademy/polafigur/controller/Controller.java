package pl.sdacademy.polafigur.controller;

import pl.sdacademy.polafigur.model.Circle;
import pl.sdacademy.polafigur.model.FieldCalculate;
import pl.sdacademy.polafigur.model.Rectangle;
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
            }
        }
    }

    private void handleRectangleOption() {
        Rectangle rectangle = view.getRectangleParameters();
        //TODO: walidacja danych

        double field = model.calculateRectangleField(rectangle);
        view.showRectangleField(field);
    }

    private void handleCircleOption() {
        Circle circle = view.getCircleParameters();
        double field = model.calculateCircleField(circle);
        view.showCircleField(field);
    }
}
