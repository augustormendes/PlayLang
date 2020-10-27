package br.ufscar.dc.compiladores.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import br.ufscar.dc.compiladores.services.PlayLangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPlayLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'WINDOW_SIZE:'", "','", "'globalEvent{'", "'}'", "'='", "'ZERO'", "';'", "'Scene'", "'('", "');'", "'<'", "'>'", "'IF'", "')'", "'{'", "'ELSE'", "'[['", "']]'", "'->'", "'Random'", "',['", "']'", "'PlaySound'", "'if'", "'else'", "'%'", "'-'", "'+'", "'*'", "'/'", "'=='", "'!='", "'>='", "'<='", "'true'", "'false'", "'&'", "'|'", "'!'", "'STRING'", "'INT'", "'BOOL'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int RULE_ID=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalPlayLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPlayLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPlayLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalPlayLang.g"; }



     	private PlayLangGrammarAccess grammarAccess;

        public InternalPlayLangParser(TokenStream input, PlayLangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Game";
       	}

       	@Override
       	protected PlayLangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleGame"
    // InternalPlayLang.g:64:1: entryRuleGame returns [EObject current=null] : iv_ruleGame= ruleGame EOF ;
    public final EObject entryRuleGame() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGame = null;


        try {
            // InternalPlayLang.g:64:45: (iv_ruleGame= ruleGame EOF )
            // InternalPlayLang.g:65:2: iv_ruleGame= ruleGame EOF
            {
             newCompositeNode(grammarAccess.getGameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGame=ruleGame();

            state._fsp--;

             current =iv_ruleGame; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGame"


    // $ANTLR start "ruleGame"
    // InternalPlayLang.g:71:1: ruleGame returns [EObject current=null] : (otherlv_0= 'WINDOW_SIZE:' ( (lv_linha_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_coluna_3_0= RULE_INT ) ) ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )* ( (lv_evento_5_0= ruleEventoGlobal ) )? ( (lv_cenas_6_0= ruleCena ) )* ) ;
    public final EObject ruleGame() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_linha_1_0=null;
        Token otherlv_2=null;
        Token lv_coluna_3_0=null;
        EObject lv_declaracoes_globais_4_0 = null;

        EObject lv_evento_5_0 = null;

        EObject lv_cenas_6_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:77:2: ( (otherlv_0= 'WINDOW_SIZE:' ( (lv_linha_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_coluna_3_0= RULE_INT ) ) ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )* ( (lv_evento_5_0= ruleEventoGlobal ) )? ( (lv_cenas_6_0= ruleCena ) )* ) )
            // InternalPlayLang.g:78:2: (otherlv_0= 'WINDOW_SIZE:' ( (lv_linha_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_coluna_3_0= RULE_INT ) ) ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )* ( (lv_evento_5_0= ruleEventoGlobal ) )? ( (lv_cenas_6_0= ruleCena ) )* )
            {
            // InternalPlayLang.g:78:2: (otherlv_0= 'WINDOW_SIZE:' ( (lv_linha_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_coluna_3_0= RULE_INT ) ) ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )* ( (lv_evento_5_0= ruleEventoGlobal ) )? ( (lv_cenas_6_0= ruleCena ) )* )
            // InternalPlayLang.g:79:3: otherlv_0= 'WINDOW_SIZE:' ( (lv_linha_1_0= RULE_INT ) ) otherlv_2= ',' ( (lv_coluna_3_0= RULE_INT ) ) ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )* ( (lv_evento_5_0= ruleEventoGlobal ) )? ( (lv_cenas_6_0= ruleCena ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getGameAccess().getWINDOW_SIZEKeyword_0());
            		
            // InternalPlayLang.g:83:3: ( (lv_linha_1_0= RULE_INT ) )
            // InternalPlayLang.g:84:4: (lv_linha_1_0= RULE_INT )
            {
            // InternalPlayLang.g:84:4: (lv_linha_1_0= RULE_INT )
            // InternalPlayLang.g:85:5: lv_linha_1_0= RULE_INT
            {
            lv_linha_1_0=(Token)match(input,RULE_INT,FOLLOW_4); 

            					newLeafNode(lv_linha_1_0, grammarAccess.getGameAccess().getLinhaINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"linha",
            						lv_linha_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getGameAccess().getCommaKeyword_2());
            		
            // InternalPlayLang.g:105:3: ( (lv_coluna_3_0= RULE_INT ) )
            // InternalPlayLang.g:106:4: (lv_coluna_3_0= RULE_INT )
            {
            // InternalPlayLang.g:106:4: (lv_coluna_3_0= RULE_INT )
            // InternalPlayLang.g:107:5: lv_coluna_3_0= RULE_INT
            {
            lv_coluna_3_0=(Token)match(input,RULE_INT,FOLLOW_5); 

            					newLeafNode(lv_coluna_3_0, grammarAccess.getGameAccess().getColunaINTTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGameRule());
            					}
            					setWithLastConsumed(
            						current,
            						"coluna",
            						lv_coluna_3_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalPlayLang.g:123:3: ( (lv_declaracoes_globais_4_0= ruleDeclaracao ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=50 && LA1_0<=52)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalPlayLang.g:124:4: (lv_declaracoes_globais_4_0= ruleDeclaracao )
            	    {
            	    // InternalPlayLang.g:124:4: (lv_declaracoes_globais_4_0= ruleDeclaracao )
            	    // InternalPlayLang.g:125:5: lv_declaracoes_globais_4_0= ruleDeclaracao
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getDeclaracoes_globaisDeclaracaoParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_declaracoes_globais_4_0=ruleDeclaracao();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"declaracoes_globais",
            	    						lv_declaracoes_globais_4_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Declaracao");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalPlayLang.g:142:3: ( (lv_evento_5_0= ruleEventoGlobal ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalPlayLang.g:143:4: (lv_evento_5_0= ruleEventoGlobal )
                    {
                    // InternalPlayLang.g:143:4: (lv_evento_5_0= ruleEventoGlobal )
                    // InternalPlayLang.g:144:5: lv_evento_5_0= ruleEventoGlobal
                    {

                    					newCompositeNode(grammarAccess.getGameAccess().getEventoEventoGlobalParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_6);
                    lv_evento_5_0=ruleEventoGlobal();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getGameRule());
                    					}
                    					set(
                    						current,
                    						"evento",
                    						lv_evento_5_0,
                    						"br.ufscar.dc.compiladores.PlayLang.EventoGlobal");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPlayLang.g:161:3: ( (lv_cenas_6_0= ruleCena ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==18) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalPlayLang.g:162:4: (lv_cenas_6_0= ruleCena )
            	    {
            	    // InternalPlayLang.g:162:4: (lv_cenas_6_0= ruleCena )
            	    // InternalPlayLang.g:163:5: lv_cenas_6_0= ruleCena
            	    {

            	    					newCompositeNode(grammarAccess.getGameAccess().getCenasCenaParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_cenas_6_0=ruleCena();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getGameRule());
            	    					}
            	    					add(
            	    						current,
            	    						"cenas",
            	    						lv_cenas_6_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Cena");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGame"


    // $ANTLR start "entryRuleEventoGlobal"
    // InternalPlayLang.g:184:1: entryRuleEventoGlobal returns [EObject current=null] : iv_ruleEventoGlobal= ruleEventoGlobal EOF ;
    public final EObject entryRuleEventoGlobal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventoGlobal = null;


        try {
            // InternalPlayLang.g:184:53: (iv_ruleEventoGlobal= ruleEventoGlobal EOF )
            // InternalPlayLang.g:185:2: iv_ruleEventoGlobal= ruleEventoGlobal EOF
            {
             newCompositeNode(grammarAccess.getEventoGlobalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventoGlobal=ruleEventoGlobal();

            state._fsp--;

             current =iv_ruleEventoGlobal; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEventoGlobal"


    // $ANTLR start "ruleEventoGlobal"
    // InternalPlayLang.g:191:1: ruleEventoGlobal returns [EObject current=null] : (otherlv_0= 'globalEvent{' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= '}' ) ;
    public final EObject ruleEventoGlobal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_comandos_1_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:197:2: ( (otherlv_0= 'globalEvent{' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= '}' ) )
            // InternalPlayLang.g:198:2: (otherlv_0= 'globalEvent{' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= '}' )
            {
            // InternalPlayLang.g:198:2: (otherlv_0= 'globalEvent{' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= '}' )
            // InternalPlayLang.g:199:3: otherlv_0= 'globalEvent{' ( (lv_comandos_1_0= ruleComando ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getEventoGlobalAccess().getGlobalEventKeyword_0());
            		
            // InternalPlayLang.g:203:3: ( (lv_comandos_1_0= ruleComando ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_ID||LA4_0==30) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalPlayLang.g:204:4: (lv_comandos_1_0= ruleComando )
            	    {
            	    // InternalPlayLang.g:204:4: (lv_comandos_1_0= ruleComando )
            	    // InternalPlayLang.g:205:5: lv_comandos_1_0= ruleComando
            	    {

            	    					newCompositeNode(grammarAccess.getEventoGlobalAccess().getComandosComandoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_comandos_1_0=ruleComando();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEventoGlobalRule());
            	    					}
            	    					add(
            	    						current,
            	    						"comandos",
            	    						lv_comandos_1_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Comando");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            otherlv_2=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getEventoGlobalAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEventoGlobal"


    // $ANTLR start "entryRuleDeclaracao"
    // InternalPlayLang.g:230:1: entryRuleDeclaracao returns [EObject current=null] : iv_ruleDeclaracao= ruleDeclaracao EOF ;
    public final EObject entryRuleDeclaracao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeclaracao = null;


        try {
            // InternalPlayLang.g:230:51: (iv_ruleDeclaracao= ruleDeclaracao EOF )
            // InternalPlayLang.g:231:2: iv_ruleDeclaracao= ruleDeclaracao EOF
            {
             newCompositeNode(grammarAccess.getDeclaracaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeclaracao=ruleDeclaracao();

            state._fsp--;

             current =iv_ruleDeclaracao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDeclaracao"


    // $ANTLR start "ruleDeclaracao"
    // InternalPlayLang.g:237:1: ruleDeclaracao returns [EObject current=null] : ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) ) otherlv_7= ';' ) ;
    public final EObject ruleDeclaracao() throws RecognitionException {
        EObject current = null;

        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_string_3_0=null;
        Token lv_int_5_0=null;
        Token lv_zero_6_0=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_tipo_0_0 = null;

        AntlrDatatypeRuleToken lv_bool_4_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:243:2: ( ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) ) otherlv_7= ';' ) )
            // InternalPlayLang.g:244:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) ) otherlv_7= ';' )
            {
            // InternalPlayLang.g:244:2: ( ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) ) otherlv_7= ';' )
            // InternalPlayLang.g:245:3: ( (lv_tipo_0_0= ruleTipo ) ) ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) ) otherlv_7= ';'
            {
            // InternalPlayLang.g:245:3: ( (lv_tipo_0_0= ruleTipo ) )
            // InternalPlayLang.g:246:4: (lv_tipo_0_0= ruleTipo )
            {
            // InternalPlayLang.g:246:4: (lv_tipo_0_0= ruleTipo )
            // InternalPlayLang.g:247:5: lv_tipo_0_0= ruleTipo
            {

            					newCompositeNode(grammarAccess.getDeclaracaoAccess().getTipoTipoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_9);
            lv_tipo_0_0=ruleTipo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
            					}
            					set(
            						current,
            						"tipo",
            						lv_tipo_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.Tipo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:264:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlayLang.g:265:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlayLang.g:265:4: (lv_name_1_0= RULE_ID )
            // InternalPlayLang.g:266:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeclaracaoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeclaracaoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getDeclaracaoAccess().getEqualsSignKeyword_2());
            		
            // InternalPlayLang.g:286:3: ( ( (lv_string_3_0= RULE_STRING ) ) | ( (lv_bool_4_0= ruleBOOL ) ) | ( (lv_int_5_0= RULE_INT ) ) | ( (lv_zero_6_0= 'ZERO' ) ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case 45:
            case 46:
                {
                alt5=2;
                }
                break;
            case RULE_INT:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalPlayLang.g:287:4: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPlayLang.g:287:4: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPlayLang.g:288:5: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPlayLang.g:288:5: (lv_string_3_0= RULE_STRING )
                    // InternalPlayLang.g:289:6: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

                    						newLeafNode(lv_string_3_0, grammarAccess.getDeclaracaoAccess().getStringSTRINGTerminalRuleCall_3_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:306:4: ( (lv_bool_4_0= ruleBOOL ) )
                    {
                    // InternalPlayLang.g:306:4: ( (lv_bool_4_0= ruleBOOL ) )
                    // InternalPlayLang.g:307:5: (lv_bool_4_0= ruleBOOL )
                    {
                    // InternalPlayLang.g:307:5: (lv_bool_4_0= ruleBOOL )
                    // InternalPlayLang.g:308:6: lv_bool_4_0= ruleBOOL
                    {

                    						newCompositeNode(grammarAccess.getDeclaracaoAccess().getBoolBOOLParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_bool_4_0=ruleBOOL();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDeclaracaoRule());
                    						}
                    						set(
                    							current,
                    							"bool",
                    							lv_bool_4_0,
                    							"br.ufscar.dc.compiladores.PlayLang.BOOL");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalPlayLang.g:326:4: ( (lv_int_5_0= RULE_INT ) )
                    {
                    // InternalPlayLang.g:326:4: ( (lv_int_5_0= RULE_INT ) )
                    // InternalPlayLang.g:327:5: (lv_int_5_0= RULE_INT )
                    {
                    // InternalPlayLang.g:327:5: (lv_int_5_0= RULE_INT )
                    // InternalPlayLang.g:328:6: lv_int_5_0= RULE_INT
                    {
                    lv_int_5_0=(Token)match(input,RULE_INT,FOLLOW_12); 

                    						newLeafNode(lv_int_5_0, grammarAccess.getDeclaracaoAccess().getIntINTTerminalRuleCall_3_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"int",
                    							lv_int_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalPlayLang.g:345:4: ( (lv_zero_6_0= 'ZERO' ) )
                    {
                    // InternalPlayLang.g:345:4: ( (lv_zero_6_0= 'ZERO' ) )
                    // InternalPlayLang.g:346:5: (lv_zero_6_0= 'ZERO' )
                    {
                    // InternalPlayLang.g:346:5: (lv_zero_6_0= 'ZERO' )
                    // InternalPlayLang.g:347:6: lv_zero_6_0= 'ZERO'
                    {
                    lv_zero_6_0=(Token)match(input,16,FOLLOW_12); 

                    						newLeafNode(lv_zero_6_0, grammarAccess.getDeclaracaoAccess().getZeroZEROKeyword_3_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDeclaracaoRule());
                    						}
                    						setWithLastConsumed(current, "zero", lv_zero_6_0, "ZERO");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getDeclaracaoAccess().getSemicolonKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDeclaracao"


    // $ANTLR start "entryRuleCena"
    // InternalPlayLang.g:368:1: entryRuleCena returns [EObject current=null] : iv_ruleCena= ruleCena EOF ;
    public final EObject entryRuleCena() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCena = null;


        try {
            // InternalPlayLang.g:368:45: (iv_ruleCena= ruleCena EOF )
            // InternalPlayLang.g:369:2: iv_ruleCena= ruleCena EOF
            {
             newCompositeNode(grammarAccess.getCenaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCena=ruleCena();

            state._fsp--;

             current =iv_ruleCena; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCena"


    // $ANTLR start "ruleCena"
    // InternalPlayLang.g:375:1: ruleCena returns [EObject current=null] : (otherlv_0= 'Scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_textos_3_0= ruleTexto ) )+ ( (lv_imagem_4_0= ruleImagem ) )? ( (lv_sound_5_0= rulePlaySound ) )? ( (lv_escolhas_6_0= ruleEscolhas ) )+ otherlv_7= ');' ) ;
    public final EObject ruleCena() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_7=null;
        EObject lv_textos_3_0 = null;

        EObject lv_imagem_4_0 = null;

        EObject lv_sound_5_0 = null;

        EObject lv_escolhas_6_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:381:2: ( (otherlv_0= 'Scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_textos_3_0= ruleTexto ) )+ ( (lv_imagem_4_0= ruleImagem ) )? ( (lv_sound_5_0= rulePlaySound ) )? ( (lv_escolhas_6_0= ruleEscolhas ) )+ otherlv_7= ');' ) )
            // InternalPlayLang.g:382:2: (otherlv_0= 'Scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_textos_3_0= ruleTexto ) )+ ( (lv_imagem_4_0= ruleImagem ) )? ( (lv_sound_5_0= rulePlaySound ) )? ( (lv_escolhas_6_0= ruleEscolhas ) )+ otherlv_7= ');' )
            {
            // InternalPlayLang.g:382:2: (otherlv_0= 'Scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_textos_3_0= ruleTexto ) )+ ( (lv_imagem_4_0= ruleImagem ) )? ( (lv_sound_5_0= rulePlaySound ) )? ( (lv_escolhas_6_0= ruleEscolhas ) )+ otherlv_7= ');' )
            // InternalPlayLang.g:383:3: otherlv_0= 'Scene' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_textos_3_0= ruleTexto ) )+ ( (lv_imagem_4_0= ruleImagem ) )? ( (lv_sound_5_0= rulePlaySound ) )? ( (lv_escolhas_6_0= ruleEscolhas ) )+ otherlv_7= ');'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getCenaAccess().getSceneKeyword_0());
            		
            // InternalPlayLang.g:387:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalPlayLang.g:388:4: (lv_name_1_0= RULE_ID )
            {
            // InternalPlayLang.g:388:4: (lv_name_1_0= RULE_ID )
            // InternalPlayLang.g:389:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCenaAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCenaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getCenaAccess().getLeftParenthesisKeyword_2());
            		
            // InternalPlayLang.g:409:3: ( (lv_textos_3_0= ruleTexto ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalPlayLang.g:410:4: (lv_textos_3_0= ruleTexto )
            	    {
            	    // InternalPlayLang.g:410:4: (lv_textos_3_0= ruleTexto )
            	    // InternalPlayLang.g:411:5: lv_textos_3_0= ruleTexto
            	    {

            	    					newCompositeNode(grammarAccess.getCenaAccess().getTextosTextoParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_15);
            	    lv_textos_3_0=ruleTexto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCenaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"textos",
            	    						lv_textos_3_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Texto");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // InternalPlayLang.g:428:3: ( (lv_imagem_4_0= ruleImagem ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==21) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalPlayLang.g:429:4: (lv_imagem_4_0= ruleImagem )
                    {
                    // InternalPlayLang.g:429:4: (lv_imagem_4_0= ruleImagem )
                    // InternalPlayLang.g:430:5: lv_imagem_4_0= ruleImagem
                    {

                    					newCompositeNode(grammarAccess.getCenaAccess().getImagemImagemParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_imagem_4_0=ruleImagem();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCenaRule());
                    					}
                    					set(
                    						current,
                    						"imagem",
                    						lv_imagem_4_0,
                    						"br.ufscar.dc.compiladores.PlayLang.Imagem");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPlayLang.g:447:3: ( (lv_sound_5_0= rulePlaySound ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==33) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalPlayLang.g:448:4: (lv_sound_5_0= rulePlaySound )
                    {
                    // InternalPlayLang.g:448:4: (lv_sound_5_0= rulePlaySound )
                    // InternalPlayLang.g:449:5: lv_sound_5_0= rulePlaySound
                    {

                    					newCompositeNode(grammarAccess.getCenaAccess().getSoundPlaySoundParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_16);
                    lv_sound_5_0=rulePlaySound();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getCenaRule());
                    					}
                    					set(
                    						current,
                    						"sound",
                    						lv_sound_5_0,
                    						"br.ufscar.dc.compiladores.PlayLang.PlaySound");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPlayLang.g:466:3: ( (lv_escolhas_6_0= ruleEscolhas ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==23||LA9_0==27) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalPlayLang.g:467:4: (lv_escolhas_6_0= ruleEscolhas )
            	    {
            	    // InternalPlayLang.g:467:4: (lv_escolhas_6_0= ruleEscolhas )
            	    // InternalPlayLang.g:468:5: lv_escolhas_6_0= ruleEscolhas
            	    {

            	    					newCompositeNode(grammarAccess.getCenaAccess().getEscolhasEscolhasParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_17);
            	    lv_escolhas_6_0=ruleEscolhas();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCenaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"escolhas",
            	    						lv_escolhas_6_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Escolhas");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getCenaAccess().getRightParenthesisSemicolonKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCena"


    // $ANTLR start "entryRuleImagem"
    // InternalPlayLang.g:493:1: entryRuleImagem returns [EObject current=null] : iv_ruleImagem= ruleImagem EOF ;
    public final EObject entryRuleImagem() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImagem = null;


        try {
            // InternalPlayLang.g:493:47: (iv_ruleImagem= ruleImagem EOF )
            // InternalPlayLang.g:494:2: iv_ruleImagem= ruleImagem EOF
            {
             newCompositeNode(grammarAccess.getImagemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImagem=ruleImagem();

            state._fsp--;

             current =iv_ruleImagem; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImagem"


    // $ANTLR start "ruleImagem"
    // InternalPlayLang.g:500:1: ruleImagem returns [EObject current=null] : (otherlv_0= '<' ( (lv_caminho_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )? otherlv_6= '>' ) ;
    public final EObject ruleImagem() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_caminho_1_0=null;
        Token otherlv_2=null;
        Token lv_linha_3_0=null;
        Token otherlv_4=null;
        Token lv_coluna_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalPlayLang.g:506:2: ( (otherlv_0= '<' ( (lv_caminho_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )? otherlv_6= '>' ) )
            // InternalPlayLang.g:507:2: (otherlv_0= '<' ( (lv_caminho_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )? otherlv_6= '>' )
            {
            // InternalPlayLang.g:507:2: (otherlv_0= '<' ( (lv_caminho_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )? otherlv_6= '>' )
            // InternalPlayLang.g:508:3: otherlv_0= '<' ( (lv_caminho_1_0= RULE_STRING ) ) (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )? otherlv_6= '>'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getImagemAccess().getLessThanSignKeyword_0());
            		
            // InternalPlayLang.g:512:3: ( (lv_caminho_1_0= RULE_STRING ) )
            // InternalPlayLang.g:513:4: (lv_caminho_1_0= RULE_STRING )
            {
            // InternalPlayLang.g:513:4: (lv_caminho_1_0= RULE_STRING )
            // InternalPlayLang.g:514:5: lv_caminho_1_0= RULE_STRING
            {
            lv_caminho_1_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_caminho_1_0, grammarAccess.getImagemAccess().getCaminhoSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getImagemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"caminho",
            						lv_caminho_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalPlayLang.g:530:3: (otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==12) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalPlayLang.g:531:4: otherlv_2= ',' ( (lv_linha_3_0= RULE_INT ) ) otherlv_4= ',' ( (lv_coluna_5_0= RULE_INT ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getImagemAccess().getCommaKeyword_2_0());
                    			
                    // InternalPlayLang.g:535:4: ( (lv_linha_3_0= RULE_INT ) )
                    // InternalPlayLang.g:536:5: (lv_linha_3_0= RULE_INT )
                    {
                    // InternalPlayLang.g:536:5: (lv_linha_3_0= RULE_INT )
                    // InternalPlayLang.g:537:6: lv_linha_3_0= RULE_INT
                    {
                    lv_linha_3_0=(Token)match(input,RULE_INT,FOLLOW_4); 

                    						newLeafNode(lv_linha_3_0, grammarAccess.getImagemAccess().getLinhaINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImagemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"linha",
                    							lv_linha_3_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,12,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getImagemAccess().getCommaKeyword_2_2());
                    			
                    // InternalPlayLang.g:557:4: ( (lv_coluna_5_0= RULE_INT ) )
                    // InternalPlayLang.g:558:5: (lv_coluna_5_0= RULE_INT )
                    {
                    // InternalPlayLang.g:558:5: (lv_coluna_5_0= RULE_INT )
                    // InternalPlayLang.g:559:6: lv_coluna_5_0= RULE_INT
                    {
                    lv_coluna_5_0=(Token)match(input,RULE_INT,FOLLOW_20); 

                    						newLeafNode(lv_coluna_5_0, grammarAccess.getImagemAccess().getColunaINTTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getImagemRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"coluna",
                    							lv_coluna_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getImagemAccess().getGreaterThanSignKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImagem"


    // $ANTLR start "entryRuleTexto"
    // InternalPlayLang.g:584:1: entryRuleTexto returns [EObject current=null] : iv_ruleTexto= ruleTexto EOF ;
    public final EObject entryRuleTexto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTexto = null;


        try {
            // InternalPlayLang.g:584:46: (iv_ruleTexto= ruleTexto EOF )
            // InternalPlayLang.g:585:2: iv_ruleTexto= ruleTexto EOF
            {
             newCompositeNode(grammarAccess.getTextoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTexto=ruleTexto();

            state._fsp--;

             current =iv_ruleTexto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTexto"


    // $ANTLR start "ruleTexto"
    // InternalPlayLang.g:591:1: ruleTexto returns [EObject current=null] : ( ( (lv_text_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleTexto() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalPlayLang.g:597:2: ( ( ( (lv_text_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // InternalPlayLang.g:598:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalPlayLang.g:598:2: ( ( (lv_text_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalPlayLang.g:599:3: ( (lv_text_0_0= RULE_STRING ) )
                    {
                    // InternalPlayLang.g:599:3: ( (lv_text_0_0= RULE_STRING ) )
                    // InternalPlayLang.g:600:4: (lv_text_0_0= RULE_STRING )
                    {
                    // InternalPlayLang.g:600:4: (lv_text_0_0= RULE_STRING )
                    // InternalPlayLang.g:601:5: lv_text_0_0= RULE_STRING
                    {
                    lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_text_0_0, grammarAccess.getTextoAccess().getTextSTRINGTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextoRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"text",
                    						lv_text_0_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:618:3: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPlayLang.g:618:3: ( (otherlv_1= RULE_ID ) )
                    // InternalPlayLang.g:619:4: (otherlv_1= RULE_ID )
                    {
                    // InternalPlayLang.g:619:4: (otherlv_1= RULE_ID )
                    // InternalPlayLang.g:620:5: otherlv_1= RULE_ID
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getTextoRule());
                    					}
                    				
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(otherlv_1, grammarAccess.getTextoAccess().getVarDeclaracaoCrossReference_1_0());
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTexto"


    // $ANTLR start "entryRuleEscolhas"
    // InternalPlayLang.g:635:1: entryRuleEscolhas returns [EObject current=null] : iv_ruleEscolhas= ruleEscolhas EOF ;
    public final EObject entryRuleEscolhas() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscolhas = null;


        try {
            // InternalPlayLang.g:635:49: (iv_ruleEscolhas= ruleEscolhas EOF )
            // InternalPlayLang.g:636:2: iv_ruleEscolhas= ruleEscolhas EOF
            {
             newCompositeNode(grammarAccess.getEscolhasRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscolhas=ruleEscolhas();

            state._fsp--;

             current =iv_ruleEscolhas; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscolhas"


    // $ANTLR start "ruleEscolhas"
    // InternalPlayLang.g:642:1: ruleEscolhas returns [EObject current=null] : ( ( (lv_singleChoice_0_0= ruleEscolha ) ) | ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? ) ) ;
    public final EObject ruleEscolhas() throws RecognitionException {
        EObject current = null;

        Token lv_hasIf_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_hasElse_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_singleChoice_0_0 = null;

        EObject lv_expressaoIf_3_0 = null;

        EObject lv_escolhasIF_6_0 = null;

        EObject lv_escolhasELSE_10_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:648:2: ( ( ( (lv_singleChoice_0_0= ruleEscolha ) ) | ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? ) ) )
            // InternalPlayLang.g:649:2: ( ( (lv_singleChoice_0_0= ruleEscolha ) ) | ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? ) )
            {
            // InternalPlayLang.g:649:2: ( ( (lv_singleChoice_0_0= ruleEscolha ) ) | ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            else if ( (LA15_0==23) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalPlayLang.g:650:3: ( (lv_singleChoice_0_0= ruleEscolha ) )
                    {
                    // InternalPlayLang.g:650:3: ( (lv_singleChoice_0_0= ruleEscolha ) )
                    // InternalPlayLang.g:651:4: (lv_singleChoice_0_0= ruleEscolha )
                    {
                    // InternalPlayLang.g:651:4: (lv_singleChoice_0_0= ruleEscolha )
                    // InternalPlayLang.g:652:5: lv_singleChoice_0_0= ruleEscolha
                    {

                    					newCompositeNode(grammarAccess.getEscolhasAccess().getSingleChoiceEscolhaParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_singleChoice_0_0=ruleEscolha();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getEscolhasRule());
                    					}
                    					set(
                    						current,
                    						"singleChoice",
                    						lv_singleChoice_0_0,
                    						"br.ufscar.dc.compiladores.PlayLang.Escolha");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:670:3: ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? )
                    {
                    // InternalPlayLang.g:670:3: ( ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )? )
                    // InternalPlayLang.g:671:4: ( (lv_hasIf_1_0= 'IF' ) ) otherlv_2= '(' ( (lv_expressaoIf_3_0= ruleExpressao ) ) otherlv_4= ')' otherlv_5= '{' ( (lv_escolhasIF_6_0= ruleEscolhas ) )+ otherlv_7= '}' ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )?
                    {
                    // InternalPlayLang.g:671:4: ( (lv_hasIf_1_0= 'IF' ) )
                    // InternalPlayLang.g:672:5: (lv_hasIf_1_0= 'IF' )
                    {
                    // InternalPlayLang.g:672:5: (lv_hasIf_1_0= 'IF' )
                    // InternalPlayLang.g:673:6: lv_hasIf_1_0= 'IF'
                    {
                    lv_hasIf_1_0=(Token)match(input,23,FOLLOW_13); 

                    						newLeafNode(lv_hasIf_1_0, grammarAccess.getEscolhasAccess().getHasIfIFKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEscolhasRule());
                    						}
                    						setWithLastConsumed(current, "hasIf", lv_hasIf_1_0 != null, "IF");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,19,FOLLOW_21); 

                    				newLeafNode(otherlv_2, grammarAccess.getEscolhasAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalPlayLang.g:689:4: ( (lv_expressaoIf_3_0= ruleExpressao ) )
                    // InternalPlayLang.g:690:5: (lv_expressaoIf_3_0= ruleExpressao )
                    {
                    // InternalPlayLang.g:690:5: (lv_expressaoIf_3_0= ruleExpressao )
                    // InternalPlayLang.g:691:6: lv_expressaoIf_3_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getEscolhasAccess().getExpressaoIfExpressaoParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_expressaoIf_3_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEscolhasRule());
                    						}
                    						set(
                    							current,
                    							"expressaoIf",
                    							lv_expressaoIf_3_0,
                    							"br.ufscar.dc.compiladores.PlayLang.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,24,FOLLOW_23); 

                    				newLeafNode(otherlv_4, grammarAccess.getEscolhasAccess().getRightParenthesisKeyword_1_3());
                    			
                    otherlv_5=(Token)match(input,25,FOLLOW_16); 

                    				newLeafNode(otherlv_5, grammarAccess.getEscolhasAccess().getLeftCurlyBracketKeyword_1_4());
                    			
                    // InternalPlayLang.g:716:4: ( (lv_escolhasIF_6_0= ruleEscolhas ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==23||LA12_0==27) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalPlayLang.g:717:5: (lv_escolhasIF_6_0= ruleEscolhas )
                    	    {
                    	    // InternalPlayLang.g:717:5: (lv_escolhasIF_6_0= ruleEscolhas )
                    	    // InternalPlayLang.g:718:6: lv_escolhasIF_6_0= ruleEscolhas
                    	    {

                    	    						newCompositeNode(grammarAccess.getEscolhasAccess().getEscolhasIFEscolhasParserRuleCall_1_5_0());
                    	    					
                    	    pushFollow(FOLLOW_24);
                    	    lv_escolhasIF_6_0=ruleEscolhas();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEscolhasRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"escolhasIF",
                    	    							lv_escolhasIF_6_0,
                    	    							"br.ufscar.dc.compiladores.PlayLang.Escolhas");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_25); 

                    				newLeafNode(otherlv_7, grammarAccess.getEscolhasAccess().getRightCurlyBracketKeyword_1_6());
                    			
                    // InternalPlayLang.g:739:4: ( ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==26) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // InternalPlayLang.g:740:5: ( (lv_hasElse_8_0= 'ELSE' ) ) otherlv_9= '{' ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+ otherlv_11= '}'
                            {
                            // InternalPlayLang.g:740:5: ( (lv_hasElse_8_0= 'ELSE' ) )
                            // InternalPlayLang.g:741:6: (lv_hasElse_8_0= 'ELSE' )
                            {
                            // InternalPlayLang.g:741:6: (lv_hasElse_8_0= 'ELSE' )
                            // InternalPlayLang.g:742:7: lv_hasElse_8_0= 'ELSE'
                            {
                            lv_hasElse_8_0=(Token)match(input,26,FOLLOW_23); 

                            							newLeafNode(lv_hasElse_8_0, grammarAccess.getEscolhasAccess().getHasElseELSEKeyword_1_7_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEscolhasRule());
                            							}
                            							setWithLastConsumed(current, "hasElse", lv_hasElse_8_0 != null, "ELSE");
                            						

                            }


                            }

                            otherlv_9=(Token)match(input,25,FOLLOW_16); 

                            					newLeafNode(otherlv_9, grammarAccess.getEscolhasAccess().getLeftCurlyBracketKeyword_1_7_1());
                            				
                            // InternalPlayLang.g:758:5: ( (lv_escolhasELSE_10_0= ruleEscolhas ) )+
                            int cnt13=0;
                            loop13:
                            do {
                                int alt13=2;
                                int LA13_0 = input.LA(1);

                                if ( (LA13_0==23||LA13_0==27) ) {
                                    alt13=1;
                                }


                                switch (alt13) {
                            	case 1 :
                            	    // InternalPlayLang.g:759:6: (lv_escolhasELSE_10_0= ruleEscolhas )
                            	    {
                            	    // InternalPlayLang.g:759:6: (lv_escolhasELSE_10_0= ruleEscolhas )
                            	    // InternalPlayLang.g:760:7: lv_escolhasELSE_10_0= ruleEscolhas
                            	    {

                            	    							newCompositeNode(grammarAccess.getEscolhasAccess().getEscolhasELSEEscolhasParserRuleCall_1_7_2_0());
                            	    						
                            	    pushFollow(FOLLOW_24);
                            	    lv_escolhasELSE_10_0=ruleEscolhas();

                            	    state._fsp--;


                            	    							if (current==null) {
                            	    								current = createModelElementForParent(grammarAccess.getEscolhasRule());
                            	    							}
                            	    							add(
                            	    								current,
                            	    								"escolhasELSE",
                            	    								lv_escolhasELSE_10_0,
                            	    								"br.ufscar.dc.compiladores.PlayLang.Escolhas");
                            	    							afterParserOrEnumRuleCall();
                            	    						

                            	    }


                            	    }
                            	    break;

                            	default :
                            	    if ( cnt13 >= 1 ) break loop13;
                                        EarlyExitException eee =
                                            new EarlyExitException(13, input);
                                        throw eee;
                                }
                                cnt13++;
                            } while (true);

                            otherlv_11=(Token)match(input,14,FOLLOW_2); 

                            					newLeafNode(otherlv_11, grammarAccess.getEscolhasAccess().getRightCurlyBracketKeyword_1_7_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscolhas"


    // $ANTLR start "entryRuleEscolha"
    // InternalPlayLang.g:787:1: entryRuleEscolha returns [EObject current=null] : iv_ruleEscolha= ruleEscolha EOF ;
    public final EObject entryRuleEscolha() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEscolha = null;


        try {
            // InternalPlayLang.g:787:48: (iv_ruleEscolha= ruleEscolha EOF )
            // InternalPlayLang.g:788:2: iv_ruleEscolha= ruleEscolha EOF
            {
             newCompositeNode(grammarAccess.getEscolhaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEscolha=ruleEscolha();

            state._fsp--;

             current =iv_ruleEscolha; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEscolha"


    // $ANTLR start "ruleEscolha"
    // InternalPlayLang.g:794:1: ruleEscolha returns [EObject current=null] : (otherlv_0= '[[' ( (lv_textos_1_0= ruleTexto ) )+ (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )? otherlv_5= ']]' ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) ) ) ;
    public final EObject ruleEscolha() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_textos_1_0 = null;

        EObject lv_comando_3_0 = null;

        EObject lv_if_6_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:800:2: ( (otherlv_0= '[[' ( (lv_textos_1_0= ruleTexto ) )+ (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )? otherlv_5= ']]' ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) ) ) )
            // InternalPlayLang.g:801:2: (otherlv_0= '[[' ( (lv_textos_1_0= ruleTexto ) )+ (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )? otherlv_5= ']]' ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) ) )
            {
            // InternalPlayLang.g:801:2: (otherlv_0= '[[' ( (lv_textos_1_0= ruleTexto ) )+ (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )? otherlv_5= ']]' ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) ) )
            // InternalPlayLang.g:802:3: otherlv_0= '[[' ( (lv_textos_1_0= ruleTexto ) )+ (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )? otherlv_5= ']]' ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getEscolhaAccess().getLeftSquareBracketLeftSquareBracketKeyword_0());
            		
            // InternalPlayLang.g:806:3: ( (lv_textos_1_0= ruleTexto ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_STRING)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalPlayLang.g:807:4: (lv_textos_1_0= ruleTexto )
            	    {
            	    // InternalPlayLang.g:807:4: (lv_textos_1_0= ruleTexto )
            	    // InternalPlayLang.g:808:5: lv_textos_1_0= ruleTexto
            	    {

            	    					newCompositeNode(grammarAccess.getEscolhaAccess().getTextosTextoParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_26);
            	    lv_textos_1_0=ruleTexto();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEscolhaRule());
            	    					}
            	    					add(
            	    						current,
            	    						"textos",
            	    						lv_textos_1_0,
            	    						"br.ufscar.dc.compiladores.PlayLang.Texto");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);

            // InternalPlayLang.g:825:3: (otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==19) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalPlayLang.g:826:4: otherlv_2= '(' ( (lv_comando_3_0= ruleComando ) )+ otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_7); 

                    				newLeafNode(otherlv_2, grammarAccess.getEscolhaAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalPlayLang.g:830:4: ( (lv_comando_3_0= ruleComando ) )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==RULE_ID||LA17_0==30) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalPlayLang.g:831:5: (lv_comando_3_0= ruleComando )
                    	    {
                    	    // InternalPlayLang.g:831:5: (lv_comando_3_0= ruleComando )
                    	    // InternalPlayLang.g:832:6: lv_comando_3_0= ruleComando
                    	    {

                    	    						newCompositeNode(grammarAccess.getEscolhaAccess().getComandoComandoParserRuleCall_2_1_0());
                    	    					
                    	    pushFollow(FOLLOW_27);
                    	    lv_comando_3_0=ruleComando();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEscolhaRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"comando",
                    	    							lv_comando_3_0,
                    	    							"br.ufscar.dc.compiladores.PlayLang.Comando");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);

                    otherlv_4=(Token)match(input,24,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getEscolhaAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,28,FOLLOW_29); 

            			newLeafNode(otherlv_5, grammarAccess.getEscolhaAccess().getRightSquareBracketRightSquareBracketKeyword_3());
            		
            // InternalPlayLang.g:858:3: ( ( (lv_if_6_0= ruleIf ) ) | (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==34) ) {
                alt19=1;
            }
            else if ( (LA19_0==29) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalPlayLang.g:859:4: ( (lv_if_6_0= ruleIf ) )
                    {
                    // InternalPlayLang.g:859:4: ( (lv_if_6_0= ruleIf ) )
                    // InternalPlayLang.g:860:5: (lv_if_6_0= ruleIf )
                    {
                    // InternalPlayLang.g:860:5: (lv_if_6_0= ruleIf )
                    // InternalPlayLang.g:861:6: lv_if_6_0= ruleIf
                    {

                    						newCompositeNode(grammarAccess.getEscolhaAccess().getIfIfParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_if_6_0=ruleIf();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEscolhaRule());
                    						}
                    						set(
                    							current,
                    							"if",
                    							lv_if_6_0,
                    							"br.ufscar.dc.compiladores.PlayLang.If");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:879:4: (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )
                    {
                    // InternalPlayLang.g:879:4: (otherlv_7= '->' ( (otherlv_8= RULE_ID ) ) )
                    // InternalPlayLang.g:880:5: otherlv_7= '->' ( (otherlv_8= RULE_ID ) )
                    {
                    otherlv_7=(Token)match(input,29,FOLLOW_9); 

                    					newLeafNode(otherlv_7, grammarAccess.getEscolhaAccess().getHyphenMinusGreaterThanSignKeyword_4_1_0());
                    				
                    // InternalPlayLang.g:884:5: ( (otherlv_8= RULE_ID ) )
                    // InternalPlayLang.g:885:6: (otherlv_8= RULE_ID )
                    {
                    // InternalPlayLang.g:885:6: (otherlv_8= RULE_ID )
                    // InternalPlayLang.g:886:7: otherlv_8= RULE_ID
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getEscolhaRule());
                    							}
                    						
                    otherlv_8=(Token)match(input,RULE_ID,FOLLOW_2); 

                    							newLeafNode(otherlv_8, grammarAccess.getEscolhaAccess().getIdCenaCrossReference_4_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEscolha"


    // $ANTLR start "entryRuleComando"
    // InternalPlayLang.g:903:1: entryRuleComando returns [EObject current=null] : iv_ruleComando= ruleComando EOF ;
    public final EObject entryRuleComando() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComando = null;


        try {
            // InternalPlayLang.g:903:48: (iv_ruleComando= ruleComando EOF )
            // InternalPlayLang.g:904:2: iv_ruleComando= ruleComando EOF
            {
             newCompositeNode(grammarAccess.getComandoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComando=ruleComando();

            state._fsp--;

             current =iv_ruleComando; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComando"


    // $ANTLR start "ruleComando"
    // InternalPlayLang.g:910:1: ruleComando returns [EObject current=null] : (this_Atribuicao_0= ruleAtribuicao | this_Random_1= ruleRandom ) ;
    public final EObject ruleComando() throws RecognitionException {
        EObject current = null;

        EObject this_Atribuicao_0 = null;

        EObject this_Random_1 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:916:2: ( (this_Atribuicao_0= ruleAtribuicao | this_Random_1= ruleRandom ) )
            // InternalPlayLang.g:917:2: (this_Atribuicao_0= ruleAtribuicao | this_Random_1= ruleRandom )
            {
            // InternalPlayLang.g:917:2: (this_Atribuicao_0= ruleAtribuicao | this_Random_1= ruleRandom )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            else if ( (LA20_0==30) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalPlayLang.g:918:3: this_Atribuicao_0= ruleAtribuicao
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getAtribuicaoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Atribuicao_0=ruleAtribuicao();

                    state._fsp--;


                    			current = this_Atribuicao_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:927:3: this_Random_1= ruleRandom
                    {

                    			newCompositeNode(grammarAccess.getComandoAccess().getRandomParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Random_1=ruleRandom();

                    state._fsp--;


                    			current = this_Random_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComando"


    // $ANTLR start "entryRuleRandom"
    // InternalPlayLang.g:939:1: entryRuleRandom returns [EObject current=null] : iv_ruleRandom= ruleRandom EOF ;
    public final EObject entryRuleRandom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom = null;


        try {
            // InternalPlayLang.g:939:47: (iv_ruleRandom= ruleRandom EOF )
            // InternalPlayLang.g:940:2: iv_ruleRandom= ruleRandom EOF
            {
             newCompositeNode(grammarAccess.getRandomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandom=ruleRandom();

            state._fsp--;

             current =iv_ruleRandom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandom"


    // $ANTLR start "ruleRandom"
    // InternalPlayLang.g:946:1: ruleRandom returns [EObject current=null] : (otherlv_0= 'Random' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',[' ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) ) otherlv_13= ']' otherlv_14= ')' ) ;
    public final EObject ruleRandom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_possibilidadesInt_4_0=null;
        Token otherlv_5=null;
        Token lv_possibilidadesInt_6_0=null;
        Token lv_possibilidadesString_7_0=null;
        Token otherlv_8=null;
        Token lv_possibilidadesString_9_0=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_possibilidadesBool_10_0 = null;

        AntlrDatatypeRuleToken lv_possibilidadesBool_12_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:952:2: ( (otherlv_0= 'Random' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',[' ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) ) otherlv_13= ']' otherlv_14= ')' ) )
            // InternalPlayLang.g:953:2: (otherlv_0= 'Random' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',[' ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) ) otherlv_13= ']' otherlv_14= ')' )
            {
            // InternalPlayLang.g:953:2: (otherlv_0= 'Random' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',[' ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) ) otherlv_13= ']' otherlv_14= ')' )
            // InternalPlayLang.g:954:3: otherlv_0= 'Random' otherlv_1= '(' ( (otherlv_2= RULE_ID ) ) otherlv_3= ',[' ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) ) otherlv_13= ']' otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getRandomAccess().getRandomKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getRandomAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPlayLang.g:962:3: ( (otherlv_2= RULE_ID ) )
            // InternalPlayLang.g:963:4: (otherlv_2= RULE_ID )
            {
            // InternalPlayLang.g:963:4: (otherlv_2= RULE_ID )
            // InternalPlayLang.g:964:5: otherlv_2= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandomRule());
            					}
            				
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_30); 

            					newLeafNode(otherlv_2, grammarAccess.getRandomAccess().getIdDeclaracaoCrossReference_2_0());
            				

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getRandomAccess().getCommaLeftSquareBracketKeyword_3());
            		
            // InternalPlayLang.g:979:3: ( ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* ) | ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* ) | ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* ) )
            int alt24=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt24=1;
                }
                break;
            case RULE_STRING:
                {
                alt24=2;
                }
                break;
            case 45:
            case 46:
                {
                alt24=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalPlayLang.g:980:4: ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* )
                    {
                    // InternalPlayLang.g:980:4: ( ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )* )
                    // InternalPlayLang.g:981:5: ( (lv_possibilidadesInt_4_0= RULE_INT ) ) (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )*
                    {
                    // InternalPlayLang.g:981:5: ( (lv_possibilidadesInt_4_0= RULE_INT ) )
                    // InternalPlayLang.g:982:6: (lv_possibilidadesInt_4_0= RULE_INT )
                    {
                    // InternalPlayLang.g:982:6: (lv_possibilidadesInt_4_0= RULE_INT )
                    // InternalPlayLang.g:983:7: lv_possibilidadesInt_4_0= RULE_INT
                    {
                    lv_possibilidadesInt_4_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    							newLeafNode(lv_possibilidadesInt_4_0, grammarAccess.getRandomAccess().getPossibilidadesIntINTTerminalRuleCall_4_0_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRandomRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"possibilidadesInt",
                    								lv_possibilidadesInt_4_0,
                    								"org.eclipse.xtext.common.Terminals.INT");
                    						

                    }


                    }

                    // InternalPlayLang.g:999:5: (otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==12) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalPlayLang.g:1000:6: otherlv_5= ',' ( (lv_possibilidadesInt_6_0= RULE_INT ) )
                    	    {
                    	    otherlv_5=(Token)match(input,12,FOLLOW_3); 

                    	    						newLeafNode(otherlv_5, grammarAccess.getRandomAccess().getCommaKeyword_4_0_1_0());
                    	    					
                    	    // InternalPlayLang.g:1004:6: ( (lv_possibilidadesInt_6_0= RULE_INT ) )
                    	    // InternalPlayLang.g:1005:7: (lv_possibilidadesInt_6_0= RULE_INT )
                    	    {
                    	    // InternalPlayLang.g:1005:7: (lv_possibilidadesInt_6_0= RULE_INT )
                    	    // InternalPlayLang.g:1006:8: lv_possibilidadesInt_6_0= RULE_INT
                    	    {
                    	    lv_possibilidadesInt_6_0=(Token)match(input,RULE_INT,FOLLOW_32); 

                    	    								newLeafNode(lv_possibilidadesInt_6_0, grammarAccess.getRandomAccess().getPossibilidadesIntINTTerminalRuleCall_4_0_1_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getRandomRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"possibilidadesInt",
                    	    									lv_possibilidadesInt_6_0,
                    	    									"org.eclipse.xtext.common.Terminals.INT");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:1025:4: ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* )
                    {
                    // InternalPlayLang.g:1025:4: ( ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )* )
                    // InternalPlayLang.g:1026:5: ( (lv_possibilidadesString_7_0= RULE_STRING ) ) (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )*
                    {
                    // InternalPlayLang.g:1026:5: ( (lv_possibilidadesString_7_0= RULE_STRING ) )
                    // InternalPlayLang.g:1027:6: (lv_possibilidadesString_7_0= RULE_STRING )
                    {
                    // InternalPlayLang.g:1027:6: (lv_possibilidadesString_7_0= RULE_STRING )
                    // InternalPlayLang.g:1028:7: lv_possibilidadesString_7_0= RULE_STRING
                    {
                    lv_possibilidadesString_7_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    							newLeafNode(lv_possibilidadesString_7_0, grammarAccess.getRandomAccess().getPossibilidadesStringSTRINGTerminalRuleCall_4_1_0_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRandomRule());
                    							}
                    							addWithLastConsumed(
                    								current,
                    								"possibilidadesString",
                    								lv_possibilidadesString_7_0,
                    								"org.eclipse.xtext.common.Terminals.STRING");
                    						

                    }


                    }

                    // InternalPlayLang.g:1044:5: (otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) ) )*
                    loop22:
                    do {
                        int alt22=2;
                        int LA22_0 = input.LA(1);

                        if ( (LA22_0==12) ) {
                            alt22=1;
                        }


                        switch (alt22) {
                    	case 1 :
                    	    // InternalPlayLang.g:1045:6: otherlv_8= ',' ( (lv_possibilidadesString_9_0= RULE_STRING ) )
                    	    {
                    	    otherlv_8=(Token)match(input,12,FOLLOW_18); 

                    	    						newLeafNode(otherlv_8, grammarAccess.getRandomAccess().getCommaKeyword_4_1_1_0());
                    	    					
                    	    // InternalPlayLang.g:1049:6: ( (lv_possibilidadesString_9_0= RULE_STRING ) )
                    	    // InternalPlayLang.g:1050:7: (lv_possibilidadesString_9_0= RULE_STRING )
                    	    {
                    	    // InternalPlayLang.g:1050:7: (lv_possibilidadesString_9_0= RULE_STRING )
                    	    // InternalPlayLang.g:1051:8: lv_possibilidadesString_9_0= RULE_STRING
                    	    {
                    	    lv_possibilidadesString_9_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    	    								newLeafNode(lv_possibilidadesString_9_0, grammarAccess.getRandomAccess().getPossibilidadesStringSTRINGTerminalRuleCall_4_1_1_1_0());
                    	    							

                    	    								if (current==null) {
                    	    									current = createModelElement(grammarAccess.getRandomRule());
                    	    								}
                    	    								addWithLastConsumed(
                    	    									current,
                    	    									"possibilidadesString",
                    	    									lv_possibilidadesString_9_0,
                    	    									"org.eclipse.xtext.common.Terminals.STRING");
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop22;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 3 :
                    // InternalPlayLang.g:1070:4: ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* )
                    {
                    // InternalPlayLang.g:1070:4: ( ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )* )
                    // InternalPlayLang.g:1071:5: ( (lv_possibilidadesBool_10_0= ruleBOOL ) ) (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )*
                    {
                    // InternalPlayLang.g:1071:5: ( (lv_possibilidadesBool_10_0= ruleBOOL ) )
                    // InternalPlayLang.g:1072:6: (lv_possibilidadesBool_10_0= ruleBOOL )
                    {
                    // InternalPlayLang.g:1072:6: (lv_possibilidadesBool_10_0= ruleBOOL )
                    // InternalPlayLang.g:1073:7: lv_possibilidadesBool_10_0= ruleBOOL
                    {

                    							newCompositeNode(grammarAccess.getRandomAccess().getPossibilidadesBoolBOOLParserRuleCall_4_2_0_0());
                    						
                    pushFollow(FOLLOW_32);
                    lv_possibilidadesBool_10_0=ruleBOOL();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getRandomRule());
                    							}
                    							add(
                    								current,
                    								"possibilidadesBool",
                    								lv_possibilidadesBool_10_0,
                    								"br.ufscar.dc.compiladores.PlayLang.BOOL");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalPlayLang.g:1090:5: (otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==12) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalPlayLang.g:1091:6: otherlv_11= ',' ( (lv_possibilidadesBool_12_0= ruleBOOL ) )
                    	    {
                    	    otherlv_11=(Token)match(input,12,FOLLOW_33); 

                    	    						newLeafNode(otherlv_11, grammarAccess.getRandomAccess().getCommaKeyword_4_2_1_0());
                    	    					
                    	    // InternalPlayLang.g:1095:6: ( (lv_possibilidadesBool_12_0= ruleBOOL ) )
                    	    // InternalPlayLang.g:1096:7: (lv_possibilidadesBool_12_0= ruleBOOL )
                    	    {
                    	    // InternalPlayLang.g:1096:7: (lv_possibilidadesBool_12_0= ruleBOOL )
                    	    // InternalPlayLang.g:1097:8: lv_possibilidadesBool_12_0= ruleBOOL
                    	    {

                    	    								newCompositeNode(grammarAccess.getRandomAccess().getPossibilidadesBoolBOOLParserRuleCall_4_2_1_1_0());
                    	    							
                    	    pushFollow(FOLLOW_32);
                    	    lv_possibilidadesBool_12_0=ruleBOOL();

                    	    state._fsp--;


                    	    								if (current==null) {
                    	    									current = createModelElementForParent(grammarAccess.getRandomRule());
                    	    								}
                    	    								add(
                    	    									current,
                    	    									"possibilidadesBool",
                    	    									lv_possibilidadesBool_12_0,
                    	    									"br.ufscar.dc.compiladores.PlayLang.BOOL");
                    	    								afterParserOrEnumRuleCall();
                    	    							

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,32,FOLLOW_22); 

            			newLeafNode(otherlv_13, grammarAccess.getRandomAccess().getRightSquareBracketKeyword_5());
            		
            otherlv_14=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_14, grammarAccess.getRandomAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandom"


    // $ANTLR start "entryRulePlaySound"
    // InternalPlayLang.g:1129:1: entryRulePlaySound returns [EObject current=null] : iv_rulePlaySound= rulePlaySound EOF ;
    public final EObject entryRulePlaySound() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlaySound = null;


        try {
            // InternalPlayLang.g:1129:50: (iv_rulePlaySound= rulePlaySound EOF )
            // InternalPlayLang.g:1130:2: iv_rulePlaySound= rulePlaySound EOF
            {
             newCompositeNode(grammarAccess.getPlaySoundRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlaySound=rulePlaySound();

            state._fsp--;

             current =iv_rulePlaySound; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlaySound"


    // $ANTLR start "rulePlaySound"
    // InternalPlayLang.g:1136:1: rulePlaySound returns [EObject current=null] : (otherlv_0= 'PlaySound' otherlv_1= '(' ( (lv_file_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject rulePlaySound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_file_path_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalPlayLang.g:1142:2: ( (otherlv_0= 'PlaySound' otherlv_1= '(' ( (lv_file_path_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalPlayLang.g:1143:2: (otherlv_0= 'PlaySound' otherlv_1= '(' ( (lv_file_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalPlayLang.g:1143:2: (otherlv_0= 'PlaySound' otherlv_1= '(' ( (lv_file_path_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalPlayLang.g:1144:3: otherlv_0= 'PlaySound' otherlv_1= '(' ( (lv_file_path_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getPlaySoundAccess().getPlaySoundKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getPlaySoundAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPlayLang.g:1152:3: ( (lv_file_path_2_0= RULE_STRING ) )
            // InternalPlayLang.g:1153:4: (lv_file_path_2_0= RULE_STRING )
            {
            // InternalPlayLang.g:1153:4: (lv_file_path_2_0= RULE_STRING )
            // InternalPlayLang.g:1154:5: lv_file_path_2_0= RULE_STRING
            {
            lv_file_path_2_0=(Token)match(input,RULE_STRING,FOLLOW_22); 

            					newLeafNode(lv_file_path_2_0, grammarAccess.getPlaySoundAccess().getFile_pathSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlaySoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"file_path",
            						lv_file_path_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getPlaySoundAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlaySound"


    // $ANTLR start "entryRuleIf"
    // InternalPlayLang.g:1178:1: entryRuleIf returns [EObject current=null] : iv_ruleIf= ruleIf EOF ;
    public final EObject entryRuleIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIf = null;


        try {
            // InternalPlayLang.g:1178:43: (iv_ruleIf= ruleIf EOF )
            // InternalPlayLang.g:1179:2: iv_ruleIf= ruleIf EOF
            {
             newCompositeNode(grammarAccess.getIfRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIf=ruleIf();

            state._fsp--;

             current =iv_ruleIf; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIf"


    // $ANTLR start "ruleIf"
    // InternalPlayLang.g:1185:1: ruleIf returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expressaoIf_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) ) ) ;
    public final EObject ruleIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_expressaoIf_2_0 = null;

        EObject lv_elif_7_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1191:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expressaoIf_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) ) ) )
            // InternalPlayLang.g:1192:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expressaoIf_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            {
            // InternalPlayLang.g:1192:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expressaoIf_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) ) )
            // InternalPlayLang.g:1193:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expressaoIf_2_0= ruleExpressao ) ) otherlv_3= ')' otherlv_4= '->' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_13); 

            			newLeafNode(otherlv_0, grammarAccess.getIfAccess().getIfKeyword_0());
            		
            otherlv_1=(Token)match(input,19,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getIfAccess().getLeftParenthesisKeyword_1());
            		
            // InternalPlayLang.g:1201:3: ( (lv_expressaoIf_2_0= ruleExpressao ) )
            // InternalPlayLang.g:1202:4: (lv_expressaoIf_2_0= ruleExpressao )
            {
            // InternalPlayLang.g:1202:4: (lv_expressaoIf_2_0= ruleExpressao )
            // InternalPlayLang.g:1203:5: lv_expressaoIf_2_0= ruleExpressao
            {

            					newCompositeNode(grammarAccess.getIfAccess().getExpressaoIfExpressaoParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_22);
            lv_expressaoIf_2_0=ruleExpressao();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIfRule());
            					}
            					set(
            						current,
            						"expressaoIf",
            						lv_expressaoIf_2_0,
            						"br.ufscar.dc.compiladores.PlayLang.Expressao");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,24,FOLLOW_34); 

            			newLeafNode(otherlv_3, grammarAccess.getIfAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,29,FOLLOW_9); 

            			newLeafNode(otherlv_4, grammarAccess.getIfAccess().getHyphenMinusGreaterThanSignKeyword_4());
            		
            // InternalPlayLang.g:1228:3: ( (otherlv_5= RULE_ID ) )
            // InternalPlayLang.g:1229:4: (otherlv_5= RULE_ID )
            {
            // InternalPlayLang.g:1229:4: (otherlv_5= RULE_ID )
            // InternalPlayLang.g:1230:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIfRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_5, grammarAccess.getIfAccess().getIdIfCenaCrossReference_5_0());
            				

            }


            }

            // InternalPlayLang.g:1241:3: (otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) ) )
            // InternalPlayLang.g:1242:4: otherlv_6= 'else' ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) )
            {
            otherlv_6=(Token)match(input,35,FOLLOW_29); 

            				newLeafNode(otherlv_6, grammarAccess.getIfAccess().getElseKeyword_6_0());
            			
            // InternalPlayLang.g:1246:4: ( ( (lv_elif_7_0= ruleIf ) ) | (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==34) ) {
                alt25=1;
            }
            else if ( (LA25_0==29) ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalPlayLang.g:1247:5: ( (lv_elif_7_0= ruleIf ) )
                    {
                    // InternalPlayLang.g:1247:5: ( (lv_elif_7_0= ruleIf ) )
                    // InternalPlayLang.g:1248:6: (lv_elif_7_0= ruleIf )
                    {
                    // InternalPlayLang.g:1248:6: (lv_elif_7_0= ruleIf )
                    // InternalPlayLang.g:1249:7: lv_elif_7_0= ruleIf
                    {

                    							newCompositeNode(grammarAccess.getIfAccess().getElifIfParserRuleCall_6_1_0_0());
                    						
                    pushFollow(FOLLOW_2);
                    lv_elif_7_0=ruleIf();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getIfRule());
                    							}
                    							set(
                    								current,
                    								"elif",
                    								lv_elif_7_0,
                    								"br.ufscar.dc.compiladores.PlayLang.If");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:1267:5: (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) )
                    {
                    // InternalPlayLang.g:1267:5: (otherlv_8= '->' ( (otherlv_9= RULE_ID ) ) )
                    // InternalPlayLang.g:1268:6: otherlv_8= '->' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,29,FOLLOW_9); 

                    						newLeafNode(otherlv_8, grammarAccess.getIfAccess().getHyphenMinusGreaterThanSignKeyword_6_1_1_0());
                    					
                    // InternalPlayLang.g:1272:6: ( (otherlv_9= RULE_ID ) )
                    // InternalPlayLang.g:1273:7: (otherlv_9= RULE_ID )
                    {
                    // InternalPlayLang.g:1273:7: (otherlv_9= RULE_ID )
                    // InternalPlayLang.g:1274:8: otherlv_9= RULE_ID
                    {

                    								if (current==null) {
                    									current = createModelElement(grammarAccess.getIfRule());
                    								}
                    							
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_2); 

                    								newLeafNode(otherlv_9, grammarAccess.getIfAccess().getIdElseCenaCrossReference_6_1_1_1_0());
                    							

                    }


                    }


                    }


                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIf"


    // $ANTLR start "entryRuleAtribuicao"
    // InternalPlayLang.g:1292:1: entryRuleAtribuicao returns [EObject current=null] : iv_ruleAtribuicao= ruleAtribuicao EOF ;
    public final EObject entryRuleAtribuicao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtribuicao = null;


        try {
            // InternalPlayLang.g:1292:51: (iv_ruleAtribuicao= ruleAtribuicao EOF )
            // InternalPlayLang.g:1293:2: iv_ruleAtribuicao= ruleAtribuicao EOF
            {
             newCompositeNode(grammarAccess.getAtribuicaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAtribuicao=ruleAtribuicao();

            state._fsp--;

             current =iv_ruleAtribuicao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtribuicao"


    // $ANTLR start "ruleAtribuicao"
    // InternalPlayLang.g:1299:1: ruleAtribuicao returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleAtribuicao() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_string_3_0=null;
        EObject lv_expressao_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1305:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) ) )
            // InternalPlayLang.g:1306:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            {
            // InternalPlayLang.g:1306:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) ) )
            // InternalPlayLang.g:1307:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '=' ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            {
            // InternalPlayLang.g:1307:3: ( (otherlv_0= RULE_ID ) )
            // InternalPlayLang.g:1308:4: (otherlv_0= RULE_ID )
            {
            // InternalPlayLang.g:1308:4: (otherlv_0= RULE_ID )
            // InternalPlayLang.g:1309:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAtribuicaoRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getAtribuicaoAccess().getIdDeclaracaoCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,15,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAtribuicaoAccess().getEqualsSignKeyword_1());
            		
            // InternalPlayLang.g:1324:3: ( ( (lv_expressao_2_0= ruleExpressao ) ) | ( (lv_string_3_0= RULE_STRING ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( ((LA26_0>=RULE_INT && LA26_0<=RULE_ID)||LA26_0==37||(LA26_0>=45 && LA26_0<=46)||LA26_0==49) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalPlayLang.g:1325:4: ( (lv_expressao_2_0= ruleExpressao ) )
                    {
                    // InternalPlayLang.g:1325:4: ( (lv_expressao_2_0= ruleExpressao ) )
                    // InternalPlayLang.g:1326:5: (lv_expressao_2_0= ruleExpressao )
                    {
                    // InternalPlayLang.g:1326:5: (lv_expressao_2_0= ruleExpressao )
                    // InternalPlayLang.g:1327:6: lv_expressao_2_0= ruleExpressao
                    {

                    						newCompositeNode(grammarAccess.getAtribuicaoAccess().getExpressaoExpressaoParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expressao_2_0=ruleExpressao();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAtribuicaoRule());
                    						}
                    						set(
                    							current,
                    							"expressao",
                    							lv_expressao_2_0,
                    							"br.ufscar.dc.compiladores.PlayLang.Expressao");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:1345:4: ( (lv_string_3_0= RULE_STRING ) )
                    {
                    // InternalPlayLang.g:1345:4: ( (lv_string_3_0= RULE_STRING ) )
                    // InternalPlayLang.g:1346:5: (lv_string_3_0= RULE_STRING )
                    {
                    // InternalPlayLang.g:1346:5: (lv_string_3_0= RULE_STRING )
                    // InternalPlayLang.g:1347:6: lv_string_3_0= RULE_STRING
                    {
                    lv_string_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_string_3_0, grammarAccess.getAtribuicaoAccess().getStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAtribuicaoRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"string",
                    							lv_string_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAtribuicao"


    // $ANTLR start "entryRuleExpressao"
    // InternalPlayLang.g:1368:1: entryRuleExpressao returns [EObject current=null] : iv_ruleExpressao= ruleExpressao EOF ;
    public final EObject entryRuleExpressao() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressao = null;


        try {
            // InternalPlayLang.g:1368:50: (iv_ruleExpressao= ruleExpressao EOF )
            // InternalPlayLang.g:1369:2: iv_ruleExpressao= ruleExpressao EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressao=ruleExpressao();

            state._fsp--;

             current =iv_ruleExpressao; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressao"


    // $ANTLR start "ruleExpressao"
    // InternalPlayLang.g:1375:1: ruleExpressao returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* ) ;
    public final EObject ruleExpressao() throws RecognitionException {
        EObject current = null;

        EObject lv_termos_0_0 = null;

        AntlrDatatypeRuleToken lv_ou_1_0 = null;

        EObject lv_termos_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1381:2: ( ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* ) )
            // InternalPlayLang.g:1382:2: ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* )
            {
            // InternalPlayLang.g:1382:2: ( ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )* )
            // InternalPlayLang.g:1383:3: ( (lv_termos_0_0= ruleTermoLogico ) ) ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )*
            {
            // InternalPlayLang.g:1383:3: ( (lv_termos_0_0= ruleTermoLogico ) )
            // InternalPlayLang.g:1384:4: (lv_termos_0_0= ruleTermoLogico )
            {
            // InternalPlayLang.g:1384:4: (lv_termos_0_0= ruleTermoLogico )
            // InternalPlayLang.g:1385:5: lv_termos_0_0= ruleTermoLogico
            {

            					newCompositeNode(grammarAccess.getExpressaoAccess().getTermosTermoLogicoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
            lv_termos_0_0=ruleTermoLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoRule());
            					}
            					add(
            						current,
            						"termos",
            						lv_termos_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.TermoLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1402:3: ( ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==48) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalPlayLang.g:1403:4: ( (lv_ou_1_0= ruleOU ) ) ( (lv_termos_2_0= ruleTermoLogico ) )
            	    {
            	    // InternalPlayLang.g:1403:4: ( (lv_ou_1_0= ruleOU ) )
            	    // InternalPlayLang.g:1404:5: (lv_ou_1_0= ruleOU )
            	    {
            	    // InternalPlayLang.g:1404:5: (lv_ou_1_0= ruleOU )
            	    // InternalPlayLang.g:1405:6: lv_ou_1_0= ruleOU
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getOuOUParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_ou_1_0=ruleOU();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"ou",
            	    							lv_ou_1_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.OU");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1422:4: ( (lv_termos_2_0= ruleTermoLogico ) )
            	    // InternalPlayLang.g:1423:5: (lv_termos_2_0= ruleTermoLogico )
            	    {
            	    // InternalPlayLang.g:1423:5: (lv_termos_2_0= ruleTermoLogico )
            	    // InternalPlayLang.g:1424:6: lv_termos_2_0= ruleTermoLogico
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAccess().getTermosTermoLogicoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_37);
            	    lv_termos_2_0=ruleTermoLogico();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"termos",
            	    							lv_termos_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.TermoLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressao"


    // $ANTLR start "entryRuleTermoLogico"
    // InternalPlayLang.g:1446:1: entryRuleTermoLogico returns [EObject current=null] : iv_ruleTermoLogico= ruleTermoLogico EOF ;
    public final EObject entryRuleTermoLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermoLogico = null;


        try {
            // InternalPlayLang.g:1446:52: (iv_ruleTermoLogico= ruleTermoLogico EOF )
            // InternalPlayLang.g:1447:2: iv_ruleTermoLogico= ruleTermoLogico EOF
            {
             newCompositeNode(grammarAccess.getTermoLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermoLogico=ruleTermoLogico();

            state._fsp--;

             current =iv_ruleTermoLogico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermoLogico"


    // $ANTLR start "ruleTermoLogico"
    // InternalPlayLang.g:1453:1: ruleTermoLogico returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* ) ;
    public final EObject ruleTermoLogico() throws RecognitionException {
        EObject current = null;

        EObject lv_fatores_0_0 = null;

        AntlrDatatypeRuleToken lv_e_1_0 = null;

        EObject lv_fatores_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1459:2: ( ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* ) )
            // InternalPlayLang.g:1460:2: ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* )
            {
            // InternalPlayLang.g:1460:2: ( ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )* )
            // InternalPlayLang.g:1461:3: ( (lv_fatores_0_0= ruleFatorLogico ) ) ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )*
            {
            // InternalPlayLang.g:1461:3: ( (lv_fatores_0_0= ruleFatorLogico ) )
            // InternalPlayLang.g:1462:4: (lv_fatores_0_0= ruleFatorLogico )
            {
            // InternalPlayLang.g:1462:4: (lv_fatores_0_0= ruleFatorLogico )
            // InternalPlayLang.g:1463:5: lv_fatores_0_0= ruleFatorLogico
            {

            					newCompositeNode(grammarAccess.getTermoLogicoAccess().getFatoresFatorLogicoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_fatores_0_0=ruleFatorLogico();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            					}
            					add(
            						current,
            						"fatores",
            						lv_fatores_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.FatorLogico");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1480:3: ( ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==47) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalPlayLang.g:1481:4: ( (lv_e_1_0= ruleE ) ) ( (lv_fatores_2_0= ruleFatorLogico ) )
            	    {
            	    // InternalPlayLang.g:1481:4: ( (lv_e_1_0= ruleE ) )
            	    // InternalPlayLang.g:1482:5: (lv_e_1_0= ruleE )
            	    {
            	    // InternalPlayLang.g:1482:5: (lv_e_1_0= ruleE )
            	    // InternalPlayLang.g:1483:6: lv_e_1_0= ruleE
            	    {

            	    						newCompositeNode(grammarAccess.getTermoLogicoAccess().getEEParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_e_1_0=ruleE();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"e",
            	    							lv_e_1_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.E");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1500:4: ( (lv_fatores_2_0= ruleFatorLogico ) )
            	    // InternalPlayLang.g:1501:5: (lv_fatores_2_0= ruleFatorLogico )
            	    {
            	    // InternalPlayLang.g:1501:5: (lv_fatores_2_0= ruleFatorLogico )
            	    // InternalPlayLang.g:1502:6: lv_fatores_2_0= ruleFatorLogico
            	    {

            	    						newCompositeNode(grammarAccess.getTermoLogicoAccess().getFatoresFatorLogicoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_fatores_2_0=ruleFatorLogico();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoLogicoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fatores",
            	    							lv_fatores_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.FatorLogico");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermoLogico"


    // $ANTLR start "entryRuleFatorLogico"
    // InternalPlayLang.g:1524:1: entryRuleFatorLogico returns [EObject current=null] : iv_ruleFatorLogico= ruleFatorLogico EOF ;
    public final EObject entryRuleFatorLogico() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFatorLogico = null;


        try {
            // InternalPlayLang.g:1524:52: (iv_ruleFatorLogico= ruleFatorLogico EOF )
            // InternalPlayLang.g:1525:2: iv_ruleFatorLogico= ruleFatorLogico EOF
            {
             newCompositeNode(grammarAccess.getFatorLogicoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFatorLogico=ruleFatorLogico();

            state._fsp--;

             current =iv_ruleFatorLogico; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFatorLogico"


    // $ANTLR start "ruleFatorLogico"
    // InternalPlayLang.g:1531:1: ruleFatorLogico returns [EObject current=null] : ( ( (lv_nao_0_0= ruleNAO ) )? ( (lv_parcela_1_0= ruleParcela_logica ) ) ) ;
    public final EObject ruleFatorLogico() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_nao_0_0 = null;

        EObject lv_parcela_1_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1537:2: ( ( ( (lv_nao_0_0= ruleNAO ) )? ( (lv_parcela_1_0= ruleParcela_logica ) ) ) )
            // InternalPlayLang.g:1538:2: ( ( (lv_nao_0_0= ruleNAO ) )? ( (lv_parcela_1_0= ruleParcela_logica ) ) )
            {
            // InternalPlayLang.g:1538:2: ( ( (lv_nao_0_0= ruleNAO ) )? ( (lv_parcela_1_0= ruleParcela_logica ) ) )
            // InternalPlayLang.g:1539:3: ( (lv_nao_0_0= ruleNAO ) )? ( (lv_parcela_1_0= ruleParcela_logica ) )
            {
            // InternalPlayLang.g:1539:3: ( (lv_nao_0_0= ruleNAO ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==49) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalPlayLang.g:1540:4: (lv_nao_0_0= ruleNAO )
                    {
                    // InternalPlayLang.g:1540:4: (lv_nao_0_0= ruleNAO )
                    // InternalPlayLang.g:1541:5: lv_nao_0_0= ruleNAO
                    {

                    					newCompositeNode(grammarAccess.getFatorLogicoAccess().getNaoNAOParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_21);
                    lv_nao_0_0=ruleNAO();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFatorLogicoRule());
                    					}
                    					set(
                    						current,
                    						"nao",
                    						lv_nao_0_0 != null,
                    						"br.ufscar.dc.compiladores.PlayLang.NAO");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalPlayLang.g:1558:3: ( (lv_parcela_1_0= ruleParcela_logica ) )
            // InternalPlayLang.g:1559:4: (lv_parcela_1_0= ruleParcela_logica )
            {
            // InternalPlayLang.g:1559:4: (lv_parcela_1_0= ruleParcela_logica )
            // InternalPlayLang.g:1560:5: lv_parcela_1_0= ruleParcela_logica
            {

            					newCompositeNode(grammarAccess.getFatorLogicoAccess().getParcelaParcela_logicaParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_parcela_1_0=ruleParcela_logica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFatorLogicoRule());
            					}
            					set(
            						current,
            						"parcela",
            						lv_parcela_1_0,
            						"br.ufscar.dc.compiladores.PlayLang.Parcela_logica");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFatorLogico"


    // $ANTLR start "entryRuleParcela_logica"
    // InternalPlayLang.g:1581:1: entryRuleParcela_logica returns [EObject current=null] : iv_ruleParcela_logica= ruleParcela_logica EOF ;
    public final EObject entryRuleParcela_logica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParcela_logica = null;


        try {
            // InternalPlayLang.g:1581:55: (iv_ruleParcela_logica= ruleParcela_logica EOF )
            // InternalPlayLang.g:1582:2: iv_ruleParcela_logica= ruleParcela_logica EOF
            {
             newCompositeNode(grammarAccess.getParcela_logicaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParcela_logica=ruleParcela_logica();

            state._fsp--;

             current =iv_ruleParcela_logica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParcela_logica"


    // $ANTLR start "ruleParcela_logica"
    // InternalPlayLang.g:1588:1: ruleParcela_logica returns [EObject current=null] : ( ( (lv_p_0_0= ruleBOOL ) ) | ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ) ;
    public final EObject ruleParcela_logica() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_p_0_0 = null;

        EObject lv_exp_1_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1594:2: ( ( ( (lv_p_0_0= ruleBOOL ) ) | ( (lv_exp_1_0= ruleExpressaoRelacional ) ) ) )
            // InternalPlayLang.g:1595:2: ( ( (lv_p_0_0= ruleBOOL ) ) | ( (lv_exp_1_0= ruleExpressaoRelacional ) ) )
            {
            // InternalPlayLang.g:1595:2: ( ( (lv_p_0_0= ruleBOOL ) ) | ( (lv_exp_1_0= ruleExpressaoRelacional ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=45 && LA30_0<=46)) ) {
                alt30=1;
            }
            else if ( ((LA30_0>=RULE_INT && LA30_0<=RULE_ID)||LA30_0==37) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalPlayLang.g:1596:3: ( (lv_p_0_0= ruleBOOL ) )
                    {
                    // InternalPlayLang.g:1596:3: ( (lv_p_0_0= ruleBOOL ) )
                    // InternalPlayLang.g:1597:4: (lv_p_0_0= ruleBOOL )
                    {
                    // InternalPlayLang.g:1597:4: (lv_p_0_0= ruleBOOL )
                    // InternalPlayLang.g:1598:5: lv_p_0_0= ruleBOOL
                    {

                    					newCompositeNode(grammarAccess.getParcela_logicaAccess().getPBOOLParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_p_0_0=ruleBOOL();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParcela_logicaRule());
                    					}
                    					set(
                    						current,
                    						"p",
                    						lv_p_0_0,
                    						"br.ufscar.dc.compiladores.PlayLang.BOOL");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:1616:3: ( (lv_exp_1_0= ruleExpressaoRelacional ) )
                    {
                    // InternalPlayLang.g:1616:3: ( (lv_exp_1_0= ruleExpressaoRelacional ) )
                    // InternalPlayLang.g:1617:4: (lv_exp_1_0= ruleExpressaoRelacional )
                    {
                    // InternalPlayLang.g:1617:4: (lv_exp_1_0= ruleExpressaoRelacional )
                    // InternalPlayLang.g:1618:5: lv_exp_1_0= ruleExpressaoRelacional
                    {

                    					newCompositeNode(grammarAccess.getParcela_logicaAccess().getExpExpressaoRelacionalParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_exp_1_0=ruleExpressaoRelacional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getParcela_logicaRule());
                    					}
                    					set(
                    						current,
                    						"exp",
                    						lv_exp_1_0,
                    						"br.ufscar.dc.compiladores.PlayLang.ExpressaoRelacional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParcela_logica"


    // $ANTLR start "entryRuleExpressaoRelacional"
    // InternalPlayLang.g:1639:1: entryRuleExpressaoRelacional returns [EObject current=null] : iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF ;
    public final EObject entryRuleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoRelacional = null;


        try {
            // InternalPlayLang.g:1639:60: (iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF )
            // InternalPlayLang.g:1640:2: iv_ruleExpressaoRelacional= ruleExpressaoRelacional EOF
            {
             newCompositeNode(grammarAccess.getExpressaoRelacionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoRelacional=ruleExpressaoRelacional();

            state._fsp--;

             current =iv_ruleExpressaoRelacional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressaoRelacional"


    // $ANTLR start "ruleExpressaoRelacional"
    // InternalPlayLang.g:1646:1: ruleExpressaoRelacional returns [EObject current=null] : ( ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )* ) ;
    public final EObject ruleExpressaoRelacional() throws RecognitionException {
        EObject current = null;

        EObject lv_expressoes_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_expressoes_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1652:2: ( ( ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )* ) )
            // InternalPlayLang.g:1653:2: ( ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )* )
            {
            // InternalPlayLang.g:1653:2: ( ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )* )
            // InternalPlayLang.g:1654:3: ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) ) ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )*
            {
            // InternalPlayLang.g:1654:3: ( (lv_expressoes_0_0= ruleExpressaoAritmetica ) )
            // InternalPlayLang.g:1655:4: (lv_expressoes_0_0= ruleExpressaoAritmetica )
            {
            // InternalPlayLang.g:1655:4: (lv_expressoes_0_0= ruleExpressaoAritmetica )
            // InternalPlayLang.g:1656:5: lv_expressoes_0_0= ruleExpressaoAritmetica
            {

            					newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getExpressoesExpressaoAritmeticaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_39);
            lv_expressoes_0_0=ruleExpressaoAritmetica();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            					}
            					add(
            						current,
            						"expressoes",
            						lv_expressoes_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.ExpressaoAritmetica");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1673:3: ( ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=21 && LA31_0<=22)||(LA31_0>=41 && LA31_0<=44)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalPlayLang.g:1674:4: ( (lv_op_1_0= ruleOPRELACIONAL ) ) ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) )
            	    {
            	    // InternalPlayLang.g:1674:4: ( (lv_op_1_0= ruleOPRELACIONAL ) )
            	    // InternalPlayLang.g:1675:5: (lv_op_1_0= ruleOPRELACIONAL )
            	    {
            	    // InternalPlayLang.g:1675:5: (lv_op_1_0= ruleOPRELACIONAL )
            	    // InternalPlayLang.g:1676:6: lv_op_1_0= ruleOPRELACIONAL
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getOpOPRELACIONALParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_1_0=ruleOPRELACIONAL();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.OPRELACIONAL");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1693:4: ( (lv_expressoes_2_0= ruleExpressaoAritmetica ) )
            	    // InternalPlayLang.g:1694:5: (lv_expressoes_2_0= ruleExpressaoAritmetica )
            	    {
            	    // InternalPlayLang.g:1694:5: (lv_expressoes_2_0= ruleExpressaoAritmetica )
            	    // InternalPlayLang.g:1695:6: lv_expressoes_2_0= ruleExpressaoAritmetica
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoRelacionalAccess().getExpressoesExpressaoAritmeticaParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_39);
            	    lv_expressoes_2_0=ruleExpressaoAritmetica();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoRelacionalRule());
            	    						}
            	    						add(
            	    							current,
            	    							"expressoes",
            	    							lv_expressoes_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.ExpressaoAritmetica");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressaoRelacional"


    // $ANTLR start "entryRuleExpressaoAritmetica"
    // InternalPlayLang.g:1717:1: entryRuleExpressaoAritmetica returns [EObject current=null] : iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF ;
    public final EObject entryRuleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressaoAritmetica = null;


        try {
            // InternalPlayLang.g:1717:60: (iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF )
            // InternalPlayLang.g:1718:2: iv_ruleExpressaoAritmetica= ruleExpressaoAritmetica EOF
            {
             newCompositeNode(grammarAccess.getExpressaoAritmeticaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpressaoAritmetica=ruleExpressaoAritmetica();

            state._fsp--;

             current =iv_ruleExpressaoAritmetica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressaoAritmetica"


    // $ANTLR start "ruleExpressaoAritmetica"
    // InternalPlayLang.g:1724:1: ruleExpressaoAritmetica returns [EObject current=null] : ( ( (lv_termos_0_0= ruleTermo ) ) ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )* ) ;
    public final EObject ruleExpressaoAritmetica() throws RecognitionException {
        EObject current = null;

        EObject lv_termos_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_termos_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1730:2: ( ( ( (lv_termos_0_0= ruleTermo ) ) ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )* ) )
            // InternalPlayLang.g:1731:2: ( ( (lv_termos_0_0= ruleTermo ) ) ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )* )
            {
            // InternalPlayLang.g:1731:2: ( ( (lv_termos_0_0= ruleTermo ) ) ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )* )
            // InternalPlayLang.g:1732:3: ( (lv_termos_0_0= ruleTermo ) ) ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )*
            {
            // InternalPlayLang.g:1732:3: ( (lv_termos_0_0= ruleTermo ) )
            // InternalPlayLang.g:1733:4: (lv_termos_0_0= ruleTermo )
            {
            // InternalPlayLang.g:1733:4: (lv_termos_0_0= ruleTermo )
            // InternalPlayLang.g:1734:5: lv_termos_0_0= ruleTermo
            {

            					newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getTermosTermoParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_40);
            lv_termos_0_0=ruleTermo();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            					}
            					add(
            						current,
            						"termos",
            						lv_termos_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.Termo");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1751:3: ( ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=37 && LA32_0<=38)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalPlayLang.g:1752:4: ( (lv_op_1_0= ruleOP1 ) ) ( (lv_termos_2_0= ruleTermo ) )
            	    {
            	    // InternalPlayLang.g:1752:4: ( (lv_op_1_0= ruleOP1 ) )
            	    // InternalPlayLang.g:1753:5: (lv_op_1_0= ruleOP1 )
            	    {
            	    // InternalPlayLang.g:1753:5: (lv_op_1_0= ruleOP1 )
            	    // InternalPlayLang.g:1754:6: lv_op_1_0= ruleOP1
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getOpOP1ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_1_0=ruleOP1();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.OP1");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1771:4: ( (lv_termos_2_0= ruleTermo ) )
            	    // InternalPlayLang.g:1772:5: (lv_termos_2_0= ruleTermo )
            	    {
            	    // InternalPlayLang.g:1772:5: (lv_termos_2_0= ruleTermo )
            	    // InternalPlayLang.g:1773:6: lv_termos_2_0= ruleTermo
            	    {

            	    						newCompositeNode(grammarAccess.getExpressaoAritmeticaAccess().getTermosTermoParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_40);
            	    lv_termos_2_0=ruleTermo();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpressaoAritmeticaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"termos",
            	    							lv_termos_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.Termo");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressaoAritmetica"


    // $ANTLR start "entryRuleTermo"
    // InternalPlayLang.g:1795:1: entryRuleTermo returns [EObject current=null] : iv_ruleTermo= ruleTermo EOF ;
    public final EObject entryRuleTermo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermo = null;


        try {
            // InternalPlayLang.g:1795:46: (iv_ruleTermo= ruleTermo EOF )
            // InternalPlayLang.g:1796:2: iv_ruleTermo= ruleTermo EOF
            {
             newCompositeNode(grammarAccess.getTermoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTermo=ruleTermo();

            state._fsp--;

             current =iv_ruleTermo; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermo"


    // $ANTLR start "ruleTermo"
    // InternalPlayLang.g:1802:1: ruleTermo returns [EObject current=null] : ( ( (lv_fatores_0_0= ruleFator ) ) ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )* ) ;
    public final EObject ruleTermo() throws RecognitionException {
        EObject current = null;

        EObject lv_fatores_0_0 = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_fatores_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1808:2: ( ( ( (lv_fatores_0_0= ruleFator ) ) ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )* ) )
            // InternalPlayLang.g:1809:2: ( ( (lv_fatores_0_0= ruleFator ) ) ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )* )
            {
            // InternalPlayLang.g:1809:2: ( ( (lv_fatores_0_0= ruleFator ) ) ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )* )
            // InternalPlayLang.g:1810:3: ( (lv_fatores_0_0= ruleFator ) ) ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )*
            {
            // InternalPlayLang.g:1810:3: ( (lv_fatores_0_0= ruleFator ) )
            // InternalPlayLang.g:1811:4: (lv_fatores_0_0= ruleFator )
            {
            // InternalPlayLang.g:1811:4: (lv_fatores_0_0= ruleFator )
            // InternalPlayLang.g:1812:5: lv_fatores_0_0= ruleFator
            {

            					newCompositeNode(grammarAccess.getTermoAccess().getFatoresFatorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_41);
            lv_fatores_0_0=ruleFator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTermoRule());
            					}
            					add(
            						current,
            						"fatores",
            						lv_fatores_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.Fator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1829:3: ( ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=39 && LA33_0<=40)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalPlayLang.g:1830:4: ( (lv_op_1_0= ruleOP2 ) ) ( (lv_fatores_2_0= ruleFator ) )
            	    {
            	    // InternalPlayLang.g:1830:4: ( (lv_op_1_0= ruleOP2 ) )
            	    // InternalPlayLang.g:1831:5: (lv_op_1_0= ruleOP2 )
            	    {
            	    // InternalPlayLang.g:1831:5: (lv_op_1_0= ruleOP2 )
            	    // InternalPlayLang.g:1832:6: lv_op_1_0= ruleOP2
            	    {

            	    						newCompositeNode(grammarAccess.getTermoAccess().getOpOP2ParserRuleCall_1_0_0());
            	    					
            	    pushFollow(FOLLOW_21);
            	    lv_op_1_0=ruleOP2();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"op",
            	    							lv_op_1_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.OP2");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1849:4: ( (lv_fatores_2_0= ruleFator ) )
            	    // InternalPlayLang.g:1850:5: (lv_fatores_2_0= ruleFator )
            	    {
            	    // InternalPlayLang.g:1850:5: (lv_fatores_2_0= ruleFator )
            	    // InternalPlayLang.g:1851:6: lv_fatores_2_0= ruleFator
            	    {

            	    						newCompositeNode(grammarAccess.getTermoAccess().getFatoresFatorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_41);
            	    lv_fatores_2_0=ruleFator();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getTermoRule());
            	    						}
            	    						add(
            	    							current,
            	    							"fatores",
            	    							lv_fatores_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.Fator");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermo"


    // $ANTLR start "entryRuleFator"
    // InternalPlayLang.g:1873:1: entryRuleFator returns [EObject current=null] : iv_ruleFator= ruleFator EOF ;
    public final EObject entryRuleFator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFator = null;


        try {
            // InternalPlayLang.g:1873:46: (iv_ruleFator= ruleFator EOF )
            // InternalPlayLang.g:1874:2: iv_ruleFator= ruleFator EOF
            {
             newCompositeNode(grammarAccess.getFatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFator=ruleFator();

            state._fsp--;

             current =iv_ruleFator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFator"


    // $ANTLR start "ruleFator"
    // InternalPlayLang.g:1880:1: ruleFator returns [EObject current=null] : ( ( (lv_parcelas_0_0= ruleParcela ) ) ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )* ) ;
    public final EObject ruleFator() throws RecognitionException {
        EObject current = null;

        Token lv_op_1_0=null;
        EObject lv_parcelas_0_0 = null;

        EObject lv_parcelas_2_0 = null;



        	enterRule();

        try {
            // InternalPlayLang.g:1886:2: ( ( ( (lv_parcelas_0_0= ruleParcela ) ) ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )* ) )
            // InternalPlayLang.g:1887:2: ( ( (lv_parcelas_0_0= ruleParcela ) ) ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )* )
            {
            // InternalPlayLang.g:1887:2: ( ( (lv_parcelas_0_0= ruleParcela ) ) ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )* )
            // InternalPlayLang.g:1888:3: ( (lv_parcelas_0_0= ruleParcela ) ) ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )*
            {
            // InternalPlayLang.g:1888:3: ( (lv_parcelas_0_0= ruleParcela ) )
            // InternalPlayLang.g:1889:4: (lv_parcelas_0_0= ruleParcela )
            {
            // InternalPlayLang.g:1889:4: (lv_parcelas_0_0= ruleParcela )
            // InternalPlayLang.g:1890:5: lv_parcelas_0_0= ruleParcela
            {

            					newCompositeNode(grammarAccess.getFatorAccess().getParcelasParcelaParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_42);
            lv_parcelas_0_0=ruleParcela();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFatorRule());
            					}
            					add(
            						current,
            						"parcelas",
            						lv_parcelas_0_0,
            						"br.ufscar.dc.compiladores.PlayLang.Parcela");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalPlayLang.g:1907:3: ( ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==36) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalPlayLang.g:1908:4: ( (lv_op_1_0= '%' ) ) ( (lv_parcelas_2_0= ruleParcela ) )
            	    {
            	    // InternalPlayLang.g:1908:4: ( (lv_op_1_0= '%' ) )
            	    // InternalPlayLang.g:1909:5: (lv_op_1_0= '%' )
            	    {
            	    // InternalPlayLang.g:1909:5: (lv_op_1_0= '%' )
            	    // InternalPlayLang.g:1910:6: lv_op_1_0= '%'
            	    {
            	    lv_op_1_0=(Token)match(input,36,FOLLOW_21); 

            	    						newLeafNode(lv_op_1_0, grammarAccess.getFatorAccess().getOpPercentSignKeyword_1_0_0());
            	    					

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getFatorRule());
            	    						}
            	    						addWithLastConsumed(current, "op", lv_op_1_0, "%");
            	    					

            	    }


            	    }

            	    // InternalPlayLang.g:1922:4: ( (lv_parcelas_2_0= ruleParcela ) )
            	    // InternalPlayLang.g:1923:5: (lv_parcelas_2_0= ruleParcela )
            	    {
            	    // InternalPlayLang.g:1923:5: (lv_parcelas_2_0= ruleParcela )
            	    // InternalPlayLang.g:1924:6: lv_parcelas_2_0= ruleParcela
            	    {

            	    						newCompositeNode(grammarAccess.getFatorAccess().getParcelasParcelaParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_42);
            	    lv_parcelas_2_0=ruleParcela();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFatorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"parcelas",
            	    							lv_parcelas_2_0,
            	    							"br.ufscar.dc.compiladores.PlayLang.Parcela");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFator"


    // $ANTLR start "entryRuleParcela"
    // InternalPlayLang.g:1946:1: entryRuleParcela returns [EObject current=null] : iv_ruleParcela= ruleParcela EOF ;
    public final EObject entryRuleParcela() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParcela = null;


        try {
            // InternalPlayLang.g:1946:48: (iv_ruleParcela= ruleParcela EOF )
            // InternalPlayLang.g:1947:2: iv_ruleParcela= ruleParcela EOF
            {
             newCompositeNode(grammarAccess.getParcelaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParcela=ruleParcela();

            state._fsp--;

             current =iv_ruleParcela; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParcela"


    // $ANTLR start "ruleParcela"
    // InternalPlayLang.g:1953:1: ruleParcela returns [EObject current=null] : ( ( (lv_sub_0_0= '-' ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) ) ) ;
    public final EObject ruleParcela() throws RecognitionException {
        EObject current = null;

        Token lv_sub_0_0=null;
        Token otherlv_1=null;
        Token lv_int_2_0=null;


        	enterRule();

        try {
            // InternalPlayLang.g:1959:2: ( ( ( (lv_sub_0_0= '-' ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) ) ) )
            // InternalPlayLang.g:1960:2: ( ( (lv_sub_0_0= '-' ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) ) )
            {
            // InternalPlayLang.g:1960:2: ( ( (lv_sub_0_0= '-' ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) ) )
            // InternalPlayLang.g:1961:3: ( (lv_sub_0_0= '-' ) )? ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) )
            {
            // InternalPlayLang.g:1961:3: ( (lv_sub_0_0= '-' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalPlayLang.g:1962:4: (lv_sub_0_0= '-' )
                    {
                    // InternalPlayLang.g:1962:4: (lv_sub_0_0= '-' )
                    // InternalPlayLang.g:1963:5: lv_sub_0_0= '-'
                    {
                    lv_sub_0_0=(Token)match(input,37,FOLLOW_43); 

                    					newLeafNode(lv_sub_0_0, grammarAccess.getParcelaAccess().getSubHyphenMinusKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getParcelaRule());
                    					}
                    					setWithLastConsumed(current, "sub", lv_sub_0_0 != null, "-");
                    				

                    }


                    }
                    break;

            }

            // InternalPlayLang.g:1975:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_int_2_0= RULE_INT ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ID) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_INT) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalPlayLang.g:1976:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalPlayLang.g:1976:4: ( (otherlv_1= RULE_ID ) )
                    // InternalPlayLang.g:1977:5: (otherlv_1= RULE_ID )
                    {
                    // InternalPlayLang.g:1977:5: (otherlv_1= RULE_ID )
                    // InternalPlayLang.g:1978:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParcelaRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getParcelaAccess().getIdDeclaracaoCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:1990:4: ( (lv_int_2_0= RULE_INT ) )
                    {
                    // InternalPlayLang.g:1990:4: ( (lv_int_2_0= RULE_INT ) )
                    // InternalPlayLang.g:1991:5: (lv_int_2_0= RULE_INT )
                    {
                    // InternalPlayLang.g:1991:5: (lv_int_2_0= RULE_INT )
                    // InternalPlayLang.g:1992:6: lv_int_2_0= RULE_INT
                    {
                    lv_int_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_int_2_0, grammarAccess.getParcelaAccess().getIntINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getParcelaRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"int",
                    							lv_int_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParcela"


    // $ANTLR start "entryRuleOP1"
    // InternalPlayLang.g:2013:1: entryRuleOP1 returns [String current=null] : iv_ruleOP1= ruleOP1 EOF ;
    public final String entryRuleOP1() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP1 = null;


        try {
            // InternalPlayLang.g:2013:43: (iv_ruleOP1= ruleOP1 EOF )
            // InternalPlayLang.g:2014:2: iv_ruleOP1= ruleOP1 EOF
            {
             newCompositeNode(grammarAccess.getOP1Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP1=ruleOP1();

            state._fsp--;

             current =iv_ruleOP1.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOP1"


    // $ANTLR start "ruleOP1"
    // InternalPlayLang.g:2020:1: ruleOP1 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '+' | kw= '-' ) ;
    public final AntlrDatatypeRuleToken ruleOP1() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2026:2: ( (kw= '+' | kw= '-' ) )
            // InternalPlayLang.g:2027:2: (kw= '+' | kw= '-' )
            {
            // InternalPlayLang.g:2027:2: (kw= '+' | kw= '-' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==38) ) {
                alt37=1;
            }
            else if ( (LA37_0==37) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalPlayLang.g:2028:3: kw= '+'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP1Access().getPlusSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:2034:3: kw= '-'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP1Access().getHyphenMinusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOP1"


    // $ANTLR start "entryRuleOP2"
    // InternalPlayLang.g:2043:1: entryRuleOP2 returns [String current=null] : iv_ruleOP2= ruleOP2 EOF ;
    public final String entryRuleOP2() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOP2 = null;


        try {
            // InternalPlayLang.g:2043:43: (iv_ruleOP2= ruleOP2 EOF )
            // InternalPlayLang.g:2044:2: iv_ruleOP2= ruleOP2 EOF
            {
             newCompositeNode(grammarAccess.getOP2Rule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOP2=ruleOP2();

            state._fsp--;

             current =iv_ruleOP2.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOP2"


    // $ANTLR start "ruleOP2"
    // InternalPlayLang.g:2050:1: ruleOP2 returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '*' | kw= '/' ) ;
    public final AntlrDatatypeRuleToken ruleOP2() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2056:2: ( (kw= '*' | kw= '/' ) )
            // InternalPlayLang.g:2057:2: (kw= '*' | kw= '/' )
            {
            // InternalPlayLang.g:2057:2: (kw= '*' | kw= '/' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==39) ) {
                alt38=1;
            }
            else if ( (LA38_0==40) ) {
                alt38=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalPlayLang.g:2058:3: kw= '*'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP2Access().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:2064:3: kw= '/'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOP2Access().getSolidusKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOP2"


    // $ANTLR start "entryRuleOPRELACIONAL"
    // InternalPlayLang.g:2073:1: entryRuleOPRELACIONAL returns [String current=null] : iv_ruleOPRELACIONAL= ruleOPRELACIONAL EOF ;
    public final String entryRuleOPRELACIONAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOPRELACIONAL = null;


        try {
            // InternalPlayLang.g:2073:52: (iv_ruleOPRELACIONAL= ruleOPRELACIONAL EOF )
            // InternalPlayLang.g:2074:2: iv_ruleOPRELACIONAL= ruleOPRELACIONAL EOF
            {
             newCompositeNode(grammarAccess.getOPRELACIONALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOPRELACIONAL=ruleOPRELACIONAL();

            state._fsp--;

             current =iv_ruleOPRELACIONAL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOPRELACIONAL"


    // $ANTLR start "ruleOPRELACIONAL"
    // InternalPlayLang.g:2080:1: ruleOPRELACIONAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOPRELACIONAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2086:2: ( (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // InternalPlayLang.g:2087:2: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // InternalPlayLang.g:2087:2: (kw= '==' | kw= '!=' | kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt39=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt39=1;
                }
                break;
            case 42:
                {
                alt39=2;
                }
                break;
            case 43:
                {
                alt39=3;
                }
                break;
            case 44:
                {
                alt39=4;
                }
                break;
            case 22:
                {
                alt39=5;
                }
                break;
            case 21:
                {
                alt39=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalPlayLang.g:2088:3: kw= '=='
                    {
                    kw=(Token)match(input,41,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getEqualsSignEqualsSignKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:2094:3: kw= '!='
                    {
                    kw=(Token)match(input,42,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getExclamationMarkEqualsSignKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPlayLang.g:2100:3: kw= '>='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getGreaterThanSignEqualsSignKeyword_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalPlayLang.g:2106:3: kw= '<='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getLessThanSignEqualsSignKeyword_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalPlayLang.g:2112:3: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getGreaterThanSignKeyword_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalPlayLang.g:2118:3: kw= '<'
                    {
                    kw=(Token)match(input,21,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getOPRELACIONALAccess().getLessThanSignKeyword_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOPRELACIONAL"


    // $ANTLR start "entryRuleBOOL"
    // InternalPlayLang.g:2127:1: entryRuleBOOL returns [String current=null] : iv_ruleBOOL= ruleBOOL EOF ;
    public final String entryRuleBOOL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBOOL = null;


        try {
            // InternalPlayLang.g:2127:44: (iv_ruleBOOL= ruleBOOL EOF )
            // InternalPlayLang.g:2128:2: iv_ruleBOOL= ruleBOOL EOF
            {
             newCompositeNode(grammarAccess.getBOOLRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBOOL=ruleBOOL();

            state._fsp--;

             current =iv_ruleBOOL.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBOOL"


    // $ANTLR start "ruleBOOL"
    // InternalPlayLang.g:2134:1: ruleBOOL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'true' | kw= 'false' ) ;
    public final AntlrDatatypeRuleToken ruleBOOL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2140:2: ( (kw= 'true' | kw= 'false' ) )
            // InternalPlayLang.g:2141:2: (kw= 'true' | kw= 'false' )
            {
            // InternalPlayLang.g:2141:2: (kw= 'true' | kw= 'false' )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==45) ) {
                alt40=1;
            }
            else if ( (LA40_0==46) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalPlayLang.g:2142:3: kw= 'true'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLAccess().getTrueKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:2148:3: kw= 'false'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getBOOLAccess().getFalseKeyword_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOL"


    // $ANTLR start "entryRuleE"
    // InternalPlayLang.g:2157:1: entryRuleE returns [String current=null] : iv_ruleE= ruleE EOF ;
    public final String entryRuleE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleE = null;


        try {
            // InternalPlayLang.g:2157:41: (iv_ruleE= ruleE EOF )
            // InternalPlayLang.g:2158:2: iv_ruleE= ruleE EOF
            {
             newCompositeNode(grammarAccess.getERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleE=ruleE();

            state._fsp--;

             current =iv_ruleE.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleE"


    // $ANTLR start "ruleE"
    // InternalPlayLang.g:2164:1: ruleE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&' ;
    public final AntlrDatatypeRuleToken ruleE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2170:2: (kw= '&' )
            // InternalPlayLang.g:2171:2: kw= '&'
            {
            kw=(Token)match(input,47,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getEAccess().getAmpersandKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleE"


    // $ANTLR start "entryRuleOU"
    // InternalPlayLang.g:2179:1: entryRuleOU returns [String current=null] : iv_ruleOU= ruleOU EOF ;
    public final String entryRuleOU() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOU = null;


        try {
            // InternalPlayLang.g:2179:42: (iv_ruleOU= ruleOU EOF )
            // InternalPlayLang.g:2180:2: iv_ruleOU= ruleOU EOF
            {
             newCompositeNode(grammarAccess.getOURule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOU=ruleOU();

            state._fsp--;

             current =iv_ruleOU.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOU"


    // $ANTLR start "ruleOU"
    // InternalPlayLang.g:2186:1: ruleOU returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '|' ;
    public final AntlrDatatypeRuleToken ruleOU() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2192:2: (kw= '|' )
            // InternalPlayLang.g:2193:2: kw= '|'
            {
            kw=(Token)match(input,48,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getOUAccess().getVerticalLineKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOU"


    // $ANTLR start "entryRuleNAO"
    // InternalPlayLang.g:2201:1: entryRuleNAO returns [String current=null] : iv_ruleNAO= ruleNAO EOF ;
    public final String entryRuleNAO() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNAO = null;


        try {
            // InternalPlayLang.g:2201:43: (iv_ruleNAO= ruleNAO EOF )
            // InternalPlayLang.g:2202:2: iv_ruleNAO= ruleNAO EOF
            {
             newCompositeNode(grammarAccess.getNAORule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNAO=ruleNAO();

            state._fsp--;

             current =iv_ruleNAO.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNAO"


    // $ANTLR start "ruleNAO"
    // InternalPlayLang.g:2208:1: ruleNAO returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '!' ;
    public final AntlrDatatypeRuleToken ruleNAO() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2214:2: (kw= '!' )
            // InternalPlayLang.g:2215:2: kw= '!'
            {
            kw=(Token)match(input,49,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getNAOAccess().getExclamationMarkKeyword());
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNAO"


    // $ANTLR start "entryRuleTipo"
    // InternalPlayLang.g:2223:1: entryRuleTipo returns [String current=null] : iv_ruleTipo= ruleTipo EOF ;
    public final String entryRuleTipo() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTipo = null;


        try {
            // InternalPlayLang.g:2223:44: (iv_ruleTipo= ruleTipo EOF )
            // InternalPlayLang.g:2224:2: iv_ruleTipo= ruleTipo EOF
            {
             newCompositeNode(grammarAccess.getTipoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTipo=ruleTipo();

            state._fsp--;

             current =iv_ruleTipo.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTipo"


    // $ANTLR start "ruleTipo"
    // InternalPlayLang.g:2230:1: ruleTipo returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'STRING' | kw= 'INT' | kw= 'BOOL' ) ;
    public final AntlrDatatypeRuleToken ruleTipo() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalPlayLang.g:2236:2: ( (kw= 'STRING' | kw= 'INT' | kw= 'BOOL' ) )
            // InternalPlayLang.g:2237:2: (kw= 'STRING' | kw= 'INT' | kw= 'BOOL' )
            {
            // InternalPlayLang.g:2237:2: (kw= 'STRING' | kw= 'INT' | kw= 'BOOL' )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt41=1;
                }
                break;
            case 51:
                {
                alt41=2;
                }
                break;
            case 52:
                {
                alt41=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalPlayLang.g:2238:3: kw= 'STRING'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoAccess().getSTRINGKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalPlayLang.g:2244:3: kw= 'INT'
                    {
                    kw=(Token)match(input,51,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoAccess().getINTKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalPlayLang.g:2250:3: kw= 'BOOL'
                    {
                    kw=(Token)match(input,52,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getTipoAccess().getBOOLKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTipo"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x001C000000042002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000040004020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000600000010050L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000208A00060L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000208A00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000208B00000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000401000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0002602000000030L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000208A04000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010080060L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000041000020L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000420000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000600000000050L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000100001000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000600000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002602000000070L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00001E0000600002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000030L});

}