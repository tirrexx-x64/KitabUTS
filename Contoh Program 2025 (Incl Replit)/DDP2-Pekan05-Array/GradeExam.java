public class GradeExam {
    
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

    hitungAllStudents(answers, keys);
  }

  public static void hitungAllStudents(char[][] answers, char[] kunci){
    for(int index=0; index< answers.length;index++){
        int nilai = hitungStudent(answers, kunci, index);
        System.out.println("Students ke "+ index + " nilai :" + nilai);
    }
  }

  public static void hitungAllStudentsAlternatif(char[][] answers, char[] kunci){
    int count=0;
    for(char[] answer: answers){
        int nilai = hitungStudentAlternatif(answer, kunci);
        System.out.println("Students ke "+ count++ + " nilai :" + nilai);
    }
  }


  public static int hitungStudentAlternatif(char[] answer, char[] kunci){
    int nilai = 0;
    for(int soal=0; soal < answer.length; soal++){
      if(answer[soal] == kunci[soal]){
          nilai++;
      }
    }
    return nilai;
  }

  public static int hitungStudent(char[][] answers, char[] kunci, int index){
    int nilai = 0;
    for(int soal=0; soal < answers[index].length; soal++){
        if(answers[index][soal] == kunci[soal]){
            nilai++;
        }
    }
    return nilai;
  }
}
