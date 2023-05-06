import java.util.Scanner;

public class Drinks_200B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ratio = new double[n];
        for (int i = 0; i < n; i++) {
            ratio[i] = sc.nextInt();
        }
        double sum = 0;
        for (double portion : ratio) {
            sum += portion;
        }
        System.out.println(sum / ratio.length);
    }
}
