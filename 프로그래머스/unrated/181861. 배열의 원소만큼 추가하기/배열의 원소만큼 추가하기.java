class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int a = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                a++;
            }
        }

        answer = new int[a];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[index++] = arr[i];
            }
        }
        
        return answer;
    }
}