import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int root = (int) Math.sqrt(n);
        ArrayList<Integer> divisorArr = new ArrayList<>();
        
        for (int i = 1; i <= root; i++) {
            if (n%i == 0) {
                divisorArr.add(i);
                if (n/i != i) {
                    divisorArr.add(n/i);
                }
            }
        }
        divisorArr.sort(Integer::compareTo);
        
        for (int i : divisorArr) {
            answer += i;
        }
        
        return answer;
    }
}