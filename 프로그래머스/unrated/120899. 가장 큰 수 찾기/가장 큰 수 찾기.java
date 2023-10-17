class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                answer[0] = array[0];
                answer[1] = i;
            } else if (array[i] > answer[index]) {
                answer[0] = array[i];
                answer[1] = i;
            }
        }
        
        return answer;
    }
}