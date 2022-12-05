class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int bSum = 0;
        int aSum = 0;
        
        for (int i = 0; i < before.length(); i++) {
            bSum += before.charAt(i);
            aSum += after.charAt(i);
        }
        answer = (bSum == aSum) ? 1 : 0;
        
        return answer;
    }
}