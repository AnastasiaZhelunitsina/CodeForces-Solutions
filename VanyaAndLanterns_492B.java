import java.util.Arrays;
import java.util.Scanner;

public class VanyaAndLanterns_492B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lanterns = sc.nextInt();
        int length = sc.nextInt();
        int[] distances = new int[lanterns];
        for (int i = 0; i < distances.length; i++) {
            distances[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(minLightRadius(lanterns, length, distances));

    }

    static double minLightRadius(int n, int l, int[] array) {

        Arrays.sort(array);
        double minRadius = 0.0;

        for (int i = 1; i < array.length; i++) {
            int dist = array[i] - array[i - 1];
            minRadius = Math.max(minRadius, dist);
        }
        return Math.max(minRadius / 2, Math.max(array[0] - 0, l - array[n - 1]));

    }
}
