import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> incompletion = new HashMap<>();
        
        for (String player : participant) {
            incompletion.put(player, incompletion.getOrDefault(player, 0)+1);
        }
        for (String player : completion) {
            incompletion.put(player, incompletion.get(player)-1);
        }
        for (int i = 0; i < participant.length; i++) {
            if (incompletion.get(participant[i]) == 1) {
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}