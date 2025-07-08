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



    public int[] validateFixedSizeIntRowInput(String message, int size) {
        System.out.println(message);
        
        while (true) {
            String line = input.nextLine().trim();
            String[] tokens = line.split("\\s+");

            if (tokens.length != size) {
                System.out.println("Masukan harus terdiri dari tepat " + size + " angka (integer) dipisahkan spasi.");
                continue;
            }

            try {
                int[] result = new int[size];
                for (int i = 0; i < size; i++) {
                    result[i] = Integer.parseInt(tokens[i]);
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Masukan tidak valid! Harus berupa angka bulat (integer).");
            }
        }
    }

    public boolean yesOrNoValidator(String message) {
        System.out.println(message + " (ya/tidak):");

        while (true) {
            String response = input.nextLine().trim().toLowerCase();
            if (response.equals("ya")) return true;
            if (response.equals("tidak")) return false;
            System.out.println("Masukan tidak dikenali. Tulis 'ya' atau 'tidak'.");
        }
    }

    public int[] validateIntList(String message) {
        System.out.println(message);

        while (true) {
            String[] tokens = input.nextLine().trim().split("\\s+");
            try {
                int[] result = new int[tokens.length];
                for (int i = 0; i < tokens.length; i++) {
                    result[i] = Integer.parseInt(tokens[i]);
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Semua masukan harus berupa angka bulat (integer). Coba lagi.");
            }
        }
    }

    public boolean yesNoValidator(String message) {
        System.out.println(message + " (y/n)");
        while (true) {
            String inputStr = input.nextLine().trim().toLowerCase();
            if (inputStr.equals("y")) return true;
            if (inputStr.equals("n")) return false;
            System.out.println("Jawaban harus 'y' atau 'n'");
        }
    }

    public char charValidator(String message, char[] allowedChars) {
        System.out.println(message);
        while (true) {
            String value = input.nextLine().trim().toLowerCase();
            if (value.length() == 1) {
                char c = value.charAt(0);
                for (char allowed : allowedChars) {
                    if (c == allowed) return c;
                }
            }
            System.out.println("Input tidak valid. Coba lagi.");
        }
    }


    public String strOptionValidator(String message, String[] options) {
        System.out.println(message);
        while (true) {
            String inputStr = input.nextLine().trim().toLowerCase();
            for (String option : options) {
                if (inputStr.equals(option.toLowerCase())) {
                    return inputStr;
                }
            }
            System.out.println("Input tidak sesuai pilihan.");
        }
    }


    






}
