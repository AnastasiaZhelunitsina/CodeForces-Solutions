import java.util.Scanner;

public class DesignTutorialLearnFromMath_472A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int a = 0;
        int b = 0;
        for (int i = 4; i < n; i++) {
            if (isComposite(i) && isComposite(n - i)) {
                a = i;
                b = n - i;
                break;
            }
        }
        System.out.println(a + " " + b);
    }

    public static boolean isComposite(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}
