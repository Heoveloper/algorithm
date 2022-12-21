class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string = my_string.replaceAll("\\D", " ").replaceAll("\\s+", " ").trim();
        if (my_string.length() == 0) return 0;
        String[] nums = my_string.split(" ");
        
        for (String num : nums) answer += Integer.parseInt(num);
        
        return answer;
    }
}