class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int min;
        int max;
        
        if (a >= b) {
            max = a;
            min = b;
        } else {
            min = a;
            max = b;
        }
        
        for (int i = min; i <= max; i++) {
            answer += i;
        }
        
        return answer;
    }
}