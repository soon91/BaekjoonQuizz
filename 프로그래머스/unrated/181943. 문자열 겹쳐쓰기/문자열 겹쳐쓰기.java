class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i == s) {
                answer += overwrite_string;
            } else if (!(i > s && i < overwrite_string.length()+s)) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}