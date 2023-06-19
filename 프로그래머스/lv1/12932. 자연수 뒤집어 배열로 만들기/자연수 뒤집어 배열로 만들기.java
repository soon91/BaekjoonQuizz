class Solution {
    public int[] solution(long n) {
        int[] answer = {};
                
        String s = String.valueOf(n);

        answer = new int[s.length()];

        int index=0;
        for (int i = s.length()-1 ; i >=0; i--) {
            answer[index] = Character.getNumericValue(s.charAt(i));
            index++;
        }

        return answer;
    }
}