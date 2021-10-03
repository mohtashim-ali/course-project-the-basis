public class Calculator {

    public static void main(String[] args){
        IntegerValue n4 = new IntegerValue(3);
        IntegerValue n5 = new IntegerValue(-12);
        Fraction n6 = new Fraction(new IntegerValue(1), new IntegerValue(4));
        RealNumber n7 = n4.divide_integer(n5);
    }
}
