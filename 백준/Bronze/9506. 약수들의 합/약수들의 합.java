import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();

            StringBuilder sb = new StringBuilder();
            int temp = 0;

            if (n == -1) {
                break;
            }

            sb.append(n + " =");

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    temp += i;
                    sb.append(" " + i + " +");
                }
            }

            if (n == temp) {
                sb.deleteCharAt(sb.length()-1);
                System.out.println(sb.toString());
            } else System.out.println(n + " is NOT perfect.");
        }
    }
}