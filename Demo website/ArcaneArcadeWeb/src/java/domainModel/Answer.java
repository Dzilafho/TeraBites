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
@XmlRootElement
public class Answer implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int answerID;
    private String answer;
    
    public Answer()
    {
        this.answer = null;
    }
    public Answer(String mAnswer)
    {
        this.answer = mAnswer;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return the answerID
     */
    public int getAnswerID() {
        return answerID;
    }

    /**
     * @param answerID the answerID to set
     */
    public void setAnswerID(int answerID) {
        this.answerID = answerID;
    }
    
}
