import java.util.Scanner;

public class SoldierAndBananas_546A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        String[] splitLine = line.split(" ");

        int price = Integer.parseInt(splitLine[0]);
        int cash = Integer.parseInt(splitLine[1]);
        int quantity = Integer.parseInt(splitLine[2]);

        int finalPrice = 0;
        for (int i = 1; i <= quantity; i++) {
            finalPrice += price * i;
        }

        if (finalPrice < cash) {
            System.out.println(0);
        } else {
            System.out.println(finalPrice - cash);
        }
    }
}
