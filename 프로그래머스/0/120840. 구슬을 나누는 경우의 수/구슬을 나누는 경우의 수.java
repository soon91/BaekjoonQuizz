import java.math.BigInteger;
class Solution {
    public int solution(int balls, int share) {
        int answer = 0;

        BigInteger n = BigInteger.ONE;
        BigInteger m = BigInteger.ONE;
        BigInteger nm = BigInteger.ONE;

        for (int i = 1; i <= balls; i++) {
            n = n.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= share; i++) {
            m = m.multiply(BigInteger.valueOf(i));
        }

        for (int i = 1; i <= balls-share; i++) {
            nm = nm.multiply(BigInteger.valueOf(i));
        }

        answer = n.divide(m.multiply(nm)).intValue();
        
        return answer;
    }
}