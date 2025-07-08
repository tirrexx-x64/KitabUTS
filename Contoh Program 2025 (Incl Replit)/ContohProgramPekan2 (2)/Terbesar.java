import java.util.Scanner;

public class Terbesar {

    public static void main(String argv[]) {

        int a = 11;
        int b = 9;
        int c = 5;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan bilangan pertama: ");
        a = input.nextInt();
        System.out.print("Masukan bilangan kedua: ");
        b = input.nextInt();
        System.out.print("Masukan bilangan ketiga: ");
        c = input.nextInt();

        int hasil = cariTerbesar(a,b,c);
        System.out.println("Bilangan terbesar: " + hasil);

        if(a+b+c-hasil <= hasil){
            System.out.println("Bukan Segitiga");
        }
        else {
            if (a==b && b==c){
                System.out.println("Sama sisi");
            }
            else{
                if(a==b || b==c || c==a){
                    System.out.println("Sama kaki");
                }
                else{
                    if ( (a*a+b*b==c*c) || (a*a+c*c==b*b) || (b*b+c*c==a*a)){
                        System.out.println("Siku-siku");
                    }
                    else{
                        System.out.println("Sembarang");
                    }
                }
            }
        }


    }

    public static int cariTerbesar(int a, int b, int c){
        int hasil;
        if (a>b){
            if(a>c){
                System.out.println(a);
                hasil = a;
            }
            else {
                System.out.println(c);
                hasil = c;
            }
        }
        else{
            if(b>c){
                System.out.println(b);
                hasil = b;
            }
            else {
                System.out.println(c);
                hasil = c;
            }
        }
        return hasil;
    }

}
