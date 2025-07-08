
public class CobaBedaFile {
    public static void main(String[] argv){
        int x = 1;
        int y = 7;
        int z = 9;
    
        int result = Math.max(x,y);
        int hasil = Ex00TestMaks.maks(x,y);
        int hasilJuga = Ex00TestMaks.maks(x,y,z);
    
        System.out.printf("versi english max(%d,%d) = %d \n", x,y, result );
        System.out.printf("versi indonesia maks(%d,%d) = %d \n", x,y, hasil);
        System.out.printf("versi indonesia maks(%d,%d,%d) = %d \n", x,y, z, hasilJuga);
    }
}
