class Solution {
    public int solution(int num, int k) {
        int answer = -1;

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            if (Integer.parseInt(String.valueOf(num).split("")[i]) == k) {
                answer = i+1;
                break;
            }
        }
        
        return answer;
    }
}