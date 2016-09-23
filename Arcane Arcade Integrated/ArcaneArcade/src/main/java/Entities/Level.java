package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author teraBites
 */

@Entity
@XmlRootElement
public class Level implements Serializable {
    
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
   private int levelID;
  
    private String levelName;
   
   @OneToMany( targetEntity=Question.class,cascade = CascadeType.ALL)
   private List<Question> levelQuestions=new ArrayList<Question>(); 
   
   @OneToOne( targetEntity=Badge.class, cascade = CascadeType.ALL)
   private Badge badge;
   
   public Level(){
       
     levelQuestions = null;
     badge = null;
     levelName=null;
   }
   
   public Level(String name){
       
     levelName = name;
     levelQuestions =new ArrayList<Question>(); 
     badge=null;
   }
   
   public Level(Question question, Badge mBadge,String name)
   {
       this.levelQuestions.add(question);
       this.badge = mBadge;
       this.levelName=name;
   }
   
   public void addQuestion(Question question)
   {
       this.levelQuestions.add(question);
   }
   
   public void removeQuestion(int question)
   {
       this.levelQuestions.remove(question-1);
   }
     /**
     * @return the levelQuestions
     */
    @XmlTransient
    public List<Question> getQuestions() {
        return levelQuestions;
    }

    /**
     * @param levels the levelQuestions to set
     */
    public void setLevels(List<Question> levels) {
        this.levelQuestions = levels;
    }

    /**
     * @return the badge
     */
    public Badge getBadge() {
        return badge;
    }

    /**
     * @param badge the badge to set
     */
    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    /**
     * @return the levelName
     */
    public String getLevelName() {
        return levelName;
    }

    /**
     * @param levelName the levelName to set
     */
    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    /**
     * @return the levelID
     */
    public int getLevelID() {
        return levelID;
    }

    /**
     * @param levelID the levelID to set
     */
    public void setLevelID(int levelID) {
        this.levelID = levelID;
    }

    
}
