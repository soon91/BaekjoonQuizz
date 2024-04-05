import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long credit_sum = 0;
        double sum = 0.0;
        
        for (int i = 0; i < 20; i++) {
            String S = sc.nextLine();
            String[] parts = S.split(" ");
            double credit = Double.parseDouble(parts[1]);
            String grade = parts[2];

            if (grade.equals("P")) {
                continue;
            } else if (grade.equals("A+")) {
                sum += credit * 4.5;
            } else if (grade.equals("A0")) {
                sum += credit * 4.0;
            } else if (grade.equals("B+")) {
                sum += credit * 3.5;
            } else if (grade.equals("B0")) {
                sum += credit * 3.0;
            } else if (grade.equals("C+")) {
                sum += credit * 2.5;
            } else if (grade.equals("C0")) {
                sum += credit * 2.0;
            } else if (grade.equals("D+")) {
                sum += credit * 1.5;
            } else if (grade.equals("D0")) {
                sum += credit * 1.0;
            } else if (grade.equals("F")) {
                sum += credit * 0.0;
            }
            credit_sum += credit;
        }

        System.out.println(sum/credit_sum);
    }
}