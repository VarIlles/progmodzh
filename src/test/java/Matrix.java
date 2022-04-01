import java.util.ArrayList;

public class Matrix {


    public int numberOfNonZeroValues(int[][] matrix) {

        int nonNulls = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\n\n");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("\t\t");
                if (matrix[i][j] != 0) {
                    nonNulls++;
                }
            }
        }

        return nonNulls;
    }

    public ArrayList<Integer> indexOfColumnsWithSameValues (int[][] matrix) {
        int[] eredmeny = new int[matrix[0].length];

        ArrayList<Integer> samevalueindex = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\n\n");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("\t\t");
                if (matrix[i][1] == matrix[i][j]) {
                    eredmeny[j]++;
                }
            }
        }


        for (int i = 0; i < eredmeny.length; i++){

            if (eredmeny[i] == matrix.length){
                samevalueindex.add(i);
            }
        }

        return samevalueindex;
    }








}
