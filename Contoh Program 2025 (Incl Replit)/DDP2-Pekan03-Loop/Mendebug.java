import java.util.Scanner;

public class Mendebug {
  public static void main(String[] args) {
    // Initialize sum
    float sumf = 0;
    float inputUser;
    
    for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
      sumf += i;

    Scanner input = new Scanner(System.in);

    System.out.println("Percobaan penjumlahan floating point.");
    System.out.println("Program akan berhenti bila jumlah sama dengan 100.50!");

    do{
        System.out.printf("Variable sumf bernilai: %3.2f\n", sumf);
        System.out.print("Tuliskan bilangan: ");
        inputUser = input.nextFloat();
        sumf = sumf + inputUser;
    }while (Math.abs(sumf - 100.50) < 0.001);

    System.out.println("Variable sumf sudah bernilai 100.50! Program berhenti.");
  }
}