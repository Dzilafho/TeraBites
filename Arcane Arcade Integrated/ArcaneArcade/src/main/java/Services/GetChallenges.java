 package Services;
import EntityManagers.ConcreteDAO;
import Entities.Challenge;
import Entities.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("getChallenges")
public class GetChallenges {
    
   @GET
   @Produces(MediaType.APPLICATION_JSON)
    public  Response getChallenges()
            
    {
        ConcreteDAO manager = new ConcreteDAO();
        List<Challenge> allChallenges = manager.getAllChallenges();
        return Response.ok().entity(new GenericEntity<List<Challenge>>(allChallenges){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
    }
                
} 