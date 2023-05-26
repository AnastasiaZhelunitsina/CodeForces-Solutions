import java.util.Scanner;

public class CapsLock_131A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        char firstLetterChar = word.charAt(0);
        String firstLetter = String.valueOf(firstLetterChar);
        String wordWithoutFirst = word.substring(1);

        StringBuilder result = new StringBuilder();
        if (firstLetter.equals(firstLetter.toLowerCase()) && wordWithoutFirst.equals(wordWithoutFirst.toUpperCase())) {
            char[] charWord = word.toCharArray();
            for (int i = 0; i < charWord.length; i++) {

                if (i == 0) {
                    result.append(String.valueOf(charWord[i]).toUpperCase());
                } else {
                    result.append(String.valueOf(charWord[i]).toLowerCase());
                }
            }
        } else if (word.equals(word.toUpperCase())) {
            result.append(word.toLowerCase());
        } else {
            result.append(word);
        }
        System.out.println(result);
    }
}
