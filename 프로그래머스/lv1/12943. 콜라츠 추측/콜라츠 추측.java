class Solution {
    public int solution(int num) {
        int answer = 0;

        if(num ==1){
            return 0;
        }

        long long_num= num;

        int cnt =0;
        while (cnt <=500){

            if(long_num % 2 ==0){
                long_num = long_num /2;
            }else {
                long_num =(long_num *3) +1;
            }
            cnt++;

            if(long_num == 1){
                break;
            }


        }


        answer = cnt;

        if(answer > 499){
            answer = -1;
        }


        return answer;
    }
}