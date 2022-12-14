class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (int i = 0; i < s1.length; i++) {
            String s1Ele = s1[i];
            int j = 0;
            while (j < s2.length) {
                String s2Ele = s2[j];
                if (s1Ele.equals(s2Ele)) answer++;
                j++;
            }
        }
        
        return answer;
    }
}