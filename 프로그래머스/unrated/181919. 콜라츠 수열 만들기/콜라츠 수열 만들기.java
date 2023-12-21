import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> a = new ArrayList<>();

        while (n != 1) {
            if (n % 2 == 0) {
                a.add(n);
                n = n / 2;
            } else {
                a.add(n);
                n = 3 * n + 1;
            }
        }

        a.add(1);

        int[] answer = new int[a.size()];

        for (int i = 0; i < a.size(); i++) {
            answer[i] = a.get(i);
        }
        
        return answer;
    }
}