package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class Question {
    private Answer answer;
    private Hint hint;
    private String questionString; 

    /**
     * @return the answer
     */
    
    public Question()
    {
        this.answer = null;
        this.hint = null;
        this.questionString = "";
    }
    
    public Answer getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    /**
     * @return the hint
     */
    public Hint getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(Hint hint) {
        this.hint = hint;
    }

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

}
