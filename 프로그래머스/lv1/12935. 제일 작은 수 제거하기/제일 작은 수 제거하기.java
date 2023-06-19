class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length==1){
            int[] answer = {-1};
            return answer;
        }

        int[] answer = {};

        answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;

        int index=0 ;

        for (int i = 0; i < arr.length; i++) {

            if (min > arr[i]) { // 5 7 2 3
                min = arr[i]; //5 5 2 2
                index = i;
            }
        }

        int index1 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                answer[index1] = arr[i];
                index1++;
            }
        }


        return answer;
    }
}