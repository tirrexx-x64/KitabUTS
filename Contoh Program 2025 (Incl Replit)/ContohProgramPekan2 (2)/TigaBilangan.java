public class TigaBilangan{

    public static int terbesar(int i, int j, int k){

        if (i>j)
            if (i>k)
                return i;
            else
                return k;
        else
            return j;             
    }
}