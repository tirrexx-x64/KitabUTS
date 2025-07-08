public class PrimeNumberMethod {

    public static boolean isPrime(int number){
      if (number <= 1 && number >= -1)
        return false;
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

      return isPrime;
        
    }

    public static int jmlSuffixPrima(int bilangan){
      int hasil = 0;

        for(int pembagi = 1  ;bilangan/pembagi>0  ; pembagi = pembagi * 10 ){
          int suffix = bilangan % pembagi;

          if (isPrime(suffix))
            hasil ++;
        
        }
        
      if (isPrime(bilangan))
        hasil ++;

      return hasil;
    }

    public static int jmlSuffixPrimaDo(int bilangan){
      int hasil = 0;
      int pembagi = 1;

      do{
        pembagi = pembagi * 10;
        int suffix = bilangan % pembagi;

        if (isPrime(suffix))
          hasil ++;
        
      }while(bilangan/pembagi >0);

      return hasil;
    }

    public static int cetakPerLine(int count, int number, int NUMBER_OF_PRIMES_PER_LINE){
        count++; // Increase the count
        System.out.printf("%7d",number); // Print the number
        if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
          // Advance to the new line
          System.out.println();
        }
        return count;
    }
    public static void cetakPrima(int NUMBER_OF_PRIMES, int NUMBER_OF_PRIMES_PER_LINE){
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness
    
        System.out.println("The first 50 prime numbers are \n");
    
        // Repeatedly find prime numbers
        for (;count < NUMBER_OF_PRIMES;) {
    
          // Print the prime number and increase the count
          if (isPrime(number)) {
            count = cetakPerLine(count, number, NUMBER_OF_PRIMES_PER_LINE);
          }
    
          // Check if the next number is prime
          number++;
        }
    
    }
  public static void main(String[] args) {

    cetakPrima(10000,10);
    }
}
