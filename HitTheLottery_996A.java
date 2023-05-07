import java.util.Scanner;

public class HitTheLottery_996A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int counter = 0;
        while (n != 0) {
            if (n >= 100) {
                counter += n / 100;
                n %= 100;
            } else if (n >= 20) {
                counter += n / 20;
                n %= 20;
            } else if (n >= 10) {
                counter += n / 10;
                n %= 10;
            } else if (n >= 5) {
                counter += n / 5;
                n %= 5;
            } else if (n >= 1) {
                counter += n / 1;
                n %= 1;
            }
        }
        System.out.println(counter);
    }
}
