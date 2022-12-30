import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> list = new ArrayList<>();
        int cnt = 0;
        
        for (int i : numlist) {
            if (i%n == 0) {
                list.add(i);
                cnt++;
            }
        }
        int[] answer = new int[cnt];
        for (int i = 0; i < list.size(); i++) answer[i] = list.get(i);
        
        return answer;
    }
}