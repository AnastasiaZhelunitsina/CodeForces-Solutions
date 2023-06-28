import java.util.Scanner;

public class SquareString_1619A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(stringCheck(sc.next()) ? "YES" : "NO");
        }

        sc.close();
    }

    static boolean stringCheck(String str) {

        boolean answer = false;
        if (str.length() % 2 == 0) {
            final int mid = str.length() / 2;
            String[] parts = {str.substring(0, mid), str.substring(mid)};
            if (parts[0].equals(parts[1])) {
                answer = true;
            }
        }
        return answer;
    }
}
