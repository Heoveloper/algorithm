import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] nArr = String.valueOf(n).split("");
        Arrays.sort(nArr, Collections.reverseOrder());
        
        String tmp = "";
        for (String s : nArr) tmp += s;
        
        answer = Long.parseLong(tmp);
        
        return answer;
    }
}