import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = 0;
        int cnt = 0;

        for (int i = 1; i <= 9; i++) {
            int temp = sc.nextInt();
            if (val < temp) {
                val = temp;
                cnt = i;
            }
        }

        System.out.print(val + "\n" + cnt);
    }
}