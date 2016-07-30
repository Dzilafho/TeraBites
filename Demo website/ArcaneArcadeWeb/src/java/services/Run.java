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
public class Run {

    
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
      
        String ret = "<!doctype html>\n" +
"<html>\n" +
"<head>\n" +
"	<meta charset=\"UTF-8\">\n" +
"	<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
"	<title>Arcane Arcade</title>\n" +
"	<link rel=\"stylesheet\" href=\"css/style.css\" type=\"text/css\">\n" +
"	<link rel=\"stylesheet\" type=\"text/css\" href=\"css/mobile.css\">\n" +
"	<script src=\"/js/mobile.js\" type=\"text/javascript\"></script>\n" +
"</head>\n" +
"<body>\n" +
"	<div id=\"page\">\n" +
"		<div id=\"header\">\n" +
"			<div>\n" +
"			</div>\n" +
"		</div>\n" +
"		\n" +
"		<div id=\"header\" >\n" +
"			<h1><center>Question 1</center></h1>\n" +
"			<h2><center><br>The answer is</center></h2>\n" +
"\n" +"<h1><center>" +visitor.getAnswer()+"</center></h1>"+

"		</div>\n" +
"		\n" +
"		<div id=\"footer\">\n" +
"			<div>\n" +
"				<p></p>\n" +
"			</div>\n" +
"		</div>\n" +
"	</div>\n" +
"</body>\n" +
"</html>\n" +
"";
        return ret;
    }
    
} 