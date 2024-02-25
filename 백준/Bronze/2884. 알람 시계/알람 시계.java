import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M >= 45) {
            System.out.println(H + " " + (M-45));
        } else if (M < 45 && H >= 1) {
            System.out.println((H-1) + " " + (60+M-45));
        } else if (M < 45 && H < 1) {
            System.out.println((24-1) + " " + (60+M-45));
        }
    }
}