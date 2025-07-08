public class AnalyzeManyNumbers {
  public static void main(String[] args) {
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter the any number of items: ");
    String[] inputNumbers = input.nextLine().split(" ");
    int[] numbers = new int[inputNumbers.length];
    int i =0;
    for(String data: inputNumbers){
        numbers[i++] = Integer.parseInt(data);   // data bilangan sebagai String diconvert menjadi int?
    }

    double sum = 0;
    for (int j = 0; j < numbers.length; j++) {
      sum += numbers[j];  // sum = sum + numbers[i];
    }
    
    double average = sum / numbers.length;

    int count = 0; // The number of elements above average
    for (double data: numbers) 
      if (data > average)
        count++;

    System.out.println("Average is " + average);
    System.out.println("Number of elements above the average "
      + count);
 
  }
}