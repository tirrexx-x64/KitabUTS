import java.util.Scanner;

public class Kuis01a02 {
    public static void main(String[] argv){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tuliskan sisi bujursangkar: ");

        double sisi = scanner.nextDouble();

        System.out.printf("Luas bujursangkar yang sisinya %.1f adalah %.3f \n",sisi, luasBujurSangkar(sisi));
        scanner.close();
    }
    
    public static double luasBujurSangkar(double sisi){
        double hasil;
        hasil = sisi * sisi;
        return hasil;
    }
}