public class DoubleTuition {
    private double increase;
    private double tuition;

    DoubleTuition(double increase, double tuition){
        this.increase = increase;
        this.tuition  = tuition;
    }

    public YearTuition getDouble(){
        int year=0;
        double tuition = this.tuition;
        while (tuition< (this.tuition *2)){
            tuition = tuition * increase;
            year++;
        }
        return new YearTuition(year,tuition);
    }

    // Mutator method
    public void setTuition(double newTuition){
        this.tuition = newTuition;
    }

    // Accessor method
    public double getTuition(){
        return this.tuition;
    }

}

