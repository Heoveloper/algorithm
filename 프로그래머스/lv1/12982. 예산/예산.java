import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            Arrays.sort(d);
            if (d[0] > budget) break;
            sum += d[i];
            answer++;
            if (i == d.length-1 || sum+d[i+1] > budget) break;
        }
        
        return answer;
    }
}