import java.util.Scanner;

public class Presents_136A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] presentTo = new int[n];
        for (int i = 0; i < presentTo.length; i++) {
            presentTo[i] = sc.nextInt();
        }
        sc.close();
        int[] presentFrom = new int[presentTo.length];
        int i = 0;
        while (i < n) {
            presentFrom[presentTo[i] - 1] = i + 1;
            i++;
        }
        for (int num : presentFrom) {
            System.out.print(num + " ");
        }
    }
}
