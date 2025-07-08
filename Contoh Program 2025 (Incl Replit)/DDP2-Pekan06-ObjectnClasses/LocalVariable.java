public class LocalVariable {

//    private int x; 
//    private String y;
    public static void main(String[] args) {
        LocalVariable localVar = new LocalVariable();
        localVar.cetak(); 
      }

      public void cetak(){
        int x; // x has no default value
        String y; // y has no default value
        System.out.println("x is " + x); 
        System.out.println("y is " + y);
      }
    
}
