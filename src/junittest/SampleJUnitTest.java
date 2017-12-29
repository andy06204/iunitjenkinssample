package junittest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import junittest.Calculation;

public class SampleJUnitTest extends TestCase{

	
	Calculation cal;

	@Before
	  public void setUp() {
	    cal = new Calculation();
	  }
	
	@Test
	public void testDivideByZero() {
		
	    // Divide by zero shouldn't work
	    try {
	      cal.divide(2, 0);
	      fail("Should have thrown an exception!");
	    }
	    catch (ArithmeticException e) {
	      // Good, that's what we expect
	    	System.out.println(e);
	    }  
		//cal.divide(2, 0);
	}
	
	
	
	@After
	protected void tearDown() throws Exception {

		super.tearDown();
	}

	
}
