/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcane;

import org.antlr.v4.runtime.atn.ATN;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dZiLafho
 */
public class EsoLangParserTest {
    
    public EsoLangParserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGrammarFileName method, of class EsoLangParser.
     */
    @Test
    public void testGetGrammarFileName() {
        System.out.println("getGrammarFileName");
        EsoLangParser instance = null;
        String expResult = "";
        String result = instance.getGrammarFileName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTokenNames method, of class EsoLangParser.
     */
    @Test
    public void testGetTokenNames() {
        System.out.println("getTokenNames");
        EsoLangParser instance = null;
        String[] expResult = null;
        String[] result = instance.getTokenNames();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRuleNames method, of class EsoLangParser.
     */
    @Test
    public void testGetRuleNames() {
        System.out.println("getRuleNames");
        EsoLangParser instance = null;
        String[] expResult = null;
        String[] result = instance.getRuleNames();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerializedATN method, of class EsoLangParser.
     */
    @Test
    public void testGetSerializedATN() {
        System.out.println("getSerializedATN");
        EsoLangParser instance = null;
        String expResult = "";
        String result = instance.getSerializedATN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getATN method, of class EsoLangParser.
     */
    @Test
    public void testGetATN() {
        System.out.println("getATN");
        EsoLangParser instance = null;
        ATN expResult = null;
        ATN result = instance.getATN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of program method, of class EsoLangParser.
     */
    @Test
    public void testProgram() {
        System.out.println("program");
        EsoLangParser instance = null;
        EsoLangParser.ProgramContext expResult = null;
        EsoLangParser.ProgramContext result = instance.program();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of body method, of class EsoLangParser.
     */
    @Test
    public void testBody() {
        System.out.println("body");
        EsoLangParser instance = null;
        EsoLangParser.BodyContext expResult = null;
        EsoLangParser.BodyContext result = instance.body();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print method, of class EsoLangParser.
     */
    @Test
    public void testPrint() {
        System.out.println("print");
        EsoLangParser instance = null;
        EsoLangParser.PrintContext expResult = null;
        EsoLangParser.PrintContext result = instance.print();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expressions method, of class EsoLangParser.
     */
    @Test
    public void testExpressions() {
        System.out.println("expressions");
        EsoLangParser instance = null;
        EsoLangParser.ExpressionsContext expResult = null;
        EsoLangParser.ExpressionsContext result = instance.expressions();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declarations method, of class EsoLangParser.
     */
    @Test
    public void testDeclarations() {
        System.out.println("declarations");
        EsoLangParser instance = null;
        EsoLangParser.DeclarationsContext expResult = null;
        EsoLangParser.DeclarationsContext result = instance.declarations();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of expression method, of class EsoLangParser.
     */
    @Test
    public void testExpression() {
        System.out.println("expression");
        EsoLangParser instance = null;
        EsoLangParser.ExpressionContext expResult = null;
        EsoLangParser.ExpressionContext result = instance.expression();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loop method, of class EsoLangParser.
     */
    @Test
    public void testLoop() {
        System.out.println("loop");
        EsoLangParser instance = null;
        EsoLangParser.LoopContext expResult = null;
        EsoLangParser.LoopContext result = instance.loop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of previous method, of class EsoLangParser.
     */
    @Test
    public void testPrevious() {
        System.out.println("previous");
        EsoLangParser instance = null;
        EsoLangParser.PreviousContext expResult = null;
        EsoLangParser.PreviousContext result = instance.previous();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of declaration method, of class EsoLangParser.
     */
    @Test
    public void testDeclaration() {
        System.out.println("declaration");
        EsoLangParser instance = null;
        EsoLangParser.DeclarationContext expResult = null;
        EsoLangParser.DeclarationContext result = instance.declaration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignment method, of class EsoLangParser.
     */
    @Test
    public void testAssignment() {
        System.out.println("assignment");
        EsoLangParser instance = null;
        EsoLangParser.AssignmentContext expResult = null;
        EsoLangParser.AssignmentContext result = instance.assignment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operation method, of class EsoLangParser.
     */
    @Test
    public void testOperation() {
        System.out.println("operation");
        EsoLangParser instance = null;
        EsoLangParser.OperationContext expResult = null;
        EsoLangParser.OperationContext result = instance.operation();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of comparison method, of class EsoLangParser.
     */
    @Test
    public void testComparison() {
        System.out.println("comparison");
        EsoLangParser instance = null;
        EsoLangParser.ComparisonContext expResult = null;
        EsoLangParser.ComparisonContext result = instance.comparison();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of operand method, of class EsoLangParser.
     */
    @Test
    public void testOperand() {
        System.out.println("operand");
        EsoLangParser instance = null;
        EsoLangParser.OperandContext expResult = null;
        EsoLangParser.OperandContext result = instance.operand();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of condition method, of class EsoLangParser.
     */
    @Test
    public void testCondition() {
        System.out.println("condition");
        EsoLangParser instance = null;
        EsoLangParser.ConditionContext expResult = null;
        EsoLangParser.ConditionContext result = instance.condition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
