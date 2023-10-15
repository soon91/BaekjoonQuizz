import java.util.Arrays;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String[] a = my_string.split(" ");

        int index = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("")) {
                index++;
            }
        }
        answer = new String[index];

        int index2 = 0;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("")) {
                answer[index2] = a[i];
                index2++;
            }
        }
        
        return answer;
    }
}