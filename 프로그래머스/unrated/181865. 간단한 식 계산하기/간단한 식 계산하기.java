class Solution {
    public int solution(String binomial) {
        int answer = 0;
        
        if (binomial.split(" ")[1].equals("+")) {
            answer = Integer.parseInt(binomial.split(" ")[0]) + Integer.parseInt(binomial.split(" ")[2]);
        } else if (binomial.split(" ")[1].equals("-")) {
            answer = Integer.parseInt(binomial.split(" ")[0]) - Integer.parseInt(binomial.split(" ")[2]);
        } else {
            answer = Integer.parseInt(binomial.split(" ")[0]) * Integer.parseInt(binomial.split(" ")[2]);
        }
        
        return answer;
    }
}