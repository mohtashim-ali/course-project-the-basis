import Controller.CalculatorController;
import Entity.ExpressionException;
import UI.CalculatorUI;
import UseCase.BasicOperations.ParserException;

import java.io.IOException;

public class CalculatorMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserException, ExpressionException {

        System.out.println("Welcome to The Basis Calculator!");
        CalculatorController control = new CalculatorController();
        CalculatorUI new_ui = new CalculatorUI();
        new_ui.setControl(control);
        new_ui.main();
    }

}
