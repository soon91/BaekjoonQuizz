class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 123456789;
        
        int negativeAnswer = 0;
        int positiveAnswer = 0;

        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i] == false) {
                negativeAnswer += absolutes[i] * (-1);
            } else {
                positiveAnswer += absolutes[i];
            }
        }
        answer = negativeAnswer + positiveAnswer;
        
        return answer;
    }
}