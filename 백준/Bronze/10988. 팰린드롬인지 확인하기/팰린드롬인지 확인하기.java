import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        String temp = "";

        for (int i = S.length()-1; i >= 0; i--) {
            temp += S.charAt(i);
        }

        if (S.equals(temp)) {
            System.out.println("1");
        } else System.out.println("0");
    }
}