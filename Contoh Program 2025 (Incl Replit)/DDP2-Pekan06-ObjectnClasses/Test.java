import java.util.Date;

public class Test {
    public static void main(String[] args){
        Lingkaran l1 = new Lingkaran();
        System.out.println(l1.toString());
        Lingkaran l2 = new Lingkaran(10);
        System.out.println(l2.toString());
        l1.setRadius(100);
        System.out.println(l1.toString());
        l2=l1;
        System.out.println(l2.toString());
        l2.setRadius(1000);
        System.out.println(l2.toString());
        System.out.println(l1.toString());

    }
    
}
