class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        String[] arrStr = myString.split("x",-1);
        answer = new int[arrStr.length];

        for (int i = 0; i < arrStr.length; i++) {
            answer[i] = arrStr[i].length();
        }
        
        return answer;
    }
}