package mcheungsen.pb1to50;

import mcheungsen.Problem;

import java.util.ArrayList;

public class Problem7 implements Problem {
    @Override
    public String solve() {
        ArrayList<Integer> primes = new ArrayList<>();
        primes.add(2);
        int n = 3;

        while(primes.size() < 10001){
            boolean isPrime = true;
            for(int p : primes){
                if(p*p > n) break;
                if(n%p==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primes.add(n);
            }
            n+=2;
        }
        return Integer.toString(primes.get(primes.size()-1));
    }
}
