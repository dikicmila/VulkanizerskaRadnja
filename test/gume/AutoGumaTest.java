/**
 * 
 */
package gume;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Mila Dikic 
 *
 */
public class AutoGumaTest {

	private AutoGuma guma;
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		guma = new AutoGuma();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		guma = null;
	}

	/**
	 * Test method for {@link gume.AutoGuma#setMarkaModel(java.lang.String)}.
	 */
	@Test
	public void testSetMarkaModel() {
		guma.setMarkaModel("Dunlop Winter Sport 5");
		
		assertEquals("Dunlop Winter Sport 5", guma.getMarkaModel());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelNull() {
		guma.setMarkaModel(null);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetMarkaModelManjeOd3() {
		guma.setMarkaModel("Mm");
	}

	/**
	 * Test method for {@link gume.AutoGuma#setPrecnik(int)}.
	 */
	@Test
	public void testSetPrecnik() {
		guma.setPrecnik(20);
		
		assertEquals(20, guma.getPrecnik());
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikVeciOd22() {
		guma.setPrecnik(23);
	}
	
	@Test (expected = java.lang.RuntimeException.class)
	public void testSetPrecnikManjiOd13() {
		guma.setPrecnik(12);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setSirina(int)}.
	 */
	@Test
	public void testSetSirina() {
		guma.setSirina(200);
		
		assertEquals(200, guma.getSirina());
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaVecaOd355() {
		guma.setSirina(356);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetSirinaManjaOd135() {
		guma.setSirina(134);
	}

	/**
	 * Test method for {@link gume.AutoGuma#setVisina(int)}.
	 */
	@Test
	public void testSetVisina() {
		guma.setVisina(50);
		assertEquals(50, guma.getVisina());
	}

	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaVecaOd95() {
		guma.setVisina(96);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testSetVisinaManjaOd25() {
		guma.setVisina(24);
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#toString()}.
	 */
	@Test
	public void testToString() {
		guma.setMarkaModel("Dunlop Winter Sport 5");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(70);
		assertEquals("AutoGuma [markaModel=" + "Dunlop Winter Sport 5" + ", precnik=" + 20 + ", sirina=" + 200 + ", visina="
				+ 70 + "]", guma.toString());
	}
	
	/**
	 * Test method for {@link gume.AutoGuma#equals(java.lang.Object)}.
	 */
	@Test
	public void testEqualsObjectFalse() {
		guma.setMarkaModel("Dunlop Winter Sport 5");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(70);
		
		AutoGuma guma2 = new AutoGuma();
		guma.setMarkaModel("Goodyear UltraGrip");
		guma.setPrecnik(17);
		guma.setSirina(250);
		guma.setVisina(80);
		
		assertFalse(guma.equals(guma2));
	}
	
	@Test
	public void testEqualsObjectTrue() {
		guma.setMarkaModel("Dunlop Winter Sport 5");
		guma.setPrecnik(20);
		guma.setSirina(200);
		guma.setVisina(70);
		
		AutoGuma guma2 = new AutoGuma();
		guma2.setMarkaModel("Dunlop Winter Sport 5");
		guma2.setPrecnik(20);
		guma2.setSirina(200);
		guma2.setVisina(70);
		
		assertTrue(guma.equals(guma2));
	}

}
