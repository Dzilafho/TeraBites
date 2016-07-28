package za.co.bbd.arcanearcade;

import java.util.Hashtable;
import java.util.ArrayList;

import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Implementation of the automatically generated ANTLR4 visitor interface
 * that has to walk the generated parser tree.
 *
 * @author  TeraBites - University of Pretoria
 */
 public class EsoLangBaseVisitorImp extends EsoLangBaseVisitor<Integer>
 {
     public Hashtable<String, Integer> variables = new Hashtable<String, Integer>();
     public ArrayList<Integer> results = new ArrayList<Integer>();

     /**
      * Called when visiting the first function (the main function) of the 
      * program.
      *
      * @param ctx  The parser context of the main function.
      */
     @Override
     public Integer visitProgram(EsoLangParser.ProgramContext ctx)
     {
         //System.out.println("Visiting program");
         visit(ctx.function());
         return 0;
     }

     @Override
     public Integer visitFunction(EsoLangParser.FunctionContext ctx)
     {
         //System.out.println("Visiting function");
         ArrayList<ParseTree> queue = new ArrayList<ParseTree>();
         int children = ctx.getChildCount();
         int k = 0;     // Keeps track of where to insert new expression into queue
         for (int i = 0; i < children; ++i)
         {
             ParseTree child = ctx.getChild(i);             

             // Visit declarations first
             if (child instanceof EsoLangParser.DeclarationContext)
             {
                visit(child);
             }
             else if (child instanceof EsoLangParser.AfterContext)      // Add after expressions at the end of the queue
             {
                queue.add(child);
             }
             else if (child instanceof EsoLangParser.ExpressionContext) // Add normal expressions in order at the start of the queue          
             {
                queue.add(k++, child);
             }
         }
         
         while (!queue.isEmpty())
            visit(queue.remove(0));

         return 0;
     }

     @Override
     public Integer visitValueExpression(EsoLangParser.ValueExpressionContext ctx) throws IndexOutOfBoundsException 
     {
         //System.out.println("Visiting value expression");
         
         if (ctx.INT() != null)
            return Integer.valueOf(ctx.INT().getText()); // Return literal value
         else   // get value from variable
         {
             String variable = ctx.getChild(0).getText();
             if (variables.containsKey(variable))
                return variables.get(variable);    // Return value corresponding to variable
             else
             {
                 // TODO: Add error to a list to display afterwards
                 // TODO: Replace IndexOutOfBoundsException  with a valid runtime exception
                throw new IndexOutOfBoundsException();
             }
         }
     }

     @Override
     public Integer visitAssignmentExpression(EsoLangParser.AssignmentExpressionContext ctx)
     {
         //System.out.println("Visiting assignment expression");
         visit(ctx.assignment());
         return 0;
     }  

     @Override
     public Integer visitAssignment(EsoLangParser.AssignmentContext ctx)
     {
         //System.out.println("Visiting assignment");
         String variable = ctx.getChild(0).getText();
         int value = visit(ctx.expression());
         variables.put(variable, value);    // Store the variable
         return 0;
     }

     @Override
     public Integer visitPrint(EsoLangParser.PrintContext ctx)
     {
         //System.out.println("Visiting print");
         try 
         {
             int value = visit(ctx.expression());
	         results.add(value);
	         return 0;
         }
         catch (IndexOutOfBoundsException ex)
         {
             return -1;
         }         
     }
 }