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
public class StudentTest {

    @Test
    public void testAddBonusMarks() {
        Student s = new Student("Ali", 80);
        int expResult = 85;
        assertEquals(expResult, s.addBonusMarks());
    }
    
    @Test
    public void testGetInfo() {
        Student s = new Student("Ali", 80);
        String expResult = "Ali has marks 80";
        assertEquals(expResult, s.getInfo());
    }
    
}
