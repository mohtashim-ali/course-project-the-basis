package Math;

import java.lang.Math;
import java.util.ArrayList;

public class Trigonometry {
    /**
     *
     * @param x is the input inside sin
     * @return sin of x
     */
    public double computeSin(double x) {
        double ans = Math.sin(x);
        return (double) Math.round(ans*10000)/10000;
    }
    /**
     *
     * @param x is the input inside cos
     * @return cos of x
     */
    public double computeCos(double x) {
        double ans= Math.cos(x);
        return (double) Math.round(ans*10000)/10000;
    }
    /**
     *
     * @param x is the input inside tan
     * @return tan of x
     */
    public double computeTan(double x){
        double ans = computeSin(x)/computeCos(x);
        return (double) Math.round(ans*10000)/10000;
    }
    /**
     *
     * @param x is the input inside csc
     * @return inverse of sin of x
     */
    public double computeCsc(double x) {
        double ans = 1 / computeSin(x);
        return (double) Math.round(ans*10000)/10000;
    }
    /**
     *
     * @param x is the input inside sec
     * @return inverse of cos of x
     */
    public double computeSec(double x){
        double ans = 1 / computeCos(x);
        return (double) Math.round(ans*10000) /10000;
    }
    /**
     *
     * @param x is the input inside cot
     * @return inverse of tan of x
     */
    public double computeCot(double x){
        double ans = 1 / computeTan(x);
        return (double) Math.round(ans*10000) / 10000;
    }

}