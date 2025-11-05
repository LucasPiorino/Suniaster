// Generated from Suniaster.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SuniasterParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SE=1, ENTAO=2, SENAO=3, FIM=4, ENQUANTO=5, LEIA=6, ESCREVA=7, VERDADEIRO=8, 
		FALSO=9, NULO=10, TIPO=11, ID=12, NUM_REAL=13, NUM_INT=14, STRING=15, 
		ATRIB=16, VIRGULA=17, ABRE_PAREN=18, FECHA_PAREN=19, ABRE_COL=20, FECHA_COL=21, 
		OP_ARIT_SOMA=22, OP_ARIT_MULT=23, OP_REL=24, OP_LOG=25, WS=26, COMENTARIO=27;
	public static final int
		RULE_programa = 0, RULE_linha = 1, RULE_declaracao = 2, RULE_comando = 3, 
		RULE_condicional = 4, RULE_bloco = 5, RULE_repeticao = 6, RULE_escrita = 7, 
		RULE_listaArgs = 8, RULE_atribuicao = 9, RULE_destino = 10, RULE_expressao = 11, 
		RULE_exprLogica = 12, RULE_exprComparacao = 13, RULE_exprSoma = 14, RULE_exprMult = 15, 
		RULE_exprPrimaria = 16, RULE_acesso = 17, RULE_listaLiteral = 18, RULE_literal = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "linha", "declaracao", "comando", "condicional", "bloco", 
			"repeticao", "escrita", "listaArgs", "atribuicao", "destino", "expressao", 
			"exprLogica", "exprComparacao", "exprSoma", "exprMult", "exprPrimaria", 
			"acesso", "listaLiteral", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'se'", "'ent\\u00E3o'", "'sen\\u00E3o'", "'fim'", "'enquanto'", 
			"'leia'", "'escreva'", "'verdadeiro'", "'falso'", "'nulo'", null, null, 
			null, null, null, "'='", "','", "'('", "')'", "'['", "']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SE", "ENTAO", "SENAO", "FIM", "ENQUANTO", "LEIA", "ESCREVA", "VERDADEIRO", 
			"FALSO", "NULO", "TIPO", "ID", "NUM_REAL", "NUM_INT", "STRING", "ATRIB", 
			"VIRGULA", "ABRE_PAREN", "FECHA_PAREN", "ABRE_COL", "FECHA_COL", "OP_ARIT_SOMA", 
			"OP_ARIT_MULT", "OP_REL", "OP_LOG", "WS", "COMENTARIO"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Suniaster.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SuniasterParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SuniasterParser.EOF, 0); }
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6306L) != 0)) {
				{
				{
				setState(40);
				linha();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinhaContext extends ParserRuleContext {
		public DeclaracaoContext declaracao() {
			return getRuleContext(DeclaracaoContext.class,0);
		}
		public ComandoContext comando() {
			return getRuleContext(ComandoContext.class,0);
		}
		public LinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitLinha(this);
		}
	}

	public final LinhaContext linha() throws RecognitionException {
		LinhaContext _localctx = new LinhaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_linha);
		try {
			setState(50);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				declaracao();
				}
				break;
			case SE:
			case ENQUANTO:
			case ESCREVA:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(49);
				comando();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracaoContext extends ParserRuleContext {
		public TerminalNode TIPO() { return getToken(SuniasterParser.TIPO, 0); }
		public TerminalNode ID() { return getToken(SuniasterParser.ID, 0); }
		public TerminalNode ATRIB() { return getToken(SuniasterParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public DeclaracaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterDeclaracao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitDeclaracao(this);
		}
	}

	public final DeclaracaoContext declaracao() throws RecognitionException {
		DeclaracaoContext _localctx = new DeclaracaoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TIPO);
			setState(53);
			match(ID);
			setState(54);
			match(ATRIB);
			setState(55);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ComandoContext extends ParserRuleContext {
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public RepeticaoContext repeticao() {
			return getRuleContext(RepeticaoContext.class,0);
		}
		public EscritaContext escrita() {
			return getRuleContext(EscritaContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ComandoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comando; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterComando(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitComando(this);
		}
	}

	public final ComandoContext comando() throws RecognitionException {
		ComandoContext _localctx = new ComandoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comando);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SE:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				condicional();
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				repeticao();
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				escrita();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				atribuicao();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public TerminalNode SE() { return getToken(SuniasterParser.SE, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(SuniasterParser.ENTAO, 0); }
		public List<BlocoContext> bloco() {
			return getRuleContexts(BlocoContext.class);
		}
		public BlocoContext bloco(int i) {
			return getRuleContext(BlocoContext.class,i);
		}
		public TerminalNode FIM() { return getToken(SuniasterParser.FIM, 0); }
		public TerminalNode SENAO() { return getToken(SuniasterParser.SENAO, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(SE);
			setState(64);
			expressao();
			setState(65);
			match(ENTAO);
			setState(66);
			bloco();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(67);
				match(SENAO);
				setState(68);
				bloco();
				}
			}

			setState(71);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BlocoContext extends ParserRuleContext {
		public List<LinhaContext> linha() {
			return getRuleContexts(LinhaContext.class);
		}
		public LinhaContext linha(int i) {
			return getRuleContext(LinhaContext.class,i);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6306L) != 0)) {
				{
				{
				setState(73);
				linha();
				}
				}
				setState(78);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RepeticaoContext extends ParserRuleContext {
		public TerminalNode ENQUANTO() { return getToken(SuniasterParser.ENQUANTO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode ENTAO() { return getToken(SuniasterParser.ENTAO, 0); }
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public TerminalNode FIM() { return getToken(SuniasterParser.FIM, 0); }
		public RepeticaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeticao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterRepeticao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitRepeticao(this);
		}
	}

	public final RepeticaoContext repeticao() throws RecognitionException {
		RepeticaoContext _localctx = new RepeticaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeticao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ENQUANTO);
			setState(80);
			expressao();
			setState(81);
			match(ENTAO);
			setState(82);
			bloco();
			setState(83);
			match(FIM);
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

	@SuppressWarnings("CheckReturnValue")
	public static class EscritaContext extends ParserRuleContext {
		public TerminalNode ESCREVA() { return getToken(SuniasterParser.ESCREVA, 0); }
		public TerminalNode ABRE_PAREN() { return getToken(SuniasterParser.ABRE_PAREN, 0); }
		public TerminalNode FECHA_PAREN() { return getToken(SuniasterParser.FECHA_PAREN, 0); }
		public ListaArgsContext listaArgs() {
			return getRuleContext(ListaArgsContext.class,0);
		}
		public EscritaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_escrita; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterEscrita(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitEscrita(this);
		}
	}

	public final EscritaContext escrita() throws RecognitionException {
		EscritaContext _localctx = new EscritaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_escrita);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(ESCREVA);
			setState(86);
			match(ABRE_PAREN);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1373952L) != 0)) {
				{
				setState(87);
				listaArgs();
				}
			}

			setState(90);
			match(FECHA_PAREN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgsContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SuniasterParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SuniasterParser.VIRGULA, i);
		}
		public ListaArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterListaArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitListaArgs(this);
		}
	}

	public final ListaArgsContext listaArgs() throws RecognitionException {
		ListaArgsContext _localctx = new ListaArgsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listaArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			expressao();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(93);
				match(VIRGULA);
				setState(94);
				expressao();
				}
				}
				setState(99);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtribuicaoContext extends ParserRuleContext {
		public DestinoContext destino() {
			return getRuleContext(DestinoContext.class,0);
		}
		public TerminalNode ATRIB() { return getToken(SuniasterParser.ATRIB, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitAtribuicao(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			destino();
			setState(101);
			match(ATRIB);
			setState(102);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DestinoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SuniasterParser.ID, 0); }
		public TerminalNode ABRE_COL() { return getToken(SuniasterParser.ABRE_COL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_COL() { return getToken(SuniasterParser.FECHA_COL, 0); }
		public DestinoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_destino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterDestino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitDestino(this);
		}
	}

	public final DestinoContext destino() throws RecognitionException {
		DestinoContext _localctx = new DestinoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_destino);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				match(ID);
				setState(106);
				match(ABRE_COL);
				setState(107);
				expressao();
				setState(108);
				match(FECHA_COL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public ExprLogicaContext exprLogica() {
			return getRuleContext(ExprLogicaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			exprLogica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicaContext extends ParserRuleContext {
		public List<ExprComparacaoContext> exprComparacao() {
			return getRuleContexts(ExprComparacaoContext.class);
		}
		public ExprComparacaoContext exprComparacao(int i) {
			return getRuleContext(ExprComparacaoContext.class,i);
		}
		public List<TerminalNode> OP_LOG() { return getTokens(SuniasterParser.OP_LOG); }
		public TerminalNode OP_LOG(int i) {
			return getToken(SuniasterParser.OP_LOG, i);
		}
		public ExprLogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprLogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExprLogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExprLogica(this);
		}
	}

	public final ExprLogicaContext exprLogica() throws RecognitionException {
		ExprLogicaContext _localctx = new ExprLogicaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_exprLogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			exprComparacao();
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_LOG) {
				{
				{
				setState(115);
				match(OP_LOG);
				setState(116);
				exprComparacao();
				}
				}
				setState(121);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparacaoContext extends ParserRuleContext {
		public List<ExprSomaContext> exprSoma() {
			return getRuleContexts(ExprSomaContext.class);
		}
		public ExprSomaContext exprSoma(int i) {
			return getRuleContext(ExprSomaContext.class,i);
		}
		public List<TerminalNode> OP_REL() { return getTokens(SuniasterParser.OP_REL); }
		public TerminalNode OP_REL(int i) {
			return getToken(SuniasterParser.OP_REL, i);
		}
		public ExprComparacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprComparacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExprComparacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExprComparacao(this);
		}
	}

	public final ExprComparacaoContext exprComparacao() throws RecognitionException {
		ExprComparacaoContext _localctx = new ExprComparacaoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_exprComparacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			exprSoma();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_REL) {
				{
				{
				setState(123);
				match(OP_REL);
				setState(124);
				exprSoma();
				}
				}
				setState(129);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprSomaContext extends ParserRuleContext {
		public List<ExprMultContext> exprMult() {
			return getRuleContexts(ExprMultContext.class);
		}
		public ExprMultContext exprMult(int i) {
			return getRuleContext(ExprMultContext.class,i);
		}
		public List<TerminalNode> OP_ARIT_SOMA() { return getTokens(SuniasterParser.OP_ARIT_SOMA); }
		public TerminalNode OP_ARIT_SOMA(int i) {
			return getToken(SuniasterParser.OP_ARIT_SOMA, i);
		}
		public ExprSomaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprSoma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExprSoma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExprSoma(this);
		}
	}

	public final ExprSomaContext exprSoma() throws RecognitionException {
		ExprSomaContext _localctx = new ExprSomaContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_exprSoma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			exprMult();
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT_SOMA) {
				{
				{
				setState(131);
				match(OP_ARIT_SOMA);
				setState(132);
				exprMult();
				}
				}
				setState(137);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultContext extends ParserRuleContext {
		public List<ExprPrimariaContext> exprPrimaria() {
			return getRuleContexts(ExprPrimariaContext.class);
		}
		public ExprPrimariaContext exprPrimaria(int i) {
			return getRuleContext(ExprPrimariaContext.class,i);
		}
		public List<TerminalNode> OP_ARIT_MULT() { return getTokens(SuniasterParser.OP_ARIT_MULT); }
		public TerminalNode OP_ARIT_MULT(int i) {
			return getToken(SuniasterParser.OP_ARIT_MULT, i);
		}
		public ExprMultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprMult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExprMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExprMult(this);
		}
	}

	public final ExprMultContext exprMult() throws RecognitionException {
		ExprMultContext _localctx = new ExprMultContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_exprMult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			exprPrimaria();
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OP_ARIT_MULT) {
				{
				{
				setState(139);
				match(OP_ARIT_MULT);
				setState(140);
				exprPrimaria();
				}
				}
				setState(145);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimariaContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AcessoContext acesso() {
			return getRuleContext(AcessoContext.class,0);
		}
		public ListaLiteralContext listaLiteral() {
			return getRuleContext(ListaLiteralContext.class,0);
		}
		public TerminalNode ABRE_PAREN() { return getToken(SuniasterParser.ABRE_PAREN, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_PAREN() { return getToken(SuniasterParser.FECHA_PAREN, 0); }
		public ExprPrimariaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprPrimaria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterExprPrimaria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitExprPrimaria(this);
		}
	}

	public final ExprPrimariaContext exprPrimaria() throws RecognitionException {
		ExprPrimariaContext _localctx = new ExprPrimariaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_exprPrimaria);
		try {
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VERDADEIRO:
			case FALSO:
			case NULO:
			case NUM_REAL:
			case NUM_INT:
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				literal();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				acesso();
				}
				break;
			case ABRE_COL:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				listaLiteral();
				}
				break;
			case ABRE_PAREN:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				match(ABRE_PAREN);
				setState(150);
				expressao();
				setState(151);
				match(FECHA_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AcessoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(SuniasterParser.ID, 0); }
		public TerminalNode ABRE_COL() { return getToken(SuniasterParser.ABRE_COL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode FECHA_COL() { return getToken(SuniasterParser.FECHA_COL, 0); }
		public AcessoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_acesso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterAcesso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitAcesso(this);
		}
	}

	public final AcessoContext acesso() throws RecognitionException {
		AcessoContext _localctx = new AcessoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_acesso);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				match(ID);
				setState(157);
				match(ABRE_COL);
				setState(158);
				expressao();
				setState(159);
				match(FECHA_COL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListaLiteralContext extends ParserRuleContext {
		public TerminalNode ABRE_COL() { return getToken(SuniasterParser.ABRE_COL, 0); }
		public TerminalNode FECHA_COL() { return getToken(SuniasterParser.FECHA_COL, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public List<TerminalNode> VIRGULA() { return getTokens(SuniasterParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(SuniasterParser.VIRGULA, i);
		}
		public ListaLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterListaLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitListaLiteral(this);
		}
	}

	public final ListaLiteralContext listaLiteral() throws RecognitionException {
		ListaLiteralContext _localctx = new ListaLiteralContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_listaLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(ABRE_COL);
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1373952L) != 0)) {
				{
				setState(164);
				expressao();
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VIRGULA) {
					{
					{
					setState(165);
					match(VIRGULA);
					setState(166);
					expressao();
					}
					}
					setState(171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(174);
			match(FECHA_COL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NUM_REAL() { return getToken(SuniasterParser.NUM_REAL, 0); }
		public TerminalNode NUM_INT() { return getToken(SuniasterParser.NUM_INT, 0); }
		public TerminalNode STRING() { return getToken(SuniasterParser.STRING, 0); }
		public TerminalNode VERDADEIRO() { return getToken(SuniasterParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(SuniasterParser.FALSO, 0); }
		public TerminalNode NULO() { return getToken(SuniasterParser.NULO, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SuniasterListener ) ((SuniasterListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 59136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\u0004\u0001\u001b\u00b3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0005\u0000*\b\u0000\n\u0000"+
		"\f\u0000-\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003"+
		"\u00013\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003>\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004F\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0005"+
		"\u0005K\b\u0005\n\u0005\f\u0005N\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007Y\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\b\u0005\b`\b\b\n\b\f\bc\t\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\no\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0005\fv\b\f\n\f\f\fy\t\f\u0001\r\u0001\r\u0001"+
		"\r\u0005\r~\b\r\n\r\f\r\u0081\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u0086\b\u000e\n\u000e\f\u000e\u0089\t\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u008e\b\u000f\n\u000f\f\u000f\u0091\t\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u009a\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00a2\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u00a8\b\u0012\n\u0012"+
		"\f\u0012\u00ab\t\u0012\u0003\u0012\u00ad\b\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&\u0000\u0001\u0002\u0000\b\n\r\u000f\u00b2\u0000+\u0001\u0000\u0000"+
		"\u0000\u00022\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006"+
		"=\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nL\u0001\u0000\u0000"+
		"\u0000\fO\u0001\u0000\u0000\u0000\u000eU\u0001\u0000\u0000\u0000\u0010"+
		"\\\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014n\u0001"+
		"\u0000\u0000\u0000\u0016p\u0001\u0000\u0000\u0000\u0018r\u0001\u0000\u0000"+
		"\u0000\u001az\u0001\u0000\u0000\u0000\u001c\u0082\u0001\u0000\u0000\u0000"+
		"\u001e\u008a\u0001\u0000\u0000\u0000 \u0099\u0001\u0000\u0000\u0000\""+
		"\u00a1\u0001\u0000\u0000\u0000$\u00a3\u0001\u0000\u0000\u0000&\u00b0\u0001"+
		"\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000\u0000"+
		"*-\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000"+
		"\u0000,.\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000./\u0005\u0000"+
		"\u0000\u0001/\u0001\u0001\u0000\u0000\u000003\u0003\u0004\u0002\u0000"+
		"13\u0003\u0006\u0003\u000020\u0001\u0000\u0000\u000021\u0001\u0000\u0000"+
		"\u00003\u0003\u0001\u0000\u0000\u000045\u0005\u000b\u0000\u000056\u0005"+
		"\f\u0000\u000067\u0005\u0010\u0000\u000078\u0003\u0016\u000b\u00008\u0005"+
		"\u0001\u0000\u0000\u00009>\u0003\b\u0004\u0000:>\u0003\f\u0006\u0000;"+
		">\u0003\u000e\u0007\u0000<>\u0003\u0012\t\u0000=9\u0001\u0000\u0000\u0000"+
		"=:\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=<\u0001\u0000\u0000"+
		"\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u0001\u0000\u0000@A\u0003"+
		"\u0016\u000b\u0000AB\u0005\u0002\u0000\u0000BE\u0003\n\u0005\u0000CD\u0005"+
		"\u0003\u0000\u0000DF\u0003\n\u0005\u0000EC\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000GH\u0005\u0004\u0000\u0000"+
		"H\t\u0001\u0000\u0000\u0000IK\u0003\u0002\u0001\u0000JI\u0001\u0000\u0000"+
		"\u0000KN\u0001\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000"+
		"\u0000\u0000M\u000b\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0005\u0000\u0000PQ\u0003\u0016\u000b\u0000QR\u0005\u0002\u0000"+
		"\u0000RS\u0003\n\u0005\u0000ST\u0005\u0004\u0000\u0000T\r\u0001\u0000"+
		"\u0000\u0000UV\u0005\u0007\u0000\u0000VX\u0005\u0012\u0000\u0000WY\u0003"+
		"\u0010\b\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u0013\u0000\u0000[\u000f\u0001\u0000\u0000"+
		"\u0000\\a\u0003\u0016\u000b\u0000]^\u0005\u0011\u0000\u0000^`\u0003\u0016"+
		"\u000b\u0000_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000b\u0011\u0001\u0000\u0000"+
		"\u0000ca\u0001\u0000\u0000\u0000de\u0003\u0014\n\u0000ef\u0005\u0010\u0000"+
		"\u0000fg\u0003\u0016\u000b\u0000g\u0013\u0001\u0000\u0000\u0000ho\u0005"+
		"\f\u0000\u0000ij\u0005\f\u0000\u0000jk\u0005\u0014\u0000\u0000kl\u0003"+
		"\u0016\u000b\u0000lm\u0005\u0015\u0000\u0000mo\u0001\u0000\u0000\u0000"+
		"nh\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000o\u0015\u0001\u0000"+
		"\u0000\u0000pq\u0003\u0018\f\u0000q\u0017\u0001\u0000\u0000\u0000rw\u0003"+
		"\u001a\r\u0000st\u0005\u0019\u0000\u0000tv\u0003\u001a\r\u0000us\u0001"+
		"\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000"+
		"wx\u0001\u0000\u0000\u0000x\u0019\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000z\u007f\u0003\u001c\u000e\u0000{|\u0005\u0018\u0000\u0000"+
		"|~\u0003\u001c\u000e\u0000}{\u0001\u0000\u0000\u0000~\u0081\u0001\u0000"+
		"\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080\u001b\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0082\u0087\u0003\u001e\u000f\u0000\u0083\u0084\u0005\u0016\u0000"+
		"\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0083\u0001\u0000\u0000"+
		"\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u001d\u0001\u0000\u0000"+
		"\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008f\u0003 \u0010\u0000"+
		"\u008b\u008c\u0005\u0017\u0000\u0000\u008c\u008e\u0003 \u0010\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u001f\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u009a\u0003&\u0013\u0000\u0093\u009a\u0003\"\u0011\u0000\u0094\u009a"+
		"\u0003$\u0012\u0000\u0095\u0096\u0005\u0012\u0000\u0000\u0096\u0097\u0003"+
		"\u0016\u000b\u0000\u0097\u0098\u0005\u0013\u0000\u0000\u0098\u009a\u0001"+
		"\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0093\u0001"+
		"\u0000\u0000\u0000\u0099\u0094\u0001\u0000\u0000\u0000\u0099\u0095\u0001"+
		"\u0000\u0000\u0000\u009a!\u0001\u0000\u0000\u0000\u009b\u00a2\u0005\f"+
		"\u0000\u0000\u009c\u009d\u0005\f\u0000\u0000\u009d\u009e\u0005\u0014\u0000"+
		"\u0000\u009e\u009f\u0003\u0016\u000b\u0000\u009f\u00a0\u0005\u0015\u0000"+
		"\u0000\u00a0\u00a2\u0001\u0000\u0000\u0000\u00a1\u009b\u0001\u0000\u0000"+
		"\u0000\u00a1\u009c\u0001\u0000\u0000\u0000\u00a2#\u0001\u0000\u0000\u0000"+
		"\u00a3\u00ac\u0005\u0014\u0000\u0000\u00a4\u00a9\u0003\u0016\u000b\u0000"+
		"\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6\u00a8\u0003\u0016\u000b\u0000"+
		"\u00a7\u00a5\u0001\u0000\u0000\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000"+
		"\u00a9\u00a7\u0001\u0000\u0000\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000"+
		"\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ac\u00a4\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00af\u0005\u0015\u0000\u0000"+
		"\u00af%\u0001\u0000\u0000\u0000\u00b0\u00b1\u0007\u0000\u0000\u0000\u00b1"+
		"\'\u0001\u0000\u0000\u0000\u0010+2=ELXanw\u007f\u0087\u008f\u0099\u00a1"+
		"\u00a9\u00ac";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}