 package Services;
import Entities.Question;
import EntityManagers.ConcreteDAO;

import java.util.List;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 
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