 package services;
import EntityManagers.ConcreteDAO;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

 
 
@Path("addLevel")
public class AddLevel {
    

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void addLevel(@Context @FormParam("challengename") String challengeName, @FormParam("levelname") String levelName)   
    {
                System.out.println(challengeName);
                ConcreteDAO manager = new ConcreteDAO();
                
                Challenge thatChallenge =  manager.getChallenge(challengeName);
                
                if(thatChallenge != null)
                {
                    thatChallenge.addChallengeLevel(new Level(levelName));
                    manager.add(thatChallenge);
                }
    }
    
} 