import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String[][] arr = new String[N][3];

        for (int i = 0; i < N; i++) {
            arr[i][0] = sc.next();
            arr[i][1] = sc.next();
            arr[i][2] = String.valueOf(i);
        }

        Arrays.sort(arr, Comparator.comparingInt((String[] a) -> Integer.parseInt(a[0]))
                .thenComparingInt(a -> Integer.parseInt(a[2])));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]).append(" ").append(arr[i][1]).append("\n");
        }
        System.out.println(sb.toString());
    }
}