public class TotalMatriks2 {
    public static void main(String[] args){
        int[][] matriks = {
            {1,2,3,4},
            {5,6,7,8},
            {3,4,5,6}
        };
        int[] jmlBaris = jumlahBaris(matriks);
        for(int baris=0;baris<jmlBaris.length;baris++)
            System.out.println("Jumlah baris:" + baris + " adalah: "+ jmlBaris[baris]);

        int[] jmlKolom = jumlahKolom(matriks);
        for(int kol=0;kol<jmlKolom.length;kol++)
            System.out.println("Jumlah kolom:" + kol + " adalah: "+ jmlKolom[kol]);

    }
    public static int[] jumlahKolom(int[][] matriks){
        int[] total = new int[matriks[0].length];
        for(int kol=0;kol<matriks[0].length;kol++){
            total[kol]=0;
            for(int baris=0;baris<matriks.length;baris++){
                total[kol]+=matriks[baris][kol];
            }
        }
        return total;
    }

    public static int[] jumlahBaris(int[][] matriks){
        int[] total = new int[matriks.length];
        for(int row=0;row<matriks.length;row++){
            total[row] = 0;
            for(int col=0;col<matriks[row].length;col++){
                total[row] += matriks[row][col];
            }
        }
        return total;
    }
}
