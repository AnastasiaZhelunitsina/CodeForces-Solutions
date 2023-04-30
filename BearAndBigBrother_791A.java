import java.util.Scanner;

public class BearAndBigBrother_791A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String buff = sc.nextLine();
        sc.close();
        String[] splitBuff = buff.split(" ");

        int weightLimak = Integer.parseInt(splitBuff[0]);
        int weightBob = Integer.parseInt(splitBuff[1]);

        int result = 0;

        while (true) {
            if (weightLimak <= weightBob) {
                weightLimak *= 3;
                weightBob *= 2;
                result++;
            } else {
                break;
            }
        }

        System.out.println(result);
    }
}
