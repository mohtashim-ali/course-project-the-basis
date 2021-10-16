public class Fraction {
    /**
    Creates a fraction
    @param numerator int
     @param denominator int
     **/
    int numerator;
    int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (this.denominator == 0){
            // Create an exception
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(15, 7);
        Fraction f2 = new Fraction (6, 7);
        Fraction f3 = f1.add(f2);
        System.out.println(f3.numerator);
    }

    /**
     * Simplifies the fraction.
     * @return The simplified version of the fraction.
     */
    public Fraction simplify() {
        int gcd = 1;
        for(int i = 1; i <= this.numerator && i <= this.denominator; i++)
        {
            if(this.numerator % i == 0 && this.denominator % i ==0 )
                gcd = i;
        }
        return new Fraction(this.numerator / gcd, this.denominator / gcd);
    }
    /**
     *
     * @param other
     * @return The sum of both fractions.
     */
    public Fraction add(Fraction other) {
        if(this.denominator == other.denominator) {
            Fraction new_fraction = new Fraction(this.numerator + other.numerator, this.denominator);
            return new_fraction.simplify();
        }
        int new_denominator = this.denominator * other.denominator;
        int new_numerator = (this.denominator * other.numerator) + (other.denominator * this.numerator);
        return new Fraction(new_numerator, new_denominator).simplify();
    }

    /**
     *
     * @param other
     * @return
     */
    public Fraction substract(Fraction other) {
        if(this.denominator == other.denominator) {
            Fraction new_fraction = new Fraction(this.numerator - other.numerator, this.denominator);
            return new_fraction.simplify();
        }
        int new_numerator = (this.numerator * other.denominator) - (other.numerator + this.denominator);
        int new_denominator = (this.denominator * other.denominator);
        return new Fraction(new_numerator, new_denominator).simplify();
    }

    /**
     *
     * @param other
     * @return the product of both fractions.
     */
    public Fraction multiply(Fraction other) {
        return new Fraction(this.numerator * other.numerator, this.denominator * other.denominator).simplify();
    }

    /**
     *
     * @param other
     * @return
     */
    public Fraction divide(Fraction other) {
        Fraction flipped = new Fraction(other.denominator, other.numerator);
        return this.multiply(flipped);
    }

    /**
     * Converts the fraction to a decimal or a whole number.
     * @return
     */
    public double evaluate() {
        return this.numerator / this.denominator;
    }


}
