 package Services;
import EntityManagers.ConcreteDAO;
import Entities.Users;
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

 
 
@Path("addUser")
public class AddUser {
   
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public void addUser(@Context @FormParam("name") String name,
                                 @FormParam("surname") String surname,
                                 @FormParam("username") String username,
                                 @FormParam("password") String password,
                                 @FormParam("email") String email,
                                 @FormParam("userType") String userType)
            
    {
         Users user=new Users(name,surname,username,password,userType,email);
         ConcreteDAO dao=new ConcreteDAO<>();
         dao.add(user);
       //return user;
        
    }
    
} 