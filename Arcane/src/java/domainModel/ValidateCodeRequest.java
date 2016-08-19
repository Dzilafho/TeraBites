package domainModel;

/**
 *
 * @author teraBites
 */
public class ValidateCodeRequest {
    
    private CompileCodeRequest compileCodeRequest;
    private UserCode userCode;
    
    public ValidateCodeRequest()
    {
        this.compileCodeRequest = null;
        this.userCode = null;
    }
    public ValidateCodeRequest(CompileCodeRequest mCompileCodeRequest, UserCode mUserCode)
    {
        this.compileCodeRequest = mCompileCodeRequest;
        this.userCode = mUserCode;
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
     * @return the userCode
     */
    public UserCode getUsercode() {
        return userCode;
    }

    /**
     * @param usercode the userCode to set
     */
    public void setUsercode(UserCode userCode) {
        this.userCode = userCode;
    }
}
