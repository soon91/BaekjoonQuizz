class Solution {
    public String solution(int age) {
        String answer = "";
        
        for (int i = 0; i < String.valueOf(age).length(); i++) {
            if (String.valueOf(age).split("")[i].equals("0")) {
                answer += 'a';
            } else if (String.valueOf(age).split("")[i].equals("1")) {
                answer += 'b';
            } else if (String.valueOf(age).split("")[i].equals("2")) {
                answer += 'c';
            } else if (String.valueOf(age).split("")[i].equals("3")) {
                answer += 'd';
            } else if (String.valueOf(age).split("")[i].equals("4")) {
                answer += 'e';
            } else if (String.valueOf(age).split("")[i].equals("5")) {
                answer += 'f';
            } else if (String.valueOf(age).split("")[i].equals("6")) {
                answer += 'g';
            } else if (String.valueOf(age).split("")[i].equals("7")) {
                answer += 'h';
            } else if (String.valueOf(age).split("")[i].equals("8")) {
                answer += 'i';
            } else if (String.valueOf(age).split("")[i].equals("9")) {
                answer += 'j';
            }
        }
        
        return answer;
    }
}