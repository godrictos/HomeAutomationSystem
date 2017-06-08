import static org.junit.Assert.*;

import org.junit.Test;

public class lightTest {

	@Test
	public void test() {
		light light1 = new light();
		light1.on();
		boolean result=light1.lightPower;
		assertEquals(true,result);
	}

}
