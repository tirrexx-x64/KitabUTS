public class Palindrom {
    public static boolean isPalindrom(String input){
        boolean hasil = true; 
        String baru = "";
        int i = input.length()-1;
        
        while(i>=0){
            baru += input.charAt(i);
            i--;
        }
        /*
        if (input.equals(baru))
            hasil = true;
        else 
            hasil = false;
        */
        
        hasil = (input.equals(baru))? true : false;

        return hasil;
    }
}
