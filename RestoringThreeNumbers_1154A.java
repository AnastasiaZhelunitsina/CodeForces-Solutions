import java.util.Arrays;
import java.util.Scanner;

public class RestoringThreeNumbers_1154A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[array.length - 1] - array[i] + " ");
        }

    }
}
