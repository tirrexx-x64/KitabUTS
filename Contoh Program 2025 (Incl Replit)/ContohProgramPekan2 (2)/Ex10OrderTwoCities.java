import java.util.Scanner;

public class Ex10OrderTwoCities {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Prompt the user to enter two cities
    System.out.print("Enter the first city: ");
    String city1 = input.next();
    System.out.print("Enter the second city: ");
    String city2 = input.nextLine();

    //melepaskan alokasi resources yang tidak dipakai lagi untuk menghemat dan menghindari conflict dengan program lain.
    input.close();

    if (city1.equalsIgnoreCase(city2))
      System.out.println("Both cities are the same!");
    else
      System.out.println("Different cities!");

    if (city1.compareTo(city2) < 0)
      System.out.println("The cities in alphabetical order are " +
         city1 + " " + city2);
    else
      System.out.println("The cities in alphabetical order are " +
          city2 + " " + city1);
  }
}
