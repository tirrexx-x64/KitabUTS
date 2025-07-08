public class MultiplicationTable {
  /** Main method */
  public static void main(String[] args) {
    // Display the table heading
    System.out.println("           Multiplication Table");

    // Display the number title
    System.out.print("    ");
    for (int j = 1; j <= 9; j++)
      System.out.print("   " + j);

    System.out.println("\n-----------------------------------------");

    // Print table body
    int i = 1;
    while ( i < 10) {
      System.out.print(i + " | ");
      int j = 1;
      while ( j < 10) {
        // Display the product and align properly
        System.out.printf("%4d", i * j);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}