import java.util.Scanner;


public class OddDivisor_1475A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(answer(sc.nextLong()));
        }
        sc.close();
    }

    static String answer(long a) {
        String result = "NO";
        if (Long.bitCount(a) != 1) {
            result = "YES";
        }
        return result;
    }
}
