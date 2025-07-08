import java.util.Scanner;


public class PrimaKembar{
    public static int mintaInput(){
        System.out.print("Tuliskan batas: ");
        Scanner input = new Scanner(System.in);
        int batas = input.nextInt();
        input.close();
        return batas;
    }

    public static boolean isPrime(int bil){
        boolean isPrime = true;
        int pembagi = 2;

        while(pembagi<bil/2 && isPrime){
            if (bil%pembagi==0){
                isPrime=false;
            }
            else
               pembagi++;
        }
        return isPrime;
    }

    public static void cariPrima(int batas){
        int bil=2;
        while (bil<batas){
            if(isPrime(bil)){
                if(isPrime(bil+2)){
                    System.out.printf("\n(%d,%d)", bil, bil+2);
                }
                bil++;
            }
            bil++;
        }
    }
    public static void main(String[] argv){
        int batas = mintaInput();
        cariPrima(batas);
    }
}