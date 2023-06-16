class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;

        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += price * (i+1);
        }
        answer = (sum>money) ? sum - money : 0;
        
        return answer;
    }
}