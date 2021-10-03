class IntegerValue extends RealNumber {
    private int value;

    public IntegerValue(int value){
        super(value);
        this.value = value;
    }
    public void set_value(int val){
        this.value = val;
    }
    public int get_value(){
        return this.value;
    }
    public IntegerValue add_integer(IntegerValue other){
        return new IntegerValue(this.value + other.get_value());
    }
    public IntegerValue multiply_integer(IntegerValue other){
        return new IntegerValue(this.value * other.get_value());
    }
    public IntegerValue subtract_integer(IntegerValue other){
        IntegerValue new_other = new IntegerValue(other.get_value() * -1);
        return add_integer(new_other);
    }
    public RealNumber divide_integer(IntegerValue other){
        if (this.get_value()%other.get_value() == 0){
            return new IntegerValue(this.get_value()/other.get_value());
        }
        Fraction n1 = new Fraction(this, other);
        return n1.simplify_fraction();
    }
    public void print(){
        System.out.println(this.value);
    }
}
