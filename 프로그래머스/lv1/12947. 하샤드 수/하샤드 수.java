class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int xSum = 0;
        int temp = x;
        
        while (x >= 1) {
            xSum += x%10;
            x /= 10;
        }
        x = temp;
        
        return (x%xSum == 0) ? answer : false;
    }
}