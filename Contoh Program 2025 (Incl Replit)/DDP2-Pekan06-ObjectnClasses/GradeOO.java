public class GradeOO {

    private double rawScore;

    GradeOO(){
    }

    GradeOO(double rawScore){
        this.rawScore = rawScore;
    }

    public char getGrade() {
        if (rawScore >= 90.0)
        return 'A';
        else if (rawScore >= 80.0)
        return 'B';
        else if (rawScore >= 70.0)
        return 'C';
        else if (rawScore >= 60.0)
        return 'D';
        else
        return 'F';
    }

  public static void main(String[] args) {

    GradeOO grade01 = new GradeOO(89);
    GradeOO grade02 = new GradeOO(95);
    GradeOO grade03 = new GradeOO(60);
    GradeOO grade04 = new GradeOO();

    System.out.print("The grade is " + grade01.getGrade());
    System.out.print("\nThe grade is " + grade02.getGrade());
  }


}