import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        sc.close();
        StringBuilder newLine = new StringBuilder();
        char[] charLine = line.toCharArray();
        for (int i = 0; i < charLine.length; i++) {
            String elem = String.valueOf(charLine[i]);
            if (i == 0) {
                newLine.append(elem.toUpperCase());
            } else {
                newLine.append(elem);
            }
        }
        System.out.println(newLine.toString());
    }
}
