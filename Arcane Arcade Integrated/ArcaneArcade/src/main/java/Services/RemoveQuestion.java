 package Services;
import Entities.*;
import EntityManagers.ConcreteDAO;
import javax.ws.rs.core.Context;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
@Path("removeQuestion")
public class RemoveQuestion {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void removeQuestion(@Context @FormParam("levelName") String levelName, @FormParam("challengeName") String challengeName, @FormParam("questionNumber") int questionNumber)
    {
                ConcreteDAO manager = new ConcreteDAO();
                
                Challenge thatChallenge =  manager.getChallenge(challengeName);
                                        
                    manager.removeQuestion(challengeName, levelName, questionNumber);
                    manager.add(thatChallenge);
     }
    
} 