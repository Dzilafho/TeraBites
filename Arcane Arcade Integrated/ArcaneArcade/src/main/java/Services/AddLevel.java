 package Services;
import Entities.Level;
import Entities.Challenge;
import EntityManagers.ConcreteDAO;

import javax.ws.rs.core.Context;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

 
 
@Path("addLevel")
public class AddLevel {
    

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public void addLevel(@Context @FormParam("levelname") String levelname, @FormParam("challengename") String challengeName)   
    {
                ConcreteDAO manager = new ConcreteDAO<Challenge>();
                
                
                Challenge thatChallenge =  manager.getChallenge(challengeName);
                                 
                thatChallenge.addChallengeLevel(new Level(levelname));
                
                
                manager.add(thatChallenge);
    }
    
} 