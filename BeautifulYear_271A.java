import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BeautifulYear_271A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();

        int result = 0;
        for (int i = 0; ; i++) {
            year += 1;
            int yearTemp = year;
            Set<Integer> splitYear = new HashSet<>();
            while (year != 0) {
                splitYear.add(year % 10);
                year /= 10;
            }
            if (splitYear.size() == 4) {
                result = yearTemp;
                break;
            }
            year = yearTemp;
        }
        System.out.println(result);
    }
}
