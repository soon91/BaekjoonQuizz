import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int abc = sc.nextInt();
            if (min > abc) {
                min = abc;
            }
            if (max < abc) {
                max = abc;
            }
        }

        System.out.println(min + " " + max);
    }
}