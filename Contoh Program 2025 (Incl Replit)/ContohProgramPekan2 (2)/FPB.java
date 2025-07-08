public class FPB {
    public int cariFPB(int bil1, int bil2){
        if (bil2==0)
            return bil1;
        return cariFPB(bil2, bil1%bil2);
    }
}
