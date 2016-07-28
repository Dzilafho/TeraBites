package za.co.bbd.arcanearcade;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class VisitorTest
{
    //private ArrayList<String> testData;
    private ArrayList<TestContainer> testData;

    @Before
    public void preTestInitialization()
    {
        testData = new ArrayList<TestContainer>();
        testData.add(new TestContainer("[. : 5]", null));
        testData.add(new TestContainer("[$5]", new Integer[]{ 5 }));
        testData.add(new TestContainer("[$ . ! | . : 1]", new Integer[]{ 1 }));
        
    }

    @After
    public void postTestCleanup()
    {
        testData.clear();
    }

    @Test
    public void testVisitor()
    {
        for (TestContainer test : testData)
        {
            EsoLangLexer lexer = new EsoLangLexer(new ANTLRInputStream(test.expression));
            EsoLangParser parser = new EsoLangParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            EsoLangBaseVisitorImp visitor = new EsoLangBaseVisitorImp();
            visitor.visit(tree);

            assertArrayEquals("Incorrect results", test.expected, visitor.results.toArray());
        }
    }

    private class TestContainer
    {
        public String expression;
        public Integer[] expected;

        public TestContainer(String expression, Integer[] expected)
        {
            this.expression = expression;
            if (expected != null)
                this.expected = expected;
            else
                this.expected = new Integer[0];
        }
    }
}