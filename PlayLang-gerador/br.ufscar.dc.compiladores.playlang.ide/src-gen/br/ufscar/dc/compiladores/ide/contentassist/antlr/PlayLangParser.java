/*
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.ide.contentassist.antlr;

import br.ufscar.dc.compiladores.ide.contentassist.antlr.internal.InternalPlayLangParser;
import br.ufscar.dc.compiladores.services.PlayLangGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class PlayLangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(PlayLangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, PlayLangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getDeclaracaoAccess().getAlternatives_3(), "rule__Declaracao__Alternatives_3");
			builder.put(grammarAccess.getTextoAccess().getAlternatives(), "rule__Texto__Alternatives");
			builder.put(grammarAccess.getEscolhasAccess().getAlternatives(), "rule__Escolhas__Alternatives");
			builder.put(grammarAccess.getEscolhaAccess().getAlternatives_4(), "rule__Escolha__Alternatives_4");
			builder.put(grammarAccess.getComandoAccess().getAlternatives(), "rule__Comando__Alternatives");
			builder.put(grammarAccess.getRandomAccess().getAlternatives_4(), "rule__Random__Alternatives_4");
			builder.put(grammarAccess.getIfAccess().getAlternatives_6_1(), "rule__If__Alternatives_6_1");
			builder.put(grammarAccess.getAtribuicaoAccess().getAlternatives_2(), "rule__Atribuicao__Alternatives_2");
			builder.put(grammarAccess.getParcela_logicaAccess().getAlternatives(), "rule__Parcela_logica__Alternatives");
			builder.put(grammarAccess.getParcelaAccess().getAlternatives_1(), "rule__Parcela__Alternatives_1");
			builder.put(grammarAccess.getOP1Access().getAlternatives(), "rule__OP1__Alternatives");
			builder.put(grammarAccess.getOP2Access().getAlternatives(), "rule__OP2__Alternatives");
			builder.put(grammarAccess.getOPRELACIONALAccess().getAlternatives(), "rule__OPRELACIONAL__Alternatives");
			builder.put(grammarAccess.getBOOLAccess().getAlternatives(), "rule__BOOL__Alternatives");
			builder.put(grammarAccess.getTipoAccess().getAlternatives(), "rule__Tipo__Alternatives");
			builder.put(grammarAccess.getGameAccess().getGroup(), "rule__Game__Group__0");
			builder.put(grammarAccess.getEventoGlobalAccess().getGroup(), "rule__EventoGlobal__Group__0");
			builder.put(grammarAccess.getDeclaracaoAccess().getGroup(), "rule__Declaracao__Group__0");
			builder.put(grammarAccess.getCenaAccess().getGroup(), "rule__Cena__Group__0");
			builder.put(grammarAccess.getImagemAccess().getGroup(), "rule__Imagem__Group__0");
			builder.put(grammarAccess.getImagemAccess().getGroup_2(), "rule__Imagem__Group_2__0");
			builder.put(grammarAccess.getEscolhasAccess().getGroup_1(), "rule__Escolhas__Group_1__0");
			builder.put(grammarAccess.getEscolhasAccess().getGroup_1_7(), "rule__Escolhas__Group_1_7__0");
			builder.put(grammarAccess.getEscolhaAccess().getGroup(), "rule__Escolha__Group__0");
			builder.put(grammarAccess.getEscolhaAccess().getGroup_2(), "rule__Escolha__Group_2__0");
			builder.put(grammarAccess.getEscolhaAccess().getGroup_4_1(), "rule__Escolha__Group_4_1__0");
			builder.put(grammarAccess.getRandomAccess().getGroup(), "rule__Random__Group__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_0(), "rule__Random__Group_4_0__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_0_1(), "rule__Random__Group_4_0_1__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_1(), "rule__Random__Group_4_1__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_1_1(), "rule__Random__Group_4_1_1__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_2(), "rule__Random__Group_4_2__0");
			builder.put(grammarAccess.getRandomAccess().getGroup_4_2_1(), "rule__Random__Group_4_2_1__0");
			builder.put(grammarAccess.getPlaySoundAccess().getGroup(), "rule__PlaySound__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup(), "rule__If__Group__0");
			builder.put(grammarAccess.getIfAccess().getGroup_6(), "rule__If__Group_6__0");
			builder.put(grammarAccess.getIfAccess().getGroup_6_1_1(), "rule__If__Group_6_1_1__0");
			builder.put(grammarAccess.getAtribuicaoAccess().getGroup(), "rule__Atribuicao__Group__0");
			builder.put(grammarAccess.getExpressaoAccess().getGroup(), "rule__Expressao__Group__0");
			builder.put(grammarAccess.getExpressaoAccess().getGroup_1(), "rule__Expressao__Group_1__0");
			builder.put(grammarAccess.getTermoLogicoAccess().getGroup(), "rule__TermoLogico__Group__0");
			builder.put(grammarAccess.getTermoLogicoAccess().getGroup_1(), "rule__TermoLogico__Group_1__0");
			builder.put(grammarAccess.getFatorLogicoAccess().getGroup(), "rule__FatorLogico__Group__0");
			builder.put(grammarAccess.getExpressaoRelacionalAccess().getGroup(), "rule__ExpressaoRelacional__Group__0");
			builder.put(grammarAccess.getExpressaoRelacionalAccess().getGroup_1(), "rule__ExpressaoRelacional__Group_1__0");
			builder.put(grammarAccess.getExpressaoAritmeticaAccess().getGroup(), "rule__ExpressaoAritmetica__Group__0");
			builder.put(grammarAccess.getExpressaoAritmeticaAccess().getGroup_1(), "rule__ExpressaoAritmetica__Group_1__0");
			builder.put(grammarAccess.getTermoAccess().getGroup(), "rule__Termo__Group__0");
			builder.put(grammarAccess.getTermoAccess().getGroup_1(), "rule__Termo__Group_1__0");
			builder.put(grammarAccess.getFatorAccess().getGroup(), "rule__Fator__Group__0");
			builder.put(grammarAccess.getFatorAccess().getGroup_1(), "rule__Fator__Group_1__0");
			builder.put(grammarAccess.getParcelaAccess().getGroup(), "rule__Parcela__Group__0");
			builder.put(grammarAccess.getGameAccess().getLinhaAssignment_1(), "rule__Game__LinhaAssignment_1");
			builder.put(grammarAccess.getGameAccess().getColunaAssignment_3(), "rule__Game__ColunaAssignment_3");
			builder.put(grammarAccess.getGameAccess().getDeclaracoes_globaisAssignment_4(), "rule__Game__Declaracoes_globaisAssignment_4");
			builder.put(grammarAccess.getGameAccess().getEventoAssignment_5(), "rule__Game__EventoAssignment_5");
			builder.put(grammarAccess.getGameAccess().getCenasAssignment_6(), "rule__Game__CenasAssignment_6");
			builder.put(grammarAccess.getEventoGlobalAccess().getComandosAssignment_1(), "rule__EventoGlobal__ComandosAssignment_1");
			builder.put(grammarAccess.getDeclaracaoAccess().getTipoAssignment_0(), "rule__Declaracao__TipoAssignment_0");
			builder.put(grammarAccess.getDeclaracaoAccess().getNameAssignment_1(), "rule__Declaracao__NameAssignment_1");
			builder.put(grammarAccess.getDeclaracaoAccess().getStringAssignment_3_0(), "rule__Declaracao__StringAssignment_3_0");
			builder.put(grammarAccess.getDeclaracaoAccess().getBoolAssignment_3_1(), "rule__Declaracao__BoolAssignment_3_1");
			builder.put(grammarAccess.getDeclaracaoAccess().getIntAssignment_3_2(), "rule__Declaracao__IntAssignment_3_2");
			builder.put(grammarAccess.getDeclaracaoAccess().getZeroAssignment_3_3(), "rule__Declaracao__ZeroAssignment_3_3");
			builder.put(grammarAccess.getCenaAccess().getNameAssignment_1(), "rule__Cena__NameAssignment_1");
			builder.put(grammarAccess.getCenaAccess().getTextosAssignment_3(), "rule__Cena__TextosAssignment_3");
			builder.put(grammarAccess.getCenaAccess().getImagemAssignment_4(), "rule__Cena__ImagemAssignment_4");
			builder.put(grammarAccess.getCenaAccess().getSoundAssignment_5(), "rule__Cena__SoundAssignment_5");
			builder.put(grammarAccess.getCenaAccess().getEscolhasAssignment_6(), "rule__Cena__EscolhasAssignment_6");
			builder.put(grammarAccess.getImagemAccess().getCaminhoAssignment_1(), "rule__Imagem__CaminhoAssignment_1");
			builder.put(grammarAccess.getImagemAccess().getLinhaAssignment_2_1(), "rule__Imagem__LinhaAssignment_2_1");
			builder.put(grammarAccess.getImagemAccess().getColunaAssignment_2_3(), "rule__Imagem__ColunaAssignment_2_3");
			builder.put(grammarAccess.getTextoAccess().getTextAssignment_0(), "rule__Texto__TextAssignment_0");
			builder.put(grammarAccess.getTextoAccess().getVarAssignment_1(), "rule__Texto__VarAssignment_1");
			builder.put(grammarAccess.getEscolhasAccess().getSingleChoiceAssignment_0(), "rule__Escolhas__SingleChoiceAssignment_0");
			builder.put(grammarAccess.getEscolhasAccess().getHasIfAssignment_1_0(), "rule__Escolhas__HasIfAssignment_1_0");
			builder.put(grammarAccess.getEscolhasAccess().getExpressaoIfAssignment_1_2(), "rule__Escolhas__ExpressaoIfAssignment_1_2");
			builder.put(grammarAccess.getEscolhasAccess().getEscolhasIFAssignment_1_5(), "rule__Escolhas__EscolhasIFAssignment_1_5");
			builder.put(grammarAccess.getEscolhasAccess().getHasElseAssignment_1_7_0(), "rule__Escolhas__HasElseAssignment_1_7_0");
			builder.put(grammarAccess.getEscolhasAccess().getEscolhasELSEAssignment_1_7_2(), "rule__Escolhas__EscolhasELSEAssignment_1_7_2");
			builder.put(grammarAccess.getEscolhaAccess().getTextosAssignment_1(), "rule__Escolha__TextosAssignment_1");
			builder.put(grammarAccess.getEscolhaAccess().getComandoAssignment_2_1(), "rule__Escolha__ComandoAssignment_2_1");
			builder.put(grammarAccess.getEscolhaAccess().getIfAssignment_4_0(), "rule__Escolha__IfAssignment_4_0");
			builder.put(grammarAccess.getEscolhaAccess().getIdAssignment_4_1_1(), "rule__Escolha__IdAssignment_4_1_1");
			builder.put(grammarAccess.getRandomAccess().getIdAssignment_2(), "rule__Random__IdAssignment_2");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesIntAssignment_4_0_0(), "rule__Random__PossibilidadesIntAssignment_4_0_0");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesIntAssignment_4_0_1_1(), "rule__Random__PossibilidadesIntAssignment_4_0_1_1");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesStringAssignment_4_1_0(), "rule__Random__PossibilidadesStringAssignment_4_1_0");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesStringAssignment_4_1_1_1(), "rule__Random__PossibilidadesStringAssignment_4_1_1_1");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesBoolAssignment_4_2_0(), "rule__Random__PossibilidadesBoolAssignment_4_2_0");
			builder.put(grammarAccess.getRandomAccess().getPossibilidadesBoolAssignment_4_2_1_1(), "rule__Random__PossibilidadesBoolAssignment_4_2_1_1");
			builder.put(grammarAccess.getPlaySoundAccess().getFile_pathAssignment_2(), "rule__PlaySound__File_pathAssignment_2");
			builder.put(grammarAccess.getIfAccess().getExpressaoIfAssignment_2(), "rule__If__ExpressaoIfAssignment_2");
			builder.put(grammarAccess.getIfAccess().getIdIfAssignment_5(), "rule__If__IdIfAssignment_5");
			builder.put(grammarAccess.getIfAccess().getElifAssignment_6_1_0(), "rule__If__ElifAssignment_6_1_0");
			builder.put(grammarAccess.getIfAccess().getIdElseAssignment_6_1_1_1(), "rule__If__IdElseAssignment_6_1_1_1");
			builder.put(grammarAccess.getAtribuicaoAccess().getIdAssignment_0(), "rule__Atribuicao__IdAssignment_0");
			builder.put(grammarAccess.getAtribuicaoAccess().getExpressaoAssignment_2_0(), "rule__Atribuicao__ExpressaoAssignment_2_0");
			builder.put(grammarAccess.getAtribuicaoAccess().getStringAssignment_2_1(), "rule__Atribuicao__StringAssignment_2_1");
			builder.put(grammarAccess.getExpressaoAccess().getTermosAssignment_0(), "rule__Expressao__TermosAssignment_0");
			builder.put(grammarAccess.getExpressaoAccess().getOuAssignment_1_0(), "rule__Expressao__OuAssignment_1_0");
			builder.put(grammarAccess.getExpressaoAccess().getTermosAssignment_1_1(), "rule__Expressao__TermosAssignment_1_1");
			builder.put(grammarAccess.getTermoLogicoAccess().getFatoresAssignment_0(), "rule__TermoLogico__FatoresAssignment_0");
			builder.put(grammarAccess.getTermoLogicoAccess().getEAssignment_1_0(), "rule__TermoLogico__EAssignment_1_0");
			builder.put(grammarAccess.getTermoLogicoAccess().getFatoresAssignment_1_1(), "rule__TermoLogico__FatoresAssignment_1_1");
			builder.put(grammarAccess.getFatorLogicoAccess().getNaoAssignment_0(), "rule__FatorLogico__NaoAssignment_0");
			builder.put(grammarAccess.getFatorLogicoAccess().getParcelaAssignment_1(), "rule__FatorLogico__ParcelaAssignment_1");
			builder.put(grammarAccess.getParcela_logicaAccess().getPAssignment_0(), "rule__Parcela_logica__PAssignment_0");
			builder.put(grammarAccess.getParcela_logicaAccess().getExpAssignment_1(), "rule__Parcela_logica__ExpAssignment_1");
			builder.put(grammarAccess.getExpressaoRelacionalAccess().getExpressoesAssignment_0(), "rule__ExpressaoRelacional__ExpressoesAssignment_0");
			builder.put(grammarAccess.getExpressaoRelacionalAccess().getOpAssignment_1_0(), "rule__ExpressaoRelacional__OpAssignment_1_0");
			builder.put(grammarAccess.getExpressaoRelacionalAccess().getExpressoesAssignment_1_1(), "rule__ExpressaoRelacional__ExpressoesAssignment_1_1");
			builder.put(grammarAccess.getExpressaoAritmeticaAccess().getTermosAssignment_0(), "rule__ExpressaoAritmetica__TermosAssignment_0");
			builder.put(grammarAccess.getExpressaoAritmeticaAccess().getOpAssignment_1_0(), "rule__ExpressaoAritmetica__OpAssignment_1_0");
			builder.put(grammarAccess.getExpressaoAritmeticaAccess().getTermosAssignment_1_1(), "rule__ExpressaoAritmetica__TermosAssignment_1_1");
			builder.put(grammarAccess.getTermoAccess().getFatoresAssignment_0(), "rule__Termo__FatoresAssignment_0");
			builder.put(grammarAccess.getTermoAccess().getOpAssignment_1_0(), "rule__Termo__OpAssignment_1_0");
			builder.put(grammarAccess.getTermoAccess().getFatoresAssignment_1_1(), "rule__Termo__FatoresAssignment_1_1");
			builder.put(grammarAccess.getFatorAccess().getParcelasAssignment_0(), "rule__Fator__ParcelasAssignment_0");
			builder.put(grammarAccess.getFatorAccess().getOpAssignment_1_0(), "rule__Fator__OpAssignment_1_0");
			builder.put(grammarAccess.getFatorAccess().getParcelasAssignment_1_1(), "rule__Fator__ParcelasAssignment_1_1");
			builder.put(grammarAccess.getParcelaAccess().getSubAssignment_0(), "rule__Parcela__SubAssignment_0");
			builder.put(grammarAccess.getParcelaAccess().getIdAssignment_1_0(), "rule__Parcela__IdAssignment_1_0");
			builder.put(grammarAccess.getParcelaAccess().getIntAssignment_1_1(), "rule__Parcela__IntAssignment_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private PlayLangGrammarAccess grammarAccess;

	@Override
	protected InternalPlayLangParser createParser() {
		InternalPlayLangParser result = new InternalPlayLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public PlayLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlayLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
