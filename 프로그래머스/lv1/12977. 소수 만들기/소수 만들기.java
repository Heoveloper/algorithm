import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        ArrayList<Integer> sums = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (i+2 >= nums.length) break;
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    sums.add(nums[i]+nums[j]+nums[k]);
                }
            }
        }

        for (int i : sums) {
            int j = 2;
            answer++;
            while (j < i) {
                if(i%j == 0) {
                    answer--;
                    break;
                }
                j++;
            }
        }

        return answer;
    }
}