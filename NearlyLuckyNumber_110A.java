import java.util.Scanner;

public class NearlyLuckyNumber_110A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        sc.close();
        String[] splitNum = num.split("");

        int counter = 0;
        for (String number : splitNum) {
            if (Integer.parseInt(number) == 4 || Integer.parseInt(number) == 7) {
                counter++;
            }
        }

        if (counter == 4 || counter == 7) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
