package wrapper2;

import com.sun.jdi.IntegerValue;

import java.awt.geom.Arc2D;
import java.math.BigInteger;

public class Demo {
    public static void main(String[] args) {
        int x = 10;

        Integer a = x; //Boxing
        int i = a; //unboxing
        Integer p = 0;
        System.out.println(p.toString());

        Integer s = 10;

        Integer b = Integer.valueOf("10");
//        System.out.println(b.toString());

//        Double dlk = new Double(12.34);
        Double dWrap = 12.34;
        Double dWrap1 = Double.valueOf(12.23);

        BigInteger bigInteger = new BigInteger("10");
        System.out.println(bigInteger.sqrt().toString());
    }
}
