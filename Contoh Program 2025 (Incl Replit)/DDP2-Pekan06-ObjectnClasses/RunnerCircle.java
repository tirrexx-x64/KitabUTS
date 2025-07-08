public class RunnerCircle {
  /** Main method */
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " +
      Circle.getNumberOfObjects());

    // Create c1
    Circle c1 = new Circle();

    // Display c1 BEFORE c2 is created
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.getRadius() +
      ") and number of Circle objects (" +
      Circle.getNumberOfObjects() + ")");

    // Create c2
    Circle c2 = new Circle(5);

    // Modify c1
    // c1.radius = 9; (Bad!)
    c1.setRadius(9);
    // Display c1 and c2 AFTER c2 was created
    System.out.println("\nAfter creating c2 and modifying c1");
    System.out.println("c1: radius (" + c1.getRadius() +
      ") and number of Circle objects (" +
      Circle.getNumberOfObjects() + ")");
    System.out.println("c2: radius (" + c2.getRadius() +
      ") and number of Circle objects (" +
      Circle.getNumberOfObjects() + ")");
  }
}