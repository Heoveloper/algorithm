class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        for (int i : numbers) answer += (double) i/numbers.length;
        
        return answer;
    }
}