class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String numbers_str[] = {"zero", "one", "two", "three",
               "four","five" ,"six","seven","eight","nine"};

        for (int i = 0; i < numbers_str.length; i++) {
            s = s.replaceAll(numbers_str[i],String.valueOf(i));

        }
        answer = Integer.parseInt(s);
        
        return answer;
    }
}