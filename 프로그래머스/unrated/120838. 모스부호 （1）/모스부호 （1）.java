class Solution {
    public String solution(String letter) {
        String answer = "";
        
        for (int i = 0; i < letter.split(" ").length; i++) {
            if (letter.split(" ")[i].equals(".-")) {
                answer += 'a';
            } else if (letter.split(" ")[i].equals("-...")){
                answer += 'b';
            } else if (letter.split(" ")[i].equals("-.-.")){
                answer += 'c';
            } else if (letter.split(" ")[i].equals("-..")){
                answer += 'd';
            } else if (letter.split(" ")[i].equals(".")){
                answer += 'e';
            } else if (letter.split(" ")[i].equals("..-.")){
                answer += 'f';
            } else if (letter.split(" ")[i].equals("--.")){
                answer += 'g';
            } else if (letter.split(" ")[i].equals("....")){
                answer += 'h';
            } else if (letter.split(" ")[i].equals("..")){
                answer += 'i';
            } else if (letter.split(" ")[i].equals(".---")){
                answer += 'j';
            } else if (letter.split(" ")[i].equals("-.-")){
                answer += 'k';
            } else if (letter.split(" ")[i].equals(".-..")){
                answer += 'l';
            } else if (letter.split(" ")[i].equals("--")){
                answer += 'm';
            } else if (letter.split(" ")[i].equals("-.")){
                answer += 'n';
            } else if (letter.split(" ")[i].equals("---")){
                answer += 'o';
            } else if (letter.split(" ")[i].equals(".--.")){
                answer += 'p';
            } else if (letter.split(" ")[i].equals("--.-")){
                answer += 'q';
            } else if (letter.split(" ")[i].equals(".-.")){
                answer += 'r';
            } else if (letter.split(" ")[i].equals("...")){
                answer += 's';
            } else if (letter.split(" ")[i].equals("-")){
                answer += 't';
            } else if (letter.split(" ")[i].equals("..-")){
                answer += 'u';
            } else if (letter.split(" ")[i].equals("...-")){
                answer += 'v';
            } else if (letter.split(" ")[i].equals(".--")){
                answer += 'w';
            } else if (letter.split(" ")[i].equals("-..-")){
                answer += 'x';
            } else if (letter.split(" ")[i].equals("-.--")){
                answer += 'y';
            } else if (letter.split(" ")[i].equals("--..")){
                answer += 'z';
            }
        }
        
        return answer;
    }
}