
public class HAS_factory {
	
		   public HAS getItem(String item){
		      if(item == null){
		         return null;
		      }		
		      if(item.equalsIgnoreCase("AC")){
		         return new AirConditioner();
		         
		      } else if(item.equalsIgnoreCase("light")){
		         return new light();
		         
		      } else if(item.equalsIgnoreCase("tv")){
		         return new Television();
		      }
		      else if(item.equalsIgnoreCase("washing machine")){
			         return new WashingMachine();
			      }
		      
		      return null;
		   }
}
