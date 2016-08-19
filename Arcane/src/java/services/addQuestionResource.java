 package services;
import backend.EsoLangBaseVisitorImp;
import backend.EsoLangLexer;
import backend.EsoLangParser;
import domainModel.EntitiesDOA;
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
import org.skife.jdbi.v2.DBI;
 
 
@Path("addQuestion")
public class addQuestionResource {

    
     @POST
     @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
     public void addQuestionResource(@Context UriInfo uriInfo,@FormParam("question") String question,@FormParam("answer") String answer,@FormParam("level") String level,@FormParam("challenge") String challenge)
     {      
         DBI dbi = new DBI("jdbc:postgresql://localhost:5432/postgres", "postgres", "root");
        EntitiesDOA dao = dbi.open(EntitiesDOA.class);
        
        dao.addQuestion(question);
        //dao.addAnswer(anser)
        dao.close();
    }
    
} 