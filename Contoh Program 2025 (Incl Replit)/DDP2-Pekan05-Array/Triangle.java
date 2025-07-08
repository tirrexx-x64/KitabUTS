public class Triangle {
    public static void main(String[] args){
        int n = 6; // Perhatikan ukuran n, bila tidak sesuai pattern bisa runtime
                   // Kalau nilai n = 10 atau 15, mngikuti pattern (1,3,6,10,15)
                   // tidak terjadi runtime!
                   // Bagaimana menghandle-nya agar tidak muncul run-time error
                   // ketika nilai n bisa bervariasi secara bebas? 
                   // Hint: Perhatikan pada baris nama runtime error terjadi
                   // dan kenapa, apakah syaratnya perlu kita tambah?
        int[][] triangle = new int[n][];
        int size = 1;
        for (int i = 0; i<triangle.length; i = i + size++){
            createColumnPerRow(triangle,i,size);
        }
        printMatrix(triangle);
    }

    public static void createColumnPerRow(int[][] triangle,int row, int size){
        int i = 1;
        for(int baris = row; baris < row+size; baris++)
            triangle[baris] = new int[i++];
    }

    public static void createColumn(int[][] triangle){
        for(int i=0; i < triangle.length; i++){
            triangle[i] = new int[i+1];
        }
    }

    public static void printMatrix(int[][] triangle){
        for(int i=0;i < triangle.length; i++){
            for(int j=0; j < triangle[i].length; j++)
                System.out.printf("%3d", triangle[i][j]);
            System.out.println();
        }
    }
}
