/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arcane;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
/**
 *
 * @author Tom
 */
public class StoreCode {
    
    private String inputCode;
    private String outputCode;
    
    EsoLangLexer lexer;
    EsoLangParser parser;
    ParseTree tree;
    EsoLangBaseVisitorImp visitor;
    
    public StoreCode() {
        inputCode = null;
        outputCode = null;
    }

    /**
     * @return the inputCode
     */
    public String getInputCode() {
        return inputCode;
    }

    /**
     * @param inputCode the inputCode to set
     */
    public void setInputCode(String inputCode) {
        
        this.inputCode = inputCode;
        
        
    }

    /**
     * @return the outputCode
     */
    public String getOutputCode() {
        try{
            

            lexer = new EsoLangLexer(new ANTLRInputStream(inputCode));
            parser = new EsoLangParser(new CommonTokenStream(lexer));
            tree = parser.body().declarations();

            visitor = new EsoLangBaseVisitorImp();
            visitor.visit(tree);
            visitor.visit(tree.getParent().getChild(5));
            visitor.visit(tree.getParent().getChild(1));

            outputCode = visitor.output;
        }
        catch(java.lang.NullPointerException err)
        {
            outputCode = "There is an error in your code";
        }
        
        return outputCode;
    }

    /**
     * @param outputCode the outputCode to set
     */
    public void setOutputCode(String outputCode) {
        this.outputCode = outputCode;
    }

    
}
