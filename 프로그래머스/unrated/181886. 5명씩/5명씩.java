class Solution {
    public String[] solution(String[] names) {
        String[] answer = {};
        
        int answer_len = 0;
        if (names.length % 5 == 0) {
            answer_len = names.length / 5;
        } else {
            answer_len = names.length / 5 + 1;
        }

        answer = new String[answer_len];

        int idx = 0;

        for (int i = 0; i < names.length; i++) {
            if (i % 5 == 0) {
                answer[idx++] = names[i];
            }
        }
        
        return answer;
    }
}