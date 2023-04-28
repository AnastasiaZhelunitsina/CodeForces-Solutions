import java.util.Scanner;

public class LayingDominoes_50A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] temp = sc.nextLine().split(" ");
        sc.close();

        int m = Integer.parseInt(temp[0]);
        int n = Integer.parseInt(temp[1]);

        int rectangleArea = m * n;

        int dominoes = rectangleArea / 2;
        System.out.println(dominoes);
    }
}
