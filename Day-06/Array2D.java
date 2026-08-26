import java.util.Scanner;

public class Array2D {

    public static void main(String[] args) {

        // Declaration
        // int arr[][] = new int[3][4];

        // Type 2 of declaration

        /*
        int brr[][] = {
                {1, 2},
                {2, 3, 5},
                {4, 5, 8, 9, 7},
                {6, 7}
        };

        // System.out.println(brr[1][0]);

        int n = brr.length;

        for (int i = 0; i < n; i++) {

            // For different columns -> length
            int m = brr[i].length;

            for (int j = 0; j < m; j++) {
                System.out.print(brr[i][j] + " ");
            }

            System.out.println();
        }
        */

        /*
        int brr[][] = {
                {1, 2},
                {2, 3, 5},
                {4, 5, 8, 9, 7},
                {6, 7}
        };

        int row_index = brr.length;

        for (int i = 0; i < row_index; i++) {

            int col_index = brr[i].length;

            for (int j = 0; j < col_index; j++) {
                System.out.print(brr[i][j] + " ");
            }

            System.out.println();
        }
        */

        /*
        Scanner sc = new Scanner(System.in);

        int arr[][] = new int[3][4];
        int n = arr.length;

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 4; j++) {

                int m = arr[i].length;

                System.out.println(
                        "Provide value for row = " + i +
                        " and column = " + j
                );

                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {

            int m = arr[i].length;

            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        */

        /*
        int arr[][] = {
                {1, 2, 3},
                {1, 5, 8, 9}
        };

        int sum = 0;
        int mup = 1;

        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int m = arr[i].length;

            for (int j = 0; j < m; j++) {
                // sum += arr[i][j];
                mup = mup * arr[i][j];
            }
        }

        // System.out.println(sum);
        System.out.println(mup);
        */

        int arr[][] = {
                {1, 3, 5},
                {96, 6, 8, 7},
                {5, 78, 32}
        };

        int max = arr[0][0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            int m = arr[i].length;

            for (int j = 0; j < m; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}