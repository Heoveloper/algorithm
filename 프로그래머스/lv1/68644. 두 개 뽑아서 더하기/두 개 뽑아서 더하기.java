import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        int[] answer = {};
        ArrayList list = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 1; j < numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                if (!list.contains(sum) && i != j) list.add(sum);
            }
        }
        
        answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) list.get(i);
        }
        Arrays.sort(answer);
        
        return answer;
    }
}