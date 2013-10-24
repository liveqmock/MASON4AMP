/*
* generated by Xtext
*/
package org.eclipse.amp.amf.testing.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.amp.amf.testing.services.ATestGrammarAccess;

public class ATestParser extends AbstractContentAssistParser {
	
	@Inject
	private ATestGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal.InternalATestParser createParser() {
		org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal.InternalATestParser result = new org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal.InternalATestParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getModelAccess().getAlternatives_3(), "rule__Model__Alternatives_3");
					put(grammarAccess.getValueAccess().getAlternatives(), "rule__Value__Alternatives");
					put(grammarAccess.getMeasureAccess().getAlternatives(), "rule__Measure__Alternatives");
					put(grammarAccess.getBOOLEANAccess().getAlternatives(), "rule__BOOLEAN__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getModelAccess().getGroup_3_0(), "rule__Model__Group_3_0__0");
					put(grammarAccess.getModelAccess().getGroup_3_0_0(), "rule__Model__Group_3_0_0__0");
					put(grammarAccess.getModelAccess().getGroup_3_1(), "rule__Model__Group_3_1__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup_5(), "rule__Constraint__Group_5__0");
					put(grammarAccess.getConstraintAccess().getGroup_7(), "rule__Constraint__Group_7__0");
					put(grammarAccess.getModelAccess().getNameAssignment_1(), "rule__Model__NameAssignment_1");
					put(grammarAccess.getModelAccess().getDescriptionAssignment_2(), "rule__Model__DescriptionAssignment_2");
					put(grammarAccess.getModelAccess().getTestsAssignment_3_0_0_1(), "rule__Model__TestsAssignment_3_0_0_1");
					put(grammarAccess.getModelAccess().getContraintsAssignment_3_0_1(), "rule__Model__ContraintsAssignment_3_0_1");
					put(grammarAccess.getModelAccess().getContainsAssignment_3_1_1(), "rule__Model__ContainsAssignment_3_1_1");
					put(grammarAccess.getTestsAccess().getImportURIAssignment(), "rule__Tests__ImportURIAssignment");
					put(grammarAccess.getTestMemberAccess().getImportURIAssignment(), "rule__TestMember__ImportURIAssignment");
					put(grammarAccess.getConstraintAccess().getMeasureAssignment_0(), "rule__Constraint__MeasureAssignment_0");
					put(grammarAccess.getConstraintAccess().getAgentAssignment_2(), "rule__Constraint__AgentAssignment_2");
					put(grammarAccess.getConstraintAccess().getAttributeAssignment_4(), "rule__Constraint__AttributeAssignment_4");
					put(grammarAccess.getConstraintAccess().getQualifierAssignment_5_1(), "rule__Constraint__QualifierAssignment_5_1");
					put(grammarAccess.getConstraintAccess().getMinValueAssignment_7_2(), "rule__Constraint__MinValueAssignment_7_2");
					put(grammarAccess.getConstraintAccess().getMaxValueAssignment_7_4(), "rule__Constraint__MaxValueAssignment_7_4");
					put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
					put(grammarAccess.getRealValueAccess().getValueAssignment(), "rule__RealValue__ValueAssignment");
					put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
					put(grammarAccess.getBooleanValueAccess().getValueAssignment(), "rule__BooleanValue__ValueAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal.InternalATestParser typedParser = (org.eclipse.amp.amf.testing.ui.contentassist.antlr.internal.InternalATestParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public ATestGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(ATestGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
