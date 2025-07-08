public class Lingkaran {

    private double r;
    private static int jumlahLingkaran = 0;
    private int urutanKe;

    public void setRadius(double radius) {
        r = (radius >= 0) ? radius : 0;
    }

    public void hitungLuas(){
        System.out.printf("Radius: %3.1f, luas: %3.2f\n",r,Math.PI * r * r);
    }

    public String toString(){
        return "Lingkaran ke-" + urutanKe + " dengan radius " + r;
    }
    Lingkaran(){
        r = 1;
        jumlahLingkaran++;
        urutanKe=jumlahLingkaran;
    }
    Lingkaran(double r){
        this();
        r = (r >= 0) ? r : 0;
        this.r = r;
    } 

    public static void main(String[] args){
        Lingkaran l = new Lingkaran(10);
    }

}
