class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int index = 0;
        int index2 = 0;

        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                index++;
            }
        }

        String[] answer = new String[index];

        for (int i = 0; i < todo_list.length; i++) {
            if (finished[i] == false) {
                answer[index2] = todo_list[i];
                index2++;
            }
        }
        
        return answer;
    }
}