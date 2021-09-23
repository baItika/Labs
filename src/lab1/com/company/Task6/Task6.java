package lab1.com.company.Task6;



public class Task6 {

    private int[][] multiplication(int[][] array1, int[][] array2)
    {
        int[][] result;
        result = new int[0][0];

        return result;
    }

    public static void main(String[] args) {

        int n = 2;
        int m = 3;
        int[][] one = new int[n][m];
        int[][] two = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                one[i][j] = (int) ((Math.random() * 9) - 1);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                two[i][j] = (int) ((Math.random() * 9) - 1);
            }
        }

        System.out.println("Matrix one");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(" " + one[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix two");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(" " + two[i][j] + " ");
            }
            System.out.println();
        }
    }
}

