import java.util.Scanner;

public class NewYearsNumber_1475B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println(answer(sc.nextInt()));
        }
        sc.close();
    }

    static String answer(int n) {
        String result = "NO";
        for (int i = 0; i * 2020 <= n ; ++i) {
            if((n - i * 2020) % 2021 == 0) {
                result = "YES";
            }
        }
        return result;
    }
}
