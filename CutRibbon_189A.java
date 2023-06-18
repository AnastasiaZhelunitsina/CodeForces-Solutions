import java.util.Scanner;

public class CutRibbon_189A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        System.out.println(solution(n, a, b, c));
    }

    static int solution(int n, int a, int b, int c) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            int maxK = -1;
            if (i - a >= 0 && dp[i - a] > -1) maxK = Math.max(maxK, dp[i - a]);
            if (i - b >= 0 && dp[i - b] > -1) maxK = Math.max(maxK, dp[i - b]);
            if (i - c >= 0 && dp[i - c] > -1) maxK = Math.max(maxK, dp[i - c]);

            if (maxK > -1) {
                dp[i] = maxK + 1;
            } else {
                dp[i] = -1;
            }
        }

        return dp[n];

    }
}
