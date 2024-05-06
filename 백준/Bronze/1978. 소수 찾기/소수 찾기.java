import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int answer = 0;

        for (int i = 0; i < N; i++) {
            int number = sc.nextInt();

            if (number <= 1) {
                continue;
            }

            if (number == 2) {
                answer++;
            }

            if (number % 2 == 0) {
                continue;
            }

            boolean isPrime = true;
            for (int j = 3; j <= Math.sqrt(number); j += 2) {
                if (number % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}