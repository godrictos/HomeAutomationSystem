import static org.junit.Assert.*;

import org.junit.Test;

public class tvChannelChange {

	@Test
	public void test() {
		Television tvv = new Television();
		tvv.on();
		tvv.changeChannel(3);
		int result=tvv.channel;
		assertEquals(3,result);
	}

}
