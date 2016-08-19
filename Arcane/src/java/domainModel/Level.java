package domainModel;

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
  
    String levelName;
   
   @OneToMany( targetEntity=Question.class,cascade = CascadeType.PERSIST )
   private List<Question> levelQuestions=new ArrayList<Question>(); 
   
   @OneToOne( targetEntity=Badge.class, cascade = CascadeType.PERSIST)
   private Badge badge;
   
   public Level(){
       
     levelQuestions = null;
     badge = null;
     levelName=null;
   }
   
   public Level(String name){
       
     levelName = name;
     levelQuestions= null;
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
   
     /**
     * @return the levelQuestions
     */
    @XmlTransient
    public List<Question> getLevels() {
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
    public Badge getBedge() {
        return badge;
    }

    /**
     * @param badge the badge to set
     */
    public void setBadge(Badge badge) {
        this.badge = badge;
    }

    
}
