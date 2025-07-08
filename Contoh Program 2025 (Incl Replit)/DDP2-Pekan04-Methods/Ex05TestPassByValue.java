import java.util.Scanner;

class Main {
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

    while(bilangan<max && isPrime){
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