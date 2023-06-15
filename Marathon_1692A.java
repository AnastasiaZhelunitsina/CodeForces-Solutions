import java.util.Scanner;

public class Marathon_1692A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(solve(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        sc.close();
    }

    static int solve(int a, int b, int c, int d) {
        int counter = 0;
        int[] array = {b, c, d};
        for (int i = 0; i < array.length; i++) {
            if (array[i] > a) {
                counter++;
            }
        }
        return counter;
    }
}
