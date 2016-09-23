package Backend;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Run {
    public static void main(String[] args) throws Exception {
        
        String expression = "[$ ... ! ... : . , ... : .. ~ . /:: .. | . : 1 .. : 2]";
        EsoLangLexer lexer = new EsoLangLexer(new ANTLRInputStream(expression));
        EsoLangParser parser = new EsoLangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.body().declarations();
        
        EsoLangBaseVisitorImp  visitor = new EsoLangBaseVisitorImp();
        //visitor.visit(tree.getChild(5));
       // System.out.println("Args " + tree.getChildCount());
        
        //System.out.println("Args " + tree.getChildCount());
        
        
        visitor.visit(tree);
        System.out.println("Done");
        visitor.visit(tree.getParent().getChild(5));
        visitor.visit(tree.getParent().getChild(1));
    }
}
