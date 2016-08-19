
package backend;;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EsoLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PRINT=5, ASSIGN=6, EQUAL=7, ADD=8, SUB=9, 
		MUL=10, DIV=11, LT=12, GT=13, LE=14, GE=15, UNTIL=16, WHERE=17, AFTER=18, 
		LOOP_START=19, LOOP_END=20, IF=21, ELSE=22, MOD=23, VARIABLE=24, NUMBER=25, 
		CONSTANT=26, NULL=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "'('", "')'", "'['", "']'", "'$'", "':'", "'::'", "'>'", 
		"'<'", "'>>'", "'<<'", "'/'", "'\\'", "'/::'", "'\\::'", "'&'", "'|'", 
		"'!'", "'{'", "'}'", "'~'", "','", "'`'", "VARIABLE", "NUMBER", "CONSTANT", 
		"'_'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_body = 1, RULE_print = 2, RULE_expressions = 3, 
		RULE_declarations = 4, RULE_expression = 5, RULE_loop = 6, RULE_previous = 7, 
		RULE_declaration = 8, RULE_assignment = 9, RULE_operation = 10, RULE_comparison = 11, 
		RULE_operand = 12, RULE_condition = 13;
	public static final String[] ruleNames = {
		"program", "body", "print", "expressions", "declarations", "expression", 
		"loop", "previous", "declaration", "assignment", "operation", "comparison", 
		"operand", "condition"
	};

	@Override
	public String getGrammarFileName() { return "EsoLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EsoLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EsoLangParser.EOF, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); body();
			setState(29); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public List<ExpressionsContext> expressions() {
			return getRuleContexts(ExpressionsContext.class);
		}
		public TerminalNode WHERE() { return getToken(EsoLangParser.WHERE, 0); }
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public TerminalNode AFTER() { return getToken(EsoLangParser.AFTER, 0); }
		public ExpressionsContext expressions(int i) {
			return getRuleContext(ExpressionsContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_body);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(31); match(T__1);
			setState(43);
			switch (_input.LA(1)) {
			case PRINT:
				{
				setState(32); print();
				setState(33); match(WS);
				setState(34); match(AFTER);
				setState(39);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(35); match(WS);
						setState(36); expressions();
						}
						} 
					}
					setState(41);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				break;
			case T__3:
			case T__1:
			case LOOP_START:
			case VARIABLE:
			case NUMBER:
			case CONSTANT:
				{
				setState(42); expressions();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(52);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(45); match(T__0);
				}
				break;
			case WS:
				{
				setState(46); match(WS);
				setState(47); match(WHERE);
				setState(48); match(WS);
				setState(49); declarations();
				setState(50); match(T__0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(EsoLangParser.WS, 0); }
		public TerminalNode VARIABLE() { return getToken(EsoLangParser.VARIABLE, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54); match(PRINT);
			setState(55); match(WS);
			setState(56); match(VARIABLE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionsContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressions);
		try {
			int _alt;
			setState(67);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58); expression();
				setState(63);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(59); match(WS);
						setState(60); expression();
						}
						} 
					}
					setState(65);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66); condition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitDeclarations(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitDeclarations(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69); declaration();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WS) {
				{
				{
				setState(70); match(WS);
				setState(71); declaration();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PreviousContext previous() {
			return getRuleContext(PreviousContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		try {
			setState(87);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77); body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78); loop();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79); previous();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(80); operand();
					}
					break;
				case 2:
					{
					setState(81); operation();
					}
					break;
				case 3:
					{
					setState(82); assignment();
					}
					break;
				case 4:
					{
					setState(83); declaration();
					}
					break;
				case 5:
					{
					setState(84); comparison();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public TerminalNode LOOP_START() { return getToken(EsoLangParser.LOOP_START, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode UNTIL() { return getToken(EsoLangParser.UNTIL, 0); }
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public TerminalNode LOOP_END() { return getToken(EsoLangParser.LOOP_END, 0); }
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_loop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(LOOP_START);
			setState(90); match(WS);
			setState(91); expressions();
			setState(92); match(WS);
			setState(93); match(LOOP_END);
			setState(94); match(WS);
			setState(99);
			switch (_input.LA(1)) {
			case VARIABLE:
			case NUMBER:
			case CONSTANT:
				{
				setState(95); operand();
				}
				break;
			case UNTIL:
				{
				setState(96); match(UNTIL);
				setState(97); match(WS);
				setState(98); comparison();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PreviousContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(EsoLangParser.VARIABLE, 0); }
		public PreviousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_previous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterPrevious(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitPrevious(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitPrevious(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreviousContext previous() throws RecognitionException {
		PreviousContext _localctx = new PreviousContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_previous);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101); match(T__3);
			setState(102); match(VARIABLE);
			setState(103); match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); assignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode ASSIGN() { return getToken(EsoLangParser.ASSIGN, 0); }
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public PreviousContext previous() {
			return getRuleContext(PreviousContext.class,0);
		}
		public TerminalNode NULL() { return getToken(EsoLangParser.NULL, 0); }
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public TerminalNode VARIABLE() { return getToken(EsoLangParser.VARIABLE, 0); }
		public TerminalNode CONSTANT() { return getToken(EsoLangParser.CONSTANT, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public OperandContext operand() {
			return getRuleContext(OperandContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==VARIABLE || _la==CONSTANT) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(108); match(WS);
			setState(109); match(ASSIGN);
			setState(110); match(WS);
			setState(115);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(111); operand();
				}
				break;
			case 2:
				{
				setState(112); match(NULL);
				}
				break;
			case 3:
				{
				setState(113); operation();
				}
				break;
			case 4:
				{
				setState(114); previous();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public List<PreviousContext> previous() {
			return getRuleContexts(PreviousContext.class);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public TerminalNode SUB() { return getToken(EsoLangParser.SUB, 0); }
		public PreviousContext previous(int i) {
			return getRuleContext(PreviousContext.class,i);
		}
		public TerminalNode ADD() { return getToken(EsoLangParser.ADD, 0); }
		public TerminalNode MOD() { return getToken(EsoLangParser.MOD, 0); }
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public TerminalNode DIV() { return getToken(EsoLangParser.DIV, 0); }
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public TerminalNode MUL() { return getToken(EsoLangParser.MUL, 0); }
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch (_input.LA(1)) {
			case VARIABLE:
			case NUMBER:
			case CONSTANT:
				{
				setState(117); operand();
				}
				break;
			case T__3:
				{
				setState(118); previous();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(121); match(WS);
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << SUB) | (1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(123); match(WS);
			setState(126);
			switch (_input.LA(1)) {
			case VARIABLE:
			case NUMBER:
			case CONSTANT:
				{
				setState(124); operand();
				}
				break;
			case T__3:
				{
				setState(125); previous();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(EsoLangParser.EQUAL, 0); }
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public TerminalNode GE() { return getToken(EsoLangParser.GE, 0); }
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public TerminalNode LT() { return getToken(EsoLangParser.LT, 0); }
		public TerminalNode GT() { return getToken(EsoLangParser.GT, 0); }
		public TerminalNode LE() { return getToken(EsoLangParser.LE, 0); }
		public OperationContext operation(int i) {
			return getRuleContext(OperationContext.class,i);
		}
		public List<OperationContext> operation() {
			return getRuleContexts(OperationContext.class);
		}
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(128); operand();
				}
				break;
			case 2:
				{
				setState(129); operation();
				}
				break;
			}
			setState(132); match(WS);
			setState(133);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << LT) | (1L << GT) | (1L << LE) | (1L << GE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			setState(134); match(WS);
			setState(137);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(135); operation();
				}
				break;
			case 2:
				{
				setState(136); operand();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(EsoLangParser.VARIABLE, 0); }
		public TerminalNode NUMBER() { return getToken(EsoLangParser.NUMBER, 0); }
		public TerminalNode CONSTANT() { return getToken(EsoLangParser.CONSTANT, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARIABLE) | (1L << NUMBER) | (1L << CONSTANT))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(EsoLangParser.ELSE, 0); }
		public TerminalNode WS(int i) {
			return getToken(EsoLangParser.WS, i);
		}
		public TerminalNode IF() { return getToken(EsoLangParser.IF, 0); }
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public List<TerminalNode> WS() { return getTokens(EsoLangParser.WS); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsoLangListener ) ((EsoLangListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsoLangVisitor ) return ((EsoLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_condition);
		try {
			setState(157);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141); expression();
				setState(142); match(WS);
				setState(143); match(IF);
				setState(144); match(WS);
				setState(145); comparison();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147); expression();
				setState(148); match(WS);
				setState(149); match(ELSE);
				setState(150); match(WS);
				setState(151); expression();
				setState(152); match(WS);
				setState(153); match(IF);
				setState(154); match(WS);
				setState(155); comparison();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36\u00a2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\7\5@\n\5\f\5\16\5C\13\5\3"+
		"\5\5\5F\n\5\3\6\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7X\n\7\5\7Z\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\bf\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13v\n\13\3\f\3\f\5\fz\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u0081\n\f\3\r\3\r"+
		"\5\r\u0085\n\r\3\r\3\r\3\r\3\r\3\r\5\r\u008c\n\r\3\16\3\16\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00a0\n\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\4\2"+
		"\32\32\34\34\4\2\n\r\31\31\4\2\t\t\16\21\3\2\32\34\u00a9\2\36\3\2\2\2"+
		"\4!\3\2\2\2\68\3\2\2\2\bE\3\2\2\2\nG\3\2\2\2\fY\3\2\2\2\16[\3\2\2\2\20"+
		"g\3\2\2\2\22k\3\2\2\2\24m\3\2\2\2\26y\3\2\2\2\30\u0084\3\2\2\2\32\u008d"+
		"\3\2\2\2\34\u009f\3\2\2\2\36\37\5\4\3\2\37 \7\2\2\3 \3\3\2\2\2!-\7\5\2"+
		"\2\"#\5\6\4\2#$\7\36\2\2$)\7\24\2\2%&\7\36\2\2&(\5\b\5\2\'%\3\2\2\2(+"+
		"\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*.\3\2\2\2+)\3\2\2\2,.\5\b\5\2-\"\3\2\2\2"+
		"-,\3\2\2\2.\66\3\2\2\2/\67\7\6\2\2\60\61\7\36\2\2\61\62\7\23\2\2\62\63"+
		"\7\36\2\2\63\64\5\n\6\2\64\65\7\6\2\2\65\67\3\2\2\2\66/\3\2\2\2\66\60"+
		"\3\2\2\2\67\5\3\2\2\289\7\7\2\29:\7\36\2\2:;\7\32\2\2;\7\3\2\2\2<A\5\f"+
		"\7\2=>\7\36\2\2>@\5\f\7\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2\2\2BF\3"+
		"\2\2\2CA\3\2\2\2DF\5\34\17\2E<\3\2\2\2ED\3\2\2\2F\t\3\2\2\2GL\5\22\n\2"+
		"HI\7\36\2\2IK\5\22\n\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\13\3\2"+
		"\2\2NL\3\2\2\2OZ\5\4\3\2PZ\5\16\b\2QZ\5\20\t\2RX\5\32\16\2SX\5\26\f\2"+
		"TX\5\24\13\2UX\5\22\n\2VX\5\30\r\2WR\3\2\2\2WS\3\2\2\2WT\3\2\2\2WU\3\2"+
		"\2\2WV\3\2\2\2XZ\3\2\2\2YO\3\2\2\2YP\3\2\2\2YQ\3\2\2\2YW\3\2\2\2Z\r\3"+
		"\2\2\2[\\\7\25\2\2\\]\7\36\2\2]^\5\b\5\2^_\7\36\2\2_`\7\26\2\2`e\7\36"+
		"\2\2af\5\32\16\2bc\7\22\2\2cd\7\36\2\2df\5\30\r\2ea\3\2\2\2eb\3\2\2\2"+
		"f\17\3\2\2\2gh\7\3\2\2hi\7\32\2\2ij\7\4\2\2j\21\3\2\2\2kl\5\24\13\2l\23"+
		"\3\2\2\2mn\t\2\2\2no\7\36\2\2op\7\b\2\2pu\7\36\2\2qv\5\32\16\2rv\7\35"+
		"\2\2sv\5\26\f\2tv\5\20\t\2uq\3\2\2\2ur\3\2\2\2us\3\2\2\2ut\3\2\2\2v\25"+
		"\3\2\2\2wz\5\32\16\2xz\5\20\t\2yw\3\2\2\2yx\3\2\2\2z{\3\2\2\2{|\7\36\2"+
		"\2|}\t\3\2\2}\u0080\7\36\2\2~\u0081\5\32\16\2\177\u0081\5\20\t\2\u0080"+
		"~\3\2\2\2\u0080\177\3\2\2\2\u0081\27\3\2\2\2\u0082\u0085\5\32\16\2\u0083"+
		"\u0085\5\26\f\2\u0084\u0082\3\2\2\2\u0084\u0083\3\2\2\2\u0085\u0086\3"+
		"\2\2\2\u0086\u0087\7\36\2\2\u0087\u0088\t\4\2\2\u0088\u008b\7\36\2\2\u0089"+
		"\u008c\5\26\f\2\u008a\u008c\5\32\16\2\u008b\u0089\3\2\2\2\u008b\u008a"+
		"\3\2\2\2\u008c\31\3\2\2\2\u008d\u008e\t\5\2\2\u008e\33\3\2\2\2\u008f\u0090"+
		"\5\f\7\2\u0090\u0091\7\36\2\2\u0091\u0092\7\27\2\2\u0092\u0093\7\36\2"+
		"\2\u0093\u0094\5\30\r\2\u0094\u00a0\3\2\2\2\u0095\u0096\5\f\7\2\u0096"+
		"\u0097\7\36\2\2\u0097\u0098\7\30\2\2\u0098\u0099\7\36\2\2\u0099\u009a"+
		"\5\f\7\2\u009a\u009b\7\36\2\2\u009b\u009c\7\27\2\2\u009c\u009d\7\36\2"+
		"\2\u009d\u009e\5\30\r\2\u009e\u00a0\3\2\2\2\u009f\u008f\3\2\2\2\u009f"+
		"\u0095\3\2\2\2\u00a0\35\3\2\2\2\21)-\66AELWYeuy\u0080\u0084\u008b\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}