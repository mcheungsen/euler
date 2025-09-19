package mcheungsen.pb1to50;

import mcheungsen.Problem;

public class Problem2 implements Problem {
    @Override
    public String solve() {
        int previous = 1;
        int fibonacci = 2;
        int evenSum = 2;

        while(fibonacci < 4000000){
            int next = previous + fibonacci;
            if(next%2 == 0){
                evenSum += next;
            }
            previous = fibonacci;
            fibonacci = next;
        }
        return Integer.toString(evenSum);
    }
}
