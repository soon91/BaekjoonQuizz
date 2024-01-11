import java.util.Arrays;
class Solution {
    public String[] solution(String myString) {
        int cut = 0;

        String[] a1 = myString.split("x");

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals("")) {
                cut++;
            }
        }

        String[] answer = new String[cut];

        int idx = 0;

        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals("")) {
                answer[idx++] = a1[i];
            }
        }

        Arrays.sort(answer);
        
        return answer;
    }
}