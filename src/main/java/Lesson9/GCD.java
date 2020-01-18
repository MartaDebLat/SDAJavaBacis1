package Lesson9;

public class GCD<m> {
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


    public static int factorial (int n ) {
//
//        private static BigInteger factorial(BigInteger a){
//            if (a.equals(new BigInteger("1"))){
//                return new BigInteger("1");
//            }
//            return a.multiply(factorial(a.subtract(new BigInteger("1"))));

        if (n == 1){
            return 1;
    }
    return n * factorial(n-1);
    }
}


