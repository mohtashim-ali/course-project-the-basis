public class Integer {
    private int value;

    private void set_value(int val){
        this.value = val;
    }
    private int get_value(){
        return this.value;
    }
    private Integer add_integer(Integer other){
        Integer new_integer = new Integer();
        new_integer.set_value(this.value +other.get_value());
        return new_integer;
    }
    public String print(){
        return this.value + "";
    }
}
