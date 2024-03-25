import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < S.length(); j++) {
                if ((int)S.charAt(j) == 97+i) {
                    System.out.print(j + " ");
                    break;
                } else if (j == S.length()-1 && (int)S.charAt(j) != 97+i) {
                    System.out.print(-1 + " ");
                }
            }
        }
    }
}