class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        int arrLen = 0;
        if (n % 2 == 0) {
            arrLen = n / 2;
        } else arrLen = n / 2 + 1;

        answer = new int[arrLen];

        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                answer[index] = i;
                index++;
            }
        }
        
        return answer;
    }
}