class Solution {
    public String solution(String s, int n) {
        
        
        String alpha_up[] = new String[26];   //26//26
        String alpha_down[] = new String[26];
        StringBuilder result = new StringBuilder();
        alpha_down = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
                "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        alpha_up = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // String s = "a B z";// 0 1
        String split[] = new String[s.length()]; // A B

        // int n =4;
        for (int i = 0; i < s.length(); i++) {
            split[i] =String.valueOf(s.charAt(i));
        }

        for (int i = 0; i < split.length; i++) {


            if(Character.isUpperCase(s.charAt(i))){
                for(int j=0 ;j<alpha_up.length; j++){
                    if(split[i].equals(alpha_up[j])){
                        split[i] = alpha_up[(j + n) % 26];
                        break;
                    }
                }
            }

            else if(Character.isLowerCase(s.charAt(i))){
                for(int j=0 ;j<alpha_up.length; j++){
                    if(split[i].equals(alpha_down[j])){
                        split[i] = alpha_down[(j + n) % 26];
                        break;
                    }
                }
            }

        }


        for(int i=0; i<split.length; i++){
            result.append(split[i]);
        }
        
        return result.toString();
    }
}