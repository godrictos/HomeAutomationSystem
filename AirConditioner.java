
public class AirConditioner implements HAS{
	boolean acPower=false;
	public void on(){
		System.out.println("ac is on");
		acPower=true;
	}
	public void off(){
		System.out.println("ac is off");
		acPower=false;
	}
}
