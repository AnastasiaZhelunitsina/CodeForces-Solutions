import java.util.Arrays;
import java.util.Scanner;

public class ArrivalOfTheGeneral_144A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] line = new int[n];
        for (int i = 0; i < line.length; i++) {
            line[i] = sc.nextInt();
        }
        sc.close();
        int max = Arrays.stream(line).max().getAsInt();
        int min = Arrays.stream(line).min().getAsInt();
        int lastIndexMin = getLastIndexMin(line, min);

        int counter = 0;

        for (int i = lastIndexMin; i <= line.length - 1; i++) {
            if (i < line.length - 1) {
                int temp = line[i];
                line[i] = line[i + 1];
                line[i + 1] = temp;
                counter++;
            } else if (i == line.length - 2) {
                int temp = line[i - 1];
                line[i - 1] = line[i];
                line[i] = temp;
                counter++;
            }
        }

        int firstIndexMax = getFirstIndexMax(line, max);

        for (int i = firstIndexMax; i > 0; i--) {
            int temp = line[i - 1];
            line[i - 1] = line[i];
            line[i] = temp;
            counter++;
        }


        System.out.println(counter);
    }


    public static int getLastIndexMin(int[] array, int number) {
        int index = -1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static int getFirstIndexMax(int[] array, int number) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

}
