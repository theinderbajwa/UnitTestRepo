/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package unittest.FirstTest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Inderpal Singh, 2026
 */
public class PasswordValidatorTest {

    /**
     * Test of checkLength method, of class PasswordValidator.
     */
    @Test
    public void testCheckLength() {
        String password = "";
        boolean expResult = false;
        assertEquals(expResult, PasswordValidator.checkLength(password));
    }
    @Test
    public void testCheckLengthGood() {
        String password = "mypasssword";
        boolean expResult = true;
        assertEquals(expResult, PasswordValidator.checkLength(password));
    }
    
    @Test
    public void testCheckLengthExactEightChar() {
        String password = "qwertyui";
        boolean expResult = true;
        assertEquals(expResult, PasswordValidator.checkLength(password));
    }
}
