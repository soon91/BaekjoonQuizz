import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");

        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}