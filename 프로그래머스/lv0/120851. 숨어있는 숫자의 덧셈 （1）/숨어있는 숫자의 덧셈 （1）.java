import java.util.regex.Pattern;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        for (char c : my_string.toCharArray()) {
            String pattern = "^[1-9]*$";
            answer += Pattern.matches(pattern, String.valueOf(c)) ? Integer.parseInt(String.valueOf(c)) : 0;
        }
        
        return answer;
    }
}