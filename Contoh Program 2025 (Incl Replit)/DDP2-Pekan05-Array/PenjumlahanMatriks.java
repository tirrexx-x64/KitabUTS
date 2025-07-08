public class PenjumlahanMatriks {

    public static void main(String[] args){
        int[][] matriks1 = {{1,2,3},
                            {4,5,6}};
        int[][] matriks2 = {{6,5,4},
                            {3,2,1}};
        int[][] matriksHasil = jumlahMatriks(matriks1,matriks2);
        printMatriks(matriksHasil);
    }

    public static void printMatriks(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        } 
    }

    public static int[][] jumlahMatriks(int[][] m1, int[][] m2){
        return m1;
    }

}
