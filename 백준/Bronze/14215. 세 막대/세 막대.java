import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int max = Math.max(Math.max(A,B),C);

        if (!(A+B+C > max * 2)) {
            System.out.println((A+B+C-max)*2-1);
        } else System.out.println(A+B+C);
    }
}