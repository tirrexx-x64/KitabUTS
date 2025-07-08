public class BirthDate {
  
    private int year;
    private int month; 
    private int day;

    public BirthDate(int year, int month, int day){
        this.year = year;
        this.month = month;   
        this.day = day;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return day+":"+month+":"+year;
    }
}
