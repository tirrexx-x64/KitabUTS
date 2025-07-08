import java.util.Scanner;

public class Harga {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);

        System.out.print("tulis nama dan harga barang-barangnya: ");
        String nama1 = input.next();
        String harga1 = input.next();
        
        String nama2 = input.next();
        String harga2 = input.next();

        double harga1double = Double.parseDouble(harga1);
        double harga2double = Double.parseDouble(harga2);

        double total = harga1double+ harga2double ;


        System.out.println("Total belanja anda: " + total);
    }
    
}
