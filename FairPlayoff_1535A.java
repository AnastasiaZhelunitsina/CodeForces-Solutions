import java.util.Arrays;
import java.util.Scanner;

public class FairPlayoff_1535A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int[] skills = new int[4];
            for (int j = 0; j < skills.length; j++) {
                skills[j] = sc.nextInt();
            }

            System.out.println(fair(skills) ? "YES" : "NO");
        }
        sc.close();
    }

    static boolean fair(int[] array) {

        int firstPlay = Math.max(array[0], array[1]);
        int secondPlay = Math.max(array[2], array[3]);

        int minFinal = Math.min(firstPlay, secondPlay);
        int maxFinal = Math.max(firstPlay, secondPlay);

        Arrays.sort(array);

        return array[3] == maxFinal && array[2] == minFinal;
    }
}
