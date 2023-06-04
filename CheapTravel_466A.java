import java.util.Arrays;
import java.util.Scanner;

public class CheapTravel_466A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int[] result = new int[3];
        result[0] = n * a;
        result[1] = n / m * b + n % m * a;
        result[2] = (n / m + 1) * b;
        Arrays.sort(result);
        System.out.println(result[0]);
    }
}
