import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }

        Arrays.sort(arr, Comparator.comparingInt(String::length)
                    .thenComparing(Comparator.naturalOrder()));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (!(i > 0 && arr[i].equals(arr[i-1]))) {
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}