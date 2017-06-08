
public class HAS_factory {
	
		   public HAS getItem(String item){
		      if(item == null){
		         return null;
		      }		
		      if(item.equalsIgnoreCase("AirConditioner")){
		         return new AirConditioner();
		         
		      } else if(item.equalsIgnoreCase("light")){
		         return new light();
		         
		      } else if(item.equalsIgnoreCase("Television")){
		         return new Television();
		      }
		      else if(item.equalsIgnoreCase("WashingMachine")){
			         return new WashingMachine();
			      }
		      
		      return null;
		   }
}


