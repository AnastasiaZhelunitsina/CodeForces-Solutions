import java.util.Arrays;
import java.util.Scanner;

public class MediumNumber_1760A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String[] charArr = sc.nextLine().split(" ");
            int[] arr = new int[3];
            for (int j = 0; j < charArr.length; j++) {
                arr[j] = Integer.parseInt(charArr[j]);
            }
            System.out.println(mediumNum(arr));
        }
        sc.close();
    }

    static int mediumNum(int[] array) {
        Arrays.sort(array);
        return array[1];
    }
}
