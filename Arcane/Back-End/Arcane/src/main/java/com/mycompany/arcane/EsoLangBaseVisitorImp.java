package com.mycompany.arcane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.mycompany.arcane.language.*;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.misc.NotNull;

/**
 *
 * @author dZiLafho
 */
public class EsoLangBaseVisitorImp extends EsoLangBaseVisitor<Integer>{
    
    
        //Stores variables & statements and their integer values
        Map<String, Object>  variables = new HashMap<>();
        
        //Stores comparison statements and their boolean values 
        Map<String, Boolean> comparisons = new HashMap<>();
        
        //Stores previous values of re-assigned variables
        Map<String, Object> previousValues = new HashMap<>();
        
    /*
        *	
        * {@inheritDoc}	
        *	 
        * <p>The default implementation returns the result of calling	 
        * {@link #visitChildren} on {@code ctx}.</p>	 
        */
        @Override public Integer visitCondition(@NotNull EsoLangParser.ConditionContext ctx)
        {
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

                        }
                        else
                                 this.visitExpression(ctx.expression(0));
                }

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
                return visitChildren(ctx); 
        }
        
        @Override public Integer visitComparison(@NotNull EsoLangParser.ComparisonContext ctx)
        {
            
                boolean result;

                if(ctx.getChild(0).getText().contains("<") | ctx.getChild(0).getText().contains(">"))
                {
                        this.visitOperation(ctx.operation(0));
                }
                else if(ctx.getChild(4).getText().contains("<") | ctx.getChild(4).getText().contains(">"))
                {
                    this.visitOperation(ctx.operation(1));
                }

                int left = (int)variables.get((String)ctx.getChild(0).getText());
                int right = (int) variables.get(ctx.getChild(4).getChild(0).getText());

                switch (ctx.getChild(2).getText()) 
                {
                        case "/": 
                                result = left < right;
                                break;

                        case "\\":
                                result = left > right;
                                break;

                        case "/::": 
                                result = left <= right;
                                System.out.println(left);
                                System.out.println(right);
                                break;

                        case "\\::":
                                result = left >= right;
                                break;

                        case "::":
                                result = left == right;
                                break;

                        default:
                                return null; 
                }

                comparisons.put(ctx.getText().toString(), result);

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
            
            
                if(ctx.getText().contains("&"))
                {

                        this.visitComparison(ctx.comparison());
                        
                        while(!comparisons.get(ctx.comparison().getText()))
                        {
                                this.visitExpressions(ctx.expressions());
                                this.visitComparison(ctx.comparison());
                        }
                }
                else
                {
                        int count = Integer.parseInt((String) variables.get(ctx.operand().getText()));
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
            
            
                if(ctx.getChild(0).getText().contains("@"))
                {

                        if(variables.containsKey(ctx.getChild(0).getText()))
                        {
                                return visitChildren(ctx);
                        }
                }
               
                
                if(ctx.getChild(4) == ctx.operation())
                {

                        this.visit(ctx.getChild(4));
                        int operand = (int) variables.get(ctx.getChild(4).getText());
                        this.previousValues.put(ctx.getChild(0).getText(),this.variables.get(ctx.getChild(0).getText()));
                        variables.put(ctx.getChild(0).getText(),operand);
                        variables.put("("+ctx.getChild(0).getText()+")",this.previousValues.get(ctx.getChild(0).getText()));
                }
                else
                {

                        Object operand; 
                        
                        if(ctx.getChild(4).getText().contains("."))
                        {
                                 operand = Integer.parseInt((String) variables.get(ctx.getChild(4).getText()));
                        }
                        else
                        {
                                  operand=Integer.parseInt(ctx.getChild(4).getText());
                        }
                        
                        this.previousValues.put(ctx.getChild(0).getText(),this.variables.get(ctx.getChild(0).getText()));
                        variables.put(ctx.getChild(0).getText(),operand);
                        variables.put("("+ctx.getChild(0).getText()+")",this.previousValues.get(ctx.getChild(0).getText()));
                }

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
            
                int left = 	(int)variables.get(ctx.getChild(0).getText());
                int right =      (int) variables.get(ctx.getChild(4).getChild(0).getText());
                int result = 0;

                switch ((String)ctx.getChild(2).getText()) 
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
                   
                }
            
                variables.put(ctx.getText(), result);
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
                return visitChildren(ctx);
         }
        
        public int getVariable(String variable)
        {
                return (int)variables.get(variable);
        }
        
         public Boolean getComparison(String expressions)
        {
                return comparisons.get(expressions);
        }
}
