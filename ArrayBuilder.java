import java.util.Random;
//usage
/**
 int[][] matrix = {
    {1, 2, 3},
    {0, 1, 4},
    {5, 6, 0}
};

ArrayBuilder ab = new ArrayBuilder();
double[][] matrixDouble = ab.convertIntToDouble(matrix);
double det = ab.determinantDouble(matrixDouble);  // = 1.0
String[][] strMatrix = ab.convertIntToString(matrix);

 */


public class ArrayBuilder {
       
    // a bunch of misc function that involes array manipulation the name explains itself :D
    @Deprecated
    public int[][] makeMeA2dArrayInt(int row, int collum ){
        int[][] integerArr = new int[row][collum]; 
        int dummyAdder = 0;
        for(int i = 0; i < integerArr.length; i++){
            for(int j = 0; j < integerArr[i].length; j++){
                integerArr[i][j] =  dummyAdder++;
            }
        }
        flush2dArrayEmpty(integerArr);
        return integerArr;
    }

    @Deprecated
    public void flush2dArrayEmpty(int intArray2d[][]){
        for(int i = 0; i < intArray2d.length; i++){
            for(int j = 0; j < intArray2d[i].length; j++){
                intArray2d[i][j] =  0;
            }
        }
    }

    @Deprecated
    public int[] convertStringToInt(String intArray[]){
        int[] temp =  new int[intArray.length];
        for(int i = 0;  i < intArray.length; i++ ){
            temp[i] = Integer.parseInt(intArray[i]);
        } 
        return temp;
    }

    @Deprecated
    public int[][] convertStringToIntArray2d(String intArray[][]){
        int[][] temp = new int[intArray.length][];
        for(int i = 0; i < intArray.length; i++ ){
            for(int j = 0; j < intArray[i].length; j++){
                temp[i][j] = Integer.parseInt(intArray[i][j]);
            }
        }
        return temp;
    }

    @Deprecated
    public void printMyInt2dArray(int arr[][]){
        for(int[] row : arr){
            for(int val: row){
                System.out.print(val +"\t");
            }
            System.out.println("");
        }
    }

    @Deprecated
    public void printMyStr2dArray(String arr[][]){
        for(String[] row : arr){
            for(String val: row){
                System.out.print(val +"\t");
            }
            System.out.println("");
        }
    }

    @Deprecated
    public void fill2dArrayWithValue(int[][] array, int value) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
            }
        }
    }



    @Deprecated
    public int[][] transpose2dArray(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] transposed = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    @Deprecated
    public int[][] clone2dArray(int[][] original) {
        int[][] clone = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            clone[i] = original[i].clone();
        }
        return clone;
    }

    @Deprecated
    public boolean is2dArrayEmpty(int[][] array) {
        for (int[] row : array) {
            for (int val : row) {
                if (val != 0) return false;
            }
        }
        return true;
    }


    @Deprecated
    public void randomize2dArray(int[][] array, int min, int max) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt((max - min) + 1) + min;
            }
        }
    }

    @Deprecated
    public int[][] multiplyMatrix(int[][] A, int[][] B) {
        int aRows = A.length;
        int aCols = A[0].length;
        int bCols = B[0].length;

        int[][] result = new int[aRows][bCols];

        for (int i = 0; i < aRows; i++) {
            for (int j = 0; j < bCols; j++) {
                for (int k = 0; k < aCols; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return result;
    }


    @Deprecated
    public int determinant(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        int det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinant(minor(matrix, 0, col));
        }

        return det;
    }

    @Deprecated
    private int[][] minor(int[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        int[][] minor = new int[n - 1][n - 1];

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) continue;
                minor[r][c] = matrix[i][j];
                c++;
            }
            r++;
        }

        return minor;
    }


    @Deprecated
    public int[][] addMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] + B[i][j];
            }
        }

        return result;
    }

    @Deprecated
    public int[][] subtractMatrix(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = A[i][j] - B[i][j];
            }
        }

        return result;
    }

    @Deprecated
    public String[][] convertIntToString(int[][] intArray) {
        String[][] result = new String[intArray.length][];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = new String[intArray[i].length];
            for (int j = 0; j < intArray[i].length; j++) {
                result[i][j] = String.valueOf(intArray[i][j]);
            }
        }
        return result;
    }


    @Deprecated
    public double determinantDouble(double[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }

        double det = 0;
        for (int col = 0; col < n; col++) {
            det += Math.pow(-1, col) * matrix[0][col] * determinantDouble(minorDouble(matrix, 0, col));
        }

        return det;
    }

    private double[][] minorDouble(double[][] matrix, int rowToRemove, int colToRemove) {
        int n = matrix.length;
        double[][] minor = new double[n - 1][n - 1];
        int r = 0;

        for (int i = 0; i < n; i++) {
            if (i == rowToRemove) continue;
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (j == colToRemove) continue;
                minor[r][c++] = matrix[i][j];
            }
            r++;
        }

        return minor;
    }


    @Deprecated
    public double[][] convertIntToDouble(int[][] intArray) {
        double[][] result = new double[intArray.length][];
        for (int i = 0; i < intArray.length; i++) {
            result[i] = new double[intArray[i].length];
            for (int j = 0; j < intArray[i].length; j++) {
                result[i][j] = intArray[i][j];
            }
        }
        return result;
    }
    
    @Deprecated
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    // Sum of 1D array
    @Deprecated
    public int sum1D(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }

    // Max/min value in 1D array
    @Deprecated
    public int max1D(int[] arr) {
        int max = arr[0];
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    @Deprecated
    public int min1D(int[] arr) {
        int min = arr[0];
        for (int val : arr) if (val < min) min = val;
        return min;
    }

    // Reverse a 1D array
    @Deprecated
    public int[] reverseArray(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Check if a 2D array is symmetric
    @Deprecated
    public boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) return false;
            }
        }
        return true;
    }

    // Check if all rows/columns are equal sum
    @Deprecated
    public boolean hasUniformRowSums(int[][] matrix) {
        int target = sum1D(matrix[0]);
        for (int i = 1; i < matrix.length; i++) {
            if (sum1D(matrix[i]) != target) return false;
        }
        return true;
    }

    // Print 1D array
    @Deprecated
    public void print1D(int[] arr) {
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }

    // Print with labels
    @Deprecated
    public void printLabeledMatrix(String[] labels, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(labels[i] + ": ");
            for (int val : matrix[i]) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Deprecated
    public void fillIntBorder(int[][] array, int borderValue) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            array[i][0] = borderValue;
            array[i][cols - 1] = borderValue;
        }
        for (int j = 0; j < cols; j++) {
            array[0][j] = borderValue;
            array[rows - 1][j] = borderValue;
        }
    }

    @Deprecated
    public void fillStringBorder(String[][] array, String borderValue) {
        int rows = array.length;
        int cols = array[0].length;

        for (int i = 0; i < rows; i++) {
            array[i][0] = borderValue;
            array[i][cols - 1] = borderValue;
        }
        for (int j = 0; j < cols; j++) {
            array[0][j] = borderValue;
            array[rows - 1][j] = borderValue;
        }
    }

    @Deprecated
    public char[][] splitStringToCharGrid(String text, int columns) {
        int length = text.length();
        int rows = (int) Math.ceil((double) length / columns);
        char[][] result = new char[rows][columns];

        int idx = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (idx < length) {
                    result[i][j] = text.charAt(idx++);
                } else {
                    result[i][j] = ' '; // padding
                }
            }
        }
        return result;
    }


    @Deprecated
    public String[][] convertCharToString(char[][] charArray) {
        String[][] result = new String[charArray.length][charArray[0].length];
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray[i].length; j++) {
                result[i][j] = String.valueOf(charArray[i][j]);
            }
        }
        return result;
    }


    @Deprecated
    public boolean containsSequence(char[][] grid, char[] word) {
        int rows = grid.length;
        int cols = grid[0].length;
        int wlen = word.length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= cols - wlen; j++) {
                boolean match = true;
                for (int k = 0; k < wlen; k++) {
                    if (grid[i][j + k] != word[k]) {
                        match = false;
                        break;
                    }
                }
                if (match) return true;
            }
        }
        return false;
    }


    @Deprecated
    public boolean containsWord(char[][] grid, String word) {
            return containsSequence(grid, word.toCharArray());
        }

        public void insertRowIntoMatrix(int[][] matrix, int[] rowData, int rowIndex) {
        if (matrix == null || rowData == null) {
            System.out.println("Matrix or row data cannot be null.");
        }
        if (rowIndex < 0 || rowIndex >= matrix.length) {
            System.out.println ("Invalid row index.");
        }
        if (matrix[0].length != rowData.length) {
            System.out.println ("Row data must match matrix column size.");
        }

        for (int i = 0; i < rowData.length; i++) {
            matrix[rowIndex][i] = rowData[i];
        }
    }


    @Deprecated
    public boolean isPangram(String sentence) {
        sentence = sentence.toLowerCase(); // ignore case
        boolean[] alphabet = new boolean[26]; // 26 letters a–z

        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!alphabet[i]) return false;
        }

        return true;
    }

    @Deprecated
    public int[] countCharFrequency(String s) {
        int[] freq = new int[26];
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }
        return freq;
    }

    @Deprecated
    public boolean isAnagram(String s1, String s2) {
        int[] count1 = countCharFrequency(s1);
        int[] count2 = countCharFrequency(s2);
        
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) return false;
        }
        return true;
    }

    @Deprecated
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }

    @Deprecated
    public int countWords(String s) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }

        return count;
    }

    @Deprecated
    public boolean allCharsUnique(String s) {
        boolean[] seen = new boolean[256]; // For all ASCII
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (seen[c]) return false;
            seen[c] = true;
        }
        return true;
    }

    @Deprecated
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    //
    // 1 fuct 

    @Deprecated
    public boolean isPalindromeRecursive(String s) {
        s = s.toLowerCase();
        return isPalindromeHelper(s, 0, s.length() - 1);
    }

    private boolean isPalindromeHelper(String s, int left, int right) {
        while (left < right && !Character.isLetterOrDigit(s.charAt(left))) left++;
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) right--;
        
        if (left >= right) return true;
        if (s.charAt(left) != s.charAt(right)) return false;
        
        return isPalindromeHelper(s, left + 1, right - 1);
    }
    // reverse

    @Deprecated
    public int[][] reverseMatrixFlattened(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int total = rows * cols;

        // Flatten
        int[] flat = new int[total];
        int index = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                flat[index++] = val;
            }
        }

        // Reverse flat array
        for (int i = 0; i < total / 2; i++) {
            int temp = flat[i];
            flat[i] = flat[total - 1 - i];
            flat[total - 1 - i] = temp;
        }

        // Reshape
        int[][] result = new int[rows][cols];
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = flat[index++];
            }
        }

        return result;
    }


    @Deprecated
    public int[][] reverseMatrixRows(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix[i][cols - 1 - j];
            }
        }

        return result;
    }

    @Deprecated
    public int[][] reverseMatrixColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[rows][cols];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                result[i][j] = matrix[rows - 1 - i][j];
            }
        }

        return result;
    }

    



}
