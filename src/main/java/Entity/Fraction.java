package Entity;

public class Fraction {
    /**
    Creates a fraction
     **/
    public int numerator;
    public int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
//        if (this.denominator == 0){
//            // exception
//        }
    }

    /**
     * Simplifies the fraction.
     * @return The simplified version of the fraction.
     */
    public Fraction simplify() {
        int gcd = 1;
        Fraction n = new Fraction(Math.abs(this.numerator), Math.abs(this.denominator));
        for(int i = 1; i <= n.getNumerator() && i <= n.getDenominator(); i++)
        {
            if(n.getNumerator() % i == 0 && n.getDenominator() % i == 0)
                gcd = i;
        }
        if (n.getNumerator() == n.getDenominator()) {
            return new Fraction(this.getNumerator()/this.getDenominator(), 1);
        }
        if (n.getNumerator() == 0) {
            return new Fraction(0, 1);
        }
        return new Fraction(this.getNumerator() / gcd, this.getDenominator() / gcd);
    }
    /**
     *
     * @param other second fraction
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
     * @param other second fraction
     * @return returns different of both fractions
     */
    public Fraction subtract(Fraction other) {
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

    // unused method but will not delete for saving purposes
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

    public String toString(){
        return this.numerator + "/" + this.denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

}

