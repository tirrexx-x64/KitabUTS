public class MultiplicationTableMethod {

  public static void cetakHeader(int ukuran){
    // Display the table heading
    System.out.println("           Multiplication Table");

    // Display the number title
    System.out.print("    ");
    for (int j = 1; j < ukuran; j++)
        System.out.print("   " + j);
    
    System.out.print("\n----");
    for (int j = 1; j < ukuran; j++)
        System.out.print("----");

    System.out.println();
  }  

  public static void cetakBaris(int barisKe, int ukuran){
    int i = barisKe;
    System.out.print(i + " | ");
    int j = 1;
    while ( j < ukuran) {
      // Display the product and align properly
      System.out.printf("%4d", i * j);
      j++;
    }
    System.out.println();
  }

  public static void cetakPerkalian(int ukuran){
    cetakHeader(ukuran);
    // Print table body
    int i = 1;
    while ( i < ukuran) {
        cetakBaris(i, ukuran);
        i++;
    }
  }

  /** Main method */
  public static void main(String[] args) {
    cetakPerkalian(5);
  }
}