package lab1.com.company.Task5;

public class Task5 {
    public static void main(String[] args) {

        int n = 3;
        int m = 4;
        int[][] bef = new int[n][m];
        int[][] aft = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                bef[i][j] = (int) ((Math.random() * 9)-1);
            }
        }

        System.out.println("Matrix before");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" " + bef[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                aft[j][i] = bef[i][j] ;
            }
        }

        System.out.println();
        System.out.println("Matrix after");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" " + aft[i][j] + " ");
            }
            System.out.println();
        }

    }
}
