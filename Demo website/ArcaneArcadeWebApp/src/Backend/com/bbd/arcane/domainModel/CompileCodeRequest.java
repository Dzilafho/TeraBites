package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class CompileCodeRequest {
    
    private UserCode usercode;
    
    public CompileCodeRequest()
    {
        this.usercode = null;
    }
    public CompileCodeRequest(UserCode mUserCode)
    {
        this.usercode=mUserCode;
    }

    /**
     * @return the usercode
     */
    public UserCode getUsercode() {
        return usercode;
    }

    /**
     * @param usercode the usercode to set
     */
    public void setUsercode(UserCode usercode) {
        this.usercode = usercode;
    }
    
    
}
