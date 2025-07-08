public class TestSum {
  public static void main(String[] args) {
    // Initialize sum
    float sumf = 0;

    System.out.println("Percobaan penjumlahan floating point.\nHasil seharusnya 50.50, tapi...?");
/*
    while (sumf - 0.0 < 0.000001) {
      System.out.println ("Variable sumf mendekati nol");
    }
*/
    // version 1
    // Add 0.01, 0.02, ..., 0.99, 1 to sum
    for (float i = 0.01f; i <= 1.0f; i = i + 0.01f)
      sumf += i;

    // Display result
    System.out.println("Version 1: The sum is " + sumf);

    // Version 2
    // Initialize sum
    double sum = 0;
    // Add 0.01, 0.02, ..., 0.99, 1 to sum
    for (double i = 0.01; i <= 1.0; i = i + 0.01)   
      sum += i;
    // Display result
    System.out.println("Version 2: The sum is " + sum);

    // Version 3
    sum = 0;
    double currentValue = 0.01;
    for (int count = 0; count < 100; count++) {     
      sum += currentValue;
      currentValue += 0.01;
    }
    // Display result
    System.out.println("Version 3: The sum is " + sum);

    // Version 4
    sum = 0;
    currentValue = 1.0;
    for (int count = 0; count < 100; count++) {  
      sum += currentValue;
      currentValue -= 0.01;
    }
    // Display result
    System.out.println("Version 4: The sum is " + sum);


  }
}

/*
// Version 2
  // Initialize sum
double sum = 0;
// Add 0.01, 0.02, ..., 0.99, 1 to sum
for (double i = 0.01; i <= 1.0; i = i + 0.01) sum += i;

// Version 3
sum = 0;
double currentValue = 0.01;
for (int count = 0; count < 100; count++) { sum += currentValue;
currentValue += 0.01;
}

// Version 4
sum = 0;
currentValue = 1.0;
for (int count = 0; count < 100; count++) { sum += currentValue;
currentValue  -= 0.01;
}

*/