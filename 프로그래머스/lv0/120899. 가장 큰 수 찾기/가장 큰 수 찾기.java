import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int[] arrayCopy = array.clone();
        Arrays.sort(arrayCopy);
        
        answer[0] = arrayCopy[arrayCopy.length-1];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == answer[0]) {
                answer[1] = i;
                break;
            }
        }
        
        return answer;
    }
}