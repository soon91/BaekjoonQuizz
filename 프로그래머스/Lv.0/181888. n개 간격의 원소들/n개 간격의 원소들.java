import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < num_list.length; i++) {
            if (i % n == 0) {
                list.add(num_list[i]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}