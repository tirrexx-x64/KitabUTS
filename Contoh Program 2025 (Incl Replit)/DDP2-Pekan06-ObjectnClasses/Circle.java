public class Circle {
  /** The radius of the circle */
  private double radius = 1;

  private String label; 
  /** The number of the objects created */
  private static int numberOfObjects;

  /** Construct a circle with radius 1 */
  public Circle() {
    this(1.0);
  }

  /** Construct a circle with a specified radius */
  public Circle(double radius) {
    this.radius = radius;
    numberOfObjects++;
    label = "Lingkaran nomor: " + numberOfObjects + " dengan radius " + this.getRadius();
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double newRadius) {
    radius = (newRadius >= 0) ? newRadius : 0;
  }

  /** Return numberOfObjects */
  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  /** Return the area of this circle */
  public double getArea() {
    return radius * radius * Math.PI;
  }

  public String getLabel(){
    return this.label; 
  }
}