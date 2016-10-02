package miw.iwvg.classes;

import org.junit.Before;

import static org.junit.Assert.*;

import org.junit.Test;

public class C11Test {
	C11 c;
	
	@Before
	public void before() {
		c  = new C11();
	}
	
	@Test
	public void testM1() {
		assertEquals("m1 without error", c.m1());
	}
	
	@Test
	public void testM2() {
		assertEquals("m2", c.m2());
	}
	
}
