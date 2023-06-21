class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        boolean eratos[] = new boolean[3000];

       eratos[0] = eratos[1] = true;

       for(int i=2; i*i<=2999;i++){
           if(!eratos[i]){
               for(int j =i *i;j<=2999; j+=i){
                   eratos[j] = true;
               }
           }
       }//소수이면 false 소수가 아니면 true

        
        for (int i = 0; i < nums.length; i++) {

            for (int j = i +1; j < nums.length; j++) {
                int sum =0;
                for(int k = j +1; k < nums.length;k++){
                    sum = nums[i] + nums[j] + nums[k];
                    if(eratos[sum] == false){
                        answer++;
                    }
                }
            }
        }

        return answer;
    }
}