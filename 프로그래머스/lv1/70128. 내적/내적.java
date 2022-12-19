class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        
        for (int i = 0; i < a.length; i++) {
            if (i == 0) answer = 0;
            answer += a[i]*b[i];
        }
        
        return answer;
    }
}