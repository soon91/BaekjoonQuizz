import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        ArrayList<Integer> winner = new ArrayList<>();

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == arr1[i%5]) {
                cnt1++;
            }
            if (answers[i] == arr2[i%8]) {
                cnt2++;
            }
            if (answers[i] == arr3[i%10]) {
                cnt3++;
            }
        }
        // 1등만 출력이니 2등과 3등 비교는 불필요
        /*
        1등 : cnt1 , 2등 : cnt2 , 3등 : cnt3
        1등 : cnt1 , 2등 : cnt3 , 3등 : cnt2
        1등 : cnt2 , 2등 : cnt1 , 3등 : cnt3
        1등 : cnt2 , 2등 : cnt3 , 3등 : cnt1
        1등 : cnt3 , 2등 : cnt1 , 3등 : cnt2
        1등 : cnt3 , 2등 : cnt2 , 3등 : cnt1
        */
        if (cnt1 >= cnt2 && cnt1 >= cnt3) {
            winner.add(1);
        }
        if (cnt2 >= cnt1 && cnt2 >= cnt3) {
            winner.add(2);
        }
        if (cnt3 >= cnt1 && cnt3 >= cnt2) {
            winner.add(3);
        }
        
        // Collections.sort(winner);
        
        answer = new int[winner.size()];
        
        for(int i = 0; i < winner.size(); i++){
            answer[i] = winner.get(i);
        }
        
        return answer;
    }
}