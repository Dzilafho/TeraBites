 package services;
import EntityManagers.ConcreteDAO;
import backend.EsoLangBaseVisitorImp;
import backend.EsoLangLexer;
import backend.EsoLangParser;
import domainModel.Challenge;
import domainModel.*;
import java.util.ArrayList;
import java.util.List;
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
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
 
 
@Path("getQuestions")
public class GetQuestions {

    
    @GET
   @Produces(MediaType.APPLICATION_JSON)
    public  Response GetQuestions()
            
    {
        ConcreteDAO manager = new ConcreteDAO();
        List<Question> allQuestions = manager.getAllQuestions();
        
        
        return Response.ok().entity(new GenericEntity<List<Question>>(allQuestions){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
    }
} 