 package services;
import backend.EsoLangBaseVisitorImp;
import backend.EsoLangLexer;
import backend.EsoLangParser;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 
 
@Path("run")
public class RunResource {

    
     @POST
     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
     @Produces("text/html")
     public String createMessage(@FormParam("question") String myQuestion)
     {
        String expression=myQuestion.toString();
        EsoLangLexer lexer = new EsoLangLexer(new ANTLRInputStream(expression));
        EsoLangParser parser = new EsoLangParser(new CommonTokenStream(lexer));
        ParseTree tree = parser.body().declarations();
        EsoLangBaseVisitorImp  visitor = new EsoLangBaseVisitorImp();
        visitor.visit(tree);
        visitor.visit(tree.getParent().getChild(5));
        visitor.visit(tree.getParent().getChild(1));
        
        return "<h1>"+visitor.getAnswer()+"</h1>";
    }
    
} 