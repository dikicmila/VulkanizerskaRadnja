/**
 * 
 */
package gume.radnja;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gume.AutoGuma;

/**
 * @author Mila Dikic
 *
 */
public class VulkanizerskaRadnjaTest {
	
	private VulkanizerskaRadnja radnja;
	private AutoGuma a;
	private LinkedList<AutoGuma> gume;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		radnja = new VulkanizerskaRadnja();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		radnja = null;
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#dodajGumu(gume.AutoGuma)}.
	 */
	@Test
	public void testDodajGumu() {
		a = new AutoGuma();
		gume = new LinkedList<AutoGuma>();
		a.setMarkaModel("Micheline 123");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		radnja.dodajGumu(a);
		gume.add(a);
		assertEquals(gume, radnja.pronadjiGumu(a.getMarkaModel()));
	}
	
	@Test(expected = java.lang.NullPointerException.class)
	public void testDodajGumuNull() {
		radnja.dodajGumu(null);
	}
	
	@Test(expected = java.lang.RuntimeException.class)
	public void testDodajGumuVecSadrzi() {
		a = new AutoGuma();
		a.setMarkaModel("Micheline 123");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		radnja.dodajGumu(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Micheline 123");
		a2.setPrecnik(20);
		a2.setSirina(200);
		a2.setVisina(50);
		radnja.dodajGumu(a2);
	}

	/**
	 * Test method for {@link gume.radnja.VulkanizerskaRadnja#pronadjiGumu(java.lang.String)}.
	 */
	@Test
	public void testPronadjiGumu() {
		a = new AutoGuma();
		gume = new LinkedList<AutoGuma>();
		a.setMarkaModel("Micheline 123");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		radnja.dodajGumu(a);
		gume.add(a);
		assertEquals(gume, radnja.pronadjiGumu(a.getMarkaModel()));
	}
	
	@Test
	public void testPronadjiGumuNull() {
		assertEquals(null, radnja.pronadjiGumu(null));
	}
	
	@Test
	public void testPronadjiGumuIsteMarke() {
		a = new AutoGuma();
		gume = new LinkedList<AutoGuma>();
		a.setMarkaModel("Micheline 123");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		radnja.dodajGumu(a);
		gume.add(a);
		
		AutoGuma a2 = new AutoGuma();
		a2.setMarkaModel("Micheline 123");
		a2.setPrecnik(18);
		a2.setSirina(210);
		a2.setVisina(60);
		radnja.dodajGumu(a2);
		gume.add(a2);
		
		assertEquals(gume, radnja.pronadjiGumu(a.getMarkaModel()));
	}
	
	@Test
	public void testPronadjiGumuNemaGume() {
		a = new AutoGuma();
		a.setMarkaModel("Micheline 123");
		a.setPrecnik(20);
		a.setSirina(200);
		a.setVisina(50);
		radnja.dodajGumu(a);

		assertEquals(null, radnja.pronadjiGumu("Micheline 456"));
	}

}
