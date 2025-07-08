public class Praktikum05 {
    public static int[] removeDup(int[] data){
        int[] noDup = new int[data.length];
        int j = 0;
        for(int i=0; i<data.length ; i++){
            if (!(isElement(data[i], noDup,j)))
                noDup[j++] = data[i];
        }
        int[] hasil = new int[j];
        for (int i = 0; i<j; i++){
            hasil[i] = noDup[i];
        }
        return hasil;
    }

    public static boolean isElement(int datum, int[] data, int j){
        boolean hasil = false;
        int i = 0;

        while (i<j && i<data.length && !hasil){
            if (datum == data[i]) 
                hasil = true;
            i++;
        }

        return hasil;
    }

    public static int maxSubArray(int[] data){

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
