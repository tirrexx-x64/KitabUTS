public class Arrays {

    public static int[][] bikinArraysofArrays(int row, int col){
        int[][] matriks;

        matriks = new int[row][];

        for (int i=0; i< row; i++){
            matriks[i]=new int[col];
        }

        return matriks;
    }
}
