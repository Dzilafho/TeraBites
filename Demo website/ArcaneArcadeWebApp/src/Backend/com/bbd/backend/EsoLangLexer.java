
package com.bbd.backend;;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EsoLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, PRINT=5, ASSIGN=6, EQUAL=7, ADD=8, SUB=9, 
		MUL=10, DIV=11, LT=12, GT=13, LE=14, GE=15, UNTIL=16, WHERE=17, AFTER=18, 
		LOOP_START=19, LOOP_END=20, IF=21, ELSE=22, MOD=23, VARIABLE=24, NUMBER=25, 
		CONSTANT=26, NULL=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "PRINT", "ASSIGN", "EQUAL", "ADD", "SUB", 
		"MUL", "DIV", "LT", "GT", "LE", "GE", "UNTIL", "WHERE", "AFTER", "LOOP_START", 
		"LOOP_END", "IF", "ELSE", "MOD", "VARIABLE", "NUMBER", "CONSTANT", "NULL", 
		"WS"
	};


	public EsoLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "EsoLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u0084\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\4\3\4"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\30\3\30\3\31\6\31r\n\31\r\31\16\31s\3\32\6\32w\n\32\r\32\16\32x\3\33"+
		"\3\33\6\33}\n\33\r\33\16\33~\3\34\3\34\3\35\3\35\2\2\36\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36\3\2\4\3\2\62;\5"+
		"\2\13\f\17\17\"\"\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7?\3\2\2\2\tA\3\2\2\2\13C\3\2"+
		"\2\2\rE\3\2\2\2\17G\3\2\2\2\21J\3\2\2\2\23L\3\2\2\2\25N\3\2\2\2\27Q\3"+
		"\2\2\2\31T\3\2\2\2\33V\3\2\2\2\35X\3\2\2\2\37\\\3\2\2\2!`\3\2\2\2#b\3"+
		"\2\2\2%d\3\2\2\2\'f\3\2\2\2)h\3\2\2\2+j\3\2\2\2-l\3\2\2\2/n\3\2\2\2\61"+
		"q\3\2\2\2\63v\3\2\2\2\65z\3\2\2\2\67\u0080\3\2\2\29\u0082\3\2\2\2;<\7"+
		"*\2\2<\4\3\2\2\2=>\7+\2\2>\6\3\2\2\2?@\7]\2\2@\b\3\2\2\2AB\7_\2\2B\n\3"+
		"\2\2\2CD\7&\2\2D\f\3\2\2\2EF\7<\2\2F\16\3\2\2\2GH\7<\2\2HI\7<\2\2I\20"+
		"\3\2\2\2JK\7@\2\2K\22\3\2\2\2LM\7>\2\2M\24\3\2\2\2NO\7@\2\2OP\7@\2\2P"+
		"\26\3\2\2\2QR\7>\2\2RS\7>\2\2S\30\3\2\2\2TU\7\61\2\2U\32\3\2\2\2VW\7^"+
		"\2\2W\34\3\2\2\2XY\7\61\2\2YZ\7<\2\2Z[\7<\2\2[\36\3\2\2\2\\]\7^\2\2]^"+
		"\7<\2\2^_\7<\2\2_ \3\2\2\2`a\7(\2\2a\"\3\2\2\2bc\7~\2\2c$\3\2\2\2de\7"+
		"#\2\2e&\3\2\2\2fg\7}\2\2g(\3\2\2\2hi\7\177\2\2i*\3\2\2\2jk\7\u0080\2\2"+
		"k,\3\2\2\2lm\7.\2\2m.\3\2\2\2no\7b\2\2o\60\3\2\2\2pr\7\60\2\2qp\3\2\2"+
		"\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2t\62\3\2\2\2uw\t\2\2\2vu\3\2\2\2wx\3\2"+
		"\2\2xv\3\2\2\2xy\3\2\2\2y\64\3\2\2\2z|\7B\2\2{}\5\61\31\2|{\3\2\2\2}~"+
		"\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\66\3\2\2\2\u0080\u0081\7a\2\2\u0081"+
		"8\3\2\2\2\u0082\u0083\t\3\2\2\u0083:\3\2\2\2\6\2sx~\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}