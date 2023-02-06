package leetCode.easy;

/*
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal,
switching the matrix's row and column indices.
 */
public class TransposeMatrix_867 {
    public int[][] transpose(int[][] A) {
        int m = A.length, n = A[0].length;
        int[][] result = new int[n][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[j][i] = A[i][j];
            }
        }
        return result;
    }
}
