public class Calculator {
  /** Main method */
  public static void main(String[] arguments) {
    // Check number of strings passed
    if (arguments.length != 3) {
      System.out.println(
        "Usage: java Calculator operand1 operator operand2");
      System.exit(0);
    }

    // The result of the operation
    int result = 0;

    // Determine the operator
    
    switch (arguments[1].charAt(0)) { 
      case '+': result = Integer.parseInt(arguments[0]) + 
                         Integer.parseInt(arguments[2]);
                break;
      case '-': result = Integer.parseInt(arguments[0]) -
                         Integer.parseInt(arguments[2]);
                break;
      case '.': result = Integer.parseInt(arguments[0]) *
                         Integer.parseInt(arguments[2]);
                break;
      case '/': result = Integer.parseInt(arguments[0]) /
                         Integer.parseInt(arguments[2]);
    }

    // Display result
    System.out.println(arguments[0] + ' ' + arguments[1] 
      + ' ' + arguments[2] + " = " + result);
  }
}
