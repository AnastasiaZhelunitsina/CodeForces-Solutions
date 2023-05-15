import java.util.Scanner;

public class CandiesAndTwoSisters_1335A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number <= 2) {
                System.out.println(0);
            } else if (number % 2 == 0) {
                System.out.println((number / 2) - 1);
            } else {
                System.out.println((number - 1) / 2);
            }
        }
    }
}