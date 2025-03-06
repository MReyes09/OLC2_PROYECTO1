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
		T__45=46, T__46=47, INT=48, DOUBLE=49, CHAR=50, STRING=51, BOOL=52, BLANCOS=53, 
		ID_VARIABLE=54, COMENTARIOLINEA=55, COMENTARIOMULTILINEA=56;
	public static final int
		RULE_inicio = 0, RULE_instrucciones = 1, RULE_imprimir = 2, RULE_sIf = 3, 
		RULE_sSwitch = 4, RULE_cases = 5, RULE_block = 6, RULE_sFor = 7, RULE_varDcl = 8, 
		RULE_varDclSlice = 9, RULE_assign = 10, RULE_varAsign = 11, RULE_expr = 12, 
		RULE_type = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "instrucciones", "imprimir", "sIf", "sSwitch", "cases", "block", 
			"sFor", "varDcl", "varDclSlice", "assign", "varAsign", "expr", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "'fmt.Println('", "','", "')'", "'if'", "'else'", 
			"'switch'", "'case'", "':'", "'default:'", "'for'", "';'", "'var'", "'='", 
			"':='", "'[]'", "'+='", "'-='", "'++'", "'--'", "'['", "']'", "'-'", 
			"'!'", "'*'", "'/'", "'%'", "'+'", "'<'", "'>'", "'<='", "'>='", "'=='", 
			"'!='", "'&&'", "'||'", "'('", "'slices.Index('", "'strings.Join('", 
			"'len('", "'append('", "'int'", "'float64'", "'string'", "'bool'", "'rune'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "DOUBLE", "CHAR", "STRING", "BOOL", "BLANCOS", "ID_VARIABLE", 
			"COMENTARIOLINEA", "COMENTARIOMULTILINEA"
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
			setState(31);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052980042L) != 0)) {
				{
				{
				setState(28);
				instrucciones();
				}
				}
				setState(33);
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
	public static class PrintStmtContext extends InstruccionesContext {
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public PrintStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfStmtContext extends InstruccionesContext {
		public SIfContext sIf() {
			return getRuleContext(SIfContext.class,0);
		}
		public IfStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStmtContext extends InstruccionesContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
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
	public static class AsignStmtContext extends InstruccionesContext {
		public VarAsignContext varAsign() {
			return getRuleContext(VarAsignContext.class,0);
		}
		public AsignStmtContext(InstruccionesContext ctx) { copyFrom(ctx); }
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

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new PrintStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				imprimir();
				}
				break;
			case 2:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				expr(0);
				}
				break;
			case 3:
				_localctx = new IfStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				sIf();
				}
				break;
			case 4:
				_localctx = new SwitchInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				sSwitch();
				}
				break;
			case 5:
				_localctx = new SeccionInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(T__0);
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052980042L) != 0)) {
					{
					{
					setState(39);
					instrucciones();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(45);
				match(T__1);
				}
				break;
			case 6:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(46);
				sFor();
				}
				break;
			case 7:
				_localctx = new VarDeclSliceStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(47);
				varDclSlice();
				}
				break;
			case 8:
				_localctx = new AsignStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				varAsign();
				}
				break;
			case 9:
				_localctx = new VarDeclStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				varDcl();
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
			setState(52);
			match(T__2);
			setState(53);
			expr(0);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(54);
				match(T__3);
				setState(55);
				expr(0);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__4);
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
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new IfOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(T__5);
				setState(64);
				expr(0);
				setState(65);
				block();
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6) {
					{
					setState(66);
					match(T__6);
					setState(67);
					block();
					}
				}

				}
				break;
			case 2:
				_localctx = new IfAnidadoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(70);
				match(T__5);
				setState(71);
				expr(0);
				setState(72);
				block();
				setState(73);
				match(T__6);
				setState(74);
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
			setState(78);
			match(T__7);
			setState(79);
			expr(0);
			setState(80);
			match(T__0);
			setState(81);
			cases();
			setState(82);
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
			setState(103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				_localctx = new CaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(T__8);
				setState(85);
				expr(0);
				setState(86);
				match(T__9);
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052980042L) != 0)) {
					{
					{
					setState(87);
					instrucciones();
					}
					}
					setState(92);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8 || _la==T__10) {
					{
					setState(93);
					cases();
					}
				}

				}
				break;
			case T__10:
				_localctx = new DefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(T__10);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052980042L) != 0)) {
					{
					{
					setState(97);
					instrucciones();
					}
					}
					setState(102);
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
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__0);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052980042L) != 0)) {
				{
				{
				setState(106);
				instrucciones();
				}
				}
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new ForCondicionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(T__11);
				setState(115);
				expr(0);
				setState(116);
				block();
				}
				break;
			case 2:
				_localctx = new ForAsignacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(T__11);
				setState(119);
				varDcl();
				setState(120);
				match(T__12);
				setState(121);
				expr(0);
				setState(122);
				match(T__12);
				setState(123);
				varAsign();
				setState(124);
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
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new VarDclWithTypeAndValueContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(T__13);
				setState(129);
				match(ID_VARIABLE);
				setState(130);
				type();
				setState(131);
				match(T__14);
				setState(132);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarDclWithTypeOnlyContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(T__13);
				setState(135);
				match(ID_VARIABLE);
				setState(136);
				type();
				}
				break;
			case 3:
				_localctx = new VarDclWithInferenceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				match(ID_VARIABLE);
				setState(138);
				match(T__15);
				setState(139);
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SliceValoresContext(VarDclSliceContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceVacioContext extends VarDclSliceContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public SliceVacioContext(VarDclSliceContext ctx) { copyFrom(ctx); }
	}

	public final VarDclSliceContext varDclSlice() throws RecognitionException {
		VarDclSliceContext _localctx = new VarDclSliceContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_varDclSlice);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_VARIABLE:
				_localctx = new SliceValoresContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				match(ID_VARIABLE);
				setState(143);
				assign();
				setState(144);
				match(T__16);
				setState(145);
				type();
				setState(146);
				match(T__0);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 26748644052959232L) != 0)) {
					{
					setState(147);
					expr(0);
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(148);
						match(T__3);
						setState(149);
						expr(0);
						}
						}
						setState(154);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(157);
				match(T__1);
				}
				break;
			case T__13:
				_localctx = new SliceVacioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__13);
				setState(160);
				match(ID_VARIABLE);
				setState(161);
				match(T__16);
				setState(162);
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
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==T__14 || _la==T__15) ) {
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
		enterRule(_localctx, 22, RULE_varAsign);
		int _la;
		try {
			setState(182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				_localctx = new VarExprContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(ID_VARIABLE);
				setState(168);
				match(T__14);
				setState(169);
				expr(0);
				}
				break;
			case 2:
				_localctx = new VarAddContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				match(ID_VARIABLE);
				setState(171);
				((VarAddContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__17 || _la==T__18) ) {
					((VarAddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(172);
				expr(0);
				}
				break;
			case 3:
				_localctx = new VarIncContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(ID_VARIABLE);
				setState(174);
				((VarIncContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__19 || _la==T__20) ) {
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
				setState(175);
				match(ID_VARIABLE);
				setState(176);
				match(T__21);
				setState(177);
				expr(0);
				setState(178);
				match(T__22);
				setState(179);
				match(T__14);
				setState(180);
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
	public static class ArrayAccessSimpleContext extends ExprContext {
		public TerminalNode ID_VARIABLE() { return getToken(gramaticaParser.ID_VARIABLE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(185);
				match(T__23);
				setState(186);
				expr(19);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(T__24);
				setState(188);
				expr(18);
				}
				break;
			case 3:
				{
				_localctx = new IntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(INT);
				}
				break;
			case 4:
				{
				_localctx = new DoubleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(DOUBLE);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(192);
				match(BOOL);
				}
				break;
			case 7:
				{
				_localctx = new IdentifierContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193);
				match(ID_VARIABLE);
				}
				break;
			case 8:
				{
				_localctx = new CharContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(194);
				match(CHAR);
				}
				break;
			case 9:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(195);
				match(T__37);
				setState(196);
				expr(0);
				setState(197);
				match(T__4);
				}
				break;
			case 10:
				{
				_localctx = new ArrayAccessSimpleContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199);
				match(ID_VARIABLE);
				setState(200);
				match(T__21);
				setState(201);
				expr(0);
				setState(202);
				match(T__22);
				}
				break;
			case 11:
				{
				_localctx = new ArrayFindIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(204);
				match(T__38);
				setState(205);
				match(ID_VARIABLE);
				setState(206);
				match(T__3);
				setState(207);
				expr(0);
				setState(208);
				match(T__4);
				}
				break;
			case 12:
				{
				_localctx = new ArrayJoinContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(210);
				match(T__39);
				setState(211);
				match(ID_VARIABLE);
				setState(212);
				match(T__3);
				setState(213);
				expr(0);
				setState(214);
				match(T__4);
				}
				break;
			case 13:
				{
				_localctx = new ArrayLengthContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(216);
				match(T__40);
				setState(217);
				match(ID_VARIABLE);
				setState(218);
				match(T__4);
				}
				break;
			case 14:
				{
				_localctx = new ArrayAppendContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(T__41);
				setState(220);
				match(ID_VARIABLE);
				setState(221);
				match(T__3);
				setState(222);
				expr(0);
				setState(223);
				match(T__4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(242);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModuloContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(228);
						((MulDivModuloContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) ) {
							((MulDivModuloContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(229);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(231);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__28) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(232);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new MinorMajorEqualContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(234);
						((MinorMajorEqualContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
							((MinorMajorEqualContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(235);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new EqualsNotEqualsContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(237);
						((EqualsNotEqualsContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((EqualsNotEqualsContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(238);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new LogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(240);
						((LogicalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__35 || _la==T__36) ) {
							((LogicalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(241);
						expr(14);
						}
						break;
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
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
		enterRule(_localctx, 26, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 272678883688448L) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00018\u00fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0005\u0000\u001e\b\u0000\n\u0000"+
		"\f\u0000!\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001,\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00013\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u00029\b"+
		"\u0002\n\u0002\f\u0002<\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005Y\b\u0005\n\u0005\f\u0005\\\t\u0005\u0001\u0005\u0003\u0005_\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0005\u0005c\b\u0005\n\u0005\f\u0005f\t\u0005"+
		"\u0003\u0005h\b\u0005\u0001\u0006\u0001\u0006\u0005\u0006l\b\u0006\n\u0006"+
		"\f\u0006o\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u008d\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0005\t\u0097\b\t\n\t\f\t\u009a\t\t\u0003\t"+
		"\u009c\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00a4"+
		"\b\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00b7"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00e2\b\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00f3\b\f\n\f\f\f\u00f6"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0000\u0001\u0018\u000e\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000\t\u0001\u0000"+
		"\u000f\u0010\u0001\u0000\u0012\u0013\u0001\u0000\u0014\u0015\u0001\u0000"+
		"\u001a\u001c\u0002\u0000\u0018\u0018\u001d\u001d\u0001\u0000\u001e!\u0001"+
		"\u0000\"#\u0001\u0000$%\u0001\u0000+/\u0118\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u00022\u0001\u0000\u0000\u0000\u00044\u0001\u0000\u0000\u0000\u0006"+
		"L\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000"+
		"\u0000\fi\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010"+
		"\u008c\u0001\u0000\u0000\u0000\u0012\u00a3\u0001\u0000\u0000\u0000\u0014"+
		"\u00a5\u0001\u0000\u0000\u0000\u0016\u00b6\u0001\u0000\u0000\u0000\u0018"+
		"\u00e1\u0001\u0000\u0000\u0000\u001a\u00f7\u0001\u0000\u0000\u0000\u001c"+
		"\u001e\u0003\u0002\u0001\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001e"+
		"!\u0001\u0000\u0000\u0000\u001f\u001d\u0001\u0000\u0000\u0000\u001f \u0001"+
		"\u0000\u0000\u0000 \u0001\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000\"3\u0003\u0004\u0002\u0000#3\u0003\u0018\f\u0000$3\u0003\u0006"+
		"\u0003\u0000%3\u0003\b\u0004\u0000&*\u0005\u0001\u0000\u0000\')\u0003"+
		"\u0002\u0001\u0000(\'\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000"+
		"*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000"+
		"\u0000,*\u0001\u0000\u0000\u0000-3\u0005\u0002\u0000\u0000.3\u0003\u000e"+
		"\u0007\u0000/3\u0003\u0012\t\u000003\u0003\u0016\u000b\u000013\u0003\u0010"+
		"\b\u00002\"\u0001\u0000\u0000\u00002#\u0001\u0000\u0000\u00002$\u0001"+
		"\u0000\u0000\u00002%\u0001\u0000\u0000\u00002&\u0001\u0000\u0000\u0000"+
		"2.\u0001\u0000\u0000\u00002/\u0001\u0000\u0000\u000020\u0001\u0000\u0000"+
		"\u000021\u0001\u0000\u0000\u00003\u0003\u0001\u0000\u0000\u000045\u0005"+
		"\u0003\u0000\u00005:\u0003\u0018\f\u000067\u0005\u0004\u0000\u000079\u0003"+
		"\u0018\f\u000086\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;=\u0001\u0000\u0000\u0000"+
		"<:\u0001\u0000\u0000\u0000=>\u0005\u0005\u0000\u0000>\u0005\u0001\u0000"+
		"\u0000\u0000?@\u0005\u0006\u0000\u0000@A\u0003\u0018\f\u0000AD\u0003\f"+
		"\u0006\u0000BC\u0005\u0007\u0000\u0000CE\u0003\f\u0006\u0000DB\u0001\u0000"+
		"\u0000\u0000DE\u0001\u0000\u0000\u0000EM\u0001\u0000\u0000\u0000FG\u0005"+
		"\u0006\u0000\u0000GH\u0003\u0018\f\u0000HI\u0003\f\u0006\u0000IJ\u0005"+
		"\u0007\u0000\u0000JK\u0003\u0006\u0003\u0000KM\u0001\u0000\u0000\u0000"+
		"L?\u0001\u0000\u0000\u0000LF\u0001\u0000\u0000\u0000M\u0007\u0001\u0000"+
		"\u0000\u0000NO\u0005\b\u0000\u0000OP\u0003\u0018\f\u0000PQ\u0005\u0001"+
		"\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005\u0002\u0000\u0000S\t\u0001"+
		"\u0000\u0000\u0000TU\u0005\t\u0000\u0000UV\u0003\u0018\f\u0000VZ\u0005"+
		"\n\u0000\u0000WY\u0003\u0002\u0001\u0000XW\u0001\u0000\u0000\u0000Y\\"+
		"\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000"+
		"\u0000[^\u0001\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000]_\u0003\n"+
		"\u0005\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_h\u0001"+
		"\u0000\u0000\u0000`d\u0005\u000b\u0000\u0000ac\u0003\u0002\u0001\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gT\u0001\u0000\u0000\u0000g`\u0001\u0000\u0000\u0000h\u000b"+
		"\u0001\u0000\u0000\u0000im\u0005\u0001\u0000\u0000jl\u0003\u0002\u0001"+
		"\u0000kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000"+
		"\u0000\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000pq\u0005\u0002\u0000\u0000q\r\u0001\u0000\u0000\u0000"+
		"rs\u0005\f\u0000\u0000st\u0003\u0018\f\u0000tu\u0003\f\u0006\u0000u\u007f"+
		"\u0001\u0000\u0000\u0000vw\u0005\f\u0000\u0000wx\u0003\u0010\b\u0000x"+
		"y\u0005\r\u0000\u0000yz\u0003\u0018\f\u0000z{\u0005\r\u0000\u0000{|\u0003"+
		"\u0016\u000b\u0000|}\u0003\f\u0006\u0000}\u007f\u0001\u0000\u0000\u0000"+
		"~r\u0001\u0000\u0000\u0000~v\u0001\u0000\u0000\u0000\u007f\u000f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u000e\u0000\u0000\u0081\u0082\u0005"+
		"6\u0000\u0000\u0082\u0083\u0003\u001a\r\u0000\u0083\u0084\u0005\u000f"+
		"\u0000\u0000\u0084\u0085\u0003\u0018\f\u0000\u0085\u008d\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0005\u000e\u0000\u0000\u0087\u0088\u00056\u0000\u0000"+
		"\u0088\u008d\u0003\u001a\r\u0000\u0089\u008a\u00056\u0000\u0000\u008a"+
		"\u008b\u0005\u0010\u0000\u0000\u008b\u008d\u0003\u0018\f\u0000\u008c\u0080"+
		"\u0001\u0000\u0000\u0000\u008c\u0086\u0001\u0000\u0000\u0000\u008c\u0089"+
		"\u0001\u0000\u0000\u0000\u008d\u0011\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u00056\u0000\u0000\u008f\u0090\u0003\u0014\n\u0000\u0090\u0091\u0005"+
		"\u0011\u0000\u0000\u0091\u0092\u0003\u001a\r\u0000\u0092\u009b\u0005\u0001"+
		"\u0000\u0000\u0093\u0098\u0003\u0018\f\u0000\u0094\u0095\u0005\u0004\u0000"+
		"\u0000\u0095\u0097\u0003\u0018\f\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u0093\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005\u0002\u0000\u0000\u009e\u00a4\u0001\u0000\u0000\u0000"+
		"\u009f\u00a0\u0005\u000e\u0000\u0000\u00a0\u00a1\u00056\u0000\u0000\u00a1"+
		"\u00a2\u0005\u0011\u0000\u0000\u00a2\u00a4\u0003\u001a\r\u0000\u00a3\u008e"+
		"\u0001\u0000\u0000\u0000\u00a3\u009f\u0001\u0000\u0000\u0000\u00a4\u0013"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0007\u0000\u0000\u0000\u00a6\u0015"+
		"\u0001\u0000\u0000\u0000\u00a7\u00a8\u00056\u0000\u0000\u00a8\u00a9\u0005"+
		"\u000f\u0000\u0000\u00a9\u00b7\u0003\u0018\f\u0000\u00aa\u00ab\u00056"+
		"\u0000\u0000\u00ab\u00ac\u0007\u0001\u0000\u0000\u00ac\u00b7\u0003\u0018"+
		"\f\u0000\u00ad\u00ae\u00056\u0000\u0000\u00ae\u00b7\u0007\u0002\u0000"+
		"\u0000\u00af\u00b0\u00056\u0000\u0000\u00b0\u00b1\u0005\u0016\u0000\u0000"+
		"\u00b1\u00b2\u0003\u0018\f\u0000\u00b2\u00b3\u0005\u0017\u0000\u0000\u00b3"+
		"\u00b4\u0005\u000f\u0000\u0000\u00b4\u00b5\u0003\u0018\f\u0000\u00b5\u00b7"+
		"\u0001\u0000\u0000\u0000\u00b6\u00a7\u0001\u0000\u0000\u0000\u00b6\u00aa"+
		"\u0001\u0000\u0000\u0000\u00b6\u00ad\u0001\u0000\u0000\u0000\u00b6\u00af"+
		"\u0001\u0000\u0000\u0000\u00b7\u0017\u0001\u0000\u0000\u0000\u00b8\u00b9"+
		"\u0006\f\uffff\uffff\u0000\u00b9\u00ba\u0005\u0018\u0000\u0000\u00ba\u00e2"+
		"\u0003\u0018\f\u0013\u00bb\u00bc\u0005\u0019\u0000\u0000\u00bc\u00e2\u0003"+
		"\u0018\f\u0012\u00bd\u00e2\u00050\u0000\u0000\u00be\u00e2\u00051\u0000"+
		"\u0000\u00bf\u00e2\u00053\u0000\u0000\u00c0\u00e2\u00054\u0000\u0000\u00c1"+
		"\u00e2\u00056\u0000\u0000\u00c2\u00e2\u00052\u0000\u0000\u00c3\u00c4\u0005"+
		"&\u0000\u0000\u00c4\u00c5\u0003\u0018\f\u0000\u00c5\u00c6\u0005\u0005"+
		"\u0000\u0000\u00c6\u00e2\u0001\u0000\u0000\u0000\u00c7\u00c8\u00056\u0000"+
		"\u0000\u00c8\u00c9\u0005\u0016\u0000\u0000\u00c9\u00ca\u0003\u0018\f\u0000"+
		"\u00ca\u00cb\u0005\u0017\u0000\u0000\u00cb\u00e2\u0001\u0000\u0000\u0000"+
		"\u00cc\u00cd\u0005\'\u0000\u0000\u00cd\u00ce\u00056\u0000\u0000\u00ce"+
		"\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d0\u0003\u0018\f\u0000\u00d0\u00d1"+
		"\u0005\u0005\u0000\u0000\u00d1\u00e2\u0001\u0000\u0000\u0000\u00d2\u00d3"+
		"\u0005(\u0000\u0000\u00d3\u00d4\u00056\u0000\u0000\u00d4\u00d5\u0005\u0004"+
		"\u0000\u0000\u00d5\u00d6\u0003\u0018\f\u0000\u00d6\u00d7\u0005\u0005\u0000"+
		"\u0000\u00d7\u00e2\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005)\u0000\u0000"+
		"\u00d9\u00da\u00056\u0000\u0000\u00da\u00e2\u0005\u0005\u0000\u0000\u00db"+
		"\u00dc\u0005*\u0000\u0000\u00dc\u00dd\u00056\u0000\u0000\u00dd\u00de\u0005"+
		"\u0004\u0000\u0000\u00de\u00df\u0003\u0018\f\u0000\u00df\u00e0\u0005\u0005"+
		"\u0000\u0000\u00e0\u00e2\u0001\u0000\u0000\u0000\u00e1\u00b8\u0001\u0000"+
		"\u0000\u0000\u00e1\u00bb\u0001\u0000\u0000\u0000\u00e1\u00bd\u0001\u0000"+
		"\u0000\u0000\u00e1\u00be\u0001\u0000\u0000\u0000\u00e1\u00bf\u0001\u0000"+
		"\u0000\u0000\u00e1\u00c0\u0001\u0000\u0000\u0000\u00e1\u00c1\u0001\u0000"+
		"\u0000\u0000\u00e1\u00c2\u0001\u0000\u0000\u0000\u00e1\u00c3\u0001\u0000"+
		"\u0000\u0000\u00e1\u00c7\u0001\u0000\u0000\u0000\u00e1\u00cc\u0001\u0000"+
		"\u0000\u0000\u00e1\u00d2\u0001\u0000\u0000\u0000\u00e1\u00d8\u0001\u0000"+
		"\u0000\u0000\u00e1\u00db\u0001\u0000\u0000\u0000\u00e2\u00f4\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e4\n\u0011\u0000\u0000\u00e4\u00e5\u0007\u0003\u0000"+
		"\u0000\u00e5\u00f3\u0003\u0018\f\u0012\u00e6\u00e7\n\u0010\u0000\u0000"+
		"\u00e7\u00e8\u0007\u0004\u0000\u0000\u00e8\u00f3\u0003\u0018\f\u0011\u00e9"+
		"\u00ea\n\u000f\u0000\u0000\u00ea\u00eb\u0007\u0005\u0000\u0000\u00eb\u00f3"+
		"\u0003\u0018\f\u0010\u00ec\u00ed\n\u000e\u0000\u0000\u00ed\u00ee\u0007"+
		"\u0006\u0000\u0000\u00ee\u00f3\u0003\u0018\f\u000f\u00ef\u00f0\n\r\u0000"+
		"\u0000\u00f0\u00f1\u0007\u0007\u0000\u0000\u00f1\u00f3\u0003\u0018\f\u000e"+
		"\u00f2\u00e3\u0001\u0000\u0000\u0000\u00f2\u00e6\u0001\u0000\u0000\u0000"+
		"\u00f2\u00e9\u0001\u0000\u0000\u0000\u00f2\u00ec\u0001\u0000\u0000\u0000"+
		"\u00f2\u00ef\u0001\u0000\u0000\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f5\u0019\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0007\b\u0000\u0000\u00f8\u001b\u0001\u0000\u0000\u0000\u0014"+
		"\u001f*2:DLZ^dgm~\u008c\u0098\u009b\u00a3\u00b6\u00e1\u00f2\u00f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}