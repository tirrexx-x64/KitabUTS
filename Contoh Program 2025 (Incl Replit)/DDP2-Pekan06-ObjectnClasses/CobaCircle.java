public class CobaCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle(5);
        //System.out.println("jumlah circle "+ circle1.getNumberOfObjects() );
        System.out.println(circle1.getLabel());
        Circle circle2 = new Circle(7);
        //System.out.println("jumlah circle "+ circle1.getNumberOfObjects() );
        System.out.println(circle2.getLabel());
        Circle circle3 = new Circle(9);
        //System.out.println("jumlah circle "+ circle1.getNumberOfObjects() );
        System.out.println(circle3.getLabel());

        System.out.println("-----------------");
        System.out.println(circle1.getLabel());
        System.out.println(circle2.getLabel());
        System.out.println(circle3.getLabel());

    }
}
