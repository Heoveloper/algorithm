class Solution {
    public String solution(String s) {
        String answer = "";
        String sLow = s.toLowerCase();
        String[] sWords = sLow.split(" ");
        
        int cnt = s.length();
        for (int i = 0; i < sWords.length; i++) {
            if (sWords[i].isEmpty()) {
                answer += " ";
                cnt--;
                continue;
            } else {
                answer += sWords[i].substring(0, 1).toUpperCase() + sWords[i].substring(1);
                cnt -= sWords[i].length();
                if (i != sWords.length-1) {
                    answer += " ";
                    cnt--;
                }
            }
        }
        for (int i = 0; i < cnt; i++) answer += " ";
        
        return answer;
    }
}