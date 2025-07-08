import java.util.Scanner;

public class Exercise02_02 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Enter lengths of the sides of the Equilateral triangle
    System.out.print("Enter length of the sides and height of the Equilateral triangle: ");
    double length = input.nextDouble();
    double height = input.nextDouble();

    double area = length * length * Math.sqrt(3)/4;
    double volume = area * height;

    System.out.println("The area is " + area);
    System.out.println("The volume of the Triangular prism is " + volume);
  }
}
