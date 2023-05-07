
import java.util.HashSet;
import java.util.Scanner;

public class IWannaBeTheGuy_469A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "I become the guy.";
        String impossible = "Oh, my keyboard!";

        int n = sc.nextInt();
        int p = sc.nextInt();
        int[] lilX = new int[p];
        for (int i = 0; i < lilX.length; i++) {
            lilX[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int[] lilY = new int[q];
        for (int i = 0; i < lilY.length; i++) {
            lilY[i] = sc.nextInt();
        }
        sc.close();

        HashSet<Integer> result = new HashSet<>();
        for (int num : lilX) {
            result.add(num);
        }
        for (int num : lilY) {
            result.add(num);
        }
        if (result.size() == n) {
            System.out.println(pass);
        } else {
            System.out.println(impossible);
        }

    }
}
