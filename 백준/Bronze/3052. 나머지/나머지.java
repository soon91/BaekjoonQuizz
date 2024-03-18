import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            arr[i] = n % 42;
        }

        int cnt = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    cnt--;
                    break;
                }
            }
        }
        
        System.out.println(cnt);
    }
}