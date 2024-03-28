import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int A_temp = 0;
        int B_temp = 0;

        for (int i = 1; i <= 100; i*=10) {
            A_temp += (A / i % 10) * 100 / i;
            B_temp += (B / i % 10) * 100 / i;
        }
        if (A_temp > B_temp) {
            System.out.println(A_temp);
        } else System.out.println(B_temp);
    }
}