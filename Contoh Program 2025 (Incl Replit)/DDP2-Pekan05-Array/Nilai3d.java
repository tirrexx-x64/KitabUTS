public class Nilai3d {
    private double[][][] scores ;
    private String[] nama ;

    Nilai3d(){
        scores = new double[1][1][1];
        nama = new String[1];
    }
    
    Nilai3d(double[][][] scores, String[] nama){
        this.scores = scores;
        this.nama = nama;
    }

    public double[] hitungNilai(){
        double[] hasil = new double[scores.length];

        // Calculate and display total score for each student
        for (int i = 0; i < scores.length; i++) {
            double totalScore = 0;
            for (int j = 0; j < scores[i].length; j++)
                for (int k = 0; k < scores[i][j].length; k++)
                    totalScore += scores[i][j][k];
            hasil[i]= totalScore;
        }
        return hasil;
    }

    public void cetakHasil(double[] hasil){
        for(double datum: hasil){
            System.out.println(datum);
        }
    }

    public double nilaiTertinggi(double[] hasil){
        double tertinggi = 0;

        for(double datum : hasil){
            if (tertinggi < datum)
                tertinggi = datum;
        }

        return tertinggi;
    }

}
