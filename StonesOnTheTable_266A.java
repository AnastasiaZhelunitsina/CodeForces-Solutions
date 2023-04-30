import java.util.Scanner;

public class StonesOnTheTable_266A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String colors = sc.nextLine();

        sc.close();

        char[] stones = colors.toCharArray();
        int result = 0;

        for (int i = 0; i < stones.length; i++) {
            if (i != stones.length - 1) {
                if (stones[i] == stones[i + 1]) {
                    result++;
                }
            }
        }
        System.out.println(result);
    }
}
