class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        for (int i = 0; i < signs.length; i++) {
            if (i == 0) answer = 0;
            int a = absolutes[i];
            a = !signs[i] ? -a : a;
            answer += a;
        }
        
        return answer;
    }
}