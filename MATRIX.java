class MATRIX{
public static void main(String args[]) {

        System.out.println("NAME:AAYUSH");
        System.out.println("ROLL NO:18103003");

        int r1 = 2, c1 = 3;
        int r2 = 3, c2 = 2;
        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6} };
        int[][] secondMatrix = { {1, 2}, {3, 4}, {5, 6} };

        
        int[][] product = new int[r1][c2];
        for(int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        
        System.out.println("Multiplication of two matrices is: ");
        for(int[] row : product) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}
