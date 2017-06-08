import static org.junit.Assert.*;

import org.junit.Test;

public class lightOffTest {

	@Test
	public void test() {
		light light1 = new light();
		light1.off();
		boolean result=light1.lightPower;
		assertEquals(false,result);
	}

}
