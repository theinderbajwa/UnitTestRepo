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
public class UnitTestTest {
       /**
     * Test of greet method, of class UnitTest.
     */
    @Test
    public void testGreet() {
//        System.out.println("greet");
        //define object of class
        UnitTest instance = new UnitTest();
        //define expected result
        String expResult = "Hello";
        //actutal result
        String result = instance.greet();
        //compare results
        assertEquals(expResult, result);
    } 
}
