import java.util.Scanner;

public class Nama {
    public static void main(String[] argv){
        Scanner input = new Scanner(System.in);

        System.out.println("Tuliskan nama lengkap: ");
        String nama = input.nextLine();

        int pembatas = nama.indexOf(' ');
        String firstName = nama.substring(0, pembatas);

        int pembatasLastName = nama.lastIndexOf(' ');
        String lastName = nama.substring(pembatasLastName+1);

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        
    }
    
}
