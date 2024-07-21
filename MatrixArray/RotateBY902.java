package MatrixArray;
public class RotateBY902 {
    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int len = mat.length;

        for (int i = 0; i < len - 1; i++) {

            for (int j = i + 1; j < len; j++) {

                     int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;

            }

        }

        // rev

        for (int i = 0; i < len; i++) {
            int start = 0;
            int end = len - 1;
            while (start < end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;

                start++;
                end--;
            }

        }

        print(mat, len, len);

    }

 

    public static void print(int[][] arr, int n, int m) {
        // printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

    }
}
