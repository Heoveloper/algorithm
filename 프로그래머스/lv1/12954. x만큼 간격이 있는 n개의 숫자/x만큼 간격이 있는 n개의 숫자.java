class Solution {
    public long[] solution(int x, int n) {
        long[] answer = {};
        answer = new long[n];
        
        int i = n-1;
        while (i >= 0) {
            answer[i] = (long) x*i+x;
            i--;
        }
        
        return answer;
    }
}