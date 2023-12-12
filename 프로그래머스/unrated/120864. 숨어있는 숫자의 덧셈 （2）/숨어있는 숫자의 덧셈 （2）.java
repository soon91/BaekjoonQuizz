class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        String[] a = my_string.replaceAll("[a-z,A-Z]"," ").split(" ");

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals("")) {
                answer += Integer.parseInt(String.valueOf(a[i]));
            }
        }
        
        return answer;
    }
}