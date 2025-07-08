
public class Main {
  public static void main(String[] args) {
    //String s1 = "Hey";
    //String s2 = s1.substring(0,1);
    //String s3 = s2.toLowerCase();

    // System.out.println(s3);
    int a;
    int b=1,c;
    a = (b += (c = 5));
    // a = (b += 5);
    // a = (b = b + 5);
    // a = (b = 1 + 5);
    // a = (b = 6);
    // a = 6;
    
    
    System.out.println("Hasil a adalah " + a);

    System.out.println("Nilai b adalah " + b);
  }
}