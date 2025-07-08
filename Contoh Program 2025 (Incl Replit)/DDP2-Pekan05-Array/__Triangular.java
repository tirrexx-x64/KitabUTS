public class __Triangular {
    public static int[][] lowerTriangular(int size){
        int[][] hasil = new int[size][];
        for(int i = 0; i<size; i++){
            hasil[i] = new int[i+1];
        }
        return hasil;
    }
    public static int[][] sequenceInMatrix(int[][] matrix){
        int count=0;
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j < matrix[i].length; j++){
                   matrix[i][j] = ++count; 
            }
        }
        return matrix;
    }
}
