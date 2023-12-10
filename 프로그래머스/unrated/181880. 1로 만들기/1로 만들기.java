class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            int a = num_list[i];
            for (; a > 1;) {
                a /= 2;
                answer++;
            }
        }
        
        return answer;
    }
}