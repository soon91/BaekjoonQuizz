import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String myStr) {
        ArrayList<String> list = new ArrayList<>();

        String temp = "";

        for (int i = 0; i < myStr.length(); i++) {
            char c = myStr.charAt(i);
            if (c == 'a' || c == 'b' || c == 'c') {
                if (!temp.isEmpty()) {
                    list.add(temp);
                    temp = "";
                }
            } else {
                temp += c;
            }
        }

        if (!temp.isEmpty()) {
            list.add(temp);
        }

        if(list.isEmpty()) {
            list.add("EMPTY");
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}