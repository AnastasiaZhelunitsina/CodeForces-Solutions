import java.util.Scanner;

public class Hulk_705A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        String hate = "I hate ";
        String love = "I love ";
        String it = "it ";
        String that = "that ";

        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                if (i == n) {
                    result.append(hate + it);
                } else {
                    result.append(hate + that);
                }
            } else {
                if (i == n) {
                    result.append(love + it);
                } else {
                    result.append(love + that);
                }
            }
        }
        System.out.println(result.toString());
    }
}
