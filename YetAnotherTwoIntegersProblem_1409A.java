import java.util.Scanner;

public class YetAnotherTwoIntegersProblem_1409A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int counter = 0;
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            while (max != min) {
                for (int j = 10; j > 0; j--) {
                    int differences = (max - min) / j;
                    counter += differences;
                    max -= differences * j;
                    if (max == min) {
                        break;
                    }
                }
            }
            System.out.println(counter);
        }
    }
}
