import java.util.Scanner;

public class BeautifulMatrix_263A {
    public static void main(String[] args) {

        final int INDEX_CENTRAL_COLUMN = 2;
        final int INDEX_CENTRAL_LINE = 2;
        final int ONE = 1;

        Scanner sc = new Scanner(System.in);
        String[] temp = new String[5];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sc.nextLine();
        }

        int[][] matrix = new int[5][5];

        for (int i = 0; i < matrix.length; i++) {
            String buff = temp[i];
            String[] buffArr = buff.split(" ");
            String str = "";
            for (String element : buffArr) {
                str += element;
            }
            char[] array = str.toCharArray();
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Character.getNumericValue(array[j]);
            }
        }

        int moveCounter = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == ONE) {
                    int line = i;
                    int column = j;

                    if (column > INDEX_CENTRAL_COLUMN) {
                        moveCounter += column - INDEX_CENTRAL_COLUMN;
                    } else {
                        moveCounter += INDEX_CENTRAL_COLUMN - column;
                    }

                    if (line > INDEX_CENTRAL_LINE) {
                        moveCounter += line - INDEX_CENTRAL_LINE;
                    } else {
                        moveCounter += INDEX_CENTRAL_LINE - line;
                    }
                }
            }
        }
        System.out.println(moveCounter);

    }
}
