import java.util.Scanner;

public class Ex08ChineseZodiac {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    //melepaskan alokasi resources yang tidak dipakai lagi untuk menghemat dan menghindari conflict dengan program lain.
    // input.close(); 
    /*
    if (year % 12 == 0) System.out.println("monkey");
    else if (year % 12 == 1) System.out.println("rooster");
    else if (year % 12 == 2) System.out.println("dog"); 
    else if (year % 12 == 3)  System.out.println("pig");
    else if (year % 12 == 4)  System.out.println("rat"); 
    else if (year % 12 == 5)  System.out.println("ox"); 
    else if (year % 12 == 6) System.out.println("tiger");
    else if (year % 12 == 7) System.out.println("rabbit");
    else if (year % 12 == 8) System.out.println("dragon");
    else if (year % 12 == 9) System.out.println("snake"); 
    else if (year % 12 == 10) System.out.println("horse");
    else if (year % 12 == 11) System.out.println("sheep");
    */
    switch (year % 12) {
      case 0: System.out.println("monkey"); break;
      case 1: System.out.println("rooster"); break;
      case 2: System.out.println("dog"); break;
      case 3: System.out.println("pig"); break;
      case 4: System.out.println("rat"); break;
      case 5: System.out.println("ox"); break;
      case 6: System.out.println("tiger"); break;
      case 7: System.out.println("rabbit"); break;
      case 8: System.out.println("dragon"); break;
      case 9: System.out.println("snake"); break;
      case 10: System.out.println("horse"); break;
      case 11: System.out.println("sheep"); break;
      default: System.out.println("Salah program");
    }
    
  }
}