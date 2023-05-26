import java.util.Scanner;

public class Dubstep_208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        StringBuilder result = new StringBuilder();
        String[] newStr = str.replace("WUB", " ").trim().split(" ");

        for (String word : newStr) {
            result.append(word.trim() + " ");
        }
        System.out.println(result);
    }
}
