package mcheungsen.pb1to50;

import mcheungsen.Problem;

public class Problem9 implements Problem {
    @Override
    public String solve() {
        return Integer.toString(pythagoreanTriplet_optimized());
    }

    public int pythagoreanTriplet_brutForce() {
        for (int a = 1; a <= 1000; a++) {
            for (int b = a; b <= 1000; b++) {
                for (int c = b; c <= 1000; c++) {
                    if(a+b+c == 1000 && (a*a + b*b == c*c) && a<b && b<c){
                        return a*b*c;
                    }
                }
            }
        }
        return -1;
    }

    public int pythagoreanTriplet_optimized(){
        for(int a = 1; a<=1000; a++){
            for(int b = a; b < (1000-a)/2; b++){

                int c = 1000 - a - b;
                if(a+b+c == 1000 && a*a+b*b==c*c){
                    return a*b*c;
                }
            }
        }
        return -1;
    }
}
