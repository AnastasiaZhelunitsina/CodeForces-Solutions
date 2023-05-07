import java.util.HashSet;
import java.util.Scanner;

public class AntonAndLetters_443A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] strSplit = sc.nextLine().toCharArray();
        sc.close();
        HashSet<Character> result = new HashSet<>();
        for (char symbol : strSplit) {
            if (Character.isLetter(symbol)) {
                result.add(symbol);
            }
        }
        System.out.println(result.size());
    }
}
