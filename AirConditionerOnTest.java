import static org.junit.Assert.*;

import org.junit.Test;

public class AirConditionerOnTest {
	AirConditioner airCond1 = new AirConditioner();
	@Test
	public void test() {
	
		airCond1.on();
		boolean result=airCond1.acPower;
		assertEquals(true,result);
		
		airCond1.off();
		boolean result1=airCond1.acPower;
		assertEquals(false,result1);
		
	}

}
