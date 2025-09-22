package mcheungsen.pb1to10;

import mcheungsen.Problem;

public class Problem5 implements Problem {
    @Override
    public String solve() {
        int res = 40;

        while (!dividedByOneToTwenty(res)) {
            res += 20;
        }
        return Integer.toString(res);
    }

    public boolean dividedByOneToTwenty(int n) {
        for (int i = 1; i <= 20; i++) {
            if (n % i != 0) {
                return false;
            }
        }
        return true;
    }
}
