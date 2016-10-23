 package Services;
import EntityManagers.ConcreteDAO;
import Entities.Users;
import java.io.BufferedInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
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
 
 
 /*MD5 algorthim is used to hash user passwords before storing them on the database and a randowm salt is created and used to hash the password"*/

 
 
@Path("addUser")
public class AddUser {
   
    
    private static byte[] getSalt() throws NoSuchAlgorithmException, NoSuchProviderException
    {
        //Always use a SecureRandom generator
        SecureRandom sr = SecureRandom.getInstance("SHA1PRNG", "SUN");
        //Create array for salt
        byte[] salt = new byte[16];
        //Get a random salt
        sr.nextBytes(salt);
        //return salt
        return salt;
    }
     private static String getSecurePassword(String passwordToHash, byte[] salt)
    {
        String generatedPassword = null;
        try {
            // Create MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");
            //Add password bytes to digest
            md.update(salt);
            //Get the hash's bytes 
            byte[] bytes = md.digest(passwordToHash.getBytes());
            //This bytes[] has bytes in decimal format;
            //Convert it to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for(int i=0; i< bytes.length ;i++)
            {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            //Get complete hashed password in hex format
            generatedPassword = sb.toString();
        } 
        catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }
    public boolean sendEmail(String email,String code)
    {
        
        Socket eserver;
            
            try {
                eserver = new Socket("kendy.up.ac.za", 25);
                BufferedInputStream inE = new BufferedInputStream(eserver.getInputStream());
                DataOutputStream outE = new DataOutputStream(eserver.getOutputStream());
                
                byte[] reply = new byte[8196];
                int inbytes;
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                
                outE.writeBytes("EHLO tuks.co.za\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                outE.writeBytes("MAIL FROM: <superman@up.ac.za>\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                outE.writeBytes("RCPT TO: <"+email+">\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                outE.writeBytes("DATA\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                outE.writeBytes("From: mail.cs.up.ac.za\r\n");
                outE.writeBytes("To: "+email+"\r\n");
                outE.writeBytes("Subject: Login credentials \r\n");
                outE.writeBytes("Good day,\r\n");
                outE.writeBytes("Please use this credentials to login to login: " + code + "\r\n");
                outE.writeBytes("Thank you\r\n");
                outE.writeBytes(".\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
                
                outE.writeBytes("QUIT\r\n");
                if((inbytes = inE.read(reply))!=-1){
                    String h = new String(reply,0, inbytes);
                    System.out.println(h);
                }
            } catch (IOException ex) {
                return false;
            }
            
            
            return true;
        
    }
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String addUser(@Context @FormParam("name") String name,
                                 @FormParam("surname") String surname,
                                 @FormParam("username") String username,
                                 @FormParam("password") String password,
                                 @FormParam("email") String email,
                                 @FormParam("userType") String userType) throws NoSuchAlgorithmException, NoSuchProviderException
            
    {
        
        ConcreteDAO dao=new ConcreteDAO<>();
         
        String passwordToHash = password;
        byte[] salt = getSalt();
        String securePassword = getSecurePassword(passwordToHash, salt);
        //send email with code
        sendEmail(email,password);
        // String regeneratedPassowrdToVerify = getSecurePassword(passwordToHash, salt);
        //System.out.println(regeneratedPassowrdToVerify); //Prints 83ee5baeea20b6c21635e4ea67847f66
        Users users=new Users(name,surname,username,securePassword,userType,email,salt);
            dao.add(users);
/*       if(dao.checkUserExist(username))
        {
            return "fail";
        }
        else
        {
           dao.add(users);
        }*/
    
         return "success";
        
    }
    
} 