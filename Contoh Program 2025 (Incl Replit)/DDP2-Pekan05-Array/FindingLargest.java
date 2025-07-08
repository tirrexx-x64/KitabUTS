public class FindingLargest{
    public static void main(String[] args){

        double[] myList = {1,2,3,4,5,6,7,2,3,4};

        double max = myList[0];
        for (double elemen: myList) {  // elemen di index ke-0 di proses 2 kali
            if (elemen > max) max = elemen;
        }
        System.out.print(max);
    }
}