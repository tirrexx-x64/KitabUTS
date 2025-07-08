public class MaxArray {

    public static int findMax(int[] arr){
        int hasil = arr[0];

        for (int i=1; i<arr.length; i++){
            if (hasil < arr[i]){
                hasil = arr[i];
            }
        }
        
        return hasil;
    }    
}



/*
 * 




        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }
 */