package Entities;

/**
 *
 * @author teraBites
 */
public class Compiler {
    
    private CompilerResult compilerResult;
    
    public Compiler(){
        
        this.compilerResult = null;
    }
    public Compiler(CompilerResult mCompilerResult)
    {
        this.compilerResult = mCompilerResult;
    }
    
    /**
     * @return the compilerResult
     */
    public CompilerResult getCompilerResult() {
        return compilerResult;
    }

    /**
     * @param compilerResult the compilerResult to set
     */
    public void setCompilerResult(CompilerResult compilerResult) {
        this.compilerResult = compilerResult;
    }
    
    
}
