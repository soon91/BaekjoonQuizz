import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};

        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    idx++;
                    break;
                }
            }
        }

        answer = new int[arr.length-idx];

        int idx2 = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                answer[idx2++] = arr[i];
            }
        }
        
        return answer;
    }
}