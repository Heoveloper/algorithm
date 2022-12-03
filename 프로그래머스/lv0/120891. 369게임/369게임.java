class Solution {
    public int solution(int order) {
        int answer = 0;
        String strOrder = "" + order;
        
        for (int i = 0; i < strOrder.length(); i++) {
            char is369 = strOrder.charAt(i);

            if (is369 == '3' || is369 == '6' || is369 == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}