import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = "";

        String str = String.valueOf(n);
        String[] arrStr = str.split("");
        Arrays.sort(arrStr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arrStr));

        for (int i = 0; i < arrStr.length; i++){
            s += arrStr[i];
        }
        
        answer = Long.parseLong(s);
        
        return answer;
    }
}