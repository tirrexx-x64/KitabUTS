public class DoubleTuition {
  private double initialTuition = 10000;
  private double tuition = 10000;
  private double inflasi = 0.07;

  DoubleTuition(){
  }

  DoubleTuition(double initialTuition, double inflasi){
    this.initialTuition = initialTuition;
    this.inflasi = inflasi;
  }

  DoubleTuition(double inflasi){
    this.inflasi = inflasi;
  }

  public int getYearWhenDouble(){
      int year = 0;
      while (tuition < (2*initialTuition) ) {
        tuition = tuition * 1.07;
        year++;
      }

      return year;
  }

  public double getTuition(){
    return tuition;
  }

  // Program ini menghitung kapan tuition (SPP) menjadi dua kali lipat 
  // Latihan untuk peserta DDP2 - Ubah program berikut ini menjadi Object Oriented
  // Tetapkan apa yang menjadi data
  // Tetapkan apa yang menjadi method dan parameter (bila ada, sebaiknya ada)
  // Buat Constructor nya (berikut parameter yang dibutuhkan)
  // Perhatikan bahwa method yang dibuat, idealnya tidak mencetak, melainnya me-return value
  // Proses mencetak dilakukan di main method saja. 
  public static void main(String[] args) { 

    DoubleTuition doubleTuition = new DoubleTuition(0.07);
    int yearDouble = doubleTuition.getYearWhenDouble();

    System.out.println("Tuition will be doubled in " 
      + yearDouble + " years");
    System.out.printf("Tuition will be $%.2f in %1d years",  
      doubleTuition.getTuition(), yearDouble);
  }
}