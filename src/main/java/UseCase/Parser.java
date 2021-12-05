package UseCase;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    private String strExpr;

    public Parser(String strExpr) {
        this.strExpr = strExpr;
    }
    public Operator stringToExpression (String strExpr) {
       strExpr = strExpr.replaceAll(" ", "");
        ArrayList <String>

    }

// "6+89+6^9" -> {{6, "+", 89}, "+", {6, "^", 9}}

    public boolean validity() {
        this.strExpr = this.strExpr.replaceAll(" ", "");
        if (!Character.isDigit(this.strExpr.charAt(0)) || !Character.isDigit(this.strExpr.charAt(this.strExpr.length()-1))) {
            return false;
        }
        List<Character> lst = Arrays.asList('+','-','*', '/', '^');
        for (int i=0; i<this.strExpr.length()-1; i++) {
            char curr = this.strExpr.charAt(i);
            char next = this.strExpr.charAt(i+1);
            if (lst.contains(curr) && !Character.isDigit(next)) {
                return false;
            }
            if (Character.isDigit(curr) && !lst.contains(next) && !Character.isDigit(next)) {
                return false;
            }
        }
        return true;
    }

    public String getStrExpr() {
        return strExpr;
    }

    public void setStrExpr(String strExpr) {
        this.strExpr = strExpr;
    }
}