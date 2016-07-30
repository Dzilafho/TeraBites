package domainModel;

import java.io.Serializable;
import java.util.List;
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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int levelID;
   
   @OneToMany( targetEntity=Question.class )
   private List<Question> levels; 
   @OneToOne( targetEntity=Badge.class )
   private Badge badge;
   
   public Level(){
       
     levels = null;
     badge = null;
   }
   public Level(List<Question> list, Badge mBadge)
   {
       this.levels = list;
       this.badge = mBadge;
   }
   
     /**
     * @return the levels
     */
    @XmlTransient
    public List<Question> getLevels() {
        return levels;
    }

    /**
     * @param levels the levels to set
     */
    public void setLevels(List<Question> levels) {
        this.levels = levels;
    }

    /**
     * @return the badge
     */
    public Badge getBedge() {
        return badge;
    }

    /**
     * @param bedge the badge to set
     */
    public void setBedge(Badge badge) {
        this.badge = badge;
    }
}
