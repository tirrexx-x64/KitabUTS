public class ArrayCopy {
    public static void main(String[] argv){
        int[] list1 = {1,2,3,4,5};
        int[] list2 = {5,6,7,8,9};

        System.out.println("Before assigment");
        System.out.println("list1: " + cetakArray(list1));
        System.out.println("list2: " + cetakArray(list2));

        //list1=list2;
//        list1 = arrayCopy(list2);
        System.arraycopy(list2, 0, list1, 0, list2.length );
        list2[3] = -1;

        System.out.println("After assigment");
        System.out.println("list1: " + cetakArray(list1));
        System.out.println("list2: " + cetakArray(list2));
    }

    public static String cetakArray(int[] list){
        String hasil = "" ;
        for(int datum : list){
            hasil += " " + datum;
        }
        return hasil;
    }

    public static int[] arrayCopy(int[] list){
        int[] target = new int[list.length];
        for(int i = 0; i < list.length;i++){
            target[i]= list[i];
        }
        return target;
    }
}
