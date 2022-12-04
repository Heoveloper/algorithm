class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int min = (slice < n) ? slice : n;
        int max = (slice > n) ? slice : n;
        
        if (max%min == 0) {
            answer = max/min;
        } else {
            answer = max/min+1;
        }
        
        if (slice > n) {
            answer = 1;
        }
            
        return answer;
    }
}