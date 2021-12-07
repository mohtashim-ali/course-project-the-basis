import Entity.ExpressionException;
import UseCase.BasicOperations.ParserException;

import java.io.IOException;

public class CalculatorMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException, ParserException, ExpressionException {

        System.out.println("Welcome to The Basis Calculator!");
        UI.CalculatorUI.main();
    }

}
