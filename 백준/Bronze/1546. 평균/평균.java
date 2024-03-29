import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        double[] arr = new double[N];

        double max = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double sum = 0;

        for (int i = 0; i < N; i++) {
            arr[i] = arr[i] * 100 / max;
            sum += arr[i];
        }

        System.out.println(sum / N);
    }
}