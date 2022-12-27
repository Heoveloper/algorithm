import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> divs = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n%i == 0) divs.add(i);
        }
        answer = divs.size();
        
        return answer;
    }
}