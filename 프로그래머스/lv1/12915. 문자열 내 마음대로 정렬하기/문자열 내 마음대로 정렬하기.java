import java.util.Arrays;
class Solution {
    public String[] solution(String[] strings, int n) {
        
        
        String []result = new String[strings.length];
        //  arr[0].charAt(n)
        for (int i = 0; i < strings.length; i++) {
            strings[i] = strings[i].charAt(n) +strings[i];
        }
        Arrays.sort(strings);
        for (int i = 0; i < strings.length; i++) {
            result[i] = strings[i].substring(1);
        }
        
        return result;
    }
}