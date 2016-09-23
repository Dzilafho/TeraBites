/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Users;
import EntityManagers.ConcreteDAO;
import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author gershom
 */
@Path("login")
public class Login {

   
    /**
     * Creates a new instance of LoginResource
     */
    public Login() {
    }
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

    /**
     * Retrieves representation of an instance of services.Login
     * @return an instance of java.lang.String
     */
    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.APPLICATION_JSON)
    public String LoginValidation(@Context UriInfo uriInfo,@FormParam("username") String username,@FormParam("password") String password) {
        
        ConcreteDAO dao=new ConcreteDAO<>();
        String passwordToHash = password;
        String securePassword;
        
        Users user=dao.getUser(username);
        
        if(user ==null)
        {
            return "Wrong password/username/passcode";
        }
        if(user != null)
        {
           securePassword = getSecurePassword(passwordToHash, user.getSalt());
        }
        else
        {
            return "Wrong password/username";
        }
        if(securePassword.equals(user.getPassword()) && username.equals(user.getUserName()))
        {
             return "success"+user.getUserType();
        }
        if(securePassword != user.getPassword())
        {
           return "Wrong password/username/passcode";
        }
        if(securePassword==user.getPassword())
        {
            return "sucess"+user.getUserType();
        }
        return "sucess"+user.getUserType();
    }
}
