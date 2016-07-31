package com.mycompany.arcane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.arcane.EsoLangBaseVisitorImp;
import com.mycompany.arcane.language.EsoLangLexer;
import com.mycompany.arcane.language.EsoLangParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author dZiLafho
 */
public class EsoLangBaseVisitorImpTest {
    
    static String expression;
    static EsoLangLexer lexer;
    static EsoLangParser parser;
    static ParseTree tree;
    static EsoLangBaseVisitorImp  visitor;
    
    public EsoLangBaseVisitorImpTest() {
        
    }
    
    //Generate the parse tree
    @BeforeClass
    public static void setUpClass() {
        
        expression = "[$ ... ! { ... : ... > ... . : . > .... } & . \\:: .. | . : 1 .. : 5 ... : 1 .... : 1]";
        lexer = new EsoLangLexer(new ANTLRInputStream(expression));
        parser = new EsoLangParser(new CommonTokenStream(lexer));
        tree = parser.body().declarations();
        
        visitor = new EsoLangBaseVisitorImp();
    }
    
    @Before
    public void setUp() {
        expression = "[$ ... ! { ... : ... > ... . : . > .... } & . \\:: .. | . : 1 .. : 5 ... : 1 .... : 1]";
        lexer = new EsoLangLexer(new ANTLRInputStream(expression));
        parser = new EsoLangParser(new CommonTokenStream(lexer));
        tree = parser.body().declarations();
        visitor.visit(tree);
    }

    
    /**
     * Test of visitDeclarations method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitDeclarations() {
        System.out.println("visitDeclarations");
         System.out.println(visitor.getVariable("."));
        assertEquals(visitor.getVariable("."), 1);
        assertEquals(visitor.getVariable(".."), 5);
        assertEquals(visitor.getVariable("..."), 1);
        assertEquals(visitor.getVariable("...."), 1);
        
    }
    
    /**
     * Test of visitCondition method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitCondition() {
        System.out.println("visitCondition");
        
        visitor.visit(tree.getParent().getChild(5));
        
        //If condition passes the value of dot will be changed
        assertNotEquals(visitor.getVariable("."), 1);
        
        
    }


    /**
     * Test of visitExpression method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitExpression() {
        System.out.println("visitExpression");
        
      
        //The statement in Java code
        int a = 1;
        int b = 5;
        int c = 1;
        int d = 1;
        
        System.out.println("Initial value of C is: "+c);
        
        do
        {
            c = c + c;
            a = a + d;
        }
        while(a >= b);
        
        visitor.visit(tree.getParent().getChild(5));
        
        System.out.println("The value of C is now: "+c);
       
       
        assertNotEquals(visitor.getVariable("..."), c);
        
    }

  


    /**
     * Test of visitComparison method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitComparison() {
        System.out.println("visitComparison");
        
        visitor.visit(tree.getParent().getChild(5));
        
        boolean esolangValue = visitor.getComparison(". \\:: ..");
        boolean actualValue = 2 < 3;
        
        assertEquals(esolangValue, actualValue);
        
    }


    /**
     * Test of visitAssignment method, of class EsoLangBaseVisitorImp.
     */
    @org.junit.Test
    public void testVisitAssignment() {
        System.out.println("visitAssignment");
        
        expression = "[$ . ! . : ... > .. | . : 1 .. : 5 ... : 1]";
        lexer = new EsoLangLexer(new ANTLRInputStream(expression));
        parser = new EsoLangParser(new CommonTokenStream(lexer));
        tree = parser.body().declarations();
        
        visitor = new EsoLangBaseVisitorImp();
        
        visitor.visit(tree);
        
        visitor.visit(tree.getParent().getChild(5));
     
        
        int assignedVal = visitor.getVariable(".");
        
        int variableVal = 1;
        
        int newVal = visitor.getVariable(".");
        
        assertEquals(newVal, 1+5);
        assertNotEquals(assignedVal, variableVal);
        
    
    }


}