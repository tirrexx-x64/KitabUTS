
public class Password{

    public static boolean isValid(String password) {
        boolean hasil = false;
        int i = 0;
        int jmlAngka = 0 ;
        boolean hurufBesar = false;
        boolean hurufKecil = false;
        // Silahkan lihat slide untuk memanfaatkan 
        // fungsi-fungsi terkait Character
        while(i<password.length()){
            char c = password.charAt(i);
            // Tambahkan conditional untuk pemeriksaan syarat password

            if (Character.isDigit(c)) jmlAngka++;
            if (Character.isUpperCase(c)) hurufBesar = true;
            if (Character.isLowerCase(c)) hurufKecil = true;

            i++;
        }

        hasil = (jmlAngka>1 && hurufBesar && hurufKecil && password.length()>8);

        return hasil;
    }
}