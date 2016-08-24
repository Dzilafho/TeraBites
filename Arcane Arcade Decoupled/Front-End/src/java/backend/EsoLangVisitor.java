
package backend;;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EsoLangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EsoLangVisitor<T> extends ParseTreeVisitor<T> {
        public String getAnswer();
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull EsoLangParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(@NotNull EsoLangParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrevious(@NotNull EsoLangParser.PreviousContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull EsoLangParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull EsoLangParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(@NotNull EsoLangParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(@NotNull EsoLangParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(@NotNull EsoLangParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(@NotNull EsoLangParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull EsoLangParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(@NotNull EsoLangParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(@NotNull EsoLangParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperation(@NotNull EsoLangParser.OperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(@NotNull EsoLangParser.OperandContext ctx);
}