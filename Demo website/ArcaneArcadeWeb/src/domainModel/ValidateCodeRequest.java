package com.bbd.arcane.domainModel;

/**
 *
 * @author teraBites
 */
public class ValidateCodeRequest {
    
    private UserCode userCode;
    private CompileCodeRequest compileRequest;

    /**
     * @return the userCode
     */
    
    ValidateCodeRequest()
    {
        this.userCode = null;
        this.compileRequest = null;
    }
    
     ValidateCodeRequest(UserCode userCode,CompileCodeRequest compileRequest)
    {
        this.userCode = userCode;
        this.compileRequest = compileRequest;
    }
    
    public UserCode getUserCode() {
        return userCode;
    }

    /**
     * @param userCode the userCode to set
     */
    public void setUserCode(UserCode userCode) {
        this.userCode = userCode;
    }

    /**
     * @return the compileRequest
     */
    public CompileCodeRequest getCompileRequest() {
        return compileRequest;
    }

    /**
     * @param compileRequest the compileRequest to set
     */
    public void setCompileRequest(CompileCodeRequest compileRequest) {
        this.compileRequest = compileRequest;
    }
}
