import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        ArrayList<Double> leans = new ArrayList<>();
        
        int j = 1;
        for (int i = 0; i < dots.length; i++) {
            if (j == dots.length) j = 0;
            double lean = (double) (dots[i][1]-dots[j][1])/(dots[i][0]-dots[j][0]);
            if (leans.contains(lean)) {
                answer = 1;
                break;
            } else {
                leans.add(lean);
                j++;
            }
        }
        
        return answer;
    }
}