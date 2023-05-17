import java.util.Scanner;

public class TheatreSquare_1A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        sc.close();
        System.out.println((long) (Math.ceil((double) n / (double) a) * Math.ceil((double) m / (double) a)));
    }
}
