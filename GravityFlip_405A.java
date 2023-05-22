import java.util.Arrays;
import java.util.Scanner;

public class GravityFlip_405A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
