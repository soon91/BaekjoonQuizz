class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        int index = 0;
        int max = 0;

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                max++;
            }
        }
        answer = new String[max];

        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer[index] = strArr[i];
                index++;
            }
        }
        
        return answer;
    }
}