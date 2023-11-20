class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        
        int cnt = 0;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.substring(0,i).endsWith(pat) && myString.substring(0,i).length() > cnt) {
                cnt = myString.substring(0,i).length();
                if (i == myString.length()-1 && myString.substring(0,i+1).endsWith(pat)) {
                    cnt++;
                }
            }
        }
        answer = myString.substring(0,cnt);
        
        return answer;
    }
}