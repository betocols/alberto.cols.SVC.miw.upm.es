package miw.iwvg.classes;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class C22Test {
	private C22 c;
	
	@Before
	public void before() {
		c = new C22();
	}
	
	@Test
	public void mA () {
		assertEquals("mA", c.mA());
	}
}
