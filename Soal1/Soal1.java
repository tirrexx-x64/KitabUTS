import java.util.Scanner;

/*
    Pelajari program ini 
    Baca soal pada Dokumen DeskripsiSoal.pdf (.md)
*/

public class Soal1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the size (n) of the square matrix: ");
    int ukuran = input.nextInt();    
    
    int[][] m = isiMatriks(ukuran); // Set a matrix
    input.close();
    
    // Display sum of elements
    System.out.println("\nSum of all elements is " + sum(m));
    
  }
  
  public static int[][] isiMatriks(int ukuran) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    
    // Enter array values
    int[][] m = new int[ukuran][ukuran];
    System.out.println("Enter " + m.length + " rows and "
      + m[0].length + " columns: ");
    for (int i = 0; i < m.length; i++)
      for (int j = 0; j < m[i].length; j++)
        m[i][j] = input.nextInt();
    input.close();

    return m;
  }

  public static int sum(int[][] m) {
    int total = 0;
    for (int row = 0; row < m.length; row++) {
      for (int column = 0; column < m[row].length; column++) {
        total += m[row][column];
      }
    }

    return total;
  }

}