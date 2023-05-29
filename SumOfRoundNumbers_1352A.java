import java.util.Scanner;

public class SumOfRoundNumbers_1352A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int power = 1;
            StringBuilder result = new StringBuilder();
            int counter = 0;
            while (num > 0) {

                int current = num % 10;
                if (current > 0) {
                    counter++;
                    result.append(current * power + " ");
                }
                num /= 10;
                power *= 10;
            }
            System.out.println(counter);
            System.out.println(result);

        }
    }
}
