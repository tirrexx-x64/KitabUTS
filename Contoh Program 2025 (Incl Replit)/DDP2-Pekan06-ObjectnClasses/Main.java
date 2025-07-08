class Main {
  int x;
  String y;
  static int z;
  public void test(){
    System.out.println("x is " + this.x); 
    System.out.println("y is " + this.y);
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    // int x; // x has no default value
    // String y; // y has no default value
    System.out.println("z is " + z);
    Main coba = new Main();
    coba.test();

  }
}