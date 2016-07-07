// Generated from C:\Users\dZiLafho\Documents\NetBeansProjects\Arcane\src\main\java\com\mycompany\arcane\EsoLang.g4 by ANTLR 4.4
package com.mycompany.arcane;;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EsoLangParser}.
 */
public interface EsoLangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull EsoLangParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull EsoLangParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(@NotNull EsoLangParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(@NotNull EsoLangParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 */
	void enterPrevious(@NotNull EsoLangParser.PreviousContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#previous}.
	 * @param ctx the parse tree
	 */
	void exitPrevious(@NotNull EsoLangParser.PreviousContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull EsoLangParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull EsoLangParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull EsoLangParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull EsoLangParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(@NotNull EsoLangParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(@NotNull EsoLangParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(@NotNull EsoLangParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(@NotNull EsoLangParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(@NotNull EsoLangParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(@NotNull EsoLangParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(@NotNull EsoLangParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(@NotNull EsoLangParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(@NotNull EsoLangParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(@NotNull EsoLangParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull EsoLangParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull EsoLangParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(@NotNull EsoLangParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(@NotNull EsoLangParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void enterOperation(@NotNull EsoLangParser.OperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#operation}.
	 * @param ctx the parse tree
	 */
	void exitOperation(@NotNull EsoLangParser.OperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(@NotNull EsoLangParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsoLangParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(@NotNull EsoLangParser.OperandContext ctx);
}