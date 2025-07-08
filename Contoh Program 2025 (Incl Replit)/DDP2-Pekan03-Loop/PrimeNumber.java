public class PrimeNumber {
  public static void main(String[] args) {
    final int NUMBER_OF_PRIMES = 10000; // Number of primes to display
    final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
    int count = 0; // Count the number of prime numbers
    int number = 2; // A number to be tested for primeness

    System.out.println("The first 50 prime numbers are \n");

    // Repeatedly find prime numbers
    for (;count < NUMBER_OF_PRIMES;) {
      // Assume the number is prime
      boolean isPrime = true; // Is the current number prime?

      int divisor = 2;
      // Test if number is prime
      for ( ;isPrime && divisor <= number / 2; ) {
        if (number % divisor == 0) { // number is not prime
          isPrime = false; // Set isPrime to false
        }
        divisor++;
      }

      // Print the prime number and increase the count
      if (isPrime) {
        count++; // Increase the count
        System.out.printf("%4d",number); // Print the number
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Advance to the new line
          System.out.println();
        }
      }

      // Check if the next number is prime
      number++;
    }
  }
}
