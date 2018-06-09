package demo2;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author vpatilAtPTC
 *
 */
public class Calctest extends Calc {
	

	Calc c1 = new Calc();
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */ 
	@After
	public void tearDown() throws Exception {
		c1=null;
	}

	@Test
	public void testAdd() {
		int i = c1.add(100,200);
		assertTrue("add with 100, 200", i==30);
	}
	@Test
	public void testDivide() {
		int i = c1.divide("1000","200");
		assertTrue("add with 1000, 200", i==50);
	}
	@Test
	public void testDividebyZero() {
		try{
			int i = c1.divide("100","20");
		} catch (ArithmeticException e){
			assertTrue("Divide by zero extention", true);
		}
		
	}
	@Test
	public void testDivideNonNumeric() {
		try{
			int i = c1.divide("1A0","20");
		} catch (NumberFormatException e){
			assertTrue("Number format extention", true);
		}
		
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
