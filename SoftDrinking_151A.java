import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int friends = sc.nextInt();
        int bottles = sc.nextInt();
        int milliliters = sc.nextInt();
        int limes = sc.nextInt();
        int slices = sc.nextInt();
        int salt = sc.nextInt();
        int portionDrink = sc.nextInt();
        int portionSalt = sc.nextInt();
        sc.close();

        int toastDrinks = (bottles * milliliters) / portionDrink;
        int cutLimes = limes * slices;
        int countSalt = salt / portionSalt;

        System.out.println((Math.min(toastDrinks, Math.min(cutLimes, countSalt)) / friends));
    }
}
