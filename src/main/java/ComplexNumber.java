public class ComplexNumber {
    private RealNumber real_part;
    private RealNumber imaginary_part;
    public ComplexNumber(RealNumber a, RealNumber b){
        this.real_part = a;
        this.imaginary_part = b;
    }

    public ComplexNumber add(ComplexNumber other){
        return null;
    }
    public ComplexNumber subtract(ComplexNumber other){
        // pass
        return null;
    }
    public ComplexNumber multiply(ComplexNumber other){
        // pass
        return null;
    }
    public ComplexNumber divide(ComplexNumber other){
        // pass
        return null;
    }
    public ComplexNumber square(){
        return null;
    }
    public ComplexNumber power(ComplexNumber pow){
        return null;
    }
    // Idea: All other classes inherit these six methods since every number is in the complex field just change how they
    // operate.
}
