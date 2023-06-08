import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class HolidayOfEquality_758A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] welfare = new Integer[n];
        for (int i = 0; i < welfare.length; i++) {
            welfare[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(welfare, Collections.reverseOrder());
        int max = welfare[0];
        int sum = 0;
        for (int i = 0; i < welfare.length; i++) {
            sum += (max - welfare[i]);
        }
        System.out.println(sum);
    }
}
