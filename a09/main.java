import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("For first matrix:");
        System.out.print("Enter the number of rows: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols1 = scanner.nextInt();
        Integer[][] matrix1 = new Integer[rows1][cols1];
        System.out.println("Enter the elements:");
        inputMatrix(matrix1, scanner);

        System.out.println("\nFor second matrix: ");
        System.out.print("Enter the number of rows: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols2 = scanner.nextInt();
        Integer[][] matrix2 = new Integer[rows2][cols2];
        System.out.println("Enter the elements:");
        inputMatrix(matrix2, scanner);

        if (cols1 != rows2) {
            System.out.println("\nMatrix multiplication is not possible.");
        } else {
            Integer[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

            System.out.println("\nResultant Matrix after multiplication:");
            displayMatrix(resultMatrix);
        }

        scanner.close();
    }
    private static void inputMatrix(Integer[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }
    private static Integer[][] multiplyMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;

        Integer[][] resultMatrix = new Integer[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                resultMatrix[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }
    private static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
      