import java.util.regex.Pattern;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] cooing = {"aya", "ye", "woo", "ma"};

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("ayaaya") || babbling[i].contains("yeye") ||
                babbling[i].contains("woowoo") || babbling[i].contains("mama")) continue;
            for (int j = 0; j < cooing.length; j++) {
                if (babbling[i].contains(cooing[j])) {
                    babbling[i] = babbling[i].replace(cooing[j], "b");
                }
            }
            String pattern = "^[b-b]*$";
            if (Pattern.matches(pattern, babbling[i])) answer++;
        }
        
        return answer;
    }
}