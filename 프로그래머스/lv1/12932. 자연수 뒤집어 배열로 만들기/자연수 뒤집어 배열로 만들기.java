import java.util.*;

class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int nLen = 0;
        long nCopy = n;
        
        while (n > 0) {
            n /= 10;
            nLen++;
        }
        answer = new int[nLen];
        
        n = nCopy;
        for (int i = 0; i < nLen; i++) {
            answer[i] = (int) (n%10);
            n /= 10;
        }
        
        return answer;
    }
}