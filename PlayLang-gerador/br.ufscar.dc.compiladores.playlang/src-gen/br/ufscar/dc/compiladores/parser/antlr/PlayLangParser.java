/*
 * generated by Xtext 2.23.0
 */
package br.ufscar.dc.compiladores.parser.antlr;

import br.ufscar.dc.compiladores.parser.antlr.internal.InternalPlayLangParser;
import br.ufscar.dc.compiladores.services.PlayLangGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class PlayLangParser extends AbstractAntlrParser {

	@Inject
	private PlayLangGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalPlayLangParser createParser(XtextTokenStream stream) {
		return new InternalPlayLangParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Game";
	}

	public PlayLangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(PlayLangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}