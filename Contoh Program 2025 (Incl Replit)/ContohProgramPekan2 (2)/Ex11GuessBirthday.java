import java.util.Scanner;

public class Ex11GuessBirthday {
  public static void main(String[] args) {
    String set0 =
      " 1  3  5  7\n" +
      " 9 11 13 15\n" +
      "17 19 21 23\n" +
      "25 27 29 31";    // Menyatakan punya bit 2^0
    
    String set1 =
      " 2  3  6  7\n" +
      "10 11 14 15\n" +
      "18 19 22 23\n" +
      "26 27 30 31";    // Menyatakan punya bit 2^1

    String set2 =
      " 4  5  6  7\n" +
      "12 13 14 15\n" +
      "20 21 22 23\n" +
      "28 29 30 31";   // Menyatakan punya bit 2^2

    
    String set3 =
      " 8  9 10 11\n" +
      "12 13 14 15\n" +
      "24 25 26 27\n" +
      "28 29 30 31";   // Menyatakan punya bit 2^3

    String set4 =
      "16 17 18 19\n" +
      "20 21 22 23\n" +
      "24 25 26 27\n" +
      "28 29 30 31";   // Menyatakan punya bit 2^4

    int day = 0;

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Prompt the user to answer questions
    System.out.print("Is your birthday in Set1?\n");
    System.out.print(set0);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    int answer = input.nextInt();

    if (answer == 1)
      day += 1; // 2 pangkat 0

    // Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set2?\n");
    System.out.print(set1);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    answer = input.nextInt();

    if (answer == 1)
      day += 2;  // 2 pangkat 1 (Math.pow(2,1))

    // Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set3?\n");
    System.out.print(set2);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    answer = input.nextInt();

    if (answer == 1)
      day += 4;  // 2 pangkat 2

    // Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set4?\n");
    System.out.print(set3);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    answer = input.nextInt();

    if (answer == 1)
      day += 8; // 2 pangkat 3

    // Prompt the user to answer questions
    System.out.print("\nIs your birthday in Set5?\n");
    System.out.print(set4);
    System.out.print("\nEnter 0 for No and 1 for Yes: ");
    answer = input.nextInt();

    if (answer == 1)
      day += 16;  // 2 pangkat 4

    //melepaskan alokasi resources yang tidak dipakai lagi untuk menghemat dan menghindari conflict dengan program lain.
    // input.close(); 

    System.out.println("\nYour birthday is " + day + "!");
  }
}