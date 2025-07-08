
/*
    Baca soal pada Dokumen DeskripsiSoal.pdf (.md)
    Kerjakan soal 2 di sini
*/
import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai baris: ");
        int baris = input.nextInt();

        System.out.print("Masukkan nilai kolom: ");
        int kolom = input.nextInt();

        int[][] array = new int[baris][kolom];

        System.out.println("Masukkan elemen matriks: ");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                array[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                if (i == 0 || i == baris - 1 || j == 0 || j == kolom - 1) {
                    array[i][j] = 0;
                }
            }
        }

        System.out.println();        

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        
        input.close();
    }
    
}
