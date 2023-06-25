import java.util.Arrays;
import java.util.Scanner;

public class FairDivision_1472B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < array.length; j++) {
                array[j] = sc.nextInt();
            }
            System.out.println(answer(array));
        }
        sc.close();
    }

    static String answer( int[] array) {
        if (Arrays.stream(array).sum() % 2 == 0 &&
                (Arrays.stream(array).sum() / 2 % 2 == 0 ||
                Arrays.stream(array).anyMatch(i -> i == 1))) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
