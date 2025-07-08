import java.util.Scanner;

public class RepeatAdditionQuiz {
  public static void main(String[] args) {
    int number1 = (int)(Math.random() * 10);
    int number2 = (int)(Math.random() * 10);
    int number3 = (int)(Math.random() * 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number1 + " + " + number2 + " + " + number3 + "? ");
    int answer = input.nextInt();
    
    while (answer!=(number1+number2+number3) ) {
      System.out.print("Wrong answer. Try again. What is " 
                       + number1 + " + " + number2 + " + " + number3 + "? ");
      answer = input.nextInt();
    }
    input.close();
    System.out.println("You got it!");
  }
}