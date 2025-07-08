public class MultiplicationTableMethod {

    public static void cetakGaris(){
      System.out.println("\n---------------------------------------------");
    }

    public static void cetak19(){
      System.out.printf("       ");
      for(int i=1;i<10;i++){
        System.out.printf("%4d",i);
      }
    }

    public static void cetakHeader(){
      System.out.println("           Multiplication Table");
      cetak19();
      cetakGaris();
    }

    public static void cetakBaris(int baris){
      System.out.printf("%4d | ",baris);
      for(int kolom=1;kolom<=9;kolom++){
        System.out.printf("%4d",baris*kolom);
      }
      System.out.println();

    }

    public static void cetakTabel(){
      for(int baris=1;baris<=9;baris++){
        cetakBaris(baris);
      }
    }

    public static void main(String[] argv){
      cetakHeader();
      cetakTabel();
    }

}

  /** Main method */
/*


  public static void cetakHeader(){
    System.out.println("           Multiplication Table");

    // Display the number title
    System.out.print("    ");
    for (int j = 1; j <= 9; j++)
      System.out.print("   " + j);

    System.out.println("\n-----------------------------------------");
  }
  
  public static void cetakBaris(int baris){
    System.out.print(baris + " | ");
    int j = 1;
    while ( j < 10) {
      // Display the product and align properly
      System.out.printf("%4d", baris * j);
      j++;
    }
    System.out.println();
  }

  public static void cetakTabel(){
    int i = 1;
    while ( i < 10) {
      cetakBaris(i);
      i++;
    }

  }

  public static void main(String[] args) {
    // Display the table heading
    cetakHeader();
    // Print table body
    cetakTabel();
  }
 

 */