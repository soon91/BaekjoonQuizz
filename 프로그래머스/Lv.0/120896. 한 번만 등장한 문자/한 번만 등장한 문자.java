import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";

        String[] arr_s = s.split("");
        Arrays.sort(arr_s);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr_s.length; i++) {
            if (i == 0) {
                list.add(arr_s[i]);
            } else if (arr_s[i].equals(arr_s[i-1])) {
                list.remove(arr_s[i]);
            } else {
                list.add(arr_s[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
        
        return answer;
    }
}