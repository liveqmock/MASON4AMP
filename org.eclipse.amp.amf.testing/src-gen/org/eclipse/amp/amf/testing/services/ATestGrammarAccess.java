/*
* generated by Xtext
*/

package org.eclipse.amp.amf.testing.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.amp.amf.abase.services.ABaseGrammarAccess;

@Singleton
public class ATestGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Model");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cModelAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameSTRINGTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cDescriptionAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDescriptionDESC_STRINGTerminalRuleCall_2_0 = (RuleCall)cDescriptionAssignment_2.eContents().get(0);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Group cGroup_3_0 = (Group)cAlternatives_3.eContents().get(0);
		private final Group cGroup_3_0_0 = (Group)cGroup_3_0.eContents().get(0);
		private final Keyword cTestsKeyword_3_0_0_0 = (Keyword)cGroup_3_0_0.eContents().get(0);
		private final Assignment cTestsAssignment_3_0_0_1 = (Assignment)cGroup_3_0_0.eContents().get(1);
		private final RuleCall cTestsTestsParserRuleCall_3_0_0_1_0 = (RuleCall)cTestsAssignment_3_0_0_1.eContents().get(0);
		private final Assignment cContraintsAssignment_3_0_1 = (Assignment)cGroup_3_0.eContents().get(1);
		private final RuleCall cContraintsConstraintParserRuleCall_3_0_1_0 = (RuleCall)cContraintsAssignment_3_0_1.eContents().get(0);
		private final Group cGroup_3_1 = (Group)cAlternatives_3.eContents().get(1);
		private final Keyword cContainsKeyword_3_1_0 = (Keyword)cGroup_3_1.eContents().get(0);
		private final Assignment cContainsAssignment_3_1_1 = (Assignment)cGroup_3_1.eContents().get(1);
		private final RuleCall cContainsTestMemberParserRuleCall_3_1_1_0 = (RuleCall)cContainsAssignment_3_1_1.eContents().get(0);
		
		//Model:
		//	{Model} name=STRING? description=DESC_STRING? (("tests" tests=Tests)? contraints+=Constraint+ | "contains"
		//	contains+=TestMember*)?;
		public ParserRule getRule() { return rule; }

		//{Model} name=STRING? description=DESC_STRING? (("tests" tests=Tests)? contraints+=Constraint+ | "contains"
		//contains+=TestMember*)?
		public Group getGroup() { return cGroup; }

		//{Model}
		public Action getModelAction_0() { return cModelAction_0; }

		//name=STRING?
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//STRING
		public RuleCall getNameSTRINGTerminalRuleCall_1_0() { return cNameSTRINGTerminalRuleCall_1_0; }

		//description=DESC_STRING?
		public Assignment getDescriptionAssignment_2() { return cDescriptionAssignment_2; }

		//DESC_STRING
		public RuleCall getDescriptionDESC_STRINGTerminalRuleCall_2_0() { return cDescriptionDESC_STRINGTerminalRuleCall_2_0; }

		//(("tests" tests=Tests)? contraints+=Constraint+ | "contains" contains+=TestMember*)?
		public Alternatives getAlternatives_3() { return cAlternatives_3; }

		//("tests" tests=Tests)? contraints+=Constraint+
		public Group getGroup_3_0() { return cGroup_3_0; }

		//("tests" tests=Tests)?
		public Group getGroup_3_0_0() { return cGroup_3_0_0; }

		//"tests"
		public Keyword getTestsKeyword_3_0_0_0() { return cTestsKeyword_3_0_0_0; }

		//tests=Tests
		public Assignment getTestsAssignment_3_0_0_1() { return cTestsAssignment_3_0_0_1; }

		//Tests
		public RuleCall getTestsTestsParserRuleCall_3_0_0_1_0() { return cTestsTestsParserRuleCall_3_0_0_1_0; }

		//contraints+=Constraint+
		public Assignment getContraintsAssignment_3_0_1() { return cContraintsAssignment_3_0_1; }

		//Constraint
		public RuleCall getContraintsConstraintParserRuleCall_3_0_1_0() { return cContraintsConstraintParserRuleCall_3_0_1_0; }

		//"contains" contains+=TestMember*
		public Group getGroup_3_1() { return cGroup_3_1; }

		//"contains"
		public Keyword getContainsKeyword_3_1_0() { return cContainsKeyword_3_1_0; }

		//contains+=TestMember*
		public Assignment getContainsAssignment_3_1_1() { return cContainsAssignment_3_1_1; }

		//TestMember
		public RuleCall getContainsTestMemberParserRuleCall_3_1_1_0() { return cContainsTestMemberParserRuleCall_3_1_1_0; }
	}

	public class TestsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Tests");
		private final Assignment cImportURIAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_0 = (RuleCall)cImportURIAssignment.eContents().get(0);
		
		//Tests:
		//	importURI=STRING;
		public ParserRule getRule() { return rule; }

		//importURI=STRING
		public Assignment getImportURIAssignment() { return cImportURIAssignment; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_0() { return cImportURISTRINGTerminalRuleCall_0; }
	}

	public class TestMemberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "TestMember");
		private final Assignment cImportURIAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cImportURISTRINGTerminalRuleCall_0 = (RuleCall)cImportURIAssignment.eContents().get(0);
		
		//TestMember:
		//	importURI=STRING;
		public ParserRule getRule() { return rule; }

		//importURI=STRING
		public Assignment getImportURIAssignment() { return cImportURIAssignment; }

		//STRING
		public RuleCall getImportURISTRINGTerminalRuleCall_0() { return cImportURISTRINGTerminalRuleCall_0; }
	}

	public class ConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Constraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cMeasureAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cMeasureMeasureEnumRuleCall_0_0 = (RuleCall)cMeasureAssignment_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cAgentAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final CrossReference cAgentSAgentCrossReference_2_0 = (CrossReference)cAgentAssignment_2.eContents().get(0);
		private final RuleCall cAgentSAgentIDTerminalRuleCall_2_0_1 = (RuleCall)cAgentSAgentCrossReference_2_0.eContents().get(1);
		private final Keyword cFullStopKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cAttributeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final CrossReference cAttributeSAttributeCrossReference_4_0 = (CrossReference)cAttributeAssignment_4.eContents().get(0);
		private final RuleCall cAttributeSAttributeIDTerminalRuleCall_4_0_1 = (RuleCall)cAttributeSAttributeCrossReference_4_0.eContents().get(1);
		private final Group cGroup_5 = (Group)cGroup.eContents().get(5);
		private final Keyword cEqualsSignKeyword_5_0 = (Keyword)cGroup_5.eContents().get(0);
		private final Assignment cQualifierAssignment_5_1 = (Assignment)cGroup_5.eContents().get(1);
		private final CrossReference cQualifierSStateValueCrossReference_5_1_0 = (CrossReference)cQualifierAssignment_5_1.eContents().get(0);
		private final RuleCall cQualifierSStateValueIDTerminalRuleCall_5_1_0_1 = (RuleCall)cQualifierSStateValueCrossReference_5_1_0.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Group cGroup_7 = (Group)cGroup.eContents().get(7);
		private final Keyword cEqualsSignKeyword_7_0 = (Keyword)cGroup_7.eContents().get(0);
		private final Keyword cLeftSquareBracketKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cMinValueAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cMinValueValueParserRuleCall_7_2_0 = (RuleCall)cMinValueAssignment_7_2.eContents().get(0);
		private final Keyword cCommaKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		private final Assignment cMaxValueAssignment_7_4 = (Assignment)cGroup_7.eContents().get(4);
		private final RuleCall cMaxValueValueParserRuleCall_7_4_0 = (RuleCall)cMaxValueAssignment_7_4.eContents().get(0);
		private final Keyword cRightSquareBracketKeyword_7_5 = (Keyword)cGroup_7.eContents().get(5);
		
		//Constraint:
		//	measure=Measure "(" agent=[SAgent] "." attribute=[SAttribute] ("=" qualifier=[SStateValue])? ")" ("=" "["
		//	minValue=Value "," maxValue=Value "]");
		public ParserRule getRule() { return rule; }

		//measure=Measure "(" agent=[SAgent] "." attribute=[SAttribute] ("=" qualifier=[SStateValue])? ")" ("=" "[" minValue=Value
		//"," maxValue=Value "]")
		public Group getGroup() { return cGroup; }

		//measure=Measure
		public Assignment getMeasureAssignment_0() { return cMeasureAssignment_0; }

		//Measure
		public RuleCall getMeasureMeasureEnumRuleCall_0_0() { return cMeasureMeasureEnumRuleCall_0_0; }

		//"("
		public Keyword getLeftParenthesisKeyword_1() { return cLeftParenthesisKeyword_1; }

		//agent=[SAgent]
		public Assignment getAgentAssignment_2() { return cAgentAssignment_2; }

		//[SAgent]
		public CrossReference getAgentSAgentCrossReference_2_0() { return cAgentSAgentCrossReference_2_0; }

		//ID
		public RuleCall getAgentSAgentIDTerminalRuleCall_2_0_1() { return cAgentSAgentIDTerminalRuleCall_2_0_1; }

		//"."
		public Keyword getFullStopKeyword_3() { return cFullStopKeyword_3; }

		//attribute=[SAttribute]
		public Assignment getAttributeAssignment_4() { return cAttributeAssignment_4; }

		//[SAttribute]
		public CrossReference getAttributeSAttributeCrossReference_4_0() { return cAttributeSAttributeCrossReference_4_0; }

		//ID
		public RuleCall getAttributeSAttributeIDTerminalRuleCall_4_0_1() { return cAttributeSAttributeIDTerminalRuleCall_4_0_1; }

		//("=" qualifier=[SStateValue])?
		public Group getGroup_5() { return cGroup_5; }

		//"="
		public Keyword getEqualsSignKeyword_5_0() { return cEqualsSignKeyword_5_0; }

		//qualifier=[SStateValue]
		public Assignment getQualifierAssignment_5_1() { return cQualifierAssignment_5_1; }

		//[SStateValue]
		public CrossReference getQualifierSStateValueCrossReference_5_1_0() { return cQualifierSStateValueCrossReference_5_1_0; }

		//ID
		public RuleCall getQualifierSStateValueIDTerminalRuleCall_5_1_0_1() { return cQualifierSStateValueIDTerminalRuleCall_5_1_0_1; }

		//")"
		public Keyword getRightParenthesisKeyword_6() { return cRightParenthesisKeyword_6; }

		//"=" "[" minValue=Value "," maxValue=Value "]"
		public Group getGroup_7() { return cGroup_7; }

		//"="
		public Keyword getEqualsSignKeyword_7_0() { return cEqualsSignKeyword_7_0; }

		//"["
		public Keyword getLeftSquareBracketKeyword_7_1() { return cLeftSquareBracketKeyword_7_1; }

		//minValue=Value
		public Assignment getMinValueAssignment_7_2() { return cMinValueAssignment_7_2; }

		//Value
		public RuleCall getMinValueValueParserRuleCall_7_2_0() { return cMinValueValueParserRuleCall_7_2_0; }

		//","
		public Keyword getCommaKeyword_7_3() { return cCommaKeyword_7_3; }

		//maxValue=Value
		public Assignment getMaxValueAssignment_7_4() { return cMaxValueAssignment_7_4; }

		//Value
		public RuleCall getMaxValueValueParserRuleCall_7_4_0() { return cMaxValueValueParserRuleCall_7_4_0; }

		//"]"
		public Keyword getRightSquareBracketKeyword_7_5() { return cRightSquareBracketKeyword_7_5; }
	}
	
	
	public class MeasureElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "Measure");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cCOUNTEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cCOUNTCountKeyword_0_0 = (Keyword)cCOUNTEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cAVERAGEEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cAVERAGEAverageKeyword_1_0 = (Keyword)cAVERAGEEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cSUMEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cSUMSumKeyword_2_0 = (Keyword)cSUMEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cMINIMUMEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cMINIMUMMinimumKeyword_3_0 = (Keyword)cMINIMUMEnumLiteralDeclaration_3.eContents().get(0);
		private final EnumLiteralDeclaration cMAXIMUMEnumLiteralDeclaration_4 = (EnumLiteralDeclaration)cAlternatives.eContents().get(4);
		private final Keyword cMAXIMUMMaximumKeyword_4_0 = (Keyword)cMAXIMUMEnumLiteralDeclaration_4.eContents().get(0);
		
		//enum Measure:
		//	COUNT="Count" | AVERAGE="Average" | SUM="Sum" | MINIMUM="Minimum" | MAXIMUM="Maximum";
		public EnumRule getRule() { return rule; }

		//COUNT="Count" | AVERAGE="Average" | SUM="Sum" | MINIMUM="Minimum" | MAXIMUM="Maximum"
		public Alternatives getAlternatives() { return cAlternatives; }

		//COUNT="Count"
		public EnumLiteralDeclaration getCOUNTEnumLiteralDeclaration_0() { return cCOUNTEnumLiteralDeclaration_0; }

		//"Count"
		public Keyword getCOUNTCountKeyword_0_0() { return cCOUNTCountKeyword_0_0; }

		//AVERAGE="Average"
		public EnumLiteralDeclaration getAVERAGEEnumLiteralDeclaration_1() { return cAVERAGEEnumLiteralDeclaration_1; }

		//"Average"
		public Keyword getAVERAGEAverageKeyword_1_0() { return cAVERAGEAverageKeyword_1_0; }

		//SUM="Sum"
		public EnumLiteralDeclaration getSUMEnumLiteralDeclaration_2() { return cSUMEnumLiteralDeclaration_2; }

		//"Sum"
		public Keyword getSUMSumKeyword_2_0() { return cSUMSumKeyword_2_0; }

		//MINIMUM="Minimum"
		public EnumLiteralDeclaration getMINIMUMEnumLiteralDeclaration_3() { return cMINIMUMEnumLiteralDeclaration_3; }

		//"Minimum"
		public Keyword getMINIMUMMinimumKeyword_3_0() { return cMINIMUMMinimumKeyword_3_0; }

		//MAXIMUM="Maximum"
		public EnumLiteralDeclaration getMAXIMUMEnumLiteralDeclaration_4() { return cMAXIMUMEnumLiteralDeclaration_4; }

		//"Maximum"
		public Keyword getMAXIMUMMaximumKeyword_4_0() { return cMAXIMUMMaximumKeyword_4_0; }
	}
	
	private ModelElements pModel;
	private TestsElements pTests;
	private TestMemberElements pTestMember;
	private ConstraintElements pConstraint;
	private MeasureElements unknownRuleMeasure;
	
	private final GrammarProvider grammarProvider;

	private ABaseGrammarAccess gaABase;

	@Inject
	public ATestGrammarAccess(GrammarProvider grammarProvider,
		ABaseGrammarAccess gaABase) {
		this.grammarProvider = grammarProvider;
		this.gaABase = gaABase;
	}
	
	public Grammar getGrammar() {	
		return grammarProvider.getGrammar(this);
	}
	

	public ABaseGrammarAccess getABaseGrammarAccess() {
		return gaABase;
	}

	
	//Model:
	//	{Model} name=STRING? description=DESC_STRING? (("tests" tests=Tests)? contraints+=Constraint+ | "contains"
	//	contains+=TestMember*)?;
	public ModelElements getModelAccess() {
		return (pModel != null) ? pModel : (pModel = new ModelElements());
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}

	//Tests:
	//	importURI=STRING;
	public TestsElements getTestsAccess() {
		return (pTests != null) ? pTests : (pTests = new TestsElements());
	}
	
	public ParserRule getTestsRule() {
		return getTestsAccess().getRule();
	}

	//TestMember:
	//	importURI=STRING;
	public TestMemberElements getTestMemberAccess() {
		return (pTestMember != null) ? pTestMember : (pTestMember = new TestMemberElements());
	}
	
	public ParserRule getTestMemberRule() {
		return getTestMemberAccess().getRule();
	}

	//Constraint:
	//	measure=Measure "(" agent=[SAgent] "." attribute=[SAttribute] ("=" qualifier=[SStateValue])? ")" ("=" "["
	//	minValue=Value "," maxValue=Value "]");
	public ConstraintElements getConstraintAccess() {
		return (pConstraint != null) ? pConstraint : (pConstraint = new ConstraintElements());
	}
	
	public ParserRule getConstraintRule() {
		return getConstraintAccess().getRule();
	}

	//enum Measure:
	//	COUNT="Count" | AVERAGE="Average" | SUM="Sum" | MINIMUM="Minimum" | MAXIMUM="Maximum";
	public MeasureElements getMeasureAccess() {
		return (unknownRuleMeasure != null) ? unknownRuleMeasure : (unknownRuleMeasure = new MeasureElements());
	}
	
	public EnumRule getMeasureRule() {
		return getMeasureAccess().getRule();
	}

	//Value:
	//	IntValue | StringValue | RealValue | BooleanValue;
	public ABaseGrammarAccess.ValueElements getValueAccess() {
		return gaABase.getValueAccess();
	}
	
	public ParserRule getValueRule() {
		return getValueAccess().getRule();
	}

	//IntValue:
	//	value=INTEGER;
	public ABaseGrammarAccess.IntValueElements getIntValueAccess() {
		return gaABase.getIntValueAccess();
	}
	
	public ParserRule getIntValueRule() {
		return getIntValueAccess().getRule();
	}

	//RealValue:
	//	value=REAL;
	public ABaseGrammarAccess.RealValueElements getRealValueAccess() {
		return gaABase.getRealValueAccess();
	}
	
	public ParserRule getRealValueRule() {
		return getRealValueAccess().getRule();
	}

	//StringValue:
	//	value=STRING;
	public ABaseGrammarAccess.StringValueElements getStringValueAccess() {
		return gaABase.getStringValueAccess();
	}
	
	public ParserRule getStringValueRule() {
		return getStringValueAccess().getRule();
	}

	//BooleanValue:
	//	value=BOOLEAN;
	public ABaseGrammarAccess.BooleanValueElements getBooleanValueAccess() {
		return gaABase.getBooleanValueAccess();
	}
	
	public ParserRule getBooleanValueRule() {
		return getBooleanValueAccess().getRule();
	}

	//enum BOOLEAN:
	//	TRUE="true" | FALSE="false";
	public ABaseGrammarAccess.BOOLEANElements getBOOLEANAccess() {
		return gaABase.getBOOLEANAccess();
	}
	
	public EnumRule getBOOLEANRule() {
		return getBOOLEANAccess().getRule();
	}

	//terminal INTEGER:
	//	"-"? "0".."9"+;
	public TerminalRule getINTEGERRule() {
		return gaABase.getINTEGERRule();
	} 

	//terminal REAL:
	//	"-"? "0".."9"* "." "0".."9"*;
	public TerminalRule getREALRule() {
		return gaABase.getREALRule();
	} 

	//terminal DESC_STRING:
	//	"�" ("\\" ("b" | "t" | "n" | "f" | "r" | "�" | "�" | "\\") | !("\\" | "�" | "�"))* "�";
	public TerminalRule getDESC_STRINGRule() {
		return gaABase.getDESC_STRINGRule();
	} 

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaABase.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaABase.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaABase.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaABase.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaABase.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaABase.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaABase.getANY_OTHERRule();
	} 
}
