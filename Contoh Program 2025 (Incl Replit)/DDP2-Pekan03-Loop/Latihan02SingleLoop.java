import java.util.Scanner;

public class Latihan02SingleLoop {
    public static void main(String[] args){
        int bilangan; 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tuliskan sebuah bilangan bulat: ");
        bilangan = scanner.nextInt();

        for( int i = 2; i< bilangan; i++){
            if (bilangan % i == 0)
                System.out.print(i + " ");
        }
    
        scanner.close();
    }
}
