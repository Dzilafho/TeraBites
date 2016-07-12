package domainModel;

import java.util.List;

/**
 *
 * @author teraBites
 */

public class Level {
    
   private List<Question> levels; 
   private Badge bedge;
   
   public Level(){
       
     levels = null;
     bedge = null;
   }
   public Level(List<Question> list, Badge mBadge)
   {
       this.levels = list;
       this.bedge = mBadge;
   }
   
     /**
     * @return the levels
     */
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
     * @return the bedge
     */
    public Badge getBedge() {
        return bedge;
    }

    /**
     * @param bedge the bedge to set
     */
    public void setBedge(Badge bedge) {
        this.bedge = bedge;
    }
}
