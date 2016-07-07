/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcane;

import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author dZiLafho
 */
public class EsoLangBaseVisitorImp extends EsoLangBaseVisitor<Integer>{
    
    
        Map<String, Object> variables = new HashMap<String, Object>();
        
        Map<String, Boolean> comparisons = new HashMap<String, Boolean>();
        //Stores previous values
        Map<String, Object> previousValues = new HashMap<String, Object>();
        
    /**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitCondition(@NotNull EsoLangParser.ConditionContext ctx)
        {
           // System.out.println("ctxxxxxxxxx "+ctx.getText());
            //System.out.println("ctx comppppppp "+ctx.comparison().getText());
            //System.out.println("ctx asssssss "+ctx.parent.parent.getChild(0).getText());
            System.out.println("In the condition"+ ctx.getText());
            
            this.visitComparison(ctx.comparison());
            
            if((!ctx.getText().contains(",")))
            {
                if(comparisons.get(ctx.comparison().getText()))
                    this.visitExpression(ctx.expression(0));
            }
            else
            {
                if(comparisons.get(ctx.comparison().getText()))
                {
                    this.visitExpression(ctx.expression(1));
                    //System.out.println("The exp is "+ ctx.expression(1).getText());
                }
                else
                    this.visitExpression(ctx.expression(0));
            }
            System.out.println(". is now "+variables.get("."));
            return null;
        }
        
        @Override public Integer visitDeclarations(@NotNull EsoLangParser.DeclarationsContext ctx)
        {
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitExpression(@NotNull EsoLangParser.ExpressionContext ctx) 
        {
           // System.
            //visit(ctx.declaration(0));
            System.out.print("In the expression "+ctx.getText());
           // System.out.println("Bs "+ctx.getText());
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
       
        @Override public Integer visitPrevious(@NotNull EsoLangParser.PreviousContext ctx)
        {
            System.out.println("Prev "+ctx.getText());
            System.out.println("Prev value of "+this.variables.get(".")+ " is "+this.previousValues.get("."));
            return visitChildren(ctx); 
        }
        
	@Override public Integer visitComparison(@NotNull EsoLangParser.ComparisonContext ctx)
        {
            System.out.println("In the comparisons");
            System.out.println("comparison "+ctx.getText());
            
            boolean result;
            
            if(ctx.getChild(0).getText().contains("<") | ctx.getChild(0).getText().contains(">"))
            {
               
                    this.visitOperation(ctx.operation(0));
            }
            else if(ctx.getChild(4).getText().contains("<") | ctx.getChild(4).getText().contains(">"))
            {
                this.visitOperation(ctx.operation(1));
            }
            
            int left = (int)variables.get(ctx.getChild(0).getText());
            int right =     (int)variables.get(ctx.getChild(4).getChild(0).getText());
            
            switch (ctx.getChild(2).getText()) 
            {
                case "/": 
                    result = left < right;
                    break;
                
                case "\\":
                    result = left > right;
                    break;
                    
                case "/::": 
                    System.out.println("Smaller or equal");
                    result = left <= right;
                    System.out.println(left);
                    System.out.println(right);
                    break;
                    
                case "\\::":
                    result = left >= right;
                    break;
                    
                case "::":
                    System.out.println("Equals");
                    System.out.println("L is "+left);
                            System.out.println("R is "+right);
                                    
                    result = left == right;
                    System.out.println("Res is "+result);
                    break;
                    
                default:
                    return null; 
            }
            
            comparisons.put(ctx.getText(), result);
            
            System.out.println(ctx.getText() + " is " + comparisons.get(ctx.getText()));
            
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitLoop(@NotNull EsoLangParser.LoopContext ctx)
        {
            System.out.println("Loops "+ctx.getText());
            
            if(ctx.getText().contains("&"))
            {
                 System.out.println("Hard loop "+ctx.getText());
                 
                 this.visitComparison(ctx.comparison());
                 System.out.println("The comp "+ctx.comparison().getText()+" is "+comparisons.get(ctx.comparison().getText()));
                 while(!comparisons.get(ctx.comparison().getText()))
                 {
                     this.visitExpressions(ctx.expressions());
                     this.visitComparison(ctx.comparison());
                 }
            }
            else
            {
                int count = (int)variables.get(ctx.operand().getText());
                int counter = 0;
                while(counter < count)
                {
                    this.visitExpressions(ctx.expressions());
                    counter++;
                }
            }
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
        @Override public Integer visitPrint(@NotNull EsoLangParser.PrintContext ctx)
        {
            System.out.println("Printing value as "+ variables.get(ctx.getChild(2).getText()));
            return visitChildren(ctx);
        }
        
	@Override public Integer visitAssignment(@NotNull EsoLangParser.AssignmentContext ctx) 
        {
            System.out.println("Assigning "+ctx.getText());
            
            //System.out.println("In assignment of "+ctx.getChild(0).getText());
            
            //System.out.println("Left is"+ctx.getChild(0).getText());
            
            if(ctx.getChild(0).getText().contains("@"))
            {
                //System.out.println("qqqqqqqqqqqq "+ variables.get(ctx.getChild(0).getText()));
                if(variables.containsKey(ctx.getChild(0).getText()))
                {
                    //throw an exception
                   // System.out.println("Variable is constant.");
                    return visitChildren(ctx);
                }
            }
            else
            {
                
            }
            
            
            if(ctx.getChild(4) == ctx.operation())
            {
               // System.out.println("opppppppppppppppp: "+ctx.getChild(4).getText());
                this.visit(ctx.getChild(4));
                int operand = (int)variables.get(ctx.getChild(4).getText());
                this.previousValues.put(ctx.getChild(0).getText(),this.variables.get(ctx.getChild(0).getText()));
                variables.put(ctx.getChild(0).getText(),operand);
                variables.put("("+ctx.getChild(0).getText()+")",this.previousValues.get(ctx.getChild(0).getText()));
            }
            else
            {
                //System.out.println("valueeeeeeeeeee");
                Object operand; 
                if(ctx.getChild(4).getText().contains("."))
                {
                    operand = (int)variables.get(ctx.getChild(4).getText());
                }
                else
                {
                    operand=Integer.parseInt(ctx.getChild(4).getText());
                }
                this.previousValues.put(ctx.getChild(0).getText(),this.variables.get(ctx.getChild(0).getText()));
                variables.put(ctx.getChild(0).getText(),operand);
                variables.put("("+ctx.getChild(0).getText()+")",this.previousValues.get(ctx.getChild(0).getText()));
            }
            
            
            //System.out.println("Variable: . is "+variables.get("@.."));
            
            return null; 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitProgram(@NotNull EsoLangParser.ProgramContext ctx)
        {
           // System.out.println("Visit the Program");

            System.out.println("F");
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitBody(@NotNull EsoLangParser.BodyContext ctx)
        {
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitDeclaration(@NotNull EsoLangParser.DeclarationContext ctx)
        {
            
        
            
            return visitChildren(ctx); 
        }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOperation(@NotNull EsoLangParser.OperationContext ctx) 
        {
            //System.out.println("Yah" + Integer.parseInt(ctx.getChild(4).getChild(0).getText()));
           // System.out.println("Op 1: "+ctx.getChild(0).getChild(0)+" = "+variables.get(ctx.getChild(0).getChild(0).getText()));
            //System.out.println("Op 2: "+ctx.getChild(2));
            //System.out.println("Op 3: "+ctx.getChild(4).getChild(0)+" = "+variables.get(ctx.getChild(4).getChild(0).getText()));
            System.out.println(ctx.getChild(0).getText());
            int left = (int)variables.get(ctx.getChild(0).getText());
            
            int right =     (int)variables.get(ctx.getChild(4).getChild(0).getText());
            
            System.out.println("In the operation");           
            //return 0;
            int result = 0;
            
            switch (ctx.getChild(2).getText()) 
            {
                case ">": 
                    result = left + right;
                    break;
                
                case "<":
                    result = left - right;
                    break;
                case ">>": 
                    result = left * right;
                    break;
                case "<<":
                    result = left / right;
                    break;
                case "`":
                    result = left % right;
                    break;
                default:
                    throw new IllegalArgumentException("Unkown opeator " + ctx.getChild(2).getText());
                   // break;
            }
            
            /*if(ctx.getChild(0).getText().contains("@"))
            {
                //System.out.println("qqqqqqqqqqqq "+ variables.get(ctx.getChild(0).getText()));
                if(variables.containsKey(ctx.parent.getChild(0).getText()))
                {
                    System.out.println("Variable for operation is constant.");
                    return visitChildren(ctx);
                }
            }
            else
            {
                variables.put(ctx.parent.getChild(0).getText(), result); 
            }*/
            
            variables.put(ctx.getText(), result);
          //  System.out.println("operation result: "+variables.get(ctx.parent.getChild(0).getText()));
            return visitChildren(ctx); 
        }
            
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public Integer visitOperand(@NotNull EsoLangParser.OperandContext ctx)
        {
            //System.out.println(ctx.getText());
            return visitChildren(ctx);
        }
}
