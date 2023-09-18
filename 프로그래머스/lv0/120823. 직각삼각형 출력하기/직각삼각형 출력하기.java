import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            stringBuilder.append("*");
            
            System.out.println(stringBuilder);
        }
    }
}