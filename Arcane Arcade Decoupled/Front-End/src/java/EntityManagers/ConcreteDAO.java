/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManagers;

import domainModel.Answer;
import domainModel.Challenge;
import domainModel.Hint;
import domainModel.Level;
import domainModel.Question;
import domainModel.Users;
import java.rmi.activation.Activator;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PreDestroy;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.eclipse.persistence.config.PersistenceUnitProperties;
import org.skife.jdbi.v2.sqlobject.SqlQuery;

/**
 *
 * @author Gershom
 */
public class ConcreteDAO<T> implements GenericModelDao<T> {
        
    private static final String PERSISTENCE_UNIT_NAME = "Mains";
    private static EntityManagerFactory factory;
    private static EntityManager em ;
    public ConcreteDAO()
    {
    
        factory = Persistence.createEntityManagerFactory("Mains");
        em = factory.createEntityManager();
    }

    @Override
    public void add(T entityClass) 
    {      
         em.getTransaction().begin(); 
         em.persist(entityClass);
         em.getTransaction().commit();
         em.close();
    }
    
    @Override
    public void update(T entityClass) {
         em.getTransaction().begin(); 
         em.persist(entityClass);
         em.getTransaction().commit();
         em.close();
    }

    @Override
    public void delete(T entityClass) {
        
         em.getTransaction().begin(); 
         em.remove(entityClass);
         em.getTransaction().commit();
         em.close();
       
    }

    @Override
    public T get(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<T> get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Challenge> getAllChallenges()
    {
       
        em.getTransaction().begin(); 

        List<Challenge> list = em.createQuery("SELECT c FROM Challenge c", Challenge.class).getResultList();
 
        em.getTransaction().commit();
        em.close();
         
        return list; 
    }
    
    @Override
    public List<Level> getAllLevels()
    {
        em.getTransaction().begin(); 

        List<Level> list = em.createQuery("SELECT l FROM Level l", Level.class).getResultList();
       
        em.getTransaction().commit();
        em.close();
         
        return list; 
    }
    
   
    @Override
    public List<Question> getAllQuestions() {
       em.getTransaction().begin(); 

        List<Question> list = em.createQuery("SELECT q FROM Question q", Question.class).getResultList();
       
        em.getTransaction().commit();
        em.close();
         
        return list;
    }

    @Override
    public List<Users> getAllUsers() {
        
        em.getTransaction().begin(); 

       // List<Users> list = em.createQuery("SELECT u.userID, u.userName, u.userType,  u.password, u.name, u.emailAddress  FROM Users u", Users.class).getResultList();
       List<Users> list = em.createQuery("SELECT u  FROM Users u", Users.class).getResultList();
        em.getTransaction().commit();
        em.close();
         
        return list;
    }

    @Override
    public Challenge getChallenge(String challengeName) {
        em.getTransaction().begin(); 
        
        int challengeNum = 0;
        
        List<Challenge> list = em.createQuery("SELECT c FROM Challenge c", Challenge.class).getResultList();
        
        em.getTransaction().commit();
        
        for(int i = 0; i < list.size(); i++)
        {   
            if(challengeName.equals(list.get(i).getChallengeName()))
                     challengeNum = list.get(i).getChallengeId();
        }
        
        
        Challenge item = em.find(Challenge.class, challengeNum);
        //em.getTransaction().commit();
        //em.close();
         
        return item;
    }
    public void RemoveChallenge(String challengeName)
    {
        em.getTransaction().begin();
        int challengeNum = 0;
        
        List<Challenge> list = em.createQuery("SELECT c FROM Challenge c", Challenge.class).getResultList();
        
        em.getTransaction().commit();
        
        for(int i = 0; i < list.size(); i++)
        {   
            if(challengeName.equals(list.get(i).getChallengeName()))
                     challengeNum = list.get(i).getChallengeId();
        }
        
        Challenge item = em.find(Challenge.class, challengeNum);
        
        System.out.println("hfhfhfhfhfhfhfhf  "+item.getChallengeName());
        
     }

}
