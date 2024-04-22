import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] arr = new String[15];
        Arrays.fill(arr,"");

        for (int i = 0; i < 5; i++) {
            String str = sc.nextLine();
            String[] str_arr = str.split("");

            for (int j = 0; j < str.length(); j++) {
                arr[j] += str_arr[j];
            }
        }

        String answer = "";

        for (String S : arr) {
            answer += S;
        }

        System.out.println(answer);
    }
}