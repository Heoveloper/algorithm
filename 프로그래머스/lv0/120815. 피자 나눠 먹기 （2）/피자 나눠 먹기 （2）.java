class Solution {
    public int solution(int n) {
        int answer = 0;
        int pieces = 6;
        
        while ((pieces%n) != 0) {
            pieces += 6;
        }
        answer = pieces/6;
        
        return answer;
    }
}