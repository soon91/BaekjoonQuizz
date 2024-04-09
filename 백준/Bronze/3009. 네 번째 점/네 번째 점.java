import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list_a = new ArrayList<>();
        ArrayList<Integer> list_b = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (!list_a.contains(A)) {
                list_a.add(A);
            } else list_a.remove((Integer) A);
            if (!list_b.contains(B)) {
                list_b.add(B);
            } else list_b.remove((Integer) B);
        }

        System.out.println(list_a.get(0) + " " + list_b.get(0));
    }
}