// Generated from /home/matthew-reyes/Escritorio/Proyectos COMPI 2/OLC2_Proyectos/OLC2_PROYECTO1_202202233/OLCAPI/gramatica/gramatica.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class gramaticaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, INT=59, DOUBLE=60, 
		CHAR=61, STRING=62, BOOL=63, BLANCOS=64, ID_VARIABLE=65, COMENTARIOLINEA=66, 
		COMENTARIOMULTILINEA=67;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_imprimir = 2, RULE_sIf = 3, 
		RULE_sSwitch = 4, RULE_cases = 5, RULE_block = 6, RULE_sFor = 7, RULE_varDcl = 8, 
		RULE_varDclSlice = 9, RULE_assign = 10, RULE_nuevoSlice = 11, RULE_contenidoSlice = 12, 
		RULE_varDclStruct = 13, RULE_varStructDcl = 14, RULE_varAsign = 15, RULE_expr = 16, 
		RULE_type = 17, RULE_break = 18, RULE_continue = 19, RULE_functions = 20, 
		RULE_varCallStatement = 21, RULE_valRet = 22, RULE_retorno = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "imprimir", "sIf", "sSwitch", "cases", "block", 
			"sFor", "varDcl", "varDclSlice", "assign", "nuevoSlice", "contenidoSlice", 
			"varDclStruct", "varStructDcl", "varAsign", "expr", "type", "break", 
			"continue", "functions", "varCallStatement", "valRet", "retorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'fmt.Println('", "','", "')'", "';'", "'if'", "'else'", 
			"'switch'", "'case'", "':'", "'default:'", "'for'", "':='", "'range'", 
			"'var'", "'='", "'[]'", "'type'", "'struct'", "'+='", "'-='", "'++'", 
			"'--'", "'['", "']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'('", 
			"'slices.Index('", "'strings.Join('", "'len('", "'append('", "'strconv.Atoi('", 
			"'strconv.ParseFloat('", "'reflect.TypeOf('", "'int'", "'float64'", "'string'", 
			"'bool'", "'rune'", "'break'", "'continue'", "'func'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "INT", 
			"DOUBLE", "CHAR", "STRING", "BOOL", "BLANCOS", "ID_VARIABLE", "COMENTARIOLINEA", 
			"COMENTARIOMULTILINEA"
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
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955285058186L) != 0) || _la==ID_VARIABLE) {
				{
				{
				setState(48);
				instrucciones();
				}
				}
				setState(53);
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
	public static class InstruccionesContext extends ParserRuleContext {
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
	 
		public InstruccionesContext() { }
		public void copyFrom(InstruccionesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SeccionInstruccionContext extends InstruccionesContext {
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public SeccionInstruccionContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionStmtContext extends InstruccionesContext {
		public VarCallStatementContext varCallStatement() {
			return getRuleContext(VarCallStatementContext.class,0);
		}
		public CallFunctionStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintStmtContext extends InstruccionesContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public PrintStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarStructDclStmtContext extends InstruccionesContext {
		public VarStructDclContext varStructDcl() {
			return getRuleContext(VarStructDclContext.class,0);
		}
		public VarStructDclStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignStmtContext extends InstruccionesContext {
		public VarAsignContext varAsign() {
			return getRuleContext(VarAsignContext.class,0);
		}
		public AsignStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueStmtContext extends InstruccionesContext {
		public ContinueContext continue_() {
			return getRuleContext(ContinueContext.class,0);
		}
		public ContinueStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStructStmtContext extends InstruccionesContext {
		public VarDclStructContext varDclStruct() {
			return getRuleContext(VarDclStructContext.class,0);
		}
		public VarDeclStructStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends InstruccionesContext {
		public SIfContext sIf() {
			return getRuleContext(SIfContext.class,0);
		}
		public IfStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionStmtContext extends InstruccionesContext {
		public FunctionsContext functions() {
			return getRuleContext(FunctionsContext.class,0);
		}
		public FunctionStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclSliceStmtContext extends InstruccionesContext {
		public VarDclSliceContext varDclSlice() {
			return getRuleContext(VarDclSliceContext.class,0);
		}
		public VarDeclSliceStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclStmtContext extends InstruccionesContext {
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public VarDeclStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakStmtContext extends InstruccionesContext {
		public BreakContext break_() {
			return getRuleContext(BreakContext.class,0);
		}
		public BreakStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchInstruccionContext extends InstruccionesContext {
		public SSwitchContext sSwitch() {
			return getRuleContext(SSwitchContext.class,0);
		}
		public SwitchInstruccionContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForStmtContext extends InstruccionesContext {
		public SForContext sFor() {
			return getRuleContext(SForContext.class,0);
		}
		public ForStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStmtContext extends InstruccionesContext {
		public RetornoContext retorno() {
			return getRuleContext(RetornoContext.class,0);
		}
		public ReturnStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				imprimir();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				sIf();
				}
				break;
			case 3:
				_localctx = new SwitchInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				sSwitch();
				}
				break;
			case 4:
				_localctx = new SeccionInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(T__0);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955285058186L) != 0) || _la==ID_VARIABLE) {
					{
					{
					setState(58);
					instrucciones();
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				sFor();
				}
				break;
			case 6:
				_localctx = new VarDeclSliceStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				varDclSlice();
				}
				break;
			case 7:
				_localctx = new AsignStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				varAsign();
				}
				break;
			case 8:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				varDcl();
				}
				break;
			case 9:
				_localctx = new VarDeclStructStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				varDclStruct();
				}
				break;
			case 10:
				_localctx = new VarStructDclStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(70);
				varStructDcl();
				}
				break;
			case 11:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(71);
				break_();
				}
				break;
			case 12:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(72);
				continue_();
				}
				break;
			case 13:
				_localctx = new FunctionStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(73);
				functions();
				}
				break;
			case 14:
				_localctx = new CallFunctionStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(74);
				varCallStatement();
				}
				break;
			case 15:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(75);
				retorno();
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
	public static class ImprimirContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(T__2);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 204015124483L) != 0)) {
				{
				setState(79);
				expr(0);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(80);
					match(T__3);
					setState(81);
					expr(0);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(89);
			match(T__4);
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(90);
				match(T__5);
				}
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
	public static class SIfContext extends ParserRuleContext {
		public SIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sIf; }
	 
		public SIfContext() { }
		public void copyFrom(SIfContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfAnidadoContext extends SIfContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SIfContext sIf() {
			return getRuleContext(SIfContext.class,0);
		}
		public IfAnidadoContext(SIfContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfOnlyContext extends SIfContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public IfOnlyContext(SIfContext ctx) { copyFrom(ctx); }
	}

	public final SIfContext sIf() throws RecognitionException {
		SIfContext _localctx = new SIfContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sIf);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				match(T__6);
				setState(94);
				expr(0);
				setState(95);
				block();
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(96);
					match(T__7);
					setState(97);
					block();
					}
				}

				}
				break;
			case 2:
				_localctx = new IfAnidadoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(T__6);
				setState(101);
				expr(0);
				setState(102);
				block();
				setState(103);
				match(T__7);
				setState(104);
				sIf();
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
	public static class SSwitchContext extends ParserRuleContext {
		public SSwitchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sSwitch; }
	 
		public SSwitchContext() { }
		public void copyFrom(SSwitchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchStmtContext extends SSwitchContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public SwitchStmtContext(SSwitchContext ctx) { copyFrom(ctx); }
	}

	public final SSwitchContext sSwitch() throws RecognitionException {
		SSwitchContext _localctx = new SSwitchContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sSwitch);
		try {
			_localctx = new SwitchStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(T__8);
			setState(109);
			expr(0);
			setState(110);
			match(T__0);
			setState(111);
			cases();
			setState(112);
			match(T__1);
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
	public static class CasesContext extends ParserRuleContext {
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	 
		public CasesContext() { }
		public void copyFrom(CasesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefaultContext extends CasesContext {
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public DefaultContext(CasesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaseContext extends CasesContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public CasesContext cases() {
			return getRuleContext(CasesContext.class,0);
		}
		public CaseContext(CasesContext ctx) { copyFrom(ctx); }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cases);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new CaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__9);
				setState(115);
				expr(0);
				setState(116);
				match(T__10);
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955285058186L) != 0) || _la==ID_VARIABLE) {
					{
					{
					setState(117);
					instrucciones();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__11) {
					{
					setState(123);
					cases();
					}
				}

				}
				break;
			case T__11:
				_localctx = new DefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__11);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955285058186L) != 0) || _la==ID_VARIABLE) {
					{
					{
					setState(127);
					instrucciones();
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class BlockContext extends ParserRuleContext {
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	 
		public BlockContext() { }
		public void copyFrom(BlockContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BlockStmtContext extends BlockContext {
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public BlockStmtContext(BlockContext ctx) { copyFrom(ctx); }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			_localctx = new BlockStmtContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 540431955285058186L) != 0) || _la==ID_VARIABLE) {
				{
				{
				setState(136);
				instrucciones();
				}
				}
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(142);
			match(T__1);
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
	public static class SForContext extends ParserRuleContext {
		public SForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sFor; }
	 
		public SForContext() { }
		public void copyFrom(SForContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCondicionContext extends SForContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForCondicionContext(SForContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends SForContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForRangeContext(SForContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForAsignacionContext extends SForContext {
		public VarDclContext varDcl() {
			return getRuleContext(VarDclContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAsignContext varAsign() {
			return getRuleContext(VarAsignContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForAsignacionContext(SForContext ctx) { copyFrom(ctx); }
	}

	public final SForContext sFor() throws RecognitionException {
		SForContext _localctx = new SForContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sFor);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ForCondicionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				match(T__12);
				setState(145);
				expr(0);
				setState(146);
				block();
				}
				break;
			case 2:
				_localctx = new ForAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(T__12);
				setState(149);
				varDcl();
				setState(150);
				match(T__5);
				setState(151);
				expr(0);
				setState(152);
				match(T__5);
				setState(153);
				varAsign();
				setState(154);
				block();
				}
				break;
			case 3:
				_localctx = new ForRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				match(T__12);
				setState(157);
				match(ID_VARIABLE);
				setState(158);
				match(T__3);
				setState(159);
				match(ID_VARIABLE);
				setState(160);
				match(T__13);
				setState(161);
				match(T__14);
				setState(162);
				match(ID_VARIABLE);
				setState(163);
				block();
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
	public static class VarDclContext extends ParserRuleContext {
		public VarDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDcl; }
	 
		public VarDclContext() { }
		public void copyFrom(VarDclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDclWithTypeAndValueContext extends VarDclContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDclWithTypeAndValueContext(VarDclContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDclWithInferenceContext extends VarDclContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarDclWithInferenceContext(VarDclContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarDclWithTypeOnlyContext extends VarDclContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public VarDclWithTypeOnlyContext(VarDclContext ctx) { copyFrom(ctx); }
	}

	public final VarDclContext varDcl() throws RecognitionException {
		VarDclContext _localctx = new VarDclContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_varDcl);
		try {
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDclWithTypeAndValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				match(T__15);
				setState(167);
				match(ID_VARIABLE);
				setState(168);
				type();
				setState(169);
				match(T__16);
				setState(170);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDclWithTypeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				match(T__15);
				setState(173);
				match(ID_VARIABLE);
				setState(174);
				type();
				}
				break;
			case 3:
				_localctx = new VarDclWithInferenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(ID_VARIABLE);
				setState(176);
				match(T__13);
				setState(177);
				expr(0);
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
	public static class VarDclSliceContext extends ParserRuleContext {
		public VarDclSliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDclSlice; }
	 
		public VarDclSliceContext() { }
		public void copyFrom(VarDclSliceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceValoresContext extends VarDclSliceContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ContenidoSliceContext contenidoSlice() {
			return getRuleContext(ContenidoSliceContext.class,0);
		}
		public List<NuevoSliceContext> nuevoSlice() {
			return getRuleContexts(NuevoSliceContext.class);
		}
		public NuevoSliceContext nuevoSlice(int i) {
			return getRuleContext(NuevoSliceContext.class,i);
		}
		public SliceValoresContext(VarDclSliceContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceVacioContext extends VarDclSliceContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<NuevoSliceContext> nuevoSlice() {
			return getRuleContexts(NuevoSliceContext.class);
		}
		public NuevoSliceContext nuevoSlice(int i) {
			return getRuleContext(NuevoSliceContext.class,i);
		}
		public SliceVacioContext(VarDclSliceContext ctx) { copyFrom(ctx); }
	}

	public final VarDclSliceContext varDclSlice() throws RecognitionException {
		VarDclSliceContext _localctx = new VarDclSliceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDclSlice);
		int _la;
		try {
			setState(201);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_VARIABLE:
				_localctx = new SliceValoresContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				match(ID_VARIABLE);
				setState(181);
				assign();
				setState(183); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(182);
					nuevoSlice();
					}
					}
					setState(185); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__17 );
				setState(187);
				type();
				setState(188);
				match(T__0);
				setState(189);
				contenidoSlice();
				setState(190);
				match(T__1);
				}
				break;
			case T__15:
				_localctx = new SliceVacioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(T__15);
				setState(193);
				match(ID_VARIABLE);
				setState(195); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(194);
					nuevoSlice();
					}
					}
					setState(197); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__17 );
				setState(199);
				type();
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
	public static class AssignContext extends ParserRuleContext {
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			_la = _input.LA(1);
			if ( !(_la==T__13 || _la==T__16) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class NuevoSliceContext extends ParserRuleContext {
		public NuevoSliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nuevoSlice; }
	}

	public final NuevoSliceContext nuevoSlice() throws RecognitionException {
		NuevoSliceContext _localctx = new NuevoSliceContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nuevoSlice);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__17);
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
	public static class ContenidoSliceContext extends ParserRuleContext {
		public ContenidoSliceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contenidoSlice; }
	 
		public ContenidoSliceContext() { }
		public void copyFrom(ContenidoSliceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceContenidoSliceContext extends ContenidoSliceContext {
		public List<ContenidoSliceContext> contenidoSlice() {
			return getRuleContexts(ContenidoSliceContext.class);
		}
		public ContenidoSliceContext contenidoSlice(int i) {
			return getRuleContext(ContenidoSliceContext.class,i);
		}
		public SliceContenidoSliceContext(ContenidoSliceContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceContenidoContext extends ContenidoSliceContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SliceContenidoContext(ContenidoSliceContext ctx) { copyFrom(ctx); }
	}

	public final ContenidoSliceContext contenidoSlice() throws RecognitionException {
		ContenidoSliceContext _localctx = new ContenidoSliceContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_contenidoSlice);
		int _la;
		try {
			setState(230);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__27:
			case T__28:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
			case BOOL:
			case ID_VARIABLE:
				_localctx = new SliceContenidoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				expr(0);
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(208);
					match(T__3);
					setState(209);
					expr(0);
					}
					}
					setState(214);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
				_localctx = new SliceContenidoSliceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__0);
				setState(216);
				contenidoSlice();
				setState(217);
				match(T__1);
				setState(227);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(218);
					match(T__3);
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(219);
						match(T__0);
						setState(220);
						contenidoSlice();
						setState(221);
						match(T__1);
						}
					}

					}
					}
					setState(229);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class VarDclStructContext extends ParserRuleContext {
		public VarDclStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDclStruct; }
	 
		public VarDclStructContext() { }
		public void copyFrom(VarDclStructContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclStructDataContext extends VarDclStructContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public DeclStructDataContext(VarDclStructContext ctx) { copyFrom(ctx); }
	}

	public final VarDclStructContext varDclStruct() throws RecognitionException {
		VarDclStructContext _localctx = new VarDclStructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDclStruct);
		int _la;
		try {
			_localctx = new DeclStructDataContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			match(T__18);
			setState(233);
			match(T__19);
			setState(234);
			match(ID_VARIABLE);
			setState(235);
			match(T__0);
			setState(241); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(236);
				match(ID_VARIABLE);
				setState(237);
				type();
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__5) {
					{
					setState(238);
					match(T__5);
					}
				}

				}
				}
				setState(243); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID_VARIABLE );
			setState(245);
			match(T__1);
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
	public static class VarStructDclContext extends ParserRuleContext {
		public VarStructDclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varStructDcl; }
	 
		public VarStructDclContext() { }
		public void copyFrom(VarStructDclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructVarTypeContext extends VarStructDclContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StructVarTypeContext(VarStructDclContext ctx) { copyFrom(ctx); }
	}

	public final VarStructDclContext varStructDcl() throws RecognitionException {
		VarStructDclContext _localctx = new VarStructDclContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varStructDcl);
		int _la;
		try {
			_localctx = new StructVarTypeContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(ID_VARIABLE);
			setState(248);
			match(ID_VARIABLE);
			setState(249);
			match(T__16);
			setState(250);
			match(T__0);
			setState(251);
			match(ID_VARIABLE);
			setState(252);
			match(T__10);
			setState(253);
			expr(0);
			setState(258); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(254);
				match(T__3);
				setState(255);
				match(ID_VARIABLE);
				setState(256);
				match(T__10);
				setState(257);
				expr(0);
				}
				}
				setState(260); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(262);
			match(T__1);
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
	public static class VarAsignContext extends ParserRuleContext {
		public VarAsignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAsign; }
	 
		public VarAsignContext() { }
		public void copyFrom(VarAsignContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarIncContext extends VarAsignContext {
		public Token op;
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public VarIncContext(VarAsignContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarExprContext extends VarAsignContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarExprContext(VarAsignContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessContext extends VarAsignContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessContext(VarAsignContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAccessAsignContext extends VarAsignContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StructAccessAsignContext(VarAsignContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarAddContext extends VarAsignContext {
		public Token op;
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAddContext(VarAsignContext ctx) { copyFrom(ctx); }
	}

	public final VarAsignContext varAsign() throws RecognitionException {
		VarAsignContext _localctx = new VarAsignContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varAsign);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(ID_VARIABLE);
				setState(265);
				match(T__16);
				setState(266);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				match(ID_VARIABLE);
				setState(268);
				((VarAddContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__20 || _la==T__21) ) {
					((VarAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				expr(0);
				}
				break;
			case 3:
				_localctx = new VarIncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(270);
				match(ID_VARIABLE);
				setState(271);
				((VarIncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__22 || _la==T__23) ) {
					((VarIncContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new ArrayAccessContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(272);
				match(ID_VARIABLE);
				setState(277); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(273);
					match(T__24);
					setState(274);
					expr(0);
					setState(275);
					match(T__25);
					}
					}
					setState(279); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__24 );
				setState(281);
				match(T__16);
				setState(282);
				expr(0);
				}
				break;
			case 5:
				_localctx = new StructAccessAsignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(ID_VARIABLE);
				setState(285);
				match(T__26);
				setState(286);
				match(ID_VARIABLE);
				setState(287);
				match(T__16);
				setState(288);
				expr(0);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualsNotEqualsContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualsNotEqualsContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntToStringContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntToStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionValueContext extends ExprContext {
		public VarCallStatementContext varCallStatement() {
			return getRuleContext(VarCallStatementContext.class,0);
		}
		public CallFunctionValueContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAccessSimpleContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArrayAccessSimpleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayLengthContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ArrayLengthContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModuloContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivModuloContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DoubleContext extends ExprContext {
		public TerminalNode DOUBLE() { return getToken(gramaticaParser.DOUBLE, 0); }
		public DoubleContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntegerContext extends ExprContext {
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public IntegerContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StructAccessContext extends ExprContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public StructAccessContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinorMajorEqualContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MinorMajorEqualContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public IdentifierContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReflectTypeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReflectTypeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CharContext extends ExprContext {
		public TerminalNode CHAR() { return getToken(gramaticaParser.CHAR, 0); }
		public CharContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(gramaticaParser.BOOL, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayJoinContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayJoinContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayFindIndexContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayFindIndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatToStringContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FloatToStringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ArrayAppendContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ArrayAppendContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(292);
				match(T__27);
				setState(293);
				expr(24);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(T__28);
				setState(295);
				expr(23);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(ID_VARIABLE);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(T__41);
				setState(303);
				expr(0);
				setState(304);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(ID_VARIABLE);
				setState(311); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(307);
						match(T__24);
						setState(308);
						expr(0);
						setState(309);
						match(T__25);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(313); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				{
				_localctx = new ArrayFindIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(T__42);
				setState(316);
				match(ID_VARIABLE);
				setState(317);
				match(T__3);
				setState(318);
				expr(0);
				setState(319);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new ArrayJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(321);
				match(T__43);
				setState(322);
				match(ID_VARIABLE);
				setState(323);
				match(T__3);
				setState(324);
				expr(0);
				setState(325);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ArrayLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(327);
				match(T__44);
				setState(328);
				match(ID_VARIABLE);
				setState(329);
				match(T__4);
				}
				break;
			case 14:
				{
				_localctx = new ArrayAppendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(330);
				match(T__45);
				setState(331);
				match(ID_VARIABLE);
				setState(332);
				match(T__3);
				setState(333);
				expr(0);
				setState(334);
				match(T__4);
				}
				break;
			case 15:
				{
				_localctx = new IntToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(336);
				match(T__46);
				setState(337);
				expr(0);
				setState(338);
				match(T__4);
				}
				break;
			case 16:
				{
				_localctx = new FloatToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(340);
				match(T__47);
				setState(341);
				expr(0);
				setState(342);
				match(T__4);
				}
				break;
			case 17:
				{
				_localctx = new ReflectTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(T__48);
				setState(345);
				expr(0);
				setState(346);
				match(T__4);
				}
				break;
			case 18:
				{
				_localctx = new StructAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				match(ID_VARIABLE);
				setState(349);
				match(T__26);
				setState(350);
				match(ID_VARIABLE);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
				case 1:
					{
					setState(351);
					match(T__5);
					}
					break;
				}
				}
				break;
			case 19:
				{
				_localctx = new CallFunctionValueContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				varCallStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(374);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(372);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModuloContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(357);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(358);
						((MulDivModuloContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7516192768L) != 0)) ) {
							((MulDivModuloContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(359);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(360);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(361);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__32) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(362);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new MinorMajorEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(363);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(364);
						((MinorMajorEqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 257698037760L) != 0)) ) {
							((MinorMajorEqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(365);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new EqualsNotEqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(366);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(367);
						((EqualsNotEqualsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__37 || _la==T__38) ) {
							((EqualsNotEqualsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(368);
						expr(20);
						}
						break;
					case 5:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(369);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(370);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__39 || _la==T__40) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(371);
						expr(19);
						}
						break;
					}
					} 
				}
				setState(376);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897113169920L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends ParserRuleContext {
		public BreakContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_break; }
	}

	public final BreakContext break_() throws RecognitionException {
		BreakContext _localctx = new BreakContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_break);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(T__54);
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(380);
				match(T__5);
				}
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
	public static class ContinueContext extends ParserRuleContext {
		public ContinueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue; }
	}

	public final ContinueContext continue_() throws RecognitionException {
		ContinueContext _localctx = new ContinueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			match(T__55);
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(384);
				match(T__5);
				}
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
	public static class FunctionsContext extends ParserRuleContext {
		public FunctionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions; }
	 
		public FunctionsContext() { }
		public void copyFrom(FunctionsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncionesContext extends FunctionsContext {
		public List<TerminalNode> ID_VARIABLE() { return getTokens(gramaticaParser.ID_VARIABLE); }
		public TerminalNode ID_VARIABLE(int i) {
			return getToken(gramaticaParser.ID_VARIABLE, i);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public ValRetContext valRet() {
			return getRuleContext(ValRetContext.class,0);
		}
		public FuncionesContext(FunctionsContext ctx) { copyFrom(ctx); }
	}

	public final FunctionsContext functions() throws RecognitionException {
		FunctionsContext _localctx = new FunctionsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functions);
		int _la;
		try {
			_localctx = new FuncionesContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			match(T__56);
			setState(388);
			match(ID_VARIABLE);
			setState(389);
			match(T__41);
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_VARIABLE) {
				{
				setState(390);
				match(ID_VARIABLE);
				setState(391);
				type();
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(392);
					match(T__3);
					setState(393);
					match(ID_VARIABLE);
					setState(394);
					type();
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(402);
			match(T__4);
			setState(404);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34902897113169920L) != 0)) {
				{
				setState(403);
				valRet();
				}
			}

			setState(406);
			block();
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
	public static class VarCallStatementContext extends ParserRuleContext {
		public VarCallStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varCallStatement; }
	 
		public VarCallStatementContext() { }
		public void copyFrom(VarCallStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallFunctionContext extends VarCallStatementContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CallFunctionContext(VarCallStatementContext ctx) { copyFrom(ctx); }
	}

	public final VarCallStatementContext varCallStatement() throws RecognitionException {
		VarCallStatementContext _localctx = new VarCallStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varCallStatement);
		int _la;
		try {
			_localctx = new CallFunctionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(408);
			match(ID_VARIABLE);
			setState(409);
			match(T__41);
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & 204015124483L) != 0)) {
				{
				setState(410);
				expr(0);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(411);
					match(T__3);
					setState(412);
					expr(0);
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(420);
			match(T__4);
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(421);
				match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValRetContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ValRetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valRet; }
	}

	public final ValRetContext valRet() throws RecognitionException {
		ValRetContext _localctx = new ValRetContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_valRet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			type();
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
	public static class RetornoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RetornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retorno; }
	}

	public final RetornoContext retorno() throws RecognitionException {
		RetornoContext _localctx = new RetornoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__57);
			setState(427);
			expr(0);
			setState(429);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(428);
				match(T__5);
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 22);
		case 1:
			return precpred(_ctx, 21);
		case 2:
			return precpred(_ctx, 20);
		case 3:
			return precpred(_ctx, 19);
		case 4:
			return precpred(_ctx, 18);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001C\u01b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001<\b\u0001\n\u0001\f\u0001?\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001M\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002S\b\u0002\n\u0002\f\u0002V\t\u0002\u0003\u0002X\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003c\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003k\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005w\b"+
		"\u0005\n\u0005\f\u0005z\t\u0005\u0001\u0005\u0003\u0005}\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005\u0081\b\u0005\n\u0005\f\u0005\u0084\t\u0005"+
		"\u0003\u0005\u0086\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u008a\b"+
		"\u0006\n\u0006\f\u0006\u008d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00a5\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b3\b\b\u0001\t\u0001\t\u0001\t\u0004\t\u00b8\b\t\u000b\t\f\t\u00b9"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004"+
		"\t\u00c4\b\t\u000b\t\f\t\u00c5\u0001\t\u0001\t\u0003\t\u00ca\b\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d3"+
		"\b\f\n\f\f\f\u00d6\t\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u00e0\b\f\u0005\f\u00e2\b\f\n\f\f\f\u00e5\t\f"+
		"\u0003\f\u00e7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00f0\b\r\u0004\r\u00f2\b\r\u000b\r\f\r\u00f3\u0001\r\u0001"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0004\u000e"+
		"\u0103\b\u000e\u000b\u000e\f\u000e\u0104\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u0116\b\u000f\u000b\u000f\f\u000f\u0117\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0003\u000f\u0122\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0004\u0010"+
		"\u0138\b\u0010\u000b\u0010\f\u0010\u0139\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0161"+
		"\b\u0010\u0001\u0010\u0003\u0010\u0164\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u0175\b\u0010\n\u0010\f\u0010\u0178\t\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0003\u0012\u017e\b\u0012\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u0182\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u018c\b\u0014\n\u0014\f\u0014\u018f\t\u0014\u0003\u0014\u0191\b"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u0195\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u019e\b\u0015\n\u0015\f\u0015\u01a1\t\u0015\u0003\u0015\u01a3\b"+
		"\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u01a7\b\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01ae\b\u0017\u0001"+
		"\u0017\u0000\u0001 \u0018\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.\u0000\t\u0002\u0000\u000e"+
		"\u000e\u0011\u0011\u0001\u0000\u0015\u0016\u0001\u0000\u0017\u0018\u0001"+
		"\u0000\u001e \u0002\u0000\u001c\u001c!!\u0001\u0000\"%\u0001\u0000&\'"+
		"\u0001\u0000()\u0002\u0000\u0014\u001426\u01e6\u00003\u0001\u0000\u0000"+
		"\u0000\u0002L\u0001\u0000\u0000\u0000\u0004N\u0001\u0000\u0000\u0000\u0006"+
		"j\u0001\u0000\u0000\u0000\bl\u0001\u0000\u0000\u0000\n\u0085\u0001\u0000"+
		"\u0000\u0000\f\u0087\u0001\u0000\u0000\u0000\u000e\u00a4\u0001\u0000\u0000"+
		"\u0000\u0010\u00b2\u0001\u0000\u0000\u0000\u0012\u00c9\u0001\u0000\u0000"+
		"\u0000\u0014\u00cb\u0001\u0000\u0000\u0000\u0016\u00cd\u0001\u0000\u0000"+
		"\u0000\u0018\u00e6\u0001\u0000\u0000\u0000\u001a\u00e8\u0001\u0000\u0000"+
		"\u0000\u001c\u00f7\u0001\u0000\u0000\u0000\u001e\u0121\u0001\u0000\u0000"+
		"\u0000 \u0163\u0001\u0000\u0000\u0000\"\u0179\u0001\u0000\u0000\u0000"+
		"$\u017b\u0001\u0000\u0000\u0000&\u017f\u0001\u0000\u0000\u0000(\u0183"+
		"\u0001\u0000\u0000\u0000*\u0198\u0001\u0000\u0000\u0000,\u01a8\u0001\u0000"+
		"\u0000\u0000.\u01aa\u0001\u0000\u0000\u000002\u0003\u0002\u0001\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u00004\u0001\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u00006M\u0003\u0004\u0002\u00007M\u0003\u0006\u0003\u0000"+
		"8M\u0003\b\u0004\u00009=\u0005\u0001\u0000\u0000:<\u0003\u0002\u0001\u0000"+
		";:\u0001\u0000\u0000\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000=>\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?=\u0001\u0000"+
		"\u0000\u0000@M\u0005\u0002\u0000\u0000AM\u0003\u000e\u0007\u0000BM\u0003"+
		"\u0012\t\u0000CM\u0003\u001e\u000f\u0000DM\u0003\u0010\b\u0000EM\u0003"+
		"\u001a\r\u0000FM\u0003\u001c\u000e\u0000GM\u0003$\u0012\u0000HM\u0003"+
		"&\u0013\u0000IM\u0003(\u0014\u0000JM\u0003*\u0015\u0000KM\u0003.\u0017"+
		"\u0000L6\u0001\u0000\u0000\u0000L7\u0001\u0000\u0000\u0000L8\u0001\u0000"+
		"\u0000\u0000L9\u0001\u0000\u0000\u0000LA\u0001\u0000\u0000\u0000LB\u0001"+
		"\u0000\u0000\u0000LC\u0001\u0000\u0000\u0000LD\u0001\u0000\u0000\u0000"+
		"LE\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000LG\u0001\u0000\u0000"+
		"\u0000LH\u0001\u0000\u0000\u0000LI\u0001\u0000\u0000\u0000LJ\u0001\u0000"+
		"\u0000\u0000LK\u0001\u0000\u0000\u0000M\u0003\u0001\u0000\u0000\u0000"+
		"NW\u0005\u0003\u0000\u0000OT\u0003 \u0010\u0000PQ\u0005\u0004\u0000\u0000"+
		"QS\u0003 \u0010\u0000RP\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000"+
		"TR\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UX\u0001\u0000\u0000"+
		"\u0000VT\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000XY\u0001\u0000\u0000\u0000Y[\u0005\u0005\u0000\u0000Z\\\u0005"+
		"\u0006\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000"+
		"\\\u0005\u0001\u0000\u0000\u0000]^\u0005\u0007\u0000\u0000^_\u0003 \u0010"+
		"\u0000_b\u0003\f\u0006\u0000`a\u0005\b\u0000\u0000ac\u0003\f\u0006\u0000"+
		"b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000ck\u0001\u0000\u0000"+
		"\u0000de\u0005\u0007\u0000\u0000ef\u0003 \u0010\u0000fg\u0003\f\u0006"+
		"\u0000gh\u0005\b\u0000\u0000hi\u0003\u0006\u0003\u0000ik\u0001\u0000\u0000"+
		"\u0000j]\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000k\u0007\u0001"+
		"\u0000\u0000\u0000lm\u0005\t\u0000\u0000mn\u0003 \u0010\u0000no\u0005"+
		"\u0001\u0000\u0000op\u0003\n\u0005\u0000pq\u0005\u0002\u0000\u0000q\t"+
		"\u0001\u0000\u0000\u0000rs\u0005\n\u0000\u0000st\u0003 \u0010\u0000tx"+
		"\u0005\u000b\u0000\u0000uw\u0003\u0002\u0001\u0000vu\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000"+
		"\u0000\u0000y|\u0001\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000{}\u0003"+
		"\n\u0005\u0000|{\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000}\u0086"+
		"\u0001\u0000\u0000\u0000~\u0082\u0005\f\u0000\u0000\u007f\u0081\u0003"+
		"\u0002\u0001\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001"+
		"\u0000\u0000\u0000\u0085r\u0001\u0000\u0000\u0000\u0085~\u0001\u0000\u0000"+
		"\u0000\u0086\u000b\u0001\u0000\u0000\u0000\u0087\u008b\u0005\u0001\u0000"+
		"\u0000\u0088\u008a\u0003\u0002\u0001\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008d\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008e\u0001\u0000\u0000"+
		"\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0002\u0000"+
		"\u0000\u008f\r\u0001\u0000\u0000\u0000\u0090\u0091\u0005\r\u0000\u0000"+
		"\u0091\u0092\u0003 \u0010\u0000\u0092\u0093\u0003\f\u0006\u0000\u0093"+
		"\u00a5\u0001\u0000\u0000\u0000\u0094\u0095\u0005\r\u0000\u0000\u0095\u0096"+
		"\u0003\u0010\b\u0000\u0096\u0097\u0005\u0006\u0000\u0000\u0097\u0098\u0003"+
		" \u0010\u0000\u0098\u0099\u0005\u0006\u0000\u0000\u0099\u009a\u0003\u001e"+
		"\u000f\u0000\u009a\u009b\u0003\f\u0006\u0000\u009b\u00a5\u0001\u0000\u0000"+
		"\u0000\u009c\u009d\u0005\r\u0000\u0000\u009d\u009e\u0005A\u0000\u0000"+
		"\u009e\u009f\u0005\u0004\u0000\u0000\u009f\u00a0\u0005A\u0000\u0000\u00a0"+
		"\u00a1\u0005\u000e\u0000\u0000\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2"+
		"\u00a3\u0005A\u0000\u0000\u00a3\u00a5\u0003\f\u0006\u0000\u00a4\u0090"+
		"\u0001\u0000\u0000\u0000\u00a4\u0094\u0001\u0000\u0000\u0000\u00a4\u009c"+
		"\u0001\u0000\u0000\u0000\u00a5\u000f\u0001\u0000\u0000\u0000\u00a6\u00a7"+
		"\u0005\u0010\u0000\u0000\u00a7\u00a8\u0005A\u0000\u0000\u00a8\u00a9\u0003"+
		"\"\u0011\u0000\u00a9\u00aa\u0005\u0011\u0000\u0000\u00aa\u00ab\u0003 "+
		"\u0010\u0000\u00ab\u00b3\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0010"+
		"\u0000\u0000\u00ad\u00ae\u0005A\u0000\u0000\u00ae\u00b3\u0003\"\u0011"+
		"\u0000\u00af\u00b0\u0005A\u0000\u0000\u00b0\u00b1\u0005\u000e\u0000\u0000"+
		"\u00b1\u00b3\u0003 \u0010\u0000\u00b2\u00a6\u0001\u0000\u0000\u0000\u00b2"+
		"\u00ac\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000\u00b3"+
		"\u0011\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005A\u0000\u0000\u00b5\u00b7"+
		"\u0003\u0014\n\u0000\u00b6\u00b8\u0003\u0016\u000b\u0000\u00b7\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001"+
		"\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\u0003\"\u0011\u0000\u00bc\u00bd\u0005\u0001"+
		"\u0000\u0000\u00bd\u00be\u0003\u0018\f\u0000\u00be\u00bf\u0005\u0002\u0000"+
		"\u0000\u00bf\u00ca\u0001\u0000\u0000\u0000\u00c0\u00c1\u0005\u0010\u0000"+
		"\u0000\u00c1\u00c3\u0005A\u0000\u0000\u00c2\u00c4\u0003\u0016\u000b\u0000"+
		"\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000"+
		"\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c8\u0003\"\u0011\u0000\u00c8"+
		"\u00ca\u0001\u0000\u0000\u0000\u00c9\u00b4\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c0\u0001\u0000\u0000\u0000\u00ca\u0013\u0001\u0000\u0000\u0000\u00cb"+
		"\u00cc\u0007\u0000\u0000\u0000\u00cc\u0015\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0012\u0000\u0000\u00ce\u0017\u0001\u0000\u0000\u0000\u00cf"+
		"\u00d4\u0003 \u0010\u0000\u00d0\u00d1\u0005\u0004\u0000\u0000\u00d1\u00d3"+
		"\u0003 \u0010\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00e7\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d7\u00d8\u0005\u0001\u0000\u0000\u00d8\u00d9\u0003"+
		"\u0018\f\u0000\u00d9\u00e3\u0005\u0002\u0000\u0000\u00da\u00df\u0005\u0004"+
		"\u0000\u0000\u00db\u00dc\u0005\u0001\u0000\u0000\u00dc\u00dd\u0003\u0018"+
		"\f\u0000\u00dd\u00de\u0005\u0002\u0000\u0000\u00de\u00e0\u0001\u0000\u0000"+
		"\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00df\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00da\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e7\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e6\u00cf\u0001\u0000\u0000"+
		"\u0000\u00e6\u00d7\u0001\u0000\u0000\u0000\u00e7\u0019\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e9\u0005\u0013\u0000\u0000\u00e9\u00ea\u0005\u0014\u0000"+
		"\u0000\u00ea\u00eb\u0005A\u0000\u0000\u00eb\u00f1\u0005\u0001\u0000\u0000"+
		"\u00ec\u00ed\u0005A\u0000\u0000\u00ed\u00ef\u0003\"\u0011\u0000\u00ee"+
		"\u00f0\u0005\u0006\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000\u0000\u00ef"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000\u00f1"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3"+
		"\u00f1\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0005\u0002\u0000\u0000\u00f6"+
		"\u001b\u0001\u0000\u0000\u0000\u00f7\u00f8\u0005A\u0000\u0000\u00f8\u00f9"+
		"\u0005A\u0000\u0000\u00f9\u00fa\u0005\u0011\u0000\u0000\u00fa\u00fb\u0005"+
		"\u0001\u0000\u0000\u00fb\u00fc\u0005A\u0000\u0000\u00fc\u00fd\u0005\u000b"+
		"\u0000\u0000\u00fd\u0102\u0003 \u0010\u0000\u00fe\u00ff\u0005\u0004\u0000"+
		"\u0000\u00ff\u0100\u0005A\u0000\u0000\u0100\u0101\u0005\u000b\u0000\u0000"+
		"\u0101\u0103\u0003 \u0010\u0000\u0102\u00fe\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000\u0000\u0104"+
		"\u0105\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106"+
		"\u0107\u0005\u0002\u0000\u0000\u0107\u001d\u0001\u0000\u0000\u0000\u0108"+
		"\u0109\u0005A\u0000\u0000\u0109\u010a\u0005\u0011\u0000\u0000\u010a\u0122"+
		"\u0003 \u0010\u0000\u010b\u010c\u0005A\u0000\u0000\u010c\u010d\u0007\u0001"+
		"\u0000\u0000\u010d\u0122\u0003 \u0010\u0000\u010e\u010f\u0005A\u0000\u0000"+
		"\u010f\u0122\u0007\u0002\u0000\u0000\u0110\u0115\u0005A\u0000\u0000\u0111"+
		"\u0112\u0005\u0019\u0000\u0000\u0112\u0113\u0003 \u0010\u0000\u0113\u0114"+
		"\u0005\u001a\u0000\u0000\u0114\u0116\u0001\u0000\u0000\u0000\u0115\u0111"+
		"\u0001\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115"+
		"\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0001\u0000\u0000\u0000\u0119\u011a\u0005\u0011\u0000\u0000\u011a\u011b"+
		"\u0003 \u0010\u0000\u011b\u0122\u0001\u0000\u0000\u0000\u011c\u011d\u0005"+
		"A\u0000\u0000\u011d\u011e\u0005\u001b\u0000\u0000\u011e\u011f\u0005A\u0000"+
		"\u0000\u011f\u0120\u0005\u0011\u0000\u0000\u0120\u0122\u0003 \u0010\u0000"+
		"\u0121\u0108\u0001\u0000\u0000\u0000\u0121\u010b\u0001\u0000\u0000\u0000"+
		"\u0121\u010e\u0001\u0000\u0000\u0000\u0121\u0110\u0001\u0000\u0000\u0000"+
		"\u0121\u011c\u0001\u0000\u0000\u0000\u0122\u001f\u0001\u0000\u0000\u0000"+
		"\u0123\u0124\u0006\u0010\uffff\uffff\u0000\u0124\u0125\u0005\u001c\u0000"+
		"\u0000\u0125\u0164\u0003 \u0010\u0018\u0126\u0127\u0005\u001d\u0000\u0000"+
		"\u0127\u0164\u0003 \u0010\u0017\u0128\u0164\u0005;\u0000\u0000\u0129\u0164"+
		"\u0005<\u0000\u0000\u012a\u0164\u0005>\u0000\u0000\u012b\u0164\u0005?"+
		"\u0000\u0000\u012c\u0164\u0005A\u0000\u0000\u012d\u0164\u0005=\u0000\u0000"+
		"\u012e\u012f\u0005*\u0000\u0000\u012f\u0130\u0003 \u0010\u0000\u0130\u0131"+
		"\u0005\u0005\u0000\u0000\u0131\u0164\u0001\u0000\u0000\u0000\u0132\u0137"+
		"\u0005A\u0000\u0000\u0133\u0134\u0005\u0019\u0000\u0000\u0134\u0135\u0003"+
		" \u0010\u0000\u0135\u0136\u0005\u001a\u0000\u0000\u0136\u0138\u0001\u0000"+
		"\u0000\u0000\u0137\u0133\u0001\u0000\u0000\u0000\u0138\u0139\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000"+
		"\u0000\u0000\u013a\u0164\u0001\u0000\u0000\u0000\u013b\u013c\u0005+\u0000"+
		"\u0000\u013c\u013d\u0005A\u0000\u0000\u013d\u013e\u0005\u0004\u0000\u0000"+
		"\u013e\u013f\u0003 \u0010\u0000\u013f\u0140\u0005\u0005\u0000\u0000\u0140"+
		"\u0164\u0001\u0000\u0000\u0000\u0141\u0142\u0005,\u0000\u0000\u0142\u0143"+
		"\u0005A\u0000\u0000\u0143\u0144\u0005\u0004\u0000\u0000\u0144\u0145\u0003"+
		" \u0010\u0000\u0145\u0146\u0005\u0005\u0000\u0000\u0146\u0164\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005-\u0000\u0000\u0148\u0149\u0005A\u0000\u0000"+
		"\u0149\u0164\u0005\u0005\u0000\u0000\u014a\u014b\u0005.\u0000\u0000\u014b"+
		"\u014c\u0005A\u0000\u0000\u014c\u014d\u0005\u0004\u0000\u0000\u014d\u014e"+
		"\u0003 \u0010\u0000\u014e\u014f\u0005\u0005\u0000\u0000\u014f\u0164\u0001"+
		"\u0000\u0000\u0000\u0150\u0151\u0005/\u0000\u0000\u0151\u0152\u0003 \u0010"+
		"\u0000\u0152\u0153\u0005\u0005\u0000\u0000\u0153\u0164\u0001\u0000\u0000"+
		"\u0000\u0154\u0155\u00050\u0000\u0000\u0155\u0156\u0003 \u0010\u0000\u0156"+
		"\u0157\u0005\u0005\u0000\u0000\u0157\u0164\u0001\u0000\u0000\u0000\u0158"+
		"\u0159\u00051\u0000\u0000\u0159\u015a\u0003 \u0010\u0000\u015a\u015b\u0005"+
		"\u0005\u0000\u0000\u015b\u0164\u0001\u0000\u0000\u0000\u015c\u015d\u0005"+
		"A\u0000\u0000\u015d\u015e\u0005\u001b\u0000\u0000\u015e\u0160\u0005A\u0000"+
		"\u0000\u015f\u0161\u0005\u0006\u0000\u0000\u0160\u015f\u0001\u0000\u0000"+
		"\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u0164\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0003*\u0015\u0000\u0163\u0123\u0001\u0000\u0000\u0000"+
		"\u0163\u0126\u0001\u0000\u0000\u0000\u0163\u0128\u0001\u0000\u0000\u0000"+
		"\u0163\u0129\u0001\u0000\u0000\u0000\u0163\u012a\u0001\u0000\u0000\u0000"+
		"\u0163\u012b\u0001\u0000\u0000\u0000\u0163\u012c\u0001\u0000\u0000\u0000"+
		"\u0163\u012d\u0001\u0000\u0000\u0000\u0163\u012e\u0001\u0000\u0000\u0000"+
		"\u0163\u0132\u0001\u0000\u0000\u0000\u0163\u013b\u0001\u0000\u0000\u0000"+
		"\u0163\u0141\u0001\u0000\u0000\u0000\u0163\u0147\u0001\u0000\u0000\u0000"+
		"\u0163\u014a\u0001\u0000\u0000\u0000\u0163\u0150\u0001\u0000\u0000\u0000"+
		"\u0163\u0154\u0001\u0000\u0000\u0000\u0163\u0158\u0001\u0000\u0000\u0000"+
		"\u0163\u015c\u0001\u0000\u0000\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0164\u0176\u0001\u0000\u0000\u0000\u0165\u0166\n\u0016\u0000\u0000\u0166"+
		"\u0167\u0007\u0003\u0000\u0000\u0167\u0175\u0003 \u0010\u0017\u0168\u0169"+
		"\n\u0015\u0000\u0000\u0169\u016a\u0007\u0004\u0000\u0000\u016a\u0175\u0003"+
		" \u0010\u0016\u016b\u016c\n\u0014\u0000\u0000\u016c\u016d\u0007\u0005"+
		"\u0000\u0000\u016d\u0175\u0003 \u0010\u0015\u016e\u016f\n\u0013\u0000"+
		"\u0000\u016f\u0170\u0007\u0006\u0000\u0000\u0170\u0175\u0003 \u0010\u0014"+
		"\u0171\u0172\n\u0012\u0000\u0000\u0172\u0173\u0007\u0007\u0000\u0000\u0173"+
		"\u0175\u0003 \u0010\u0013\u0174\u0165\u0001\u0000\u0000\u0000\u0174\u0168"+
		"\u0001\u0000\u0000\u0000\u0174\u016b\u0001\u0000\u0000\u0000\u0174\u016e"+
		"\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000\u0000\u0175\u0178"+
		"\u0001\u0000\u0000\u0000\u0176\u0174\u0001\u0000\u0000\u0000\u0176\u0177"+
		"\u0001\u0000\u0000\u0000\u0177!\u0001\u0000\u0000\u0000\u0178\u0176\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0007\b\u0000\u0000\u017a#\u0001\u0000"+
		"\u0000\u0000\u017b\u017d\u00057\u0000\u0000\u017c\u017e\u0005\u0006\u0000"+
		"\u0000\u017d\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000"+
		"\u0000\u017e%\u0001\u0000\u0000\u0000\u017f\u0181\u00058\u0000\u0000\u0180"+
		"\u0182\u0005\u0006\u0000\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181"+
		"\u0182\u0001\u0000\u0000\u0000\u0182\'\u0001\u0000\u0000\u0000\u0183\u0184"+
		"\u00059\u0000\u0000\u0184\u0185\u0005A\u0000\u0000\u0185\u0190\u0005*"+
		"\u0000\u0000\u0186\u0187\u0005A\u0000\u0000\u0187\u018d\u0003\"\u0011"+
		"\u0000\u0188\u0189\u0005\u0004\u0000\u0000\u0189\u018a\u0005A\u0000\u0000"+
		"\u018a\u018c\u0003\"\u0011\u0000\u018b\u0188\u0001\u0000\u0000\u0000\u018c"+
		"\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d"+
		"\u018e\u0001\u0000\u0000\u0000\u018e\u0191\u0001\u0000\u0000\u0000\u018f"+
		"\u018d\u0001\u0000\u0000\u0000\u0190\u0186\u0001\u0000\u0000\u0000\u0190"+
		"\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000\u0000\u0000\u0192"+
		"\u0194\u0005\u0005\u0000\u0000\u0193\u0195\u0003,\u0016\u0000\u0194\u0193"+
		"\u0001\u0000\u0000\u0000\u0194\u0195\u0001\u0000\u0000\u0000\u0195\u0196"+
		"\u0001\u0000\u0000\u0000\u0196\u0197\u0003\f\u0006\u0000\u0197)\u0001"+
		"\u0000\u0000\u0000\u0198\u0199\u0005A\u0000\u0000\u0199\u01a2\u0005*\u0000"+
		"\u0000\u019a\u019f\u0003 \u0010\u0000\u019b\u019c\u0005\u0004\u0000\u0000"+
		"\u019c\u019e\u0003 \u0010\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u01a1\u0001\u0000\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u019f"+
		"\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000\u01a1"+
		"\u019f\u0001\u0000\u0000\u0000\u01a2\u019a\u0001\u0000\u0000\u0000\u01a2"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a6\u0005\u0005\u0000\u0000\u01a5\u01a7\u0005\u0006\u0000\u0000\u01a6"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7"+
		"+\u0001\u0000\u0000\u0000\u01a8\u01a9\u0003\"\u0011\u0000\u01a9-\u0001"+
		"\u0000\u0000\u0000\u01aa\u01ab\u0005:\u0000\u0000\u01ab\u01ad\u0003 \u0010"+
		"\u0000\u01ac\u01ae\u0005\u0006\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000"+
		"\u0000\u01ad\u01ae\u0001\u0000\u0000\u0000\u01ae/\u0001\u0000\u0000\u0000"+
		")3=LTW[bjx|\u0082\u0085\u008b\u00a4\u00b2\u00b9\u00c5\u00c9\u00d4\u00df"+
		"\u00e3\u00e6\u00ef\u00f3\u0104\u0117\u0121\u0139\u0160\u0163\u0174\u0176"+
		"\u017d\u0181\u018d\u0190\u0194\u019f\u01a2\u01a6\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}