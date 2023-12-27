import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < intStrs.length; i++) {
            if (Integer.parseInt(intStrs[i].substring(s,s+l)) > k) {
                arrList.add(Integer.parseInt(intStrs[i].substring(s,s+l)));
            }
        }

        int[] answer = new int[arrList.size()];

        for (int i = 0; i < arrList.size(); i++) {
            answer[i] = arrList.get(i);
        }
        
        return answer;
    }
}