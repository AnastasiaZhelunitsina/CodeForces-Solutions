import java.util.Scanner;

public class PlusOrMinus_1807A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(solution(a, b, c));
        }
        sc.close();
    }

    public static char solution(int a, int b, int c) {
        return (a + b == c) ? '+' : '-';
    }
}
