
public class WashingMachine implements HAS{
	boolean wmPower=false;
	public void on(){
		System.out.println("washing machine is on");
		wmPower=true;
	}
	public void off(){
		System.out.println("washing machine is off");
		wmPower=false;
	}
}
