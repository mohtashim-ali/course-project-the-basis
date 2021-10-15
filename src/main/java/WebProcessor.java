import java.net.http.HttpResponse;

public class WebProcessor {
    /*
     String input can be either Expr/Eq
     */
    private final String input;
    public WebProcessor(String input){
        this.input = input;
    }
    /*
       If returns true it is an expression, else, it is an equation
     */
    public boolean checkExpression(){
        return this.input.contains("=");
    }
    public Expression processInput(){
        // TO DO Convert String to Expression
        return null;
    }
}
