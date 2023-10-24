class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String a = "";
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'A') {
                a += "B";
            } else a += "A";
        }
        if (a.contains(pat)) {
            answer = 1;
        }
        
        return answer;
    }
}