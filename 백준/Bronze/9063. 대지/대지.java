import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int max_x = Integer.MIN_VALUE;
        int max_y = Integer.MIN_VALUE;
        int min_x = Integer.MAX_VALUE;
        int min_y = Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x > max_x) {
                max_x = x;
            }
            if (x < min_x) {
                min_x = x;
            }
            if (y > max_y) {
                max_y = y;
            }
            if (y < min_y) {
                min_y = y;
            }
        }

        System.out.println((max_x - min_x) * (max_y - min_y));
    }
}