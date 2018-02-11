package funwithclasses;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mihai Rizea
 */
public class LocalClassExampleTest {
    
    public LocalClassExampleTest() {
    }

    /**
     * Test of validatePhoneNumber method, of class LocalClassExample.
     */
    @Test
    public void testValidatePhoneNumber() {
        System.out.println("validatePhoneNumber");
        String phoneNumberToBeValidated = "0733666999";
        LocalClassExample.validatePhoneNumber(phoneNumberToBeValidated);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
        assertEquals(phoneNumberToBeValidated, "0733666999");
    }
    
}
