import java.util.Arrays;
class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        
        int[] temp = new int[arr.length];

        while (true) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    temp[i] = arr[i] / 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    temp[i] = arr[i] * 2 + 1;
                } else {
                    temp[i] = arr[i];
                }
            }

            if (Arrays.equals(temp, arr)) {
                break;
            }

            System.arraycopy(temp, 0, arr, 0, arr.length);

            answer++;
        }
        
        return answer;
    }
}