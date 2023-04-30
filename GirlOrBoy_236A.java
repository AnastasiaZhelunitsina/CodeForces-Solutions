import java.util.HashSet;
import java.util.Scanner;

public class GirlOrBoy_236A {
    public static void main(String[] args) {
        final String GIRL = "CHAT WITH HER!";
        final String BOY = "IGNORE HIM!";

        Scanner sc = new Scanner(System.in);
        String nickname = sc.nextLine();
        sc.close();
        char[] nickChar = nickname.toCharArray();
        HashSet<Character> result = new HashSet<>();

        for (int i = 0; i < nickChar.length; i++) {
            result.add(nickChar[i]);
        }

        int len = result.size();

        if (len % 2 == 0) {
            System.out.println(GIRL);
        } else {
            System.out.println(BOY);
        }
    }
}
