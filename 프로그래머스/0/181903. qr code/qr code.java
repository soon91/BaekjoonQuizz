class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        String[] arr_code = code.split("");

        for (int i = r; i < code.length(); i = i+q) {
            answer += arr_code[i];
        }
        
        return answer;
    }
}