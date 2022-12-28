class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            String s = String.valueOf(my_string.charAt(i));
            answer += s == s.toLowerCase() ? s.toUpperCase() : s.toLowerCase();
        }
        
        return answer;
    }
}