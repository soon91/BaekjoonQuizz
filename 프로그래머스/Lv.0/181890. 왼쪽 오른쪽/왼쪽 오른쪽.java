import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        ArrayList<String> list = new ArrayList<>();
        
        boolean first_l = true;
        boolean first_r = true;
        boolean empty_l = false;
        boolean empty_r = false;

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") && first_l) {
                empty_l = true;
                break;
            } else if (str_list[i].equals("r") && first_r) {
                list.clear();
                first_r = false;
                first_l = false;
                empty_l = true;
            } else {
                list.add(str_list[i]);
            }
        }

        if (!(empty_l || empty_r)) {
            list.clear();
        }

        String[] answer = new String[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}