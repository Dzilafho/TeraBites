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
 
@Path("removeLevel")
public class RemoveLevel {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void removeLevel(@Context @FormParam("levelName") String levelName, @FormParam("challengeName") String challengeName)
    {
                ConcreteDAO manager = new ConcreteDAO<Challenge>();
                
                
                Challenge thatChallenge =  manager.getChallenge(challengeName);
                                 
                thatChallenge.removeChallengeLevel(levelName);
                
                manager.removeLevel(challengeName, levelName);

                manager.add(thatChallenge);
    
    }
    
} 