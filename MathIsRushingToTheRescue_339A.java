import java.util.Arrays;
import java.util.Scanner;

public class MathIsRushingToTheRescue_339A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] splitLine = line.split("\\+");
        int[] newLine = new int[splitLine.length];

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < splitLine.length; i++) {
            newLine[i] = Integer.parseInt(splitLine[i]);
        }
        Arrays.sort(newLine);
        for (int i = 0; i < newLine.length; i++) {
            if (i == newLine.length - 1) {
                result.append(newLine[i]);
            } else {
                result.append(newLine[i] + "+");
            }
        }

        System.out.println(result.toString());

    }
}
