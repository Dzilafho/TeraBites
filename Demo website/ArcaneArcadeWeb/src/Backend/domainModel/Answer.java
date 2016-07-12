package domainModel;

/**
 *
 * @author teraBites
 */
public class Answer {
    
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
    
}
