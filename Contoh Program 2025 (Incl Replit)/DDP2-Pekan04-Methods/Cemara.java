public class Cemara {
    public static void cemara(int ukuran){
        for(int i=1; i< ukuran; i++){
            segitiga(ukuran-i, i);
        }
        cetakBatang(ukuran);
    }

    public static void main(String[] args){
        cemara(5);
    }

    public static void segitiga(int border, int ukuran){
        for(int i=1; i<=ukuran; i++){
            cetakSpasi(border+ ukuran-i);
            cetakBintang(2*i-1);
            System.out.println();
        }
    }

    public static void cetakSpasi(int jumlah){
        for(int i=0; i<jumlah; i++)
            System.out.print(" ");
    }

    public static void cetakBintang(int jumlah){
        for(int i=0; i<jumlah; i++)
            System.out.print("*");
    }

    public static void cetakBatang(int jumlah){
        for(int i=0; i<jumlah; i++){
            cetakSpasi(jumlah-1);
            System.out.println("*");
        }
    }
}
