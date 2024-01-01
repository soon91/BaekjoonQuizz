class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";

        String[] split = my_string.split("");

        String[] temp = my_string.split("");

        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][1];
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                temp[idx--] = split[j];
            }
            System.arraycopy(temp, 0, split, 0, split.length);
        }

        for (int i = 0; i < split.length; i++) {
            answer += split[i];
        }
        
        return answer;
    }
}