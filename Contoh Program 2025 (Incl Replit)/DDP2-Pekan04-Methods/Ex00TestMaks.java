class Ex00TestMaks {
    public static void main(String[] args) {
      System.out.println("Hello world!");
      int x = 1;
      int y = 7;
      int z = 9;
  
      int result = Math.max(x,y);
      int hasil = maks(x,y);
      int hasilJuga = maks(x,y,z);
  
      System.out.printf("versi english max(%d,%d) = %d \n", x,y, result );
      System.out.printf("versi indonesia maks(%d,%d) = %d \n", x,y, hasil);
      System.out.printf("versi indonesia maks(%d,%d,%d) = %d \n", x,y, z, hasilJuga);
  
    }
    public static int sign(int n){
      if (n>0) 
        return 1;
      else if (n == 0)
        return 0;
      else return -1;
    }
  
    public static int maks(int bil1, int bil2){
      if (bil1>bil2) 
        return bil1;
      else
        return bil2;
    }
  
    public static int maks(int bil1, int bil2, int bil3){
      if (bil1>bil2) 
        return maks(bil1,bil3);
      else
        return maks(bil2,bil3);
    }
  
  
  }