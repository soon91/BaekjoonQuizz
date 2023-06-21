import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] sArr = s.split("");

        Arrays.sort(sArr, Comparator.reverseOrder());

        for (int i = 0; i < sArr.length; i++) {
            answer += sArr[i];
        }
        
        return answer;
    }
}