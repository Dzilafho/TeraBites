package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */

public class UsedHints {
    
    private String hint;
    
    public UsedHints(){
        
        this.hint = null;
    }
    public UsedHints(String mHint)
    {
        this.hint = mHint;
    }

    /**
     * @return the hint
     */
    public String getHint() {
        return hint;
    }

    /**
     * @param hint the hint to set
     */
    public void setHint(String hint) {
        this.hint = hint;
    }
}
