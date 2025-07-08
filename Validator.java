import java.util.Scanner;
public class Validator {
    private final Scanner input;

    public Validator(Scanner input){
        this.input = input;
    }
    

    public  int intValidator(String message, int lowerBound, int upperBound){
        System.out.println(message);
        while(true){
            if(input.hasNextInt()){
                int value  = input.nextInt();
                if (lowerBound == 0 && upperBound ==0 ) {
                    input.nextLine();
                    return value;
                }
                if(lowerBound <= value && upperBound>= value){
                    input.nextLine();
                    return value;
                } else {
                    System.out.println("Harus berada didalam interval" +lowerBound+ " dan " + upperBound );
                }
            }else{
                System.out.println("Masukan harus berupa angka");
                input.nextLine();
            }
        } 
    }

     public String strValidator(String message){
        System.out.println(message);
        String value  = input.nextLine();
        return value;
    }


}
