public class Exercise10_09 {
  public static void main(String[] args) {
    Course course1 = new Course("Data Structures");
    Course course2 = new Course("Database Systems");

    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("Anne Kennedy");
    course1.addStudent("Susan Kennedy");
    course1.addStudent("John Kennedy");
    course1.addStudent("Kim Johnson");
    course1.addStudent("S1");
    course1.addStudent("S2");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.addStudent("S6");
    course1.addStudent("S7");
      
    course2.addStudent("Peter Jones");
    course2.addStudent("Steve Smith");

    System.out.printf("Number of students in %s: %d%n",
      course2.getCourseName(),
      course2.getNumberOfStudents());
    
    System.out.println();

    System.out.printf("Number of students in %s: %d %n"
      ,course1.getCourseName(), course1.getNumberOfStudents());
    Student[] students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i].getName() + ", ");

    System.out.println("\nSetelah drop Student S1");
    course1.dropStudent("S1");
    System.out.printf("Number of students in %s: %d%n",
      course1.getCourseName(),
      course1.getNumberOfStudents());
    students = course1.getStudents();
    for (int i = 0; i < course1.getNumberOfStudents(); i++)
      System.out.print(students[i].getName() + ", ");
    
    course1.clear();
    System.out.println("\nSetelah mendrop seluruh mhs");
    System.out.println("Number of students in course1: "
      + course1.getNumberOfStudents());
  }
}

class Student {
  private String name;
  private double ipk;

  Student(String name, double ipk){
    this(name);
    this.ipk = ipk;
  }
  Student(String name){
    this.name = name;
    this.ipk = 0.0;
  }

  public String getName(){
    return name;
  }

  public boolean equals(String name){
    return this.getName().equals(name);
  }
}

class Course {
  private String courseName;
  private Student[] students = new Student[2];
  private int numberOfStudents;

  public Course(String name) {
    this.courseName = name;
  }
  public String getCourseName(){
    return courseName;
  }

  public void addStudent(String student) {
    if (numberOfStudents == students.length) {
      increaseSize();
    }

    students[numberOfStudents] = new Student(student);
    numberOfStudents++;
  }
  
  private void increaseSize() {
    Student[] temp = new Student[students.length * 2];
    System.arraycopy(students, 0, temp, 0, students.length);
    students = temp;
  }

  public Student[] getStudents() {
    return students;
  }

  public int getNumberOfStudents() {
    return numberOfStudents;
  }
  
  /** Clear the course */
  public void clear() {
    for (int i = 0; i < numberOfStudents; i++) 
      students[i] = null;
    numberOfStudents = 0;
  }
  
  /** Remove a student from the course */
  public void dropStudent(String student) {
    for (int i = 0; i < numberOfStudents; i++) {
      if (students[i].equals(student)) {
        // Move students[i + 1] to students[i], etc.
        for (int k = i + 1; k < numberOfStudents; k++) {
          students[k - 1] = students[k];
        }
        
        numberOfStudents--;
        break;
      }
    }
  }
}
