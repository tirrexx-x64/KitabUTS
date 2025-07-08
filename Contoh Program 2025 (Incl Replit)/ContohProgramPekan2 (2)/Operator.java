import java.util.Scanner; 

public class Operator{
  public static void main(String[] belumDiPakai){
    int bilangan1;
    int bilangan2; 

    Scanner input = new Scanner(System.in);
    System.out.print("Tulis bilangan1: ");
    bilangan1 = input.nextInt();
    System.out.print("Tulis bilangan2: ");
    bilangan2 = input.nextInt();
    input.close();
    int bilangan3 = bilangan1 | bilangan2;
    System.out.println("Contoh ini hanya akan tampil rapih untuk bilangan kurang dari 64");
    System.out.printf("bitwise evaluasi bilangan3: %d | %d  = %d \n", bilangan1, bilangan2, bilangan1 | bilangan2);
    System.out.println("Karena");
    System.out.printf("bilangan1: %3d dalam basis dua adalah %6s\n", bilangan1, Integer.toString(bilangan1,2));
    System.out.printf("bilangan2: %3d dalam basis dua adalah %6s\n", bilangan2, Integer.toString(bilangan2,2));
    System.out.printf("bilangan3: %3d dalam basis dua adalah %6s = %d pada basis 10\n", bilangan3, Integer.toString(bilangan3,2), bilangan3);
//    System.out.printf("evaluasi bilangan1 || bilangan2 adalah = %d", bilangan1 || bilangan2); // operator || bukan untuk bilangan.

    System.out.println("\nOperasi bit punya banyak manfaatnya antara lain untuk menyamarkan data/pesan rahasia dengan bitoperator xor (^).");
    int bilanganTersamar = bilangan1 ^ bilangan2;  
    System.out.printf("Bilangan1 dikirim secara tersamar: %d\n", bilanganTersamar);
    System.out.println("Yang membaca akan mengira bilangan itu adalah bilangan sebenarnya yang  dikirim");
    System.out.printf("Padahal bilangan1 yang sesunggahnya didapatkan dengan melakukan operasi bilanganTersamar xor (^) bilangan2 = %d\n", bilanganTersamar ^ bilangan2 );

  }

}