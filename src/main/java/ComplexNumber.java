public class ComplexNumber {
    private RealNumber real_part;
    private RealNumber imaginary_part;
    public ComplexNumber(RealNumber a, RealNumber b){
        this.real_part = a;
        this.imaginary_part = b;
    }

    public ComplexNumber add(ComplexNumber other){
        // pass
    }
    public ComplexNumber subtract(ComplexNumber other){
        // pass
    }
    public ComplexNumber multiply(ComplexNumber other){
        // pass
    }
    public ComplexNumber divide(ComplexNumber other){
        // pass
    }
    public ComplexNumber square(){

    }
    public ComplexNumber power(ComplexNumber pow){

    }
    // Idea: All other classes inherit these four methods since every number is in the complex field just change how they
    // operate.
}
