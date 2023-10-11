import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char[] char_before = before.toCharArray();
        char[] char_after = after.toCharArray();

        Arrays.sort(char_before);
        Arrays.sort(char_after);

        if (Arrays.equals(char_before,char_after)) {
            answer = 1;
        }
        
        return answer;
    }
}