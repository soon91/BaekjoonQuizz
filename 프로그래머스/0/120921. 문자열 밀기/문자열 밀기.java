class Solution {
    public int solution(String A, String B) {
        int answer = -1;

        String temp = "";
        int cut = 0;

        for (int i = A.length(); i > 0; i--) {
            for (int j = i; j < A.length() + i; j++) {
                temp += A.charAt(j % A.length());
            }
            System.out.println(temp);
            if (temp.equals(B)) {
                answer = cut;
                break;
            }
            temp = "";
            cut++;
        }
        
        return answer;
    }
}