class Solution {
    public int solution(int price) {
        int answer = 0;
        
        double douPri = (double)price;

        if (price >= 100000 && price < 300000) {
            answer = (int)(douPri - (douPri * 5 / 100));
        } else if (price >= 300000 && price < 500000) {
            answer = (int)(douPri - (douPri * 10 / 100));
        } else if (price >= 500000) {
            answer = (int)(douPri - (douPri * 20 / 100));
        } else answer = price;
        
        return answer;
    }
}