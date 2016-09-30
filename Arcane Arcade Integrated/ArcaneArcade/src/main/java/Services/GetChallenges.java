 package Services;
import EntityManagers.ConcreteDAO;
import Entities.Challenge;
import Entities.Users;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("getChallenges")
public class GetChallenges {
    
   @GET
   @Produces(MediaType.APPLICATION_JSON)
    public  String getChallenges()
            
    {
        
        
        
        ConcreteDAO manager = new ConcreteDAO();
        List<Challenge> allChallenges = manager.getAllChallenges();
        
        
        Gson gson = new Gson();
        
           System.out.println("JSON");
        return gson.toJson(allChallenges);
        /*return Response.ok().entity(new GenericEntity<List<Challenge>>(allChallenges){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();*/
    }
                
} 