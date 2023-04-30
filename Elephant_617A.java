import java.util.Scanner;

public class Elephant_617A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        int result = 0;

        while (x > 0) {

            if (x >= 5) {
                result = x / 5;
                x = (x - 5 * result);
            } else if (x == 4) {
                x -= 4;
                result++;
            } else if (x == 3) {
                x -= 3;
                result++;
            } else if (x == 2) {
                x -= 2;
                result++;
            } else if (x == 1) {
                x -= 1;
                result++;
            }
        }

        System.out.println(result);
    }
}
