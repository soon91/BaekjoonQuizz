class Solution {
    public String[] solution(String[] picture, int k) {
        String [] answer = new String[picture.length * k];

        int idx = 0;

        for (int i = 0; i < picture.length; i++) {
            for (int j = 0; j < picture[i].length(); j++) {
                char c = picture[i].charAt(j);
                if (j == 0) {
                    answer[idx] = String.valueOf(c);
                    for (int l = 1; l < k; l++) {
                        answer[idx] += String.valueOf(c);
                    }
                } else {
                    for (int l = 0; l < k; l++) {
                        answer[idx] += String.valueOf(c);
                    }
                }
            }
            idx++;
        }

        int idx2 = answer.length - 1;

        for (int i = picture.length - 1; i >= 0; i--) {
            for (int l = 0; l < k; l++) {
                answer[idx2] = answer[i];
                idx2--;
            }
        }
        
        return answer;
    }
}