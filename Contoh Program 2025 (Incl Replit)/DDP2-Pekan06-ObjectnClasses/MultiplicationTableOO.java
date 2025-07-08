import java.util.Scanner;

public class MultiplicationTableOO {
    private int baris;
    private int kolom;

    public void setBaris(int baris){
        this.baris = baris;
    }

    public int getBaris(){
        return baris;
    }

    MultiplicationTableOO(){

    }

    MultiplicationTableOO(int baris, int kolom){
        this.baris = baris;
        this.kolom = kolom;
    }

    public void cetakHeader(){
        // Display the table heading
        System.out.println("           Multiplication Table");

        // Display the number title
        System.out.print("    ");
        for (int j = 1; j <= this.kolom; j++)
        System.out.print("   " + j);

        System.out.println("\n-----------------------------------------");
    }

    public void cetakBaris(int baris){
            System.out.print(baris + " | ");
            
            for (int j=1; j <= this.kolom; j++) {
                // Display the product and align properly
                System.out.printf("%4d", baris * j);
            }
            System.out.println();
    }

    public void cetakBody(){
        // Print table body
        for(int i=1; i<= this.baris;i++){
            cetakBaris(i);
        }
    }

    public void cetak(){
        cetakHeader();
        cetakBody();
    }

  /** Main method */
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Tentukan panjang baris:");
    int baris = input.nextInt();
    System.out.print("Tentukan panjang kolom:");
    int kolom = input.nextInt();

    MultiplicationTableOO table = new MultiplicationTableOO(baris, kolom);
    table.cetak();

    System.out.print("Tentukan panjang baris:");
    baris = input.nextInt();
    System.out.print("Tentukan panjang kolom:");
    kolom = input.nextInt();


    MultiplicationTableOO table2 = new MultiplicationTableOO(baris, kolom);
    table2.cetak();
    
    }
}
