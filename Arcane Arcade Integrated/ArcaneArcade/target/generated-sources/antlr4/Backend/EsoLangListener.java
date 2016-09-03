// Generated from Backend\EsoLang.g4 by ANTLR 4.5.3
package Backend;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EsoLangParser}.
 */
public interface EsoLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EsoLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EsoLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(EsoLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(EsoLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(EsoLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(EsoLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(EsoLangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(EsoLangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(EsoLangParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(EsoLangParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(EsoLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(EsoLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(EsoLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(EsoLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 */
	void enterPrevious(EsoLangParser.PreviousContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 */
	void exitPrevious(EsoLangParser.PreviousContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(EsoLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(EsoLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(EsoLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(EsoLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(EsoLangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(EsoLangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(EsoLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(EsoLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(EsoLangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(EsoLangParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(EsoLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(EsoLangParser.ConditionContext ctx);
}