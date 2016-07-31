package domainModel;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author teraBites
 */
@Entity
@XmlRootElement
public class Question implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionID;
    @OneToOne ( targetEntity=Answer.class, cascade = CascadeType.PERSIST)
    private Answer answer;
    @OneToMany( targetEntity=Hint.class, cascade = CascadeType.PERSIST)
    private List<Hint> questionHints = new ArrayList<Hint>();
    
    private String questionString; 

    /**
     * @return the answer
     */
    
    public Question()
    {
       // this.answer = null;
        //this.hint = null;
        this.questionString = "";
    }
    
    public Question(String q, Answer answer, Hint hints)
    {
        this.answer = answer;
       this.questionHints.add(hints);
        this.questionString = q;
    }
    
    /*public Answer getAnswer() {
        return answer;
    }*/

    /**
     * @param answer the answer to set
     */
   /* public void setAnswer(Answer answer) {
        this.answer = answer;
    }*/

    /**
     * @return the hint
     */
    /*public Hint getHint() {
        return hint;
    }*/

    /**
     * @param hint the hint to set
     */
    /*public void setHint(Hint hint) {
        this.hint = hint;
    }*/

    /**
     * @return the questionString
     */
    public String getQuestionString() {
        return questionString;
    }

    /**
     * @param questionString the questionString to set
     */
    public void setQuestionString(String questionString) {
        this.questionString = questionString;
    }

    /**
     * @return the questionID
     */
    public int getQuestionID() {
        return questionID;
    }

    /**
     * @param questionID the questionID to set
     */
    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

}
