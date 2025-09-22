package mcheungsen.pb1to10;

import mcheungsen.Problem;

import java.util.stream.IntStream;

public class Problem1 implements Problem {
    @Override
    public String solve() {
        return Integer.toString(streamSum(1000));
    }

    /**
     * Sum  of all the multiples of 3 or 5 below max
     * @param max
     * @return
     */
    public int sumMultiply3or5(int max){
        int sum = 0;
        for (int i = 1; i < max; i++) {
            if (i%3 == 0 || i%5 == 0) sum+= i;
        }
        return sum;
    }

    public int streamSum(int max){
        return IntStream.range(1,max)
                .filter(i -> i%3==0 || i%5==0)
                .reduce(0, Integer::sum);
    }
}
