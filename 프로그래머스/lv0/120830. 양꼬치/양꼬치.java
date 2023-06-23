class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int sumN = 0;
        int sumK = 0;
        int disK = 0;

        sumN = n * 12000;
        sumK = k * 2000;
        disK = n/10 * 2000;

        answer = sumN + sumK - disK;
        
        return answer;
    }
}