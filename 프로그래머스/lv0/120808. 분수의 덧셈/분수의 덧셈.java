class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        
       answer = new int[2];

        int numer = (numer1 * denom2) + (denom1 * numer2);
        int denom = denom1 * denom2;

        for (int i = denom; i>=1; i--) {
            if (numer % i == 0 && denom % i == 0) {
                numer /= i;
                denom /= i;
            }
        }
        answer[0] = numer;
        answer[1] = denom;
        
        return answer;
    }
}