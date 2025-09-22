package mcheungsen.pb1to10;

import mcheungsen.Problem;

import java.math.BigInteger;

public class Problem10 implements Problem {
    @Override
    public String solve() {
        BigInteger sum = BigInteger.ZERO;
        int prime = nextPrime(0);
        while (prime < 2_000_000) {
            sum = sum.add(BigInteger.valueOf(prime));
            prime = nextPrime(prime);
        }
        return sum.toString();
    }

    public int nextPrime(int n) {
        n += 1;
        if (isPrime(n)) return n;
        return nextPrime(n);
    }

    public boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
