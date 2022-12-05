import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> arrN = new ArrayList<>();
        
        while(n > 0) {
            arrN.add(n%10);
            n /= 10;
        }
        
        for (int i : arrN) {
            answer += i;
        }

        return answer;
    }
}