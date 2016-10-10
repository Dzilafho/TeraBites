 package Services;
import Entities.Challenge;
import Entities.Users;
import EntityManagers.ConcreteDAO;
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

 
 
@Path("setUserProgress")
public class AddUserProgress {
    
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public void addUserProgress(@Context @FormParam("progress") String progress)
            
    {
        ConcreteDAO dao=new ConcreteDAO<>();

        Users currUser = dao.getUser("dzilafho3@gmail.com");
        currUser.setCurrentLevel(progress);
        dao.add(currUser);
    }
    
} 