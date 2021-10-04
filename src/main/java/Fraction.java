import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Fraction extends RealNumber {
    private IntegerValue top_value;
    private IntegerValue bottom_value;
    private final IntegerValue negative_one = new IntegerValue(-1);

    public Fraction(IntegerValue top_value, IntegerValue bottom_value){
        super((float) top_value.get_value()/bottom_value.get_value());
        if (bottom_value.get_value() != 0){
            this.top_value = top_value;
            this.bottom_value = bottom_value;
        }
    }

    public void set_top_value(int new_top){
        this.top_value.set_value(new_top);
    }
    public IntegerValue get_top_value(){
        return this.top_value;
    }

    public void set_bottom_value(int new_bottom){
        this.bottom_value.set_value(new_bottom);
    }
    public IntegerValue get_bottom_value(){
        return this.bottom_value;
    }

    public Fraction add(Fraction other){
        this.simplify();
        other.simplify();
        IntegerValue top = this.top_value.multiply_integer(other.bottom_value).add_integer(other.get_top_value().multiply_integer(this.get_bottom_value()));
        IntegerValue bottom = this.get_bottom_value().multiply_integer(other.get_bottom_value());
        return new Fraction(top, bottom).simplify();
    }
    public Fraction subtract(Fraction other){
        Fraction other_new = new Fraction(other.get_top_value().multiply_integer(this.negative_one), other.get_bottom_value());
        return add(other_new);
    }
    public Fraction simplify(){
        // Simplify top and bottom
        int top_value = Math.abs(this.get_top_value().get_value());
        int bottom_value = Math.abs(this.get_bottom_value().get_value());
        ArrayList<Integer> top_factor = new ArrayList<Integer>();
        ArrayList<Integer> bottom_factor = new ArrayList<Integer>();
        ArrayList<Integer> intersection = new ArrayList<Integer>();
        for (int i = 1; i<=top_value; i++){
            if (top_value % i == 0){
                top_factor.add(i);
            }
        }
        for (int i = 1; i<=bottom_value; i++){
            if (bottom_value % i == 0){
                bottom_factor.add(i);
            }
        }
        for (int i = 0; i<=top_factor.size()-1; i++){
            for (int j=0; j<=bottom_factor.size()-1; j++){
                if (Objects.equals(top_factor.get(i), bottom_factor.get(j))){
                        intersection.add(top_factor.get(i));
                }
            }
        }
        int divisor;
        if (intersection.size() == 0 || intersection.size() == 1 && intersection.get(0) == 0){
            divisor = 1;
        }
        else{
            divisor = Collections.max(intersection);
        }
        /*
        if (bottom_value/divisor == 1){
            return new IntegerValue((top_value/divisor) * (this.get_top_value().get_value()/top_value) *
                    (this.get_bottom_value().get_value()/bottom_value));
        }
         */
        return new Fraction(new IntegerValue((top_value/divisor) * (this.get_top_value().get_value()/top_value) *
                (this.get_bottom_value().get_value()/bottom_value)),
                            new IntegerValue(bottom_value/divisor));
    }

    // Must add - Multiplication of fractions, division of fractions

    public void print(){
        System.out.println(this.top_value.get_value() + " / " + this.bottom_value.get_value());
    }

}
