
import java.util.Arrays;

public class ZeroMatrix2 {
    public static void main(String[] args) {
        int[][] arr = { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 } };

        int[] cols = new int[arr[0].length];
        int[] rows = new int[arr.length];

        for (int i = 0; i < rows.length; i++) {

            for (int j = 0; j < cols.length; j++) {

                if (arr[i][j] == 1) {
                    cols[j] = 1;
                    rows[i] = 1;
                }
            }
        }

        // add in cols

        for (int i = 0; i < cols.length; i++) {
            if (cols[i] == 1) {
                for (int r = 0; r < rows.length; r++) {
                    arr[r][i] = 1;
                }
            }
        }

        // add in rows
        for (int i = 0; i < rows.length; i++) {
            if (rows[i] == 1) {
                for (int c = 0; c < cols.length; c++) {
                    arr[i][c] = 1;
                }
            }
        }

        System.out.println(Arrays.toString(cols));
        System.out.println(Arrays.toString(rows));
        print(arr, arr.length, arr[0].length);

    }

    public static void print(int[][] arr, int n, int m) {
        // printing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println("--------------");
    }
}
