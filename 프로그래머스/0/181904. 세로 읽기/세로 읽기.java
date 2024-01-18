class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        String[] arr_s = my_string.split("");

        for (int i = 0; i < arr_s.length; i += m) {
            answer += arr_s[i+c-1];
        }
        
        return answer;
    }
}