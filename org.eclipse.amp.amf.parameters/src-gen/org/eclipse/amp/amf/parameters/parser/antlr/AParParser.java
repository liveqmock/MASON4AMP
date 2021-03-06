/*
* generated by Xtext
*/
package org.eclipse.amp.amf.parameters.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.amp.amf.parameters.services.AParGrammarAccess;

public class AParParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AParGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.eclipse.amp.amf.parameters.parser.antlr.internal.InternalAParParser createParser(XtextTokenStream stream) {
		return new org.eclipse.amp.amf.parameters.parser.antlr.internal.InternalAParParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}
	
	public AParGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AParGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
