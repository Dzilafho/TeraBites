package za.co.bbd.arcanearcade;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserTest
{
    private ArrayList<String> testData;

    @Before
    public void preTestInitialization()
    {
        testData = new ArrayList<String>();
        testData.add("[. : 5]");        // Simple assignment
        testData.add("[$.]");           // Simple print
        testData.add("[$.! | . : 5]");
        //testData.add("[$ . ! { . : . > . } .. | . : 1 .. : 3]");
        //testData.add("[$ . ! { . : (.) > . } .. | . : 0 . : 1 .. : 10]");
    }

    @After
    public void postTestCleanup()
    {
        testData.clear();
    }

    @Test
    public void testParser()
    {
        for (String expression : testData)
        {
            EsoLangLexer lexer = new EsoLangLexer(new ANTLRInputStream(expression));
            EsoLangParser parser = new EsoLangParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            assertEquals("Syntax errors", 0, parser.getNumberOfSyntaxErrors());
        }
    }
}