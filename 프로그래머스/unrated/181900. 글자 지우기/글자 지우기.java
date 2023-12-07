import java.util.Arrays;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        int idx = 0;

        Arrays.sort(indices);
        
        for (int i = 0; i < my_string.length(); i++) {
            if (i == indices[idx]) {
                if (idx < indices.length-1) {
                    idx++;
                }
            } else answer += my_string.charAt(i);
        }
        
        return answer;
    }
}