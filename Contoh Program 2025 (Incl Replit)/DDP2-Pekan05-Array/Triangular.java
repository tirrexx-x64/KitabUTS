public class Triangular {
    public static int[][] lowerTriangular(int size){
        int [][] result;
        result = new int[size][];
        for(int i=0; i< size; i++){        result[0] = new int[1];
            result[i] = new int[i+1];
        }

        return result;
    }
    public static int[][] sequenceInMatrix(int[][] matrix){
        int count = 1;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j] = count++;
            }
        }
        return matrix;
    }
}
