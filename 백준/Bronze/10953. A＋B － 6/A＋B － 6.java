import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < T; i++) {
            String S = sc.nextLine();
            int A = Integer.parseInt(S.split(",")[0]);
            int B = Integer.parseInt(S.split(",")[1]);

            System.out.println(A+B);
        }
    }
}