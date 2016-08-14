 package services;
import EntityManagers.ConcreteDAO;
import domainModel.*;
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

 
 
@Path("addChallenge")
public class AddChallenge {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public void addChallenge(@Context @FormParam("challenge") String challengeName)
            
    {
        Challenge newChallenge = new Challenge(challengeName);
        ConcreteDAO dao=new ConcreteDAO<Challenge>();
        dao.add(newChallenge);        
    }
    
} 