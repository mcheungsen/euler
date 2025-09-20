package mcheungsen.pb1to50;

import mcheungsen.Problem;

public class Problem4 implements Problem {
    @Override
    public String solve() {
        int res = 0;
        for (int i = 999; i > 99; i--) {
            for (int j = 999; j > 99; j--) {
                if(isPalindrome(i*j) && i*j > res){
                    res = i*j;
                }
            }
        }
        return Integer.toString(res);
    }

    public boolean isPalindrome(int n){
        String palindrome = Integer.toString(n);
        for(int i = 0; i<palindrome.length()/2; i++){
            if(palindrome.charAt(i) != palindrome.charAt(palindrome.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}
