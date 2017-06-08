
public class Television implements HAS{
	public void on(){
		System.out.println("tv is on");
		power=true;
	}
	boolean power = false; 
    int channel = 0;
    int volume = 0;

   
    void Off (){
        power = false;
    }
    void changeChannel (int newValue){
        if (power==true)
        channel = newValue; 
 }
        void changeVolume (int newValue){
            if (power==true)
            volume = newValue;
        }
        public void increaseVolume() // Used to increase the volume
        {
          volume = volume + 1;
        }
        public void decreaseVolume() // Used to decrease the volume
        {
          volume = volume - 1;
        }
        
    void printStatus(){ 

    System.out.println("The TV staus is powerOn: " + "Channel: " + channel + " Volume: " + volume);
    }
}
