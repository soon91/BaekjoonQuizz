import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();

        String str = "";

        for (int i = 0; i < N; i++) {
            int abc = sc.nextInt();
            if (X > abc) {
                str += Integer.toString(abc) + " ";
            }
        }

        System.out.println(str.substring(0, str.length()-1));
    }
}