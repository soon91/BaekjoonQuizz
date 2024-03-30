import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        String[] list = {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

        int answer = 0;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[j].contains(String.valueOf(S.charAt(i)))) {
                    answer += j;
                    break;
                }
            }
        }

        System.out.println(answer);
    }
}