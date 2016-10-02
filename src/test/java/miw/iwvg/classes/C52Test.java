package miw.iwvg.classes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C52Test {
	C52 c;
	
	@Before
	public void before() {
		c = new C52();
	}
	
	@Test
	public void testMA() {
		assertEquals("mA", c.mA());
	}
}
