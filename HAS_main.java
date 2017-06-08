
public class HAS_main {

	public static void main(String[] args) {
		
		HAS_factory new_has_factory= new HAS_factory();

	    	      HAS item1 =  new_has_factory.getItem("Television");

	    	     
	      item1.on();
	      
	     

	    
	      HAS item2 =  new_has_factory.getItem("WashingMachine");

	    
	      item2.on();

	     
	      HAS item3 =  new_has_factory.getItem("light");

	    
	      item3.on();
	      
	    
	      HAS item4 =  new_has_factory.getItem("AirConditioner");

	  
	      item4.on();
	      
	      
	      
	      Television itemTV = new Television ();
	 	 itemTV.on();
	      itemTV.changeChannel (1);
	      itemTV.changeVolume (2);
	      
	      itemTV.increaseVolume();
	      itemTV.printStatus ();
	}
	
}
