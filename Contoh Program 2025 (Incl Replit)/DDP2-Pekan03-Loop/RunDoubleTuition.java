public class RunDoubleTuition {
    public static void main(String[] argv){
        DoubleTuition myTuition = new DoubleTuition(1.07,10000);
        
        System.out.println(myTuition.tuition); 


        System.out.println("My Initial Tuition is: " + myTuition.getTuition());
        
        YearTuition myYearTuition = myTuition.getDouble();
        System.out.println("Tuition will be doubled after " 
                           + myYearTuition.getYear() + " years." );
    }
}
