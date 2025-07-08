public class Praktikum0301 {
    public static boolean isPerfectNumber(int number){
        int faktor = 1;
        int jumlah = 0; 
        boolean hasil = false; 

        while(faktor <= number){
            if (number % faktor == 0){
                jumlah = jumlah + faktor;
            }        
            else {
                faktor = faktor + 1;
            }
        }
        return hasil;
    }    
}
