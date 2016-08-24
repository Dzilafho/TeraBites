 package services;
import EntityManagers.ConcreteDAO;
import domainModel.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("viewLevel")
public class ViewLevel {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/getAll")
    public  Response viewLevel()
            
    {
        List<Users> result = new ArrayList<Users>();
        
       //  result.add(new Users("User 1","surnamedas", "usernasdasme","password","userType","email"));
         // result.add(new Users("User 2","surname 2sd","uas dasdzxcsername","password","userType","email"));
         // result.add(new Users("name 3","surname 2","usssssssername","password","userType","email"));
         
        return Response.ok().entity(new GenericEntity<List<Users>>(result){})
        .header("Access-Control-Allow-Origin", "*")
        .header("Access-Control-Allow-Methods", "GET, POST, OPTIONS, HEAD")
        .build();
        
    }
                
} 