import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int max = Math.max(Math.max(A,B),C);

            if (A == 0 && B == 0 && C == 0) {
                break;
            }

            if (A+B+C > max * 2 && A == B && A == C) {
                System.out.println("Equilateral");
            } else if (A+B+C > max * 2 && (A == B || A == C || B == C)) {
                System.out.println("Isosceles");
            } else if (A+B+C > max * 2 && A != B && A != C) {
                System.out.println("Scalene");
            } else System.out.println("Invalid");
        }
    }
}