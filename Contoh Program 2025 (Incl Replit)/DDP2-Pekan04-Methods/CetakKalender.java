import java.util.Scanner;

public class CetakKalender {

    public static void main(String[] args){
        readInput();
    }

    public static void readInput(){
        System.out.print("Enter Full year: ");
        Scanner scanner = new Scanner(System.in);
        int tahun = scanner.nextInt();
        System.out.print("Enter month in number 1-12: ");
        int bulan = scanner.nextInt();

        printMonthTitle(bulan, tahun);
        printMonthBody(bulan, tahun);
    }

    public static void printMonthTitle(int bulan, int tahun){
        System.out.println("      " + getMonthName(bulan) + " " + tahun);
        System.out.println("----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static String getMonthName(int bulan){
        String stringBulan = "Bulan January February Maret April Mei June July August Sept Okt Nov Des";
        String[] namaBulan = stringBulan.split(" ");
        return namaBulan[bulan];
    }

    public static void printMonthBody(int bulan, int tahun){
        int jumlahHari = getNumOfDaysInMonth(bulan, tahun);
        int mulai = getStartDay(bulan, tahun);

        int tanggal = 1; 
        int hari;

        for(hari=0; hari<mulai; hari++){
            System.out.print("    ");
        }

        while (tanggal<= jumlahHari){
            System.out.printf("%4d", tanggal++);
            hari++;
            if (hari % 7 == 0){
                System.out.println("");                
            }
        }


    }
    public static int getStartDay(int bulan, int tahun){
        return 2;
    }

    public static int getNumOfDaysInMonth(int bulan, int tahun){
        if (bulan ==1 || bulan == 3 | bulan== 5 || bulan == 7 
            || bulan == 8 || bulan == 10 || bulan ==12 ){
                return 31;
            }
        else if (bulan ==4 || bulan == 4 | bulan== 9 || bulan == 11){
                return 30;
            } 
        else if (bulan == 2){
                if (isKabisat(tahun))
                    return 29;
                else return 28;
        }
        else return -1;
    }

    public static boolean isKabisat(int tahun){
        if (tahun % 4 == 0 && tahun % 100 != 0 || tahun % 400 ==0)
            return true;
        else return false;
    }
}