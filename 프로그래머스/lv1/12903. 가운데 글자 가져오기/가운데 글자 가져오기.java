class Solution {
    public String solution(String s) {
        String answer = "";
        int sLen = s.length();
        
        if ((sLen < 1 || sLen > 100)) {
            return answer;
        }
        
        if ((sLen % 2) == 0) {
            answer = s.substring(sLen/2 - 1, sLen/2 + 1);
        } else {
            answer = s.substring(sLen/2, sLen/2 + 1);
        }
        
        return answer;
    }
}