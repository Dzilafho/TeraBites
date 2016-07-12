package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class ValidateCodeRequest {
    
    private CompileCodeRequest compileCodeRequest;
    private UserCode usercode;
    
    public ValidateCodeRequest()
    {
        this.compileCodeRequest = null;
        this.usercode = null;
    }
    public ValidateCodeRequest(CompileCodeRequest mCompileCodeRequest, UserCode mUserCode)
    {
        this.compileCodeRequest = mCompileCodeRequest;
        this.usercode = mUserCode;
    }

    /**
     * @return the compileCodeRequest
     */
    public CompileCodeRequest getCompileCodeRequest() {
        return compileCodeRequest;
    }

    /**
     * @param compileCodeRequest the compileCodeRequest to set
     */
    public void setCompileCodeRequest(CompileCodeRequest compileCodeRequest) {
        this.compileCodeRequest = compileCodeRequest;
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
