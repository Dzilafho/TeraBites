// Generated from Backend\EsoLang.g4 by ANTLR 4.5.3
package Backend;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EsoLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EsoLangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(EsoLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(EsoLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(EsoLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(EsoLangParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(EsoLangParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(EsoLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(EsoLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevious(EsoLangParser.PreviousContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(EsoLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(EsoLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(EsoLangParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(EsoLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(EsoLangParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(EsoLangParser.ConditionContext ctx);
}