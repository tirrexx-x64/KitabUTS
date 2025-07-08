public class MainTV {  
  public static void main(String[] args) {
    TV tv1 = new TV();
    TV tv2 = new TV();

    tv1.turnOn();
    tv1.setChannel(30);
    tv1.setVolume(3);
     
    tv1.cetak("tv1's");
    tv2.cetak("tv2's");
   
    tv2=tv1; 

    tv2.turnOn();
    tv2.channelUp();
    tv2.channelUp();
    tv2.volumeUp();

    tv1.volumeUp();
    
    tv1.cetak("tv1's");
    tv2.cetak("tv2's");
   
  }
}