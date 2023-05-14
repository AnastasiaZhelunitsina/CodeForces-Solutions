import java.util.Scanner;

public class UltraFastMathematician_61A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] first = sc.nextLine().toCharArray();
        char[] second = sc.nextLine().toCharArray();
        sc.close();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < first.length; i++) {
            if (first[i] == second[i]){
                result.append(0);
            } else {
                result.append(1);
            }
        }
        System.out.println(result);
    }
}
