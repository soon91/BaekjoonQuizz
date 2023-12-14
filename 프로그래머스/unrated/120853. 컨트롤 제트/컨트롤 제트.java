class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] s_arr = s.split(" ");

        for (int i = 0; i < s_arr.length; i++) {
            if (s_arr[i].equals("Z")) {
                answer -= Integer.valueOf(s_arr[i-1]);
            } else answer += Integer.valueOf(s_arr[i]);
        }
        
        return answer;
    }
}