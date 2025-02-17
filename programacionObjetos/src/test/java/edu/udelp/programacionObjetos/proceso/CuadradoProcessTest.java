/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.udelp.programacionObjetos.proceso;

import edu.udelp.programacionObjetos.modelo.Cuadrado;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author diego
 */
public class CuadradoProcessTest {
    
    public CuadradoProcessTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of perimetro method, of class CuadradoProcess.
     */
    @Test
    public void testPerimetro() {
        System.out.println("perimetro");
        Cuadrado figura = new Cuadrado();
        figura.setLado(2D);
        CuadradoProcess instance = new CuadradoProcess();
        
        Double expResult = 8D;
        Double result = instance.perimetro(figura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
//        fail("The test case is a prototype.");
    }

    /**
     * Test of area method, of class CuadradoProcess.
     */
    @Test
    public void testArea() {
        System.out.println("area");
        Cuadrado figura = new Cuadrado();
        figura.setLado(2D);
        CuadradoProcess instance = new CuadradoProcess();
        Double expResult = 4D;
        Double result = instance.area(figura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
        //fail("The test case is a prototype.");
    }
    
}
