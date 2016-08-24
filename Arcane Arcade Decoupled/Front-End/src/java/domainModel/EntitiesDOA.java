/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package domainModel;

import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;

/**
 *
 * @author User
 */
public interface EntitiesDOA {
    

    //Object Addition
    
    @SqlUpdate("insert into Administrator (name) values (:name)")
     void addUser(@Bind("name") String name);
    
     @SqlUpdate("insert into question (questionString) values (:questionString)")
     void addQuestion(@Bind("questionString") String questionString);

     
    //Object Retrival
     @SqlQuery("select * from Administrator")
     String findNameById(@Bind("id") int id);
     
     
    //Object Updates
     
     
    //Object Removal
    

  

  /**
   * close with no args is used to close the connection
   */
  void close();
}
