public class WebProcessor {
    /*
    Takes a string input and converts it to either an Expression or an Equation.
     */
    public String input;

    public WebProcessor(String input){
        this.input = input;
    }
    /*
    If returns true it is an expression, returns false otherwise.
     */
    public boolean checkExpression(){
        return this.input.contains("=");
    }
    /*
    Finds the operator;
     */
    public String findOperator() {
        if(this.input.contains("+")
    }
    /*
    1 + 1
    1 + 1 = 2
     */
    public void processInput(){
        return null;
    }

}
