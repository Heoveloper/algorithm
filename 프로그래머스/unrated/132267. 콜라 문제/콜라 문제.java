class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n >= a) {
            int atOnce = (n/a)*b;
            n = n%a+atOnce;
            
            answer += atOnce;
        }
        
        return answer;
    }
}