package miw.iwvg.classes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C32Test {
	C32 c;
	
	@Before
	public void before() {
		c = new C32();
	}
	
	@Test
	public void testMA() {
		assertEquals("mA", c.mA());
	}

}
