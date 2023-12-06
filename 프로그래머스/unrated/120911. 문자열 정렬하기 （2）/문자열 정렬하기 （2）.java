import java.util.Arrays;
class Solution {
    public String solution(String my_string) {
        String answer = "";

        char[] a = my_string.toLowerCase().toCharArray();
        Arrays.sort(a);

        for (int i = 0; i < a.length; i++) {
            answer += a[i];
        }
        
        return answer;
    }
}