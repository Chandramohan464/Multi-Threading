class MatrixMultiplier implements Runnable{
    int[][] A;
    int[][] B;
    int[][] result;
    int rows;
    int cols;
    int size;

    MatrixMultiplier(int[][] A,int[][] B,int[][] result,int rows,int cols,int size){
        this.A = A;
        this.B = B;
        this.result = result;
        this.rows = rows;
        this.cols = cols;
        this.size = size;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += A[rows][i] * B[i][cols];
        }

        synchronized (result) {
            result[rows][cols] = sum;
        }
    }
    
}

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] B = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rowsA = A.length;
        int colsA = A[0].length;
        int colsB = B[0].length;
        int[][] result = new int[rowsA][colsB];


        Thread[][] threads = new Thread[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                threads[i][j] = new Thread(new MatrixMultiplier(A, B, result, i, j, colsA));
                threads[i][j].start();
            }
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                try {
                    threads[i][j].join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("Result matrix:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
