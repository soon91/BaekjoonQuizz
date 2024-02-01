class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};

        int start = 0;
        int end = 0;

        boolean start_check = true;
        boolean two_check = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2 && start_check) {
                start = i;
                end = i;
                start_check = false;
                two_check = false;
            } else if (arr[i] == 2) {
                end = i;
            }
        }

        int idx = 0;
        answer = new int[end - start + 1];

        for (int i = start; i <= end; i++) {
            answer[idx++] = arr[i];
        }
        
        if (two_check) {
            answer[0] = -1;
        }
        
        return answer;
    }
}