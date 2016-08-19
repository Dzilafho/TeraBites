package domainModel;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teraBites
 */
@Entity
public class Hint implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int HintId;
    
    private String questionHint;
    
    private int hintCost;

    public Hint()
    {
        
    }
    public Hint(String hint, int cost)
    {
        this.questionHint = hint;
        this.hintCost= cost;
    }
    /**
     * @return the questionHint
     */
    public String getQuestionHint() {
        return questionHint;
    }

    /**
     * @param questionHint the questionHint to set
     */
    public void setQuestionHint(String questionHint) {
        this.questionHint = questionHint;
    }

    /**
     * @return the hintCost
     */
    public int getHintCost() {
        return hintCost;
    }

    /**
     * @param hintCost the hintCost to set
     */
    public void setHintCost(int hintCost) {
        this.hintCost = hintCost;
    }
    
    
}
