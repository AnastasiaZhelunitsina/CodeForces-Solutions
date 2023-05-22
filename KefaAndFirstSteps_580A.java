import java.util.Scanner;

public class KefaAndFirstSteps_580A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        int counter = 0;
        int maxCnt = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] <= array[i + 1]){
                counter++;
                if (counter > maxCnt) {
                    maxCnt = counter;
                }
            } else {
                counter = 0;
            }
        }
        System.out.println(maxCnt + 1);
    }
}
