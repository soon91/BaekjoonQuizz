class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int start = Math.abs(sides[0]-sides[1])+1;
        int end = sides[0]+sides[1];

        for (int i = start; i < end; i++) {
            answer++;
        }
        
        return answer;
    }
}