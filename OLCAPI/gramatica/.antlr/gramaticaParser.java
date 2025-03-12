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
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, INT=58, DOUBLE=59, CHAR=60, 
		STRING=61, BOOL=62, BLANCOS=63, ID_VARIABLE=64, COMENTARIOLINEA=65, COMENTARIOMULTILINEA=66;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_imprimir = 2, RULE_sIf = 3, 
		RULE_sSwitch = 4, RULE_cases = 5, RULE_block = 6, RULE_sFor = 7, RULE_varDcl = 8, 
		RULE_varDclSlice = 9, RULE_assign = 10, RULE_nuevoSlice = 11, RULE_contenidoSlice = 12, 
		RULE_varDclStruct = 13, RULE_varStructDcl = 14, RULE_varAsign = 15, RULE_expr = 16, 
		RULE_type = 17, RULE_break = 18, RULE_continue = 19, RULE_functions = 20, 
		RULE_varCallStatement = 21, RULE_retorno = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "imprimir", "sIf", "sSwitch", "cases", "block", 
			"sFor", "varDcl", "varDclSlice", "assign", "nuevoSlice", "contenidoSlice", 
			"varDclStruct", "varStructDcl", "varAsign", "expr", "type", "break", 
			"continue", "functions", "varCallStatement", "retorno"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'fmt.Println('", "','", "')'", "';'", "'if'", "'else'", 
			"'switch'", "'case'", "':'", "'default:'", "'for'", "':='", "'range'", 
			"'var'", "'='", "'[]'", "'struct'", "'+='", "'-='", "'++'", "'--'", "'['", 
			"']'", "'.'", "'-'", "'!'", "'*'", "'/'", "'%'", "'+'", "'<'", "'>'", 
			"'<='", "'>='", "'=='", "'!='", "'&&'", "'||'", "'('", "'slices.Index('", 
			"'strings.Join('", "'len('", "'append('", "'strconv.Atoi('", "'strconv.ParseFloat('", 
			"'reflect.TypeOf('", "'int'", "'float64'", "'string'", "'bool'", "'rune'", 
			"'break'", "'continue'", "'func'", "'return'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "INT", "DOUBLE", 
			"CHAR", "STRING", "BOOL", "BLANCOS", "ID_VARIABLE", "COMENTARIOLINEA", 
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
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9088264048033361595L) != 0)) {
				{
				{
				setState(46);
				instrucciones();
				}
				}
				setState(51);
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
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				imprimir();
				}
				break;
			case 2:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				sIf();
				}
				break;
			case 3:
				_localctx = new SwitchInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(54);
				sSwitch();
				}
				break;
			case 4:
				_localctx = new SeccionInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(55);
				match(T__0);
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9088264048033361595L) != 0)) {
					{
					{
					setState(56);
					instrucciones();
					}
					}
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(62);
				match(T__1);
				}
				break;
			case 5:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				sFor();
				}
				break;
			case 6:
				_localctx = new VarDeclSliceStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				varDclSlice();
				}
				break;
			case 7:
				_localctx = new AsignStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				varAsign();
				}
				break;
			case 8:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(66);
				varDcl();
				}
				break;
			case 9:
				_localctx = new VarDeclStructStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(67);
				varDclStruct();
				}
				break;
			case 10:
				_localctx = new VarStructDclStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(68);
				varStructDcl();
				}
				break;
			case 11:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(69);
				break_();
				}
				break;
			case 12:
				_localctx = new ContinueStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(70);
				continue_();
				}
				break;
			case 13:
				_localctx = new FunctionStmtContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(71);
				functions();
				}
				break;
			case 14:
				_localctx = new CallFunctionStmtContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(72);
				varCallStatement();
				}
				break;
			case 15:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(73);
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
			setState(76);
			match(T__2);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 204015124483L) != 0)) {
				{
				setState(77);
				expr(0);
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(78);
					match(T__3);
					setState(79);
					expr(0);
					}
					}
					setState(84);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(87);
			match(T__4);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(88);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new IfOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__6);
				setState(92);
				expr(0);
				setState(93);
				block();
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__7) {
					{
					setState(94);
					match(T__7);
					setState(95);
					block();
					}
				}

				}
				break;
			case 2:
				_localctx = new IfAnidadoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				match(T__6);
				setState(99);
				expr(0);
				setState(100);
				block();
				setState(101);
				match(T__7);
				setState(102);
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
			setState(106);
			match(T__8);
			setState(107);
			expr(0);
			setState(108);
			match(T__0);
			setState(109);
			cases();
			setState(110);
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
			setState(131);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				_localctx = new CaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__9);
				setState(113);
				expr(0);
				setState(114);
				match(T__10);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9088264048033361595L) != 0)) {
					{
					{
					setState(115);
					instrucciones();
					}
					}
					setState(120);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__9 || _la==T__11) {
					{
					setState(121);
					cases();
					}
				}

				}
				break;
			case T__11:
				_localctx = new DefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(T__11);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9088264048033361595L) != 0)) {
					{
					{
					setState(125);
					instrucciones();
					}
					}
					setState(130);
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
			setState(133);
			match(T__0);
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & -9088264048033361595L) != 0)) {
				{
				{
				setState(134);
				instrucciones();
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(140);
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
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				_localctx = new ForCondicionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(T__12);
				setState(143);
				expr(0);
				setState(144);
				block();
				}
				break;
			case 2:
				_localctx = new ForAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(146);
				match(T__12);
				setState(147);
				varDcl();
				setState(148);
				match(T__5);
				setState(149);
				expr(0);
				setState(150);
				match(T__5);
				setState(151);
				varAsign();
				setState(152);
				block();
				}
				break;
			case 3:
				_localctx = new ForRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				match(T__12);
				setState(155);
				match(ID_VARIABLE);
				setState(156);
				match(T__3);
				setState(157);
				match(ID_VARIABLE);
				setState(158);
				match(T__13);
				setState(159);
				match(T__14);
				setState(160);
				match(ID_VARIABLE);
				setState(161);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new VarDclWithTypeAndValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(164);
				match(T__15);
				setState(165);
				match(ID_VARIABLE);
				setState(166);
				type();
				setState(167);
				match(T__16);
				setState(168);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDclWithTypeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(T__15);
				setState(171);
				match(ID_VARIABLE);
				setState(172);
				type();
				}
				break;
			case 3:
				_localctx = new VarDclWithInferenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(ID_VARIABLE);
				setState(174);
				match(T__13);
				setState(175);
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
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_VARIABLE:
				_localctx = new SliceValoresContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID_VARIABLE);
				setState(179);
				assign();
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(180);
					nuevoSlice();
					}
					}
					setState(183); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__17 );
				setState(185);
				type();
				setState(186);
				match(T__0);
				setState(187);
				contenidoSlice();
				setState(188);
				match(T__1);
				}
				break;
			case T__15:
				_localctx = new SliceVacioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__15);
				setState(191);
				match(ID_VARIABLE);
				setState(193); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(192);
					nuevoSlice();
					}
					}
					setState(195); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__17 );
				setState(197);
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
			setState(201);
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
			setState(203);
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
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__26:
			case T__27:
			case T__40:
			case T__41:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case INT:
			case DOUBLE:
			case CHAR:
			case STRING:
			case BOOL:
			case ID_VARIABLE:
				_localctx = new SliceContenidoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				expr(0);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(206);
					match(T__3);
					setState(207);
					expr(0);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__0:
				_localctx = new SliceContenidoSliceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(213);
				match(T__0);
				setState(214);
				contenidoSlice();
				setState(215);
				match(T__1);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(216);
					match(T__3);
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==T__0) {
						{
						setState(217);
						match(T__0);
						setState(218);
						contenidoSlice();
						setState(219);
						match(T__1);
						}
					}

					}
					}
					setState(227);
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
			setState(230);
			match(T__18);
			setState(231);
			match(ID_VARIABLE);
			setState(232);
			match(T__0);
			setState(237); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(233);
				type();
				setState(234);
				match(ID_VARIABLE);
				setState(235);
				match(T__5);
				}
				}
				setState(239); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556584960L) != 0) );
			setState(241);
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
			setState(243);
			match(ID_VARIABLE);
			setState(244);
			match(ID_VARIABLE);
			setState(245);
			match(T__16);
			setState(246);
			match(T__0);
			setState(247);
			match(ID_VARIABLE);
			setState(248);
			match(T__10);
			setState(249);
			expr(0);
			setState(254); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				match(T__3);
				setState(251);
				match(ID_VARIABLE);
				setState(252);
				match(T__10);
				setState(253);
				expr(0);
				}
				}
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
			setState(258);
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
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				match(ID_VARIABLE);
				setState(261);
				match(T__16);
				setState(262);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				match(ID_VARIABLE);
				setState(264);
				((VarAddContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
					((VarAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(265);
				expr(0);
				}
				break;
			case 3:
				_localctx = new VarIncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(ID_VARIABLE);
				setState(267);
				((VarIncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__21 || _la==T__22) ) {
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
				setState(268);
				match(ID_VARIABLE);
				setState(273); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(269);
					match(T__23);
					setState(270);
					expr(0);
					setState(271);
					match(T__24);
					}
					}
					setState(275); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__23 );
				setState(277);
				match(T__16);
				setState(278);
				expr(0);
				}
				break;
			case 5:
				_localctx = new StructAccessAsignContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(280);
				match(ID_VARIABLE);
				setState(281);
				match(T__25);
				setState(282);
				match(ID_VARIABLE);
				setState(283);
				match(T__16);
				setState(284);
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
			setState(351);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(288);
				match(T__26);
				setState(289);
				expr(24);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(T__27);
				setState(291);
				expr(23);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(293);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(294);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(295);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(ID_VARIABLE);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(297);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(298);
				match(T__40);
				setState(299);
				expr(0);
				setState(300);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(ID_VARIABLE);
				setState(307); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(303);
						match(T__23);
						setState(304);
						expr(0);
						setState(305);
						match(T__24);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(309); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 11:
				{
				_localctx = new ArrayFindIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(311);
				match(T__41);
				setState(312);
				match(ID_VARIABLE);
				setState(313);
				match(T__3);
				setState(314);
				expr(0);
				setState(315);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new ArrayJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(317);
				match(T__42);
				setState(318);
				match(ID_VARIABLE);
				setState(319);
				match(T__3);
				setState(320);
				expr(0);
				setState(321);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ArrayLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(323);
				match(T__43);
				setState(324);
				match(ID_VARIABLE);
				setState(325);
				match(T__4);
				}
				break;
			case 14:
				{
				_localctx = new ArrayAppendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(326);
				match(T__44);
				setState(327);
				match(ID_VARIABLE);
				setState(328);
				match(T__3);
				setState(329);
				expr(0);
				setState(330);
				match(T__4);
				}
				break;
			case 15:
				{
				_localctx = new IntToStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(332);
				match(T__45);
				setState(333);
				expr(0);
				setState(334);
				match(T__4);
				}
				break;
			case 16:
				{
				_localctx = new FloatToStringContext(_localctx);
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
			case 17:
				{
				_localctx = new ReflectTypeContext(_localctx);
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
			case 18:
				{
				_localctx = new StructAccessContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				match(ID_VARIABLE);
				setState(345);
				match(T__25);
				setState(346);
				match(ID_VARIABLE);
				setState(348);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(347);
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
				setState(350);
				varCallStatement();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(370);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(368);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModuloContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(353);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(354);
						((MulDivModuloContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3758096384L) != 0)) ) {
							((MulDivModuloContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(355);
						expr(23);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(356);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(357);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__31) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						expr(22);
						}
						break;
					case 3:
						{
						_localctx = new MinorMajorEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(359);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(360);
						((MinorMajorEqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 128849018880L) != 0)) ) {
							((MinorMajorEqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(361);
						expr(21);
						}
						break;
					case 4:
						{
						_localctx = new EqualsNotEqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(362);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(363);
						((EqualsNotEqualsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__36 || _la==T__37) ) {
							((EqualsNotEqualsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(364);
						expr(20);
						}
						break;
					case 5:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(365);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(366);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__38 || _la==T__39) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(367);
						expr(19);
						}
						break;
					}
					} 
				}
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
			setState(373);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556584960L) != 0)) ) {
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
			setState(375);
			match(T__53);
			setState(377);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(376);
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
		public List<NuevoSliceContext> nuevoSlice() {
			return getRuleContexts(NuevoSliceContext.class);
		}
		public NuevoSliceContext nuevoSlice(int i) {
			return getRuleContext(NuevoSliceContext.class,i);
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
			setState(383);
			match(T__55);
			setState(384);
			match(ID_VARIABLE);
			setState(385);
			match(T__40);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID_VARIABLE) {
				{
				setState(386);
				match(ID_VARIABLE);
				setState(387);
				type();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(388);
					match(T__3);
					setState(389);
					match(ID_VARIABLE);
					setState(390);
					type();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(398);
			match(T__4);
			setState(406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 17451448556847104L) != 0)) {
				{
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(399);
					nuevoSlice();
					}
					}
					setState(404);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(405);
				type();
				}
			}

			setState(408);
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
			setState(410);
			match(ID_VARIABLE);
			setState(411);
			match(T__40);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 27)) & ~0x3f) == 0 && ((1L << (_la - 27)) & 204015124483L) != 0)) {
				{
				setState(412);
				expr(0);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(413);
					match(T__3);
					setState(414);
					expr(0);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(422);
			match(T__4);
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(423);
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
		enterRule(_localctx, 44, RULE_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			match(T__56);
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
		"\u0004\u0001B\u01b0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0005\u00000\b\u0000\n\u0000\f\u0000"+
		"3\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001K\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002Q\b\u0002"+
		"\n\u0002\f\u0002T\t\u0002\u0003\u0002V\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002Z\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003a\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003i\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005u\b\u0005\n\u0005\f\u0005"+
		"x\t\u0005\u0001\u0005\u0003\u0005{\b\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u007f\b\u0005\n\u0005\f\u0005\u0082\t\u0005\u0003\u0005\u0084\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0088\b\u0006\n\u0006\f\u0006"+
		"\u008b\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u00a3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00b1\b\b\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u00b6\b\t\u000b\t\f\t\u00b7\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u00c2\b\t\u000b\t\f\t"+
		"\u00c3\u0001\t\u0001\t\u0003\t\u00c8\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d1\b\f\n\f\f\f\u00d4\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00de"+
		"\b\f\u0005\f\u00e0\b\f\n\f\f\f\u00e3\t\f\u0003\f\u00e5\b\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0004\r\u00ee\b\r\u000b\r\f"+
		"\r\u00ef\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u00ff\b\u000e\u000b\u000e\f\u000e\u0100\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0004\u000f\u0112\b\u000f\u000b\u000f\f"+
		"\u000f\u0113\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u011e\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u0134\b\u0010\u000b\u0010\f\u0010\u0135\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u015d\b\u0010\u0001\u0010\u0003\u0010\u0160\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0171\b\u0010\n\u0010"+
		"\f\u0010\u0174\t\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u017a\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u017e\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0188\b\u0014\n\u0014\f\u0014"+
		"\u018b\t\u0014\u0003\u0014\u018d\b\u0014\u0001\u0014\u0001\u0014\u0005"+
		"\u0014\u0191\b\u0014\n\u0014\f\u0014\u0194\t\u0014\u0001\u0014\u0003\u0014"+
		"\u0197\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u01a0\b\u0015\n\u0015\f\u0015\u01a3"+
		"\t\u0015\u0003\u0015\u01a5\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01a9\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01ae\b"+
		"\u0016\u0001\u0016\u0000\u0001 \u0017\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\t\u0002"+
		"\u0000\u000e\u000e\u0011\u0011\u0001\u0000\u0014\u0015\u0001\u0000\u0016"+
		"\u0017\u0001\u0000\u001d\u001f\u0002\u0000\u001b\u001b  \u0001\u0000!"+
		"$\u0001\u0000%&\u0001\u0000\'(\u0002\u0000\u0013\u001315\u01e7\u00001"+
		"\u0001\u0000\u0000\u0000\u0002J\u0001\u0000\u0000\u0000\u0004L\u0001\u0000"+
		"\u0000\u0000\u0006h\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000"+
		"\n\u0083\u0001\u0000\u0000\u0000\f\u0085\u0001\u0000\u0000\u0000\u000e"+
		"\u00a2\u0001\u0000\u0000\u0000\u0010\u00b0\u0001\u0000\u0000\u0000\u0012"+
		"\u00c7\u0001\u0000\u0000\u0000\u0014\u00c9\u0001\u0000\u0000\u0000\u0016"+
		"\u00cb\u0001\u0000\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a"+
		"\u00e6\u0001\u0000\u0000\u0000\u001c\u00f3\u0001\u0000\u0000\u0000\u001e"+
		"\u011d\u0001\u0000\u0000\u0000 \u015f\u0001\u0000\u0000\u0000\"\u0175"+
		"\u0001\u0000\u0000\u0000$\u0177\u0001\u0000\u0000\u0000&\u017b\u0001\u0000"+
		"\u0000\u0000(\u017f\u0001\u0000\u0000\u0000*\u019a\u0001\u0000\u0000\u0000"+
		",\u01aa\u0001\u0000\u0000\u0000.0\u0003\u0002\u0001\u0000/.\u0001\u0000"+
		"\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001"+
		"\u0000\u0000\u00002\u0001\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u00004K\u0003\u0004\u0002\u00005K\u0003\u0006\u0003\u00006K\u0003\b\u0004"+
		"\u00007;\u0005\u0001\u0000\u00008:\u0003\u0002\u0001\u000098\u0001\u0000"+
		"\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001"+
		"\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000"+
		">K\u0005\u0002\u0000\u0000?K\u0003\u000e\u0007\u0000@K\u0003\u0012\t\u0000"+
		"AK\u0003\u001e\u000f\u0000BK\u0003\u0010\b\u0000CK\u0003\u001a\r\u0000"+
		"DK\u0003\u001c\u000e\u0000EK\u0003$\u0012\u0000FK\u0003&\u0013\u0000G"+
		"K\u0003(\u0014\u0000HK\u0003*\u0015\u0000IK\u0003,\u0016\u0000J4\u0001"+
		"\u0000\u0000\u0000J5\u0001\u0000\u0000\u0000J6\u0001\u0000\u0000\u0000"+
		"J7\u0001\u0000\u0000\u0000J?\u0001\u0000\u0000\u0000J@\u0001\u0000\u0000"+
		"\u0000JA\u0001\u0000\u0000\u0000JB\u0001\u0000\u0000\u0000JC\u0001\u0000"+
		"\u0000\u0000JD\u0001\u0000\u0000\u0000JE\u0001\u0000\u0000\u0000JF\u0001"+
		"\u0000\u0000\u0000JG\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000"+
		"JI\u0001\u0000\u0000\u0000K\u0003\u0001\u0000\u0000\u0000LU\u0005\u0003"+
		"\u0000\u0000MR\u0003 \u0010\u0000NO\u0005\u0004\u0000\u0000OQ\u0003 \u0010"+
		"\u0000PN\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000"+
		"\u0000\u0000RS\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000UM\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000"+
		"VW\u0001\u0000\u0000\u0000WY\u0005\u0005\u0000\u0000XZ\u0005\u0006\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001"+
		"\u0000\u0000\u0000[\\\u0005\u0007\u0000\u0000\\]\u0003 \u0010\u0000]`"+
		"\u0003\f\u0006\u0000^_\u0005\b\u0000\u0000_a\u0003\f\u0006\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ai\u0001\u0000\u0000\u0000"+
		"bc\u0005\u0007\u0000\u0000cd\u0003 \u0010\u0000de\u0003\f\u0006\u0000"+
		"ef\u0005\b\u0000\u0000fg\u0003\u0006\u0003\u0000gi\u0001\u0000\u0000\u0000"+
		"h[\u0001\u0000\u0000\u0000hb\u0001\u0000\u0000\u0000i\u0007\u0001\u0000"+
		"\u0000\u0000jk\u0005\t\u0000\u0000kl\u0003 \u0010\u0000lm\u0005\u0001"+
		"\u0000\u0000mn\u0003\n\u0005\u0000no\u0005\u0002\u0000\u0000o\t\u0001"+
		"\u0000\u0000\u0000pq\u0005\n\u0000\u0000qr\u0003 \u0010\u0000rv\u0005"+
		"\u000b\u0000\u0000su\u0003\u0002\u0001\u0000ts\u0001\u0000\u0000\u0000"+
		"ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wz\u0001\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000y{\u0003\n\u0005"+
		"\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\u0084\u0001"+
		"\u0000\u0000\u0000|\u0080\u0005\f\u0000\u0000}\u007f\u0003\u0002\u0001"+
		"\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080"+
		"~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0084"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083p\u0001"+
		"\u0000\u0000\u0000\u0083|\u0001\u0000\u0000\u0000\u0084\u000b\u0001\u0000"+
		"\u0000\u0000\u0085\u0089\u0005\u0001\u0000\u0000\u0086\u0088\u0003\u0002"+
		"\u0001\u0000\u0087\u0086\u0001\u0000\u0000\u0000\u0088\u008b\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000"+
		"\u0000\u0000\u008a\u008c\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008d\u0005\u0002\u0000\u0000\u008d\r\u0001\u0000\u0000"+
		"\u0000\u008e\u008f\u0005\r\u0000\u0000\u008f\u0090\u0003 \u0010\u0000"+
		"\u0090\u0091\u0003\f\u0006\u0000\u0091\u00a3\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0005\r\u0000\u0000\u0093\u0094\u0003\u0010\b\u0000\u0094\u0095"+
		"\u0005\u0006\u0000\u0000\u0095\u0096\u0003 \u0010\u0000\u0096\u0097\u0005"+
		"\u0006\u0000\u0000\u0097\u0098\u0003\u001e\u000f\u0000\u0098\u0099\u0003"+
		"\f\u0006\u0000\u0099\u00a3\u0001\u0000\u0000\u0000\u009a\u009b\u0005\r"+
		"\u0000\u0000\u009b\u009c\u0005@\u0000\u0000\u009c\u009d\u0005\u0004\u0000"+
		"\u0000\u009d\u009e\u0005@\u0000\u0000\u009e\u009f\u0005\u000e\u0000\u0000"+
		"\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00a1\u0005@\u0000\u0000\u00a1"+
		"\u00a3\u0003\f\u0006\u0000\u00a2\u008e\u0001\u0000\u0000\u0000\u00a2\u0092"+
		"\u0001\u0000\u0000\u0000\u00a2\u009a\u0001\u0000\u0000\u0000\u00a3\u000f"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0010\u0000\u0000\u00a5\u00a6"+
		"\u0005@\u0000\u0000\u00a6\u00a7\u0003\"\u0011\u0000\u00a7\u00a8\u0005"+
		"\u0011\u0000\u0000\u00a8\u00a9\u0003 \u0010\u0000\u00a9\u00b1\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005\u0010\u0000\u0000\u00ab\u00ac\u0005@\u0000"+
		"\u0000\u00ac\u00b1\u0003\"\u0011\u0000\u00ad\u00ae\u0005@\u0000\u0000"+
		"\u00ae\u00af\u0005\u000e\u0000\u0000\u00af\u00b1\u0003 \u0010\u0000\u00b0"+
		"\u00a4\u0001\u0000\u0000\u0000\u00b0\u00aa\u0001\u0000\u0000\u0000\u00b0"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b1\u0011\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0005@\u0000\u0000\u00b3\u00b5\u0003\u0014\n\u0000\u00b4\u00b6"+
		"\u0003\u0016\u000b\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8"+
		"\u0001\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba"+
		"\u0003\"\u0011\u0000\u00ba\u00bb\u0005\u0001\u0000\u0000\u00bb\u00bc\u0003"+
		"\u0018\f\u0000\u00bc\u00bd\u0005\u0002\u0000\u0000\u00bd\u00c8\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0005\u0010\u0000\u0000\u00bf\u00c1\u0005@\u0000"+
		"\u0000\u00c0\u00c2\u0003\u0016\u000b\u0000\u00c1\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0003\"\u0011\u0000\u00c6\u00c8\u0001\u0000\u0000\u0000"+
		"\u00c7\u00b2\u0001\u0000\u0000\u0000\u00c7\u00be\u0001\u0000\u0000\u0000"+
		"\u00c8\u0013\u0001\u0000\u0000\u0000\u00c9\u00ca\u0007\u0000\u0000\u0000"+
		"\u00ca\u0015\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005\u0012\u0000\u0000"+
		"\u00cc\u0017\u0001\u0000\u0000\u0000\u00cd\u00d2\u0003 \u0010\u0000\u00ce"+
		"\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00ce"+
		"\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0"+
		"\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00e5"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0001\u0000\u0000\u00d6\u00d7\u0003\u0018\f\u0000\u00d7\u00e1\u0005"+
		"\u0002\u0000\u0000\u00d8\u00dd\u0005\u0004\u0000\u0000\u00d9\u00da\u0005"+
		"\u0001\u0000\u0000\u00da\u00db\u0003\u0018\f\u0000\u00db\u00dc\u0005\u0002"+
		"\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000"+
		"\u0000\u0000\u00dd\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000"+
		"\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00e0\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00df\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e5\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000"+
		"\u0000\u0000\u00e4\u00cd\u0001\u0000\u0000\u0000\u00e4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00e5\u0019\u0001\u0000\u0000\u0000\u00e6\u00e7\u0005\u0013"+
		"\u0000\u0000\u00e7\u00e8\u0005@\u0000\u0000\u00e8\u00ed\u0005\u0001\u0000"+
		"\u0000\u00e9\u00ea\u0003\"\u0011\u0000\u00ea\u00eb\u0005@\u0000\u0000"+
		"\u00eb\u00ec\u0005\u0006\u0000\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000"+
		"\u00ed\u00e9\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u0002\u0000\u0000"+
		"\u00f2\u001b\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005@\u0000\u0000\u00f4"+
		"\u00f5\u0005@\u0000\u0000\u00f5\u00f6\u0005\u0011\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0001\u0000\u0000\u00f7\u00f8\u0005@\u0000\u0000\u00f8\u00f9\u0005"+
		"\u000b\u0000\u0000\u00f9\u00fe\u0003 \u0010\u0000\u00fa\u00fb\u0005\u0004"+
		"\u0000\u0000\u00fb\u00fc\u0005@\u0000\u0000\u00fc\u00fd\u0005\u000b\u0000"+
		"\u0000\u00fd\u00ff\u0003 \u0010\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000"+
		"\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000"+
		"\u0100\u0101\u0001\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000"+
		"\u0102\u0103\u0005\u0002\u0000\u0000\u0103\u001d\u0001\u0000\u0000\u0000"+
		"\u0104\u0105\u0005@\u0000\u0000\u0105\u0106\u0005\u0011\u0000\u0000\u0106"+
		"\u011e\u0003 \u0010\u0000\u0107\u0108\u0005@\u0000\u0000\u0108\u0109\u0007"+
		"\u0001\u0000\u0000\u0109\u011e\u0003 \u0010\u0000\u010a\u010b\u0005@\u0000"+
		"\u0000\u010b\u011e\u0007\u0002\u0000\u0000\u010c\u0111\u0005@\u0000\u0000"+
		"\u010d\u010e\u0005\u0018\u0000\u0000\u010e\u010f\u0003 \u0010\u0000\u010f"+
		"\u0110\u0005\u0019\u0000\u0000\u0110\u0112\u0001\u0000\u0000\u0000\u0111"+
		"\u010d\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113"+
		"\u0111\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000\u0114"+
		"\u0115\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0011\u0000\u0000\u0116"+
		"\u0117\u0003 \u0010\u0000\u0117\u011e\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0005@\u0000\u0000\u0119\u011a\u0005\u001a\u0000\u0000\u011a\u011b\u0005"+
		"@\u0000\u0000\u011b\u011c\u0005\u0011\u0000\u0000\u011c\u011e\u0003 \u0010"+
		"\u0000\u011d\u0104\u0001\u0000\u0000\u0000\u011d\u0107\u0001\u0000\u0000"+
		"\u0000\u011d\u010a\u0001\u0000\u0000\u0000\u011d\u010c\u0001\u0000\u0000"+
		"\u0000\u011d\u0118\u0001\u0000\u0000\u0000\u011e\u001f\u0001\u0000\u0000"+
		"\u0000\u011f\u0120\u0006\u0010\uffff\uffff\u0000\u0120\u0121\u0005\u001b"+
		"\u0000\u0000\u0121\u0160\u0003 \u0010\u0018\u0122\u0123\u0005\u001c\u0000"+
		"\u0000\u0123\u0160\u0003 \u0010\u0017\u0124\u0160\u0005:\u0000\u0000\u0125"+
		"\u0160\u0005;\u0000\u0000\u0126\u0160\u0005=\u0000\u0000\u0127\u0160\u0005"+
		">\u0000\u0000\u0128\u0160\u0005@\u0000\u0000\u0129\u0160\u0005<\u0000"+
		"\u0000\u012a\u012b\u0005)\u0000\u0000\u012b\u012c\u0003 \u0010\u0000\u012c"+
		"\u012d\u0005\u0005\u0000\u0000\u012d\u0160\u0001\u0000\u0000\u0000\u012e"+
		"\u0133\u0005@\u0000\u0000\u012f\u0130\u0005\u0018\u0000\u0000\u0130\u0131"+
		"\u0003 \u0010\u0000\u0131\u0132\u0005\u0019\u0000\u0000\u0132\u0134\u0001"+
		"\u0000\u0000\u0000\u0133\u012f\u0001\u0000\u0000\u0000\u0134\u0135\u0001"+
		"\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135\u0136\u0001"+
		"\u0000\u0000\u0000\u0136\u0160\u0001\u0000\u0000\u0000\u0137\u0138\u0005"+
		"*\u0000\u0000\u0138\u0139\u0005@\u0000\u0000\u0139\u013a\u0005\u0004\u0000"+
		"\u0000\u013a\u013b\u0003 \u0010\u0000\u013b\u013c\u0005\u0005\u0000\u0000"+
		"\u013c\u0160\u0001\u0000\u0000\u0000\u013d\u013e\u0005+\u0000\u0000\u013e"+
		"\u013f\u0005@\u0000\u0000\u013f\u0140\u0005\u0004\u0000\u0000\u0140\u0141"+
		"\u0003 \u0010\u0000\u0141\u0142\u0005\u0005\u0000\u0000\u0142\u0160\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0005,\u0000\u0000\u0144\u0145\u0005@\u0000"+
		"\u0000\u0145\u0160\u0005\u0005\u0000\u0000\u0146\u0147\u0005-\u0000\u0000"+
		"\u0147\u0148\u0005@\u0000\u0000\u0148\u0149\u0005\u0004\u0000\u0000\u0149"+
		"\u014a\u0003 \u0010\u0000\u014a\u014b\u0005\u0005\u0000\u0000\u014b\u0160"+
		"\u0001\u0000\u0000\u0000\u014c\u014d\u0005.\u0000\u0000\u014d\u014e\u0003"+
		" \u0010\u0000\u014e\u014f\u0005\u0005\u0000\u0000\u014f\u0160\u0001\u0000"+
		"\u0000\u0000\u0150\u0151\u0005/\u0000\u0000\u0151\u0152\u0003 \u0010\u0000"+
		"\u0152\u0153\u0005\u0005\u0000\u0000\u0153\u0160\u0001\u0000\u0000\u0000"+
		"\u0154\u0155\u00050\u0000\u0000\u0155\u0156\u0003 \u0010\u0000\u0156\u0157"+
		"\u0005\u0005\u0000\u0000\u0157\u0160\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0005@\u0000\u0000\u0159\u015a\u0005\u001a\u0000\u0000\u015a\u015c\u0005"+
		"@\u0000\u0000\u015b\u015d\u0005\u0006\u0000\u0000\u015c\u015b\u0001\u0000"+
		"\u0000\u0000\u015c\u015d\u0001\u0000\u0000\u0000\u015d\u0160\u0001\u0000"+
		"\u0000\u0000\u015e\u0160\u0003*\u0015\u0000\u015f\u011f\u0001\u0000\u0000"+
		"\u0000\u015f\u0122\u0001\u0000\u0000\u0000\u015f\u0124\u0001\u0000\u0000"+
		"\u0000\u015f\u0125\u0001\u0000\u0000\u0000\u015f\u0126\u0001\u0000\u0000"+
		"\u0000\u015f\u0127\u0001\u0000\u0000\u0000\u015f\u0128\u0001\u0000\u0000"+
		"\u0000\u015f\u0129\u0001\u0000\u0000\u0000\u015f\u012a\u0001\u0000\u0000"+
		"\u0000\u015f\u012e\u0001\u0000\u0000\u0000\u015f\u0137\u0001\u0000\u0000"+
		"\u0000\u015f\u013d\u0001\u0000\u0000\u0000\u015f\u0143\u0001\u0000\u0000"+
		"\u0000\u015f\u0146\u0001\u0000\u0000\u0000\u015f\u014c\u0001\u0000\u0000"+
		"\u0000\u015f\u0150\u0001\u0000\u0000\u0000\u015f\u0154\u0001\u0000\u0000"+
		"\u0000\u015f\u0158\u0001\u0000\u0000\u0000\u015f\u015e\u0001\u0000\u0000"+
		"\u0000\u0160\u0172\u0001\u0000\u0000\u0000\u0161\u0162\n\u0016\u0000\u0000"+
		"\u0162\u0163\u0007\u0003\u0000\u0000\u0163\u0171\u0003 \u0010\u0017\u0164"+
		"\u0165\n\u0015\u0000\u0000\u0165\u0166\u0007\u0004\u0000\u0000\u0166\u0171"+
		"\u0003 \u0010\u0016\u0167\u0168\n\u0014\u0000\u0000\u0168\u0169\u0007"+
		"\u0005\u0000\u0000\u0169\u0171\u0003 \u0010\u0015\u016a\u016b\n\u0013"+
		"\u0000\u0000\u016b\u016c\u0007\u0006\u0000\u0000\u016c\u0171\u0003 \u0010"+
		"\u0014\u016d\u016e\n\u0012\u0000\u0000\u016e\u016f\u0007\u0007\u0000\u0000"+
		"\u016f\u0171\u0003 \u0010\u0013\u0170\u0161\u0001\u0000\u0000\u0000\u0170"+
		"\u0164\u0001\u0000\u0000\u0000\u0170\u0167\u0001\u0000\u0000\u0000\u0170"+
		"\u016a\u0001\u0000\u0000\u0000\u0170\u016d\u0001\u0000\u0000\u0000\u0171"+
		"\u0174\u0001\u0000\u0000\u0000\u0172\u0170\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173!\u0001\u0000\u0000\u0000\u0174\u0172"+
		"\u0001\u0000\u0000\u0000\u0175\u0176\u0007\b\u0000\u0000\u0176#\u0001"+
		"\u0000\u0000\u0000\u0177\u0179\u00056\u0000\u0000\u0178\u017a\u0005\u0006"+
		"\u0000\u0000\u0179\u0178\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000"+
		"\u0000\u0000\u017a%\u0001\u0000\u0000\u0000\u017b\u017d\u00057\u0000\u0000"+
		"\u017c\u017e\u0005\u0006\u0000\u0000\u017d\u017c\u0001\u0000\u0000\u0000"+
		"\u017d\u017e\u0001\u0000\u0000\u0000\u017e\'\u0001\u0000\u0000\u0000\u017f"+
		"\u0180\u00058\u0000\u0000\u0180\u0181\u0005@\u0000\u0000\u0181\u018c\u0005"+
		")\u0000\u0000\u0182\u0183\u0005@\u0000\u0000\u0183\u0189\u0003\"\u0011"+
		"\u0000\u0184\u0185\u0005\u0004\u0000\u0000\u0185\u0186\u0005@\u0000\u0000"+
		"\u0186\u0188\u0003\"\u0011\u0000\u0187\u0184\u0001\u0000\u0000\u0000\u0188"+
		"\u018b\u0001\u0000\u0000\u0000\u0189\u0187\u0001\u0000\u0000\u0000\u0189"+
		"\u018a\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018c\u0182\u0001\u0000\u0000\u0000\u018c"+
		"\u018d\u0001\u0000\u0000\u0000\u018d\u018e\u0001\u0000\u0000\u0000\u018e"+
		"\u0196\u0005\u0005\u0000\u0000\u018f\u0191\u0003\u0016\u000b\u0000\u0190"+
		"\u018f\u0001\u0000\u0000\u0000\u0191\u0194\u0001\u0000\u0000\u0000\u0192"+
		"\u0190\u0001\u0000\u0000\u0000\u0192\u0193\u0001\u0000\u0000\u0000\u0193"+
		"\u0195\u0001\u0000\u0000\u0000\u0194\u0192\u0001\u0000\u0000\u0000\u0195"+
		"\u0197\u0003\"\u0011\u0000\u0196\u0192\u0001\u0000\u0000\u0000\u0196\u0197"+
		"\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0003\f\u0006\u0000\u0199)\u0001\u0000\u0000\u0000\u019a\u019b\u0005"+
		"@\u0000\u0000\u019b\u01a4\u0005)\u0000\u0000\u019c\u01a1\u0003 \u0010"+
		"\u0000\u019d\u019e\u0005\u0004\u0000\u0000\u019e\u01a0\u0003 \u0010\u0000"+
		"\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a3\u0001\u0000\u0000\u0000"+
		"\u01a1\u019f\u0001\u0000\u0000\u0000\u01a1\u01a2\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a5\u0001\u0000\u0000\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000"+
		"\u01a4\u019c\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000"+
		"\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0005\u0005\u0000\u0000"+
		"\u01a7\u01a9\u0005\u0006\u0000\u0000\u01a8\u01a7\u0001\u0000\u0000\u0000"+
		"\u01a8\u01a9\u0001\u0000\u0000\u0000\u01a9+\u0001\u0000\u0000\u0000\u01aa"+
		"\u01ab\u00059\u0000\u0000\u01ab\u01ad\u0003 \u0010\u0000\u01ac\u01ae\u0005"+
		"\u0006\u0000\u0000\u01ad\u01ac\u0001\u0000\u0000\u0000\u01ad\u01ae\u0001"+
		"\u0000\u0000\u0000\u01ae-\u0001\u0000\u0000\u0000)1;JRUY`hvz\u0080\u0083"+
		"\u0089\u00a2\u00b0\u00b7\u00c3\u00c7\u00d2\u00dd\u00e1\u00e4\u00ef\u0100"+
		"\u0113\u011d\u0135\u015c\u015f\u0170\u0172\u0179\u017d\u0189\u018c\u0192"+
		"\u0196\u01a1\u01a4\u01a8\u01ad";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}