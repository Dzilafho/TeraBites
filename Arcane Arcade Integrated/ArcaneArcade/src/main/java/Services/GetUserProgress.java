package Services;
import EntityManagers.ConcreteDAO;
import Entities.Users;
import java.util.*;

import javax.ws.rs.*;
import javax.ws.rs.core.*;


 
 
@Path("getUserProgress")
public class GetUserProgress {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public  String getUserProgress()
            
    {
        ConcreteDAO dao=new ConcreteDAO<>();
        Users currUser = dao.getUser("dzilafho3@gmail.com");
        return currUser.getCurrentLevel();
    }
                
} 