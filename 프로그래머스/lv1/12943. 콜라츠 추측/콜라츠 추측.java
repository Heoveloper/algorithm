class Solution {
    public int solution(int num) {
        int answer = 0;
        long result = (long) num;
        
        while (result != 1) {
            result = (result%2 == 0) ? result/2 : result*3+1;
            answer++;
            if (answer == 500) return -1;
        }
        
        return answer;
    }
}