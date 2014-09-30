package MainPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassJUnitTest extends MyClass {

	@Test
	public void testReturnTrue() {
		assertTrue("This is true!", MyClass.ReturnTrue());
	}
	
	@Test
	public void testAddTwoNumbers(){
		assertNotNull("If null is returned, something is wrong. ", MyClass.AddTwoNumbers(3,4));
		
	}

}
