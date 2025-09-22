package mcheungsen.pb1to10;

import mcheungsen.Problem;

public class Problem6 implements Problem {
    @Override
    public String solve() {
        int sumSquares = 0;
        int squareSum = 0;

        for(int i =1; i<=100;i++){
            sumSquares += i*i;
            squareSum += i;
        }
        squareSum *= squareSum;

        int res = (squareSum>sumSquares) ? squareSum-sumSquares : sumSquares-squareSum;
        return Integer.toString(res);
    }
}
