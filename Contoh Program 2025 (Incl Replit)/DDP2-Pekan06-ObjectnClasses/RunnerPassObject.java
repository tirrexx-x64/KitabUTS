public class RunnerPassObject {
  /** Main method */
  public static void main(String[] args) {
    // Create a Circle object with radius 1
    Circle myCircle = new Circle(1);

    // Print areas for radius 1, 2, 3, 4, and 5.
    int n = 5;

    System.out.println("Sebelum pemanggilan method ubah");
    System.out.println("Nilai n = "+ n);
    System.out.println("Radius  = "+ myCircle.getRadius());

    ubah(n);
    ubah(myCircle);

    System.out.println("Setelah pemanggilan method ubah");
    System.out.println("Nilai n = "+ n);
    System.out.println("Radius  = "+ myCircle.getRadius());

  }

  public static void ubah(int n){
    n = n + 1;
    System.out.println("Dalam method ubah, nilai n = " + n);
  }

  public static void ubah(Circle c){
    c.setRadius(c.getRadius()+10);
    System.out.println("Dalam method ubah, radius c = " 
                       + c.getRadius());
  }


  /** Print a table of areas for radius */
  public static void printAreas(
      Circle c, int times) {
    System.out.println("Radius \t\tArea");
    while (times >= 1) {
      System.out.println(c.getRadius() + "\t\t" + c.getArea());
      c.setRadius(c.getRadius() + 1);
      times--;
    }
  }
}