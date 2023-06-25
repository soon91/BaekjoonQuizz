import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        int mul = 0;
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i]*numbers[j] > mul) {
                    answer = numbers[i]*numbers[j];
                }
            }
        }
        
        return answer;
    }
}