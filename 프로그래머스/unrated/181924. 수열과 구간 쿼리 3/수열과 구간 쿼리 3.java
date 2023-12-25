class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;

        int a = 0;
        int b = 0;

        for (int i = 0; i < queries.length; i++) {
            a = answer[queries[i][0]];
            b = answer[queries[i][1]];
            answer[queries[i][0]] = b;
            answer[queries[i][1]] = a;
        }
        
        return answer;
    }
}