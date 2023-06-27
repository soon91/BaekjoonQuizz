class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String strN = String.valueOf(n);

        for (int i = 0; i < strN.length(); i++) {
            answer += Integer.parseInt(String.valueOf(strN.charAt(i)));
        }
        
        return answer;
    }
}