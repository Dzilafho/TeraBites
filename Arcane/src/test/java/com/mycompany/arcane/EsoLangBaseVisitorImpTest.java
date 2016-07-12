/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcane;

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
public class EsoLangBaseVisitorImpTest {
    
    public EsoLangBaseVisitorImpTest() {
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
     * Test of visitCondition method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitCondition() {
        System.out.println("visitCondition");
        EsoLangParser.ConditionContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitCondition(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitDeclarations method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitDeclarations() {
        System.out.println("visitDeclarations");
        EsoLangParser.DeclarationsContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitDeclarations(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitExpression method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitExpression() {
        System.out.println("visitExpression");
        EsoLangParser.ExpressionContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitExpression(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitPrevious method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitPrevious() {
        System.out.println("visitPrevious");
        EsoLangParser.PreviousContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitPrevious(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitComparison method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitComparison() {
        System.out.println("visitComparison");
        EsoLangParser.ComparisonContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitComparison(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitLoop method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitLoop() {
        System.out.println("visitLoop");
        EsoLangParser.LoopContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitLoop(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitPrint method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitPrint() {
        System.out.println("visitPrint");
        EsoLangParser.PrintContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitPrint(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitAssignment method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitAssignment() {
        System.out.println("visitAssignment");
        EsoLangParser.AssignmentContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitAssignment(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitProgram method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitProgram() {
        System.out.println("visitProgram");
        EsoLangParser.ProgramContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitProgram(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitBody method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitBody() {
        System.out.println("visitBody");
        EsoLangParser.BodyContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitBody(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitDeclaration method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitDeclaration() {
        System.out.println("visitDeclaration");
        EsoLangParser.DeclarationContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitDeclaration(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitOperation method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitOperation() {
        System.out.println("visitOperation");
        EsoLangParser.OperationContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitOperation(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of visitOperand method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitOperand() {
        System.out.println("visitOperand");
        EsoLangParser.OperandContext ctx = null;
        EsoLangBaseVisitorImp instance = new EsoLangBaseVisitorImp();
        Integer expResult = null;
        Integer result = instance.visitOperand(ctx);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
