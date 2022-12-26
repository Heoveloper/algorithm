class Solution {
    public int solution(int price) {
        int answer = 0;
        
        answer = (int) ((price >= 500_000) ? price*0.8 : (price >= 300_000) ? price*0.9 : (price >= 100_000) ? price*0.95 : price);
        
        return answer;
    }
}