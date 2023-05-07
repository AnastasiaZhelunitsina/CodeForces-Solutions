import java.util.Scanner;

public class AntonAndPolyhedrons_785A {
    public static void main(String[] args) {
        final int TETRAHEDRON = 4;
        final int CUBE = 6;
        final int OCTAHEDRON = 8;
        final int DODECAHEDRON = 12;
        final int ICOSAHEDRON = 20;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] shapes = new String[n];
        for (int i = 0; i < n; i++) {
            shapes[i] = sc.nextLine();
        }
        sc.close();
        int sum = 0;

        for (String shape : shapes) {
            if (shape.equals("Tetrahedron")) {
                sum += TETRAHEDRON;
            } else if (shape.equals("Cube")) {
                sum += CUBE;
            } else if (shape.equals("Octahedron")) {
                sum += OCTAHEDRON;
            } else if (shape.equals("Dodecahedron")) {
                sum += DODECAHEDRON;
            } else if (shape.equals("Icosahedron")) {
                sum += ICOSAHEDRON;
            }
        }
        System.out.println(sum);
    }
}
