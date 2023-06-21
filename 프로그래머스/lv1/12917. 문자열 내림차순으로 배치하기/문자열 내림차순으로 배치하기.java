import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String arr[] = new String[s.length()];

        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr,Comparator.reverseOrder());
        
        for (int i = 0; i <s.length(); i++) {
            answer += arr[i];
        }
        
        return answer;
    }
}