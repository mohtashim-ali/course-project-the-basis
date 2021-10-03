public class Fraction {
    private int top_value;
    private int bottom_value;

    public String check_bottom_value(){
        if (bottom_value == 0){
            return "Undefined";
        }
        return "";
    }

    private void set_top_value(int new_top){
        this.top_value = new_top;
    }
    private int get_top_value(){
        return this.top_value;
    }

    private void set_bottom_value(int new_bottom){
        this.bottom_value = new_bottom;
    }
    private int get_bottom_value(){
        return this.bottom_value;
    }

    public Fraction add_fraction(Fraction other){
        Fraction new_fraction = new Fraction();
        new_fraction.set_top_value(this.get_top_value()*other.get_bottom_value()+other.get_top_value()*this.get_bottom_value());
        new_fraction.set_bottom_value(this.get_bottom_value()*other.get_bottom_value());
        return new_fraction;
    }
    public String print(){
        return this.top_value + " / " + this.bottom_value;
    }

}
