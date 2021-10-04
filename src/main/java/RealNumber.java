import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RealNumber {
    private float value;
    // Class must contain addition, multiplication, division, subtraction, powers, square root etc
    public RealNumber(float value) {
        this.value = value;
    }

    public void set_value(float value) {
        this.value = value;
    }

    public float get_value() {
        return this.value;
    }

    public RealNumber add_real_number(RealNumber other) {
        return new RealNumber(this.value + other.get_value());
    }

    public RealNumber subtract_real_number(RealNumber other) {
        return new RealNumber(this.value - other.get_value());
    }

    public RealNumber multiply_real_number(RealNumber other) {
        return new RealNumber(this.value * other.get_value());
    }

    public RealNumber divide_real_number(RealNumber other) {
        return new RealNumber(this.value / other.get_value());
    }


    public void print(){
        System.out.println(this.value);
    }
}
