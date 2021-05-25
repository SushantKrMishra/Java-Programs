import java.util.*;

public class Array {
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];

    public static void main(String[] Args) {
        Scanner sc1 = new Scanner(System.in);
        Array a1 = new Array();
        a1.input();
        a1.sum();
        a1.print();
        sc1.close();
    }

    public void input() {
        
        System.out.println("Enter the inputs of the matrix 1 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Enter the inputs of the matrix 2 : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc1.nextInt();
            }
        }
    }

    public void sum() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
    }

    public void print() {
        System.out.println("Sum of the matrix are -->");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j]+"  ");
            }
          System.out.println();
        }
    }
}
