class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        String[] strCon = control.split("");

        for (int i = 0; i < strCon.length; i++) {
            if (strCon[i].equals("w")) {
                answer += 1;
            } else if (strCon[i].equals("s")) {
                answer += -1;
            } else if (strCon[i].equals("d")) {
                answer += 10;
            } else if (strCon[i].equals("a")) {
                answer += -10;
            }
        }
        
        return answer;
    }
}