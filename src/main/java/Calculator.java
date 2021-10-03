public class Calculator {

    public static void main(String[] args){
        Fraction n3 = new Fraction(new IntegerValue(20), new IntegerValue(1000));
        n3.simplify_fraction().print();
        IntegerValue i1 = new IntegerValue(2);
        IntegerValue i2 = new IntegerValue(2);
        i1.divide_integer(i2).print();

    }
}
