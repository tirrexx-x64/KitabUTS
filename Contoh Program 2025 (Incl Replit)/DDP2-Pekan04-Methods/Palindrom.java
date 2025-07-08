import java.util.Scanner;

public class Palindrom {

  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
    inp.close();
   	//write your code below
    String tanpaSpasi = s.replaceAll(" ", "");   
    String reverse = "";

    for(int i=s.length()-1; i>=0; i--){
            reverse = reverse + s.charAt(i);
    }

    if (reverse.equalsIgnoreCase(tanpaSpasi))
        System.out.println("true");
    else
        System.out.println("false");
  }
}
