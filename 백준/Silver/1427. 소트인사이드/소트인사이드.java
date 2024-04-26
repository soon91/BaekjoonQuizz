import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        String[] arr_N = String.valueOf(N).split("");

        Arrays.sort(arr_N);

        for (int i = arr_N.length - 1; i >= 0; i--) {
            System.out.print(arr_N[i]);
        }
    }
}