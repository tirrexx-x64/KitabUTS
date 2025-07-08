// 0! = 1
// n! = n * (n-1)!
public class Factorial {
    public static int factorial(int bil){
        if (bil==0){
            return 1;
        }
        else
            return bil * factorial (bil-1);
    }
}
