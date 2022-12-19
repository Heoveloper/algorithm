import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> ternary = new ArrayList<>();
        
        while (n > 0) {
            ternary.add(n%3);
            n /= 3;
        }

        int m = (int) Math.pow(3, ternary.size()-1);
        for (int i : ternary) {
            answer += i*m;
            m /= 3;
        }
        
        return answer;
    }
}