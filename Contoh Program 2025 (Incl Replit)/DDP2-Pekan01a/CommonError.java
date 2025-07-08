import java.util.Scanner;

public class CommonError {
  public static void main(String[] args) {

    int value = 2147483647 + 1; 
    System.out.println(value); // -2147483648
    
    // displays 0.5000000000000001, not 0.5, and
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1); 
    // displays 0.09999999999999998, not 0.1. 
    System.out.println(1.0 - 0.9);
    double hasil = (1.0 - 0.9);
    if (Math.abs(hasil-0.1) < 0.0001d)
//    if (hasil==0.1)
      System.out.println("Hasil Benar!");
    else 
      System.out.println("Hasil Salah!");
    
    int number1 = 1;
    int number2 = 2;
    int average = (number1+number2)/2;
    System.out.println(average);
    
  }
}