package mcheungsen.pb1to50;

import mcheungsen.Problem;

import java.math.BigInteger;

public class Problem3 implements Problem {
    @Override
    public String solve() {
        BigInteger number = new BigInteger("600851475143");
        BigInteger maxFactor = BigInteger.ONE;

        BigInteger i = BigInteger.TWO;
        while(i.multiply(i).compareTo(number) <= 0){
            while(number.mod(i).equals(BigInteger.ZERO)){
                number = number.divide(i);
                maxFactor = i;
            }

            if(i.compareTo(BigInteger.TWO) == 0){
                i = BigInteger.valueOf(3);
            }
            else {
                i = i.add(BigInteger.TWO);
            }
        }



        if(number.compareTo(BigInteger.ONE) > 0){
            maxFactor = number;
        }
        return maxFactor.toString();
    }

}
