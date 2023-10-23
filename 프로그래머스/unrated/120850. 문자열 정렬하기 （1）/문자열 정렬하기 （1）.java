import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        String a = my_string.replaceAll("[^0-9]","");

        int[] answer = new int[a.length()];

        System.out.println(a.charAt(0));
        for (int i = 0; i < a.length(); i++) {
            answer[i] = Character.getNumericValue(a.charAt(i));
        }
        Arrays.sort(answer);
        
        return answer;
    }
}