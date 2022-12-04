class Solution {
    public int solution(int n) {
        int answer = 0;
        int nm2 = 0;
        int nm1 = 1;
        
        if (n == 0 || n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            answer = (nm2+nm1) % 1234567;
            nm2 = nm1;
            nm1 = answer;
        }
        
        return answer;
    }
}