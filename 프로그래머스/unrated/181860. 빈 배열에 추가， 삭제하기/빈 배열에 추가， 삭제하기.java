import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> a = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i] == true) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    a.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    a.pop();
                }
            }
        }

        int[] answer = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        
        return answer;
    }
}