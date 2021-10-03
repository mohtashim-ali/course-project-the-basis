public class Calculator {

    public static void main(String[] args){
        Fraction n3 = new Fraction(new IntegerValue(456), new IntegerValue(346));
        n3.simplify_fraction().print();
        Fraction n1 = new Fraction(new IntegerValue(76468), new IntegerValue(35433));
        Fraction n2 = new Fraction(new IntegerValue(865754), new IntegerValue(6753));
        n1.subtract_fraction(n2).simplify_fraction().print();
    }
}
