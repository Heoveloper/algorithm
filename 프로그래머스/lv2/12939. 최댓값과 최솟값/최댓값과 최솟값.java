import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sArr = s.split(" ");
        int[] iArr = new int[sArr.length];
        
        int idx = 0;
        for (String ele : sArr) {
            iArr[idx] = Integer.parseInt(ele);
            idx++;
        };
        Arrays.sort(iArr);
        
        answer = iArr[0] + " " + iArr[iArr.length-1];
        
        return answer;
    }
}