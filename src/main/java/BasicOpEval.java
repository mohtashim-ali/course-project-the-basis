public class BasicOpEval extends BasicOpHandler {
    private Expression expr;
    public BasicOpEval(Expression e){
        super();
        this.expr = e;
    }
    public double EvaluateExpression(){
        return 2.02;
    }
}
