/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.classwork_calculation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class CalculatorTest {
    
    public CalculatorTest() {
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
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        int num1 = 15;
        int num2 = 15;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deduct method, of class Calculator.
     */
    @Test
    public void testDeduct() {
        System.out.println("deduct");
        int num1 = 0;
        int num2 = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.deduct(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of multiplication method, of class Calculator.
     */
    @Test
    public void testMultiplication() {
        System.out.println("multiplication");
        int num1 = 8;
        int num2 = 3;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.multiplication(num1, num2);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of division method, of class Calculator.
     */
    @Test
    public void testDivision() {
        System.out.println("division");
        int num1 = 30;
        int num2 = 15;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.division(num1, num2);
        assertEquals(expResult, result);
        
    }
    
}
