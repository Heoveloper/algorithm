import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        ArrayList<Integer> match = new ArrayList<>();
        
        int cnt = 0;
        for (int i : lottos) {
            if (i == 0) {
                cnt++;
                continue;
            }
            for (int j : win_nums) {
                if (i == j) {
                    match.add(j);
                    break;
                }
            }
        }

        if (match.size() == 0) {
            answer[0] = lottos[0] == 0 ? 1 : 6;
            answer[1] = 6;
        } else {
            answer[1] = 7 - match.size();
            answer[0] = answer[1] - cnt;
        }
        
        return answer;
    }
}