import java.util.Scanner;

class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int r1 = in.nextInt();
        int c1 = in.nextInt();
        int r2 = in.nextInt();
        int c2 = in.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c1; j++)
                A[i][j] = in.nextInt();

        for (int i = 0; i < r2; i++)
            for (int j = 0; j < c2; j++)
                B[i][j] = in.nextInt();

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += A[i][k] * B[k][j];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }

        in.close();
    }
}
