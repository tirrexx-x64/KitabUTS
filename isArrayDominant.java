public class isArrayDominant {
    public static void main(String[] args) {
        System.out.println(isArrayDominant(new int[]{9, 10, 11}, new int[]{4, 5, 6}));
    }
    public static boolean isArrayDominant(int[] arr1, int[] arr2) {
        int trueCountArr1 = 0;
        int falseCountArr1 = 0;

        int trueCountArr2 = 0;
        int falseCountArr2 = 0;

        int len = arr1.length * arr2.length;
        // System.out.println(len);
        for (int i=0; i< arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if (arr1[i] >= arr2[j]) {
                    trueCountArr1 ++ ;
                } else {
                    falseCountArr1 ++;
                }
            }
        }
        for (int i=0; i< arr2.length; i++) {
            for (int j=0; j< arr1.length; j++) {
                if (arr2[i] >= arr1[j]) {
                    trueCountArr2 ++;
                } else {
                    falseCountArr2 ++;
                }
            }
        }
        if (trueCountArr1 == len || trueCountArr2 == len) {
            return true;
        }else {
            return false;
        }
    }
}