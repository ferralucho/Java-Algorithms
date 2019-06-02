package arrays;

/*
4
1 3 2 4
8 1 2 9
1 1 2 2
7 5 3 6
3
1 1 2 2
1 2 3 4
4 4 4 4

Output
2
5
2
6
 */

import java.util.Arrays;
import java.util.Scanner;

public class MedianMatrix {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int filasCol = scan.nextInt();
        int [][] matrix = new int[filasCol][filasCol];
        int tamanio = filasCol * filasCol ;
        double[] retArr = new double[filasCol];

        for (int i = 0; i < filasCol; i++) {
            for (int j = 0; j < filasCol; j++){
                matrix[i][j] = scan.nextInt();
            }
            Arrays.sort(matrix[i]);
        }
        scan.close();

        for (int i = 0; i < filasCol; i++) {
            double mediana;
            if (tamanio % 2 == 0) {
                mediana = (matrix[i][filasCol / 2 - 1] + matrix[i][filasCol / 2]) / 2.0;
            } else {
                mediana = matrix[i][filasCol / 2];
            }
            System.out.println(mediana);
        }



    }
}
