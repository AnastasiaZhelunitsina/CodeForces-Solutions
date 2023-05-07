import java.util.HashSet;
import java.util.Scanner;

public class Pangram_520A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 26) {
            System.out.println("NO");
            sc.close();
        } else {
            sc.nextLine();
            char[] wordSplit = sc.nextLine().toLowerCase().toCharArray();
            sc.close();
            HashSet<Character> charCount = new HashSet<>();
            for (char symbol : wordSplit) {
                charCount.add(symbol);
            }
            if (charCount.size() >= 26) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
