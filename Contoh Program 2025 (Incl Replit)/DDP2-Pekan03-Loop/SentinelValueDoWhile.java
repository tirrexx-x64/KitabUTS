import java.util.Scanner; 

public class SentinelValueDoWhile {
  /** Main method */
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    // Keep reading data until the input is 0
    int sum = 0;
    String jawab="";
    int data = 0;
    do {
        // Read the next data
        System.out.print(
            "Enter an integer (the input ends if it is 99999): ");
        data = input.nextInt();
        System.out.println("apakah akan isi data lagi(y/n)");
        jawab = input.next();
        sum += data;
    } while(data != 99999 && (jawab.equals("y")));

    System.out.println("The sum is " + sum);
  }
}