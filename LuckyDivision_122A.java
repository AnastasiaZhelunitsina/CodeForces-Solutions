import java.util.Scanner;

public class LuckyDivision_122A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] combination = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        String result = "NO";
        for (int i = 0; i < combination.length; i++) {
            if (n % combination[i] == 0) {
                result = "YES";
                break;
            }
        }
        System.out.println(result);
    }
}
