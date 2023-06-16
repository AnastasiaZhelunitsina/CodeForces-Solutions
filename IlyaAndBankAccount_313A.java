import java.util.Scanner;

public class IlyaAndBankAccount_313A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        sc.close();
        System.out.println(maxBankAccount(balance));
    }

    static int maxBankAccount(int n) {
        int max = n;
        if (n <= 0) {
            if (n < -10) {
                max = Math.max(n / 10, (n / 100) * 10 + (n % 10));
            } else {
                max = n % 10;
            }
        }
        return max;
    }
}
