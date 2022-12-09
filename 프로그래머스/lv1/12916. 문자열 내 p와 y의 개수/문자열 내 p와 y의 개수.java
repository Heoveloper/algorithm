class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String sLow = s.toLowerCase();
        String[] sArr = sLow.split("");
        int pNum = 0;
        int yNum = 0;

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].contains("p")) pNum++;
            else if (sArr[i].contains("y")) yNum++;
        }
        if (pNum != yNum) answer = false;

        return answer;
    }
}