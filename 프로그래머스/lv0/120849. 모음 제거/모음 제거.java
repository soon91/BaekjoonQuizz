class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        String[] sArr = my_string.split("");

        for (int i = 0; i < sArr.length; i++) {
            if (!(sArr[i].equals("a") || sArr[i].equals("e") || 
                  sArr[i].equals("i") || sArr[i].equals("o") || sArr[i].equals("u"))) {
                answer += sArr[i];
            }
        }
        
        return answer;
    }
}