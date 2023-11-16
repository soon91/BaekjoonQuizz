import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
                answer += String.valueOf(a.charAt(i)).toUpperCase();
            } else {
                answer += String.valueOf(a.charAt(i)).toLowerCase();
            }
        }
        
        System.out.println(answer);
    }
}