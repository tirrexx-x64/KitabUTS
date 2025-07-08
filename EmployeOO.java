public class EmployeOO {
    //TODO lengkapi class variable berikut. Gunakan visibility private untuk semua variable nya
    private String nama;
    private int umur;
    private String posisi;
    private int gaji;

    
    public EmployeOO(String Nama, String Posisi, int Umur, int Gaji)
    {
        //TODO
        this.nama = Nama;
        this.posisi = Posisi;
        this.umur = Umur;
        this.gaji = Gaji;
    }
    public String getNama()
    {
        //TODO
        return this.nama;
    }
    public String getPosisi()
    {
        //TODO
        return this.posisi;
    }
    public int getUmur()
    {
        //TODO
        return this.umur;
    }
    public int getGaji()
    {
        //TODO
        return this.gaji;
    }
    public void naikGaji(int Kenaikan)
    {
        //TODO
        gaji += Kenaikan;
    }
    public void kenaPenalti(int Penalti)
    {
        //TODO
        gaji -= Penalti;
    }
    public String panggilEmployee()
    {
        //TODO
        return "Employee: " + getNama() + " posisi " + getPosisi() + " berumur " + getUmur();
    }
}
