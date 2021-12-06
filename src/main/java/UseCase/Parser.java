package UseCase;

import UseCase.BasicOperations.Operator;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

public class Parser {

    private String strExpr;
    private final ArrayList<Character> operators = new ArrayList<>(){{
        add('^');
        add('/');
        add('*');
        add('-');
        add('+');
    }};

    public Parser(String strExpr) {
        this.strExpr = strExpr;
    }

    public ArrayList<Integer> findOps() {
        ArrayList<ArrayList<Integer>> listOfOpIndexes = new ArrayList<>();
        for (Character operator : this.operators) {
            ArrayList<Integer> nest = new ArrayList<>();
            for (int j = 0; j < this.strExpr.length(); j++) {
                if (this.strExpr.charAt(j) == operator) {
                    nest.add(j);
                }
            }
            listOfOpIndexes.add(nest);
        }
        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.addAll(listOfOpIndexes.get(1));
        tempList.addAll(listOfOpIndexes.get(2));
        ArrayList<Integer> tempList2 = new ArrayList<>();
        tempList2.addAll(listOfOpIndexes.get(3));
        tempList2.addAll(listOfOpIndexes.get(4));
        listOfOpIndexes.remove(listOfOpIndexes.get(2));
        Collections.sort(tempList);
        Collections.sort(tempList2);
        listOfOpIndexes.set(1, tempList);
        listOfOpIndexes.remove(listOfOpIndexes.get(3));
        listOfOpIndexes.set(2, tempList2);
        return listOfOpIndexes.stream()
                .flatMap(List::stream).collect(Collectors.toCollection(ArrayList::new));
    }

    public boolean checker() {
        int count = 0;
        for (int i = 0; i<this.strExpr.length(); i++) {
            if (this.operators.contains(this.strExpr.charAt(i))) {
                count += 1;
            }
        }
        return count == 1;
    }

    public boolean contains_onlyDigits(String s)
    {
        for (int i = 0; i < s.length(); i++){
            if (!Character.isDigit(s.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public Operator stringToExpression() throws ParserException {
        if (!this.validity()) {
            throw new ParserException("Invalid Input");
        }
        if (this.contains_onlyDigits(this.strExpr)) {
            return new Operator(Double.parseDouble(this.strExpr), "+", 0.0);
        }
        if ((Character.isDigit(this.strExpr.charAt(0)) ||
                Character.isDigit(this.strExpr.charAt(this.strExpr.length()-1))) && this.checker()) {
            int firstCount = 0;
            int i = 0;
            while (Character.isDigit(this.strExpr.charAt(i))) {
                firstCount += 1;
                i++;
            }
            return new Operator(Double.parseDouble(this.strExpr.substring(0, firstCount)),
                    Character.toString(this.strExpr.charAt(1)),
                    Double.parseDouble(this.strExpr.substring(firstCount+1)));
        }
        else{
            ArrayList<Integer> listOfOpIndexes = this.findOps();
            int mainOp = listOfOpIndexes.get(listOfOpIndexes.size() - 1);
            Parser left = new Parser(this.strExpr.substring(0, mainOp));
            Parser right = new Parser(this.strExpr.substring(mainOp+1));
            Object leftOp = left.stringToExpression();
            Object rightOp = right.stringToExpression();
            return new Operator(leftOp, Character.toString(this.strExpr.charAt(mainOp)), rightOp);
        }
    }

    public boolean validity() {
        this.strExpr = this.strExpr.replaceAll(" ", "");
        if (!Character.isDigit(this.strExpr.charAt(0)) ||
                !Character.isDigit(this.strExpr.charAt(this.strExpr.length()-1))) {
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