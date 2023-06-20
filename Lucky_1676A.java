import java.util.Scanner;

public class Lucky_1676A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            System.out.println(luckyCheck(str));
        }
        sc.close();
    }

    static String luckyCheck(String str) {
        char[] splitStr = str.toCharArray();
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;
        for (int i = 0; i < 3; i++) {
            sumFirstHalf += Character.getNumericValue(splitStr[i]);
        }
        for (int i = 3; i < splitStr.length; i++) {
            sumSecondHalf += Character.getNumericValue(splitStr[i]);
        }

        if (sumFirstHalf == sumSecondHalf) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
