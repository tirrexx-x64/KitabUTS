public class FPB{
    public static void main(String []argv){
        int bil1 = 12;
        int bil2 = 17;
        int jawab;

        for (jawab = ((bil1<bil2)? bil1 : bil2 ) ;
            ((bil1%jawab!=0 || bil2%jawab!=0));
            jawab--){

        }
        System.out.println("FPB: "+ jawab);    

    }
}