public abstract class Calculator {
    private String input;
    /*
    Constructor of Calculator takes in a string like : "5+5".
     */
    public Calculator() {
        // this.input = input;
    }

    public String get_string() {
        return this.input;
    }
    /*
    Takes in two integers, and returns their sum.
     */
    public int addition(int int1, int int2) {
        return int1 + int2;
    }
    /*
    Takes in two integers, and returns their product.
     */
    public int multiply(int int1, int int2) {
        return int1 * int2;
    }
    /*
    Takes in two integers, and divides them. If the denominator is equal to 0, return an error message.
     */
    public int divide(int numerator, int denominator) {
        return numerator/denominator;
    }
}
