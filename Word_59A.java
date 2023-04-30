import java.util.Scanner;

public class Word_59A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        char[] splitWord = word.toCharArray();

        int counterUpper = 0;
        int counterLower = 0;

        for (int i = 0; i < splitWord.length; i++) {
            if (Character.isUpperCase(splitWord[i])) {
                counterUpper++;
            } else if (Character.isLowerCase(splitWord[i])) {
                counterLower++;
            }
        }

        if (counterLower == counterUpper || counterLower > counterUpper) {
            System.out.println(word.toLowerCase());
        } else {
            System.out.println(word.toUpperCase());
        }

    }
}
