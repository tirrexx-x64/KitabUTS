
public class CetakBintang {
    
    public static void main(String[] args){
        int bilangan; 
        int angka = 1;
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Tuliskan sebuah bilangan bulat: ");
//        bilangan = scanner.nextInt();
        angka = segitiga(1, 3, 3);
//        angka = segitigaTerbalik(angka, bilangan, bilangan);

//        scanner.close();
    }

    public static void cetakSpasi(int jumlah){
        for(int j = 0; j < jumlah; j++)
            System.out.print(" ");
    }

    public static void cetakBintang(int jumlah){
        for(int j = 0; j < jumlah; j++)
            System.out.print("*");
    }

    public static int cetakAngka(int angka, int jumlah){
        for(int j = 0; j < jumlah; j++){
            System.out.print(angka);
            angka = (angka + 1) % 10;
        }
        return angka;
    }

    public static int segitiga(int angka, int batas, int ukuran){
        int bilangan = batas;
        int j = 1;
        while( j <= bilangan - (batas-ukuran)){
            cetakSpasi(bilangan-j);
            angka = cetakAngka(angka,2*j-1 );
            System.out.println("");
            j++;
        }
        return angka;
    }

    public static int segitigaTerbalik(int angka, int batas, int ukuran){
        int j = batas;
        int bilangan = ukuran;
        while( j >= 0){
            cetakSpasi(bilangan-j);
            angka = cetakAngka(angka,2*j-1 );
            System.out.println("");
            j--;
        }
        return angka;
    }
}


/*

* 
**
***
****
*****

    * 
   **
  ***
 ****
*****

    * 
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

    1
   234
  56789
 0123456
789012345
 6789012
  34567
   890
    1


    * 
   ***
  *****
 *******
*********
    * 
   ***
  *****
 *******
    * 
   ***
  *****
    * 
   ***
    * 

    * 
   ***
    * 
   ***
  *****
    * 
   ***
  *****
 *******
    * 
   ***
  *****
 *******
*********
    *
    *
    *   
    *
    *
 */