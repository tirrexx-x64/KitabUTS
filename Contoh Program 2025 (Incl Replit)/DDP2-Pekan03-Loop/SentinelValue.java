import java.util.Scanner; 

public class SentinelValue {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Read an initial data
    System.out.print(
      "Enter an integer (the input ends if it is 99999): ");
    int data = input.nextInt();
    input.nextLine();
    // Keep reading data until the input is 0
    int sum = 0;
    String jawab="";
    while (data != 99999 || (jawab.equals("y"))) {
      sum += data;

      System.out.println("Apakah akan memasukan data lagi (y/t)");
      jawab = input.nextLine();
      if (jawab.equals("y")){
        // Read the next data
        System.out.print(
          "Enter an integer (the input ends if it is 99999): ");
        data = input.nextInt();
        input.nextLine();
      }
      else data = 99999;
    }

    System.out.println("The sum is " + sum);
  }
}