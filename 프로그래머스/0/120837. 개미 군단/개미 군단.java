class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        for (int i = 5; i <= hp;) {
            if (i <= hp) {
                hp = hp - i;
                answer++;
            }
        }
        for (int i = 3; i <= hp;) {
            if (i <= hp) {
                hp = hp - i;
                answer++;
            }
        }
        for (int i = 1; i <= hp;) {
            if (i <= hp) {
                hp = hp - i;
                answer++;
            }
        }
        
        return answer;
    }
}