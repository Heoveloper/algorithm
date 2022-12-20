class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        
        for (int i : numbers) answer += i;
        
        return 44-answer;
    }
}