import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int V = sc.nextInt();
        int cut = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == V) {
                cut++;
            }
        }

        System.out.println(cut);
    }
}