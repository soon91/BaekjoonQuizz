class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        int sum=0;

        // x= 1784
        int tmp =x;

        while (x!=0){
            sum += x % 10; //8
            x /=10; // 1
        }// 1+ 8

        if(tmp % sum !=0){
            answer = false;
        }

        return answer;
    }
}