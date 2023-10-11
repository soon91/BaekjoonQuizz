class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sum = 1;

        for (int i = 1; sum <= n; i++) {
            sum *= i;
            answer++;
        }
        answer--;
        
        return answer;
    }
}