public class RaggedArrays {
    public static int[][] buildRaggedArrays(int size){
        int[][] result;
        result = new int[size][];
        for(int i=0;i<size; i++){
            result[i] = new int[size-i];
        }
        return result;
    }

    public static void main(String[] args){
        int size = 5;
        int[][] matrix = buildRaggedArrays(size);
        matrix = fillMatrix(matrix);
        printMatrix(matrix);
    }

    public static int[][] fillMatrix(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j < matrix[i].length; j++){
                matrix[i][j] = 1+i+j;
            }
        }
        return matrix;
    } 

    public static void printMatrix(int[][] matrix){
        for(int[] array: matrix){
            for(int element: array){
                System.out.printf("%3d ",element);
            }
            System.out.println();
        }
            
    }
}
