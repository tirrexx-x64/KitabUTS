public class TotalMatriks {
    public static void main(String[] args){
        int[][] matriks = {
            {1,2,3,4},
            {5,6,7,8},
            {3,4,5,6}
        };
        printMatriks(matriks);
        jumlahBaris(matriks);
        jumlahKolom(matriks);
    }

    public static void printMatriks(int[][] matrix){
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
            System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        } 
    }

    public static void jumlahKolom(int[][] matriks){
        int total;
        for(int kol=0;kol<matriks[0].length;kol++){
            total=0;
            for(int baris=0;baris<matriks.length;baris++){
                total+=matriks[baris][kol];
            }
            System.out.println("Jumlah kolom:" + kol + " adalah: "+ total);
        }
    }

    public static void jumlahBaris(int[][] matriks){
        int total;
        for(int row=0;row<matriks.length;row++){
            total = 0;
            for(int col=0;col<matriks[row].length;col++){
                total += matriks[row][col];
            }
            System.out.println("Jumlah baris: " + row + " adalah "+ total);
        }
    }
}
