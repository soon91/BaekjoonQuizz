import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
        String answer = "";
        
        BigInteger big_a = new BigInteger(a);
        BigInteger big_b = new BigInteger(b);

        answer = big_a.add(big_b).toString();
        
        return answer;
    }
}