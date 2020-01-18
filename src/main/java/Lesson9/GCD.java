package Lesson9;

public class GCD {
    public static int GCd(int a, int b) {

//        BigInteger b1 = BigInteger.valueOf(a);
//        BigInteger b2 = BigInteger.valueOf(b);
//        BigInteger gcd = b1.gcd(b2);
//        gcd = b1.gcd(b2);
//        return BigInteger.valueOf(gcd.intValue());

        if (b == 0) {
            return a;
        }
        return GCd(b, a % b);
    }
}

