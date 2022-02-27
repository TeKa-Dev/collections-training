package practic;

import java.util.function.DoubleUnaryOperator;

//   пример написания методов hashCode и equals

public final class HashCode_Equals_Exchange_ComplexNum {
    private final double re;
    private final double im;

    public HashCode_Equals_Exchange_ComplexNum(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }
    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashCode_Equals_Exchange_ComplexNum cn = (HashCode_Equals_Exchange_ComplexNum) o;
        return getRe() == cn.getRe() && getIm() == cn.getIm();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) Double.doubleToLongBits(re);
        result = prime * result + (int) Double.doubleToLongBits(im);
        return result;
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double n = 10000000;
        double h = Math.abs(b - a) / n;
        double result = 0;

        for(int i = 0; i < n; i++) {
            result +=  f.applyAsDouble(a + h * i);
        }

        return result *= h;
    }
}
