class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle%90 == 0) answer = angle/90 == 1 ? 2 : 4;
        else answer = angle/90 == 1 ? 3: 1;
        
        return answer;
    }
}