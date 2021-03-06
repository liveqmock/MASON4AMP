/*
* generated by Xtext
*/
grammar InternalABase;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package org.eclipse.amp.amf.abase.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.eclipse.amp.amf.abase.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.xtext.parsetree.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.eclipse.amp.amf.abase.services.ABaseGrammarAccess;

}

@parser::members {
 
 	private ABaseGrammarAccess grammarAccess;
 	
    public void setGrammarAccess(ABaseGrammarAccess grammarAccess) {
    	this.grammarAccess = grammarAccess;
    }
    
    @Override
    protected Grammar getGrammar() {
    	return grammarAccess.getGrammar();
    }
    
    @Override
    protected String getValueForTokenName(String tokenName) {
    	return tokenName;
    }

}




// Entry rule entryRuleValue
entryRuleValue 
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getValueAccess().getAlternatives()); }
(rule__Value__Alternatives)
{ after(grammarAccess.getValueAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleIntValue
entryRuleIntValue 
:
{ before(grammarAccess.getIntValueRule()); }
	 ruleIntValue
{ after(grammarAccess.getIntValueRule()); } 
	 EOF 
;

// Rule IntValue
ruleIntValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getIntValueAccess().getValueAssignment()); }
(rule__IntValue__ValueAssignment)
{ after(grammarAccess.getIntValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleRealValue
entryRuleRealValue 
:
{ before(grammarAccess.getRealValueRule()); }
	 ruleRealValue
{ after(grammarAccess.getRealValueRule()); } 
	 EOF 
;

// Rule RealValue
ruleRealValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getRealValueAccess().getValueAssignment()); }
(rule__RealValue__ValueAssignment)
{ after(grammarAccess.getRealValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleStringValue
entryRuleStringValue 
:
{ before(grammarAccess.getStringValueRule()); }
	 ruleStringValue
{ after(grammarAccess.getStringValueRule()); } 
	 EOF 
;

// Rule StringValue
ruleStringValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getStringValueAccess().getValueAssignment()); }
(rule__StringValue__ValueAssignment)
{ after(grammarAccess.getStringValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleBooleanValue
entryRuleBooleanValue 
:
{ before(grammarAccess.getBooleanValueRule()); }
	 ruleBooleanValue
{ after(grammarAccess.getBooleanValueRule()); } 
	 EOF 
;

// Rule BooleanValue
ruleBooleanValue
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
(rule__BooleanValue__ValueAssignment)
{ after(grammarAccess.getBooleanValueAccess().getValueAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}




// Rule BOOLEAN
ruleBOOLEAN
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBOOLEANAccess().getAlternatives()); }
(rule__BOOLEAN__Alternatives)
{ after(grammarAccess.getBOOLEANAccess().getAlternatives()); }
)

;
finally {
	restoreStackSize(stackSize);
}



rule__Value__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); }
	ruleIntValue
{ after(grammarAccess.getValueAccess().getIntValueParserRuleCall_0()); }
)

    |(
{ before(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); }
	ruleStringValue
{ after(grammarAccess.getValueAccess().getStringValueParserRuleCall_1()); }
)

    |(
{ before(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); }
	ruleRealValue
{ after(grammarAccess.getValueAccess().getRealValueParserRuleCall_2()); }
)

    |(
{ before(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); }
	ruleBooleanValue
{ after(grammarAccess.getValueAccess().getBooleanValueParserRuleCall_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BOOLEAN__Alternatives
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); }
(	'true' 
)
{ after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); }
)

    |(
{ before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); }
(	'false' 
)
{ after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}




rule__IntValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); }
	RULE_INTEGER{ after(grammarAccess.getIntValueAccess().getValueINTEGERTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__RealValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); }
	RULE_REAL{ after(grammarAccess.getRealValueAccess().getValueREALTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__StringValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
	RULE_STRING{ after(grammarAccess.getStringValueAccess().getValueSTRINGTerminalRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValue__ValueAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); }
	ruleBOOLEAN{ after(grammarAccess.getBooleanValueAccess().getValueBOOLEANEnumRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_INTEGER : '-'? ('0'..'9')+;

RULE_REAL : '-'? ('0'..'9')* '.' ('0'..'9')*;

RULE_DESC_STRING : '\u00AB' ('\\' ('b'|'t'|'n'|'f'|'r'|'\u00AB'|'\u00BB'|'\\')|~(('\\'|'\u00AB'|'\u00BB')))* '\u00BB';

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


