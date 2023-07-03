import java.util.Scanner;

public class PolycarpAndCoins_1551A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(coins(sc.nextInt()));
        }
        sc.close();
    }

    static String coins(int n) {
        int c1 = n / 3;
        int c2 = n / 3;
        if (n % 3 == 1) {
            c1++;
        } else if (n % 3 == 2) {
            c2++;
        }

        return String.format("%d %d", c1, c2);
    }
}
