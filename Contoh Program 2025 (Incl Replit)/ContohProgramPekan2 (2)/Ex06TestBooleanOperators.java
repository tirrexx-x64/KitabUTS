import java.util.Scanner; 

public class Ex06TestBooleanOperators {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Receive an input
    System.out.print("Enter an integer: ");
    int number = input.nextInt();

    //melepaskan alokasi resources yang tidak dipakai lagi untuk menghemat dan menghindari conflict dengan program lain.
    // input.close(); 

    if (number % 2 == 0 && number % 3 == 0)
      System.out.println(number + " is divisible by 2 and 3.");

    if (number % 2 == 0 || number % 3 == 0)
      System.out.println(number + " is divisible by 2 or 3.");

    if (number % 2 == 0 ^ number % 3 == 0)
      System.out.println(number + 
        " divisible by 2 or 3, but not both.");
  }
}