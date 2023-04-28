
import java.util.Scanner;

public class Team_231A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            String[] temp = sc.nextLine().split(" ");
            int elemSum = 0;
            for (String elem : temp) {
                elemSum += Integer.parseInt(elem);
            }
            array[i] = elemSum;
        }
        sc.close();

        int counter = 0;
        for (int num : array) {
            if (num >= 2) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
