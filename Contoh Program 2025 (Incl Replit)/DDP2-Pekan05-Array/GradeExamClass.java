public class GradeExamClass {

  private char[][] allStudents;
  private char[] key;

  public void hitungAllStudents(){
    for(int i=0; i<allStudents.length; i++){
      hitungStudent(i);
    }
  }

  GradeExamClass(char[][] allStudents, char[] key){
    this.allStudents = allStudents;
    this.key = key;
  }

  public void hitungStudent(int idStu){
    System.out.println("Hasil:" + bandingkan(idStu));
  }

  public int bandingkan(int idStu){
    int hasil=0;
    for(int i=0;i<=9;i++){
      if (allStudents[idStu][i]==key[i])
        hasil++;
    }
    return hasil;
  }

  /** Main method */
  public static void main(String args[]) {
    // Students' answers to the questions
    char[][] answers = {
      {'A', 'A', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
      {'D', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
      {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
      {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'D', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
      {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

    // Key to the questions
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    GradeExamClass grade = new GradeExamClass(answers, keys);

    grade.hitungAllStudents();
  }
}
