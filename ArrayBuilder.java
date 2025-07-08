import java.util.Random;
//usage
/**
 int[][] matrix = {
    {1, 2, 3},
    {0, 1, 4},
    {5, 6, 0}
};

ArrayBuilder ab = new ArrayBuilder();
double[][] matrixDouble = ab.convertIntToDouble(matrix);
double det = ab.determinantDouble(matrixDouble);  // = 1.0
String[][] strMatrix = ab.convertIntToString(matrix);

 */


public class ArrayBuilder {
       
    // a bunch of misc function that involes array manipulation the name explains itself :D
    @Deprecated
    public int[][] makeMeA2dArrayInt(int row, int collum ){
        int[][] integerArr = new int[row][collum]; 
        int dummyAdder = 0;
        for(int i = 0; i < integerArr.length; i++){
            for(int j = 0; j < integerArr[i].length; j++){
                integerArr[i][j] =  dummyAdder++;
            }
        }
        flush2dArrayEmpty(integerArr);
        return integerArr;
    }

    @Deprecated
    public void flush2dArrayEmpty(int intArray2d[][]){
        for(int i = 0; i < intArray2d.length; i++){
            for(int j = 0; j < intArray2d[i].length; j++){
                intArray2d[i][j] =  0;
            }
        }
    }

    @Deprecated
    public int[] convertStringToInt(String intArray[]){
        int[] temp =  new int[intArray.length];
        for(int i = 0;  i < intArray.length; i++ ){
            temp[i] = Integer.parseInt(intArray[i]);
        } 
        return temp;
    }

    @Deprecated
    public int[][] convertStringToIntArray2d(String intArray[][]){
        int[][] temp = new int[intArray.length][];
        for(int i = 0; i < intArray.length; i++ ){
            for(int j = 0; j < intArray[i].length; j++){
                temp[i][j] = Integer.parseInt(intArray[i][j]);
            }
        }
        return temp;
    }

    @Deprecated
    public void printMyInt2dArray(int arr[][]){
        for(int[] row : arr){
            for(int val: row){
                System.out.print(val +"\t");
            }
            System.out.println("");
        }
    }

    @Deprecated
    public void printMyStr2dArray(String arr[][]){
        for(String[] row : arr){
            for(String val: row){
                System.out.print(val +"\t");
            }
            System.out.println("");
        }
    }

    @Deprecated
    public void fill2dArrayWithValue(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
            }
        }
    }



    @Deprecated
    public int[][] transpose2dArray(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposed = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    @Deprecated
    public int[][] clone2dArray(int[][] original) {
        int[][] clone = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            clone[i] = original[i].clone();
        }
        return clone;
    }

    @Deprecated
    public boolean is2dArrayEmpty(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                if (val != 0) return false;
            }
        }
        return true;
    }


    @Deprecated
    public void randomize2dArray(int[][] array, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
    }

    @Deprecated
    public int[][] multiplyMatrix(int[][] A, int[][] B) {
        int aRows = A.length;
        int aCols = A[0].length;
        int bCols = B[0].length;

        int[][] result = new int[aRows][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }


    @Deprecated
    public int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinant(minor(matrix, 0, col));
        }

        return det;
    }

    @Deprecated
    private int[][] minor(int[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        return minor;
    }


    @Deprecated
    public int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    @Deprecated
    public int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    @Deprecated
    public String[][] convertIntToString(int[][] intArray) {
        String[][] result = new String[intArray.length][];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = new String[intArray[i].length];
            for (int j = 0; j < intArray[i].length; j++) {
                result[i][j] = String.valueOf(intArray[i][j]);
            }
        }
        return result;
    }


    @Deprecated
    public double determinantDouble(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinantDouble(minorDouble(matrix, 0, col));
        }

        return det;
    }

    private double[][] minorDouble(double[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }

        return minor;
    }


    @Deprecated
    public double[][] convertIntToDouble(int[][] intArray) {
        double[][] result = new double[intArray.length][];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = new double[intArray[i].length];
            for (int j = 0; j < intArray[i].length; j++) {
                result[i][j] = intArray[i][j];
            }
        }
        return result;
    }










    
}
