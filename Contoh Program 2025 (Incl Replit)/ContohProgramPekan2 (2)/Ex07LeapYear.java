import java.util.Scanner; 

public class Ex07LeapYear {
  public static void main(String[] args) {
    // Create a Scanner
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();

    //melepaskan alokasi resources yang tidak dipakai lagi untuk menghemat dan menghindari conflict dengan program lain.
    input.close(); 
    
    // Check if the year is a leap year 
    boolean isLeapYear = 
      (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    // Display the result in a message dialog box
    System.out.println(year + " is a leap year? " + isLeapYear);   
  } 
}