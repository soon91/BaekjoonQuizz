import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int temp = 2;

        for (int i = 0; i < N; i++) {
            temp = temp * 2 - 1;
        }

        System.out.println(temp * temp);
    }
}