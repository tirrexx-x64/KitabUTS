import java.util.Scanner;

public class Penjumlahan{
    public static void main(String[] argv){
        int number1 = (int)(Math.random() * 10);
        int number2 = (int)(Math.random() * 10);
        int hasil = number1 + number2;
        boolean evaluasi=false;
        int jawaban;
        // Create a Scanner
        Scanner input = new Scanner(System.in);
    

        do{
            System.out.printf("Berapakah jawaban dari %d + %d ?",number1, number2);
            jawaban = input.nextInt();
            if (jawaban==hasil){
                evaluasi = true;
                System.out.println("Benar");
            }    
            else {System.out.println("Jawaban salah, ulangi lagi");
        }
        }while(!evaluasi);   // benar== false


        System.out.println("Benar! Selamat!");
        input.close();
    }
}