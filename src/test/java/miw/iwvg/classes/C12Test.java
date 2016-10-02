package miw.iwvg.classes;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class C12Test {
	C12 c;
	
	@Before
	public void before() {
		c  = new C12();
	}
	
	@Test
	public void testMA() {
		assertEquals("mA", c.mA());
	}
}
