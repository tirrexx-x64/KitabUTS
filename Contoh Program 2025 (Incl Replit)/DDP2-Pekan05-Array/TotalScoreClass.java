public class TotalScoreClass {
      /** Main method */
  public static void main(String args[]) {
    double[][][] scores = {
      {{7.5, 20.5}, {9.0, 22.5}, {15, 33.5}, {13, 21.5}, {15, 2.5}},
      {{4.5, 21.5}, {9.0, 22.5}, {15, 34.5}, {12, 20.5}, {14, 9.5}},
      {{6.5, 30.5}, {9.4, 10.5}, {11, 33.5}, {11, 23.5}, {10, 2.5}},
      {{6.5, 23.5}, {9.4, 32.5}, {13, 34.5}, {11, 20.5}, {16, 7.5}},
      {{8.5, 26.5}, {9.4, 52.5}, {13, 36.5}, {13, 24.5}, {16, 2.5}},
      {{9.5, 20.5}, {9.4, 42.5}, {13, 31.5}, {12, 20.5}, {16, 6.5}},
      {{1.5, 29.5}, {6.4, 22.5}, {14, 30.5}, {10, 30.5}, {16, 6.0}}};
    
    String[] nama = {"Amir","Budi","Cica","Dudi","Emir", "Fifi", "Gina"};

    Nilai3d nilaiKuliah = new Nilai3d(scores,nama);
    double[] hasil = nilaiKuliah.hitungNilai();
    nilaiKuliah.cetakHasil(hasil);

    System.out.println("Tertinggi: " + nilaiKuliah.nilaiTertinggi(hasil));
    }
}
