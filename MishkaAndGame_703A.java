import java.util.Scanner;

public class MishkaAndGame_703A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] mishka = new int[n];
        int[] chris = new int[n];

        for (int i = 0; i < n; i++) {
            mishka[i] = sc.nextInt();
            chris[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(solve(mishka, chris));

    }


    static String solve(int[] m, int[] c) {
        int mishkaWins = 0;
        int chrisWins = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] > c[i]) {
                mishkaWins++;
            } else if (m[i] < c[i]) {
                chrisWins++;
            }
        }

        if (mishkaWins > chrisWins) {
            return "Mishka";
        } else if (chrisWins > mishkaWins) {
            return "Chris";
        } else {
            return "Friendship is magic!^^";
        }

    }
}
