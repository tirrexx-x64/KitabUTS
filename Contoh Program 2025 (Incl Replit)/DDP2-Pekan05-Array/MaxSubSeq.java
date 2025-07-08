public class MaxSubSeq {
    public static int calculate(int[] data){

        int latest  = Integer.MIN_VALUE;
        int current=0;

        for (int i=0; i<data.length; i++){
            current = current + data[i];
            if (current > latest){
                latest = current;
            }
            if (current<0){
                current = 0;
            } 
        }
        return latest;
    }
    
}
