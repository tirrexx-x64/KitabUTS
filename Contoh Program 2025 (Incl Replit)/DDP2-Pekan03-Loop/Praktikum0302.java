public class Praktikum0302 {
    public static int convert2Octal(int decimal){
        int octal =0;
        int pengali = 1;
        while(decimal>0){
            int rem = decimal % 8;
            decimal = decimal/8;
            rem = rem * pengali;
            octal = octal + rem;`
            pengali = pengali *10;
        }
        return octal;
    }
}
