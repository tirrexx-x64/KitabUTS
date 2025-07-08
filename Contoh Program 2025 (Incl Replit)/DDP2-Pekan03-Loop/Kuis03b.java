public class Kuis03b {
    public static void main(String[] args){

        for(int i=0;i<100;++i)
            System.out.println(i);

        /* 
        System.out.println("faktor: ");
        faktor(30);
        System.out.println();
        System.out.println("kelipatan: ");
        kelipatan(6,5);
        */
    }

    public static void kelipatan(int a, int b){
        int count = 0;
        int kelipatan = a;

        do{
            if (kelipatan % b == 0){
                System.out.print(kelipatan + " ");
                count ++;
            }
            kelipatan += a;
        }while(count < 5);
    }


    public static void faktor(int n){

        // Syarat a adalah faktor dari b, 
        // kalau  b dibagi oleh a
        // b % a == 0
        int i = 2;
        do{
            if (n % i == 0) // maka i adalah faktor dari n
                System.out.print(i + " ");
            i++;
        }while (i<n);
        
    }
    
}
