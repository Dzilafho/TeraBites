/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntityManagers;

import Entities.Question;
import Entities.Challenge;
import Entities.Users;
import Entities.Level;
import java.util.List;

/**
 *
 * @author Gershom
 */
public interface GenericModelDAO<T> {
    public void add(T entityClass);
    public void update(T entityClass);
    public void delete(T entityClass);
    public T get(long id);
    public List<T> get();
    
    public Challenge getChallenge(String challengeName);
    public List<Challenge> getAllChallenges();
    public List<Level> getAllLevels();
    public List<Question> getAllQuestions();
    public List<Users> getAllUsers();

}