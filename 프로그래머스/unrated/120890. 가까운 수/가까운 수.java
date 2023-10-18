class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                answer = array[i];
            } else if (Math.abs(array[i]-n) < Math.abs(answer-n)) {
                
                    answer = array[i];
                
            } else if (Math.abs(array[i]-n) == Math.abs(answer-n)) {
                if (array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}