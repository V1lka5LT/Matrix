package Matricos;

import java.util.Random;

public class Matrix {
    private int[][] dataM;

    public Matrix(int[][] dataM) { //konstruktorius
        this.dataM = dataM;
    }

    public static Matrix generaterand(int width, int height) { //random matricos generatorius pagal ploti ir auksti
        Random rand = new Random();
        int[][] matrix = new int[width][height];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = rand.nextInt(10); //generuojamas random skaicius nuo 0 iki 10 kuris irasomas i matrica
            }
        }
        return new Matrix(matrix);
    }

    public Matrix multiplier(Matrix sum) { //matricos dauginimas
        int r1 = getHeight();
        int c1 = sum.getWidth();
        int[][] product = new int[r1][c1];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                for (int k = 0; k < c1; k++) {
                    product[i][j] += this.dataM[i][k] * sum.dataM[k][j];
                }
            }
        }
        return new Matrix(product);
    }

    public int getWidth() {
        return dataM.length;
    }

    public int getHeight() {
        return dataM[0].length;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int[] row : this.dataM) {
            for (int column : row) {
                result.append(column).append("    ");
            }
            result.append("\n");
        }
        return result.toString();
    }
}
