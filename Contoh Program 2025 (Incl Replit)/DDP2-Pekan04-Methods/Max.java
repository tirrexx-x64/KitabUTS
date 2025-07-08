public class Max {
    public static void main (String[] args){
        int i = 5;
        int j = 2;
        int k = max(i,j);

        System.out.printf("Max dari %d dan %d adalah %d\n",i,j,k);

        double ii = 6.0;
        double jj = 7.0;
        double kk = max(ii,jj);
        
        System.out.printf("Max dari %.2f dan %.2f adalah %.2f\n",ii,jj,kk);

        System.out.println("Hasil = " + max(i,jj));

        System.out.println("Hasil = " + max(ii,j));

    }
    public static int max(int num1, int num2){
        int result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        
        return result;
    }

    public static double max(double num1, double num2){
        double result;
        if (num1 > num2)
            result = num1;
        else
            result = num2;
        
        return result;
    }

    

}
