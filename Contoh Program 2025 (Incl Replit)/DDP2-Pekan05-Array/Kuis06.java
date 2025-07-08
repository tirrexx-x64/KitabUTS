public class Kuis06 {
    public static boolean isElement(int datum, int[] data, int count){

        for(int i=0;i<data.length && i<count;i++){
            if (datum==data[i]){
                return true;
            }
        }

        return false;
    }

    public static int[] noDuplikat(int[] data){
        int[] noDup = new int[data.length];
        int j = 0;
        for(int i=0; i< data.length; i++){
            if (!isElement(data[i], noDup,j)){
                noDup[j] = data[i];
                j++;
            }
        }

        int[] hasil = new int[j];

        for(int i=0; i<j; i++){
            hasil[i]= noDup[i];
        }

        return hasil;
    }
}
