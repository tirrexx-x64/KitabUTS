public class MoreCircles {
  /** Main method */
  private Circle[] circleArray;

  public static void main(String[] args) {
    // Create circleArray
    MoreCircles moreCircle = new MoreCircles();
    // Print circleArray and total areas of the circles
    moreCircle.printCircleArray();
  }

  MoreCircles(){
    this.circleArray = createCircleArray();
  }

  /** Create an array of Circle objects */
  public Circle[] createCircleArray() {
    Circle[] circleArray = new Circle[5];

    for (int i = 0; i < circleArray.length; i++) {
      circleArray[i] = new Circle(Math.random() * 100);
    }

    // Return Circle array
    return circleArray;
  }

  /** Print an array of circles and their total area */
  public void printCircleArray() {
    System.out.printf("%-30s%-15s\n", "Radius", "Area");
    for (int i = 0; i < circleArray.length; i++) {
      if (circleArray[i]!=null)
        System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(),
          circleArray[i].getArea());
    }

    System.out.println("-----------------------------------------");

    // Compute and display the result
    System.out.printf("%-30s%-15f\n", "The total areas of circles is",
      sum());
  }

  /** Add circle areas */
  public double sum() {
    // Initialize sum
    double sum = 0;

    // Add areas to sum
    for (int i = 0; i < circleArray.length; i++)
        if(circleArray[i]!=null)
          sum += circleArray[i].getArea();

    return sum;
  }
}