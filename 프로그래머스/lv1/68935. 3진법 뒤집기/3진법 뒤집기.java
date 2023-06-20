class Solution {
    public int solution(int n) {
        int answer = 0;
        
        long ternary = 0;
        String strTer = "";

        long x = 1;
        while (n > 0) {
            ternary += (n % 3)*x;
            n /= 3;
            x *=10;
        }

        
        strTer = Long.toString(ternary);
        String[] arrStr = strTer.split("");
        
        for (int i = 0; i < strTer.length(); i++) {
            answer += Integer.parseInt(arrStr[i]) * Math.pow(3,i);
        }
        
        return answer;
    }
}