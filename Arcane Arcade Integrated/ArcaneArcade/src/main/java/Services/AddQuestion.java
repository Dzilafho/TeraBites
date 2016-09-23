 package Services;
import Entities.Answer;
import Entities.Challenge;
import Entities.Hint;
import Entities.Question;
import EntityManagers.ConcreteDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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


 
 
@Path("addQuestion")
public class AddQuestion {
    
    
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces("text/html")
     public void addQuestionResource(@Context @FormParam("question") String question,
                                    @FormParam("answer") String answer,
                                    @FormParam("level") String levelName,
                                    @FormParam("challenge") String challengeName)
     {      

                ConcreteDAO manager = new ConcreteDAO();
                
                Challenge thatChallenge =  manager.getChallenge(challengeName);
                
                if(thatChallenge != null)
                {
                    Question theQuestion = new Question(question, answer);
                    thatChallenge.addQuestion(levelName, theQuestion);
                    
                    manager.add(thatChallenge);
                }
                else
                {
                    System.out.println("Its null bro");
                }
     
    }
    
} 