import java.util.Scanner;

public class TheWordsAreTooLong_71A {
    public static void main(String[] args) {
        final int SHORT_LEN = 10;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();
            array[i] = word;
        }
        sc.close();

        for (String word : array) {
            StringBuilder newWord = new StringBuilder();
            if (word.length() <= SHORT_LEN) {
                System.out.println(word);
            } else {
                char[] charWord = word.toCharArray();

                for (int j = 0; j < charWord.length; j++) {
                    if (j == charWord.length - 2) {
                        newWord.append(charWord.length - 2);
                    }
                    if (j == 0) {
                        newWord.append(charWord[j]);
                    }
                    if (j == charWord.length - 1) {
                        newWord.append(charWord[j]);
                    }
                }
                System.out.println(newWord);
            }

        }
    }
}
