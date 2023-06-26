import java.util.Scanner;

public class BlackSquare_431A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = new int[4];
        for (int i = 0; i < points.length; i++) {
            points[i] = sc.nextInt();
        }
        String str = sc.next();
        sc.close();
        System.out.println(answer(points, str));
    }

    static int answer(int[] array, String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = Character.getNumericValue(s.charAt(i));

            if (current == 1) {
                sum += array[0];
            } else if (current == 2) {
                sum += array[1];
            } else if (current == 3) {
                sum += array[2];
            } else if (current == 4) {
                sum += array[3];
            }
        }
        return sum;
    }
}
