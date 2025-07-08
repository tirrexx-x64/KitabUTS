public class RunnerStudentBirthDate{
    public static void main(String[] args) {
      
        Student student = new Student(111223333, 1970, 5, 3);
        BirthDate date = student.getBirthDate();
        System.out.println(student.toString());
        date.setYear(2010); // Now the student birth year is changed!
        System.out.println(student.toString());
    }
}
