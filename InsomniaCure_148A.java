import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class InsomniaCure_148A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        Set<Integer> result = new HashSet<>();

        for (int i = 1; i <= d; i++) {
            if (i % k != 0) {
                if (i % l != 0) {
                    if (i % m != 0) {
                        if (i % n != 0) {
                            result.add(i);
                        }
                    }
                }
            }
        }
        System.out.println(d - result.size());
    }
}
