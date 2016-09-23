package Main;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import static org.junit.Assert.assertTrue;

import Entities.Level;
import Entities.Challenge;
import Entities.Users;
import EntityManagers.ConcreteDAO;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;




import java.util.ArrayList;
import java.util.Map;
//import jersey.repackaged.org.objectweb.asm.Handle;
//import static org.junit.Assert.assertTrue;

public class MainClass {
 // private static final String PERSISTENCE_UNIT_NAME = "Mains";
  //private static EntityManagerFactory factory;

  public static void main(String[] args) {
    //Answer ansObj = new Answer("This is the answer12");
    //Hint hintObj = new Hint("Come on its easy112", 2);
    //Question qObj = new Question("What is the answer 2", ansObj, hintObj);
    
    //Users theUser = new Users("Gershom", "Maluleke@venda.com");
    ConcreteDAO manager = new ConcreteDAO();
                
                 Users user=new Users("hhh","hhh","jj","jjj","hh","jjjj",null);
                 manager.add(user);
  // ConcreteDAO dao=new ConcreteDAO();
   //System.out.println("Chall :"+dao.getChallenge("First Challenge").getChallengeName());
   //System.out.println(dao.getAllUsers().get(0).toString());
   // System.out.println("The challenge name is "+challObj.getChallengeName());
     
    // factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    //EntityManager em = factory.createEntityManager();
    
    
    /*DBI dbi = new DBI("jdbc:postgresql://localhost:5432/postgres", "postgres", "DzilMul6264");
        
    String sql = "SELECT * FROM Users";
    
    Handle handle = null;
    
    handle = dbi.open();
            
    Query<Map<String, Object>> q = handle.createQuery(sql);
    
    List<Map<String, Object>> l = q.list();
                
            
            
            
    for (Map<String, Object> m : l)
    {
            
                System.out.println("Name: " + m.get("userName"));
                System.out.println("Email :" + m.get("emailaddress"));
                System.out.println("M is "+m.size());
    }
            
            */
    /*

    // create new todo
    em.getTransaction().begin();
    
    Answer ansObj = new Answer("This is the second answer");
    Hint hintObj = new Hint("You stupid", 2);
    Question qObj = new Question("Quesss the answer", ansObj, hintObj);
    
    //Users theUser = new Users("Gershom", "Maluleke@venda.com");
    
   // theUser.setUserName("Pro User");
    //todo.setSummary("This is a test");
    //todo.setDescription("This is a test");
    em.persist(qObj);
    em.getTransaction().commit();
   // em.createQuery("SELECT * FROM \"public\".users;");
   
   //em.getTransaction().commit();
    em.close();
   // handle.close(); 
      
    //DBI dbi = new DBI("jdbc:postgresql://localhost:5432/postgres", "postgres", "DzilMul6264");
    
   */

//EntitiesDOA dao = dbi.open(EntitiesDOA.class);
//dao.createSomethingTable();

//dao.insert("Aaron");

//String name = dao.findNameById(1);

//System.out.println("the name is "+name);

//dao.close();
  }
  
} 
