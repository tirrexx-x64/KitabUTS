import java.util.Scanner;
  class Prime {
    public static void main(String[] args) {
      Scanner inp = new Scanner(System.in);
      System.out.print("In:");
      double max = inp.nextDouble();
      //write your code below
      String prime = "prime";
      String not_prime = "not prime";
      inp.close();
      // bilangan prima tidak habis dibagi bilangan lain kecuali satu dan dirinya
      double bilangan = 2;
      boolean isPrime = true; 
      double batas = Math.sqrt(max);
      while(bilangan<batas && isPrime){
        if (max % bilangan == 0)   // ini arti nya habis dibagi
          isPrime = false; 
        else
          bilangan+=1;
      }
      if (isPrime && max!=1) 
        System.out.println(prime);
      else 
        System.out.println(not_prime);
    }
  }

        /*

        a * b = x 
        
        x / a = b

        3 x 5 = 15  
        5 x 3 = 15 

        17 % 2
        17 % 3
        17 % 4  
        17 % 5 (apakah masih perlu ?)

        50 % 7 
        50 % 8 (perlu?)

        a x b = max
        max % a 
        max / a = b

        47 % 6
        47 % 7 karena 7^2 = 49, 
        47 % 8 (tidak perlu )
        bila a = 7 , maka b pasti lebih kecil dari 7 

      */
  
