public class PrimaPalindrom{

    public static boolean isPalindrom3(int bil){
        int ratusan = bil / 100; // Karena integer
        int satuan  = bil % 10;
        return ratusan == satuan;
    }

    public static boolean isPrima(int bil){
        boolean prima=true;
        int i=2;
        while(i<bil/2 && prima){
            if(bil%i==0) {
                prima = false;    
            }
            i++;
        }
        return prima;
    }






    /*
    public static boolean isPrima(int bilangan) {
        boolean hasil = true;
        int pembagi = 2;
        while (hasil && pembagi < bilangan/2 ){
            if (bilangan % pembagi == 0)
                hasil = false;
            pembagi ++;
        }
        return hasil;
    }
    public static boolean isPalindrom3(int bilangan){
        int ratusan = bilangan /100;
        int satuan  = bilangan % 10;
        return ratusan == satuan;
    }
*/

    public static void cetak(int count, int bil, int batas) {
        System.out.print(bil + " ");
        if (count%batas==0)
            System.out.println();
    }
    public static void main(String[] argv){
        final int BATAS = 5;
        int count=0;
        for(int i=100;i<1000;i++){
            if (isPrima(i) && isPalindrom3(i)){
                cetak(++count,i, BATAS);
            }
        }
    }
    
}