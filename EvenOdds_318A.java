import java.util.Scanner;

public class EvenOdds_318A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long position = sc.nextLong();
        sc.close();
        if (n % 2 == 0) {
            if (position == n / 2) {
                System.out.println(n - 1);
            }
            if (position > n / 2) {
                System.out.println(2 * (position - (n / 2)));
            }
            if (position < n / 2) {
                System.out.println((2 * position) - 1);
            }
        } else {
            if (position == (n / 2) + 1) {
                System.out.println(n);
            }
            if (position > (n / 2) + 1) {
                System.out.println(2 * (position - ((n / 2) + 1)));
            }
            if (position < (n / 2) + 1) {
                System.out.println((2 * position) - 1);
            }
        }
    }
}
