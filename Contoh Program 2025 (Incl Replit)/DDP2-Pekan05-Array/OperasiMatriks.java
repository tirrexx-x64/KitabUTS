public class OperasiMatriks {

    public static int[][] penjumlahan(int[][] matriks1, int[][] matriks2){
        int[][] hasil = new int[matriks1.length][matriks1[0].length];

        for(int i=0;i<matriks1.length;i++){
            for(int j=0;j<matriks1[0].length; j++){
                hasil[i][j] = matriks1[i][j] + matriks2[i][j];
            }
        }

        return hasil;
    }

    public static int[][] perkalian(int[][] matriks1, int[][] matriks2){
        int[][] hasil = new int[matriks1.length][matriks2[0].length];

        for(int baris1 = 0; baris1 < matriks1.length; baris1++){
            for(int kolom2 = 0; kolom2 < matriks2[0].length; kolom2++){
                for(int baris2 = 0; baris2 < matriks2.length; baris2++){
                    hasil[baris1][kolom2] += matriks1[baris1][baris2] * matriks2[baris2][kolom2];  
                }
            }
        }

    
        return hasil;
    }


}
