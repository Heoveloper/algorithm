import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        long nSqrt = (long) Math.sqrt(n);
        
        if (Math.pow(nSqrt, 2) == n) {
            answer = (long) Math.pow(nSqrt+1, 2);
        } else {
            answer = -1;
        }
        
        return answer;
    }
}