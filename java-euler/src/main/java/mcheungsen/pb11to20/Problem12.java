package mcheungsen.pb11to20;

import mcheungsen.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Problem12 implements Problem {
    @Override
    public String solve() {

        int minFactors = 500;

        int res = getTriangleOverNDivisors(minFactors);

        return Integer.toString(res);
    }

    public int getTriangleOverNDivisors(int minFactors){
        int i = 0;
        int triangle = 1;
        int nbFactors = 1;
        while(nbFactors < minFactors){
            i+=1;
            triangle += i+1;
            nbFactors = getFactors(triangle);
        }

        return triangle;
    }
    public int getFactors(int n){
        Set<Integer> factors = new HashSet<>();
        for(int i = 1; i*i<= n; i++){
            if(n%i == 0){
                factors.add(i);
                factors.add(n/i);
            }
        }
        return factors.size();
    }
}
