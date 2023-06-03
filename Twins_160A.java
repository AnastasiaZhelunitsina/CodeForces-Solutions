import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twins_160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] coins = new Integer[n];
        int sum = 0;
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
            sum += coins[i];
        }
        sc.close();
        Arrays.parallelSort(coins, Collections.reverseOrder());

        int coinCnt = 0;
        int currentSum = 0;

        for (int i = 0; i < coins.length; i++) {

            if (currentSum <= (sum - currentSum)) {
                currentSum += coins[i];
                coinCnt++;
            }
        }
        System.out.println(coinCnt);
    }
}