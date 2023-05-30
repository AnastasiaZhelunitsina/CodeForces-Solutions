import java.util.Scanner;

public class BuyAShovel_732A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int coin = sc.nextInt();
        sc.close();
        int quantity = 0;
        boolean flag = false;
        int sumPrice = 0;
        while (!flag) {
            if ((sumPrice % 10 == 0 && sumPrice > 0) || (sumPrice % 10 == coin)) {
                flag = true;
                break;
            } else {
                quantity++;
                sumPrice += price;
            }
        }
        System.out.println(quantity);
    }
}
