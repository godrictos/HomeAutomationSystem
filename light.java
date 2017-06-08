
public class light implements HAS{
	boolean lightPower=false;
	public void on(){
		System.out.println("light is on");
		lightPower = true;
	}
	public void off(){
		System.out.println("light is off");
		lightPower = false;
	}
}
