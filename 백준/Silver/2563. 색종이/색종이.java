import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        int[][] arr = new int[100][100];

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            for (int j = A; j < A+10; j++) {
                for (int k = B; k < B+10; k++) {
                    arr[j][k] = 1;
                }
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    sum++;
                }
            }
        }

        System.out.println(sum);
    }
}