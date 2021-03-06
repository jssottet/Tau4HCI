/*
* generated by Xtext
*/
grammar InternalTauHCI;

options {
	superClass=AbstractInternalAntlrParser;
	
}

@lexer::header {
package tudor.lu.modeling.transformation.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package tudor.lu.modeling.transformation.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tudor.lu.modeling.transformation.services.TauHCIGrammarAccess;

}

@parser::members {

 	private TauHCIGrammarAccess grammarAccess;
 	
    public InternalTauHCIParser(TokenStream input, TauHCIGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }
    
    @Override
    protected String getFirstRuleName() {
    	return "Model";	
   	}
   	
   	@Override
   	protected TauHCIGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}
}

@rulecatch { 
    catch (RecognitionException re) { 
        recover(input,re); 
        appendSkippedTokens();
    } 
}




// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	 iv_ruleModel=ruleModel 
	 { $current=$iv_ruleModel.current; } 
	 EOF 
;

// Rule Model
ruleModel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
((
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0_0()); 
	    }
		lv_rules_0_0=ruleRule		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"rules",
        		lv_rules_0_0, 
        		"Rule");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getSpecificRulesSpecificParserRuleCall_1_0()); 
	    }
		lv_specificRules_1_0=ruleSpecific		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"specificRules",
        		lv_specificRules_1_0, 
        		"Specific");
	        afterParserOrEnumRuleCall();
	    }

)
)*(
(
		{ 
	        newCompositeNode(grammarAccess.getModelAccess().getDomainRulesDomainParserRuleCall_2_0()); 
	    }
		lv_domainRules_2_0=ruleDomain		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getModelRule());
	        }
       		add(
       			$current, 
       			"domainRules",
        		lv_domainRules_2_0, 
        		"Domain");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	 iv_ruleRule=ruleRule 
	 { $current=$iv_ruleRule.current; } 
	 EOF 
;

// Rule Rule
ruleRule returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='task rule from' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getTaskRuleFromKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getAuitypeTypeParserRuleCall_1_0()); 
	    }
		lv_auitype_1_0=ruleType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"auitype",
        		lv_auitype_1_0, 
        		"Type");
	        afterParserOrEnumRuleCall();
	    }

)
)((	otherlv_2='and' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getAndKeyword_2_0_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getTaskTypeAUITypeParserRuleCall_2_0_1_0()); 
	    }
		lv_taskType_3_0=ruleAUIType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"taskType",
        		lv_taskType_3_0, 
        		"AUIType");
	        afterParserOrEnumRuleCall();
	    }

)
))
    |(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getInteractivelyValidValidParserRuleCall_2_1_0()); 
	    }
		lv_interactivelyValid_4_0=ruleValid		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"interactivelyValid",
        		lv_interactivelyValid_4_0, 
        		"Valid");
	        afterParserOrEnumRuleCall();
	    }

)
))?	otherlv_5='to' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getToKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getRuleAccess().getUielementUIElementParserRuleCall_4_0()); 
	    }
		lv_uielement_6_0=ruleUIElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getRuleRule());
	        }
       		set(
       			$current, 
       			"uielement",
        		lv_uielement_6_0, 
        		"UIElement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_7=';' 
    {
    	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleSpecific
entryRuleSpecific returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSpecificRule()); }
	 iv_ruleSpecific=ruleSpecific 
	 { $current=$iv_ruleSpecific.current; } 
	 EOF 
;

// Rule Specific
ruleSpecific returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='specific rule from' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSpecificAccess().getSpecificRuleFromKeyword_0());
    }
(
(
		lv_taskName_1_0=RULE_STRING
		{
			newLeafNode(lv_taskName_1_0, grammarAccess.getSpecificAccess().getTaskNameSTRINGTerminalRuleCall_1_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSpecificRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"taskName",
        		lv_taskName_1_0, 
        		"STRING");
	    }

)
)(	otherlv_2='interactivelyValid' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getSpecificAccess().getInteractivelyValidKeyword_2());
    }
)?	otherlv_3='to' 
    {
    	newLeafNode(otherlv_3, grammarAccess.getSpecificAccess().getToKeyword_3());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getSpecificAccess().getUielementUIElementParserRuleCall_4_0()); 
	    }
		lv_uielement_4_0=ruleUIElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getSpecificRule());
	        }
       		add(
       			$current, 
       			"uielement",
        		lv_uielement_4_0, 
        		"UIElement");
	        afterParserOrEnumRuleCall();
	    }

)
)*	otherlv_5=';' 
    {
    	newLeafNode(otherlv_5, grammarAccess.getSpecificAccess().getSemicolonKeyword_5());
    }
)
;





// Entry rule entryRuleDomain
entryRuleDomain returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDomainRule()); }
	 iv_ruleDomain=ruleDomain 
	 { $current=$iv_ruleDomain.current; } 
	 EOF 
;

// Rule Domain
ruleDomain returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='domain rule from' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainRuleFromKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainAccess().getDomainTypeAttributeTypeParserRuleCall_1_0()); 
	    }
		lv_domainType_1_0=ruleAttributeType		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainRule());
	        }
       		set(
       			$current, 
       			"domainType",
        		lv_domainType_1_0, 
        		"AttributeType");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_2='to' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getToKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDomainAccess().getUielementUIElementParserRuleCall_3_0()); 
	    }
		lv_uielement_3_0=ruleUIElement		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDomainRule());
	        }
       		set(
       			$current, 
       			"uielement",
        		lv_uielement_3_0, 
        		"UIElement");
	        afterParserOrEnumRuleCall();
	    }

)
)	otherlv_4=';' 
    {
    	newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getSemicolonKeyword_4());
    }
)
;





// Entry rule entryRuleValid
entryRuleValid returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getValidRule()); } 
	 iv_ruleValid=ruleValid 
	 { $current=$iv_ruleValid.current.getText(); }  
	 EOF 
;

// Rule Valid
ruleValid returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='interactive' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValidAccess().getInteractiveKeyword_0()); 
    }

    |
	kw='notinteractive' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getValidAccess().getNotinteractiveKeyword_1()); 
    }
)
    ;







// Entry rule entryRuleType
entryRuleType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getTypeRule()); } 
	 iv_ruleType=ruleType 
	 { $current=$iv_ruleType.current.getText(); }  
	 EOF 
;

// Rule Type
ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='selection_1_n' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getSelection_1_nKeyword_0()); 
    }

    |
	kw='selection_n_n' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getSelection_n_nKeyword_1()); 
    }

    |
	kw='container' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getContainerKeyword_2()); 
    }

    |
	kw='input' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getInputKeyword_3()); 
    }

    |
	kw='output' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getOutputKeyword_4()); 
    }

    |
	kw='command' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getCommandKeyword_5()); 
    }

    |
	kw='navigation' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getNavigationKeyword_6()); 
    }

    |
	kw='Root' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getTypeAccess().getRootKeyword_7()); 
    }
)
    ;





// Entry rule entryRuleAUIType
entryRuleAUIType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getAUITypeRule()); } 
	 iv_ruleAUIType=ruleAUIType 
	 { $current=$iv_ruleAUIType.current.getText(); }  
	 EOF 
;

// Rule AUIType
ruleAUIType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='abstract' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAUITypeAccess().getAbstractKeyword_0()); 
    }

    |
	kw='interactive' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAUITypeAccess().getInteractiveKeyword_1()); 
    }

    |
	kw='user' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAUITypeAccess().getUserKeyword_2()); 
    }

    |
	kw='system' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAUITypeAccess().getSystemKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleUIElement
entryRuleUIElement returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getUIElementRule()); }
	 iv_ruleUIElement=ruleUIElement 
	 { $current=$iv_ruleUIElement.current; } 
	 EOF 
;

// Rule UIElement
ruleUIElement returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getWindowParserRuleCall_0()); 
    }
    this_Window_0=ruleWindow
    { 
        $current = $this_Window_0.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getListElementSelectorParserRuleCall_1()); 
    }
    this_ListElementSelector_1=ruleListElementSelector
    { 
        $current = $this_ListElementSelector_1.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getButtonParserRuleCall_2()); 
    }
    this_Button_2=ruleButton
    { 
        $current = $this_Button_2.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getPanelParserRuleCall_3()); 
    }
    this_Panel_3=rulePanel
    { 
        $current = $this_Panel_3.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getDataFieldParserRuleCall_4()); 
    }
    this_DataField_4=ruleDataField
    { 
        $current = $this_DataField_4.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getImageFieldParserRuleCall_5()); 
    }
    this_ImageField_5=ruleImageField
    { 
        $current = $this_ImageField_5.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getTextFieldParserRuleCall_6()); 
    }
    this_TextField_6=ruleTextField
    { 
        $current = $this_TextField_6.current; 
        afterParserOrEnumRuleCall();
    }

    |
    { 
        newCompositeNode(grammarAccess.getUIElementAccess().getTextAreaParserRuleCall_7()); 
    }
    this_TextArea_7=ruleTextArea
    { 
        $current = $this_TextArea_7.current; 
        afterParserOrEnumRuleCall();
    }
)
;





// Entry rule entryRuleAttributeType
entryRuleAttributeType returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getAttributeTypeRule()); } 
	 iv_ruleAttributeType=ruleAttributeType 
	 { $current=$iv_ruleAttributeType.current.getText(); }  
	 EOF 
;

// Rule AttributeType
ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(
	kw='string' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 
    }

    |
	kw='text' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getTextKeyword_1()); 
    }

    |
	kw='document' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDocumentKeyword_2()); 
    }

    |
	kw='date' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDateKeyword_3()); 
    }
)
    ;





// Entry rule entryRuleLabel
entryRuleLabel returns [String current=null] 
	:
	{ newCompositeNode(grammarAccess.getLabelRule()); } 
	 iv_ruleLabel=ruleLabel 
	 { $current=$iv_ruleLabel.current.getText(); }  
	 EOF 
;

// Rule Label
ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(    this_STRING_0=RULE_STRING    {
		$current.merge(this_STRING_0);
    }

    { 
    newLeafNode(this_STRING_0, grammarAccess.getLabelAccess().getSTRINGTerminalRuleCall_0()); 
    }

    |
	kw='taskName' 
    {
        $current.merge(kw);
        newLeafNode(kw, grammarAccess.getLabelAccess().getTaskNameKeyword_1()); 
    }
)
    ;





// Entry rule entryRuleWindow
entryRuleWindow returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getWindowRule()); }
	 iv_ruleWindow=ruleWindow 
	 { $current=$iv_ruleWindow.current; } 
	 EOF 
;

// Rule Window
ruleWindow returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Window' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getWindowKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWindowAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWindowRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='with' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getWithKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getWindowAccess().getContainedElementsConceptParserRuleCall_3_0()); 
	    }
		lv_containedElements_3_0=ruleConcept		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getWindowRule());
	        }
       		add(
       			$current, 
       			"containedElements",
        		lv_containedElements_3_0, 
        		"Concept");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRulePanel
entryRulePanel returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getPanelRule()); }
	 iv_rulePanel=rulePanel 
	 { $current=$iv_rulePanel.current; } 
	 EOF 
;

// Rule Panel
rulePanel returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Panel' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPanelAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPanelRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?	otherlv_2='with' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getWithKeyword_2());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getPanelAccess().getContainedElementsConceptParserRuleCall_3_0()); 
	    }
		lv_containedElements_3_0=ruleConcept		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getPanelRule());
	        }
       		add(
       			$current, 
       			"containedElements",
        		lv_containedElements_3_0, 
        		"Concept");
	        afterParserOrEnumRuleCall();
	    }

)
))
;





// Entry rule entryRuleListElementSelector
entryRuleListElementSelector returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getListElementSelectorRule()); }
	 iv_ruleListElementSelector=ruleListElementSelector 
	 { $current=$iv_ruleListElementSelector.current; } 
	 EOF 
;

// Rule ListElementSelector
ruleListElementSelector returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ListElementSelector' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getListElementSelectorAccess().getListElementSelectorKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getListElementSelectorAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListElementSelectorRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?(	otherlv_2='with' 
    {
    	newLeafNode(otherlv_2, grammarAccess.getListElementSelectorAccess().getWithKeyword_2_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getListElementSelectorAccess().getContainedElementsConceptParserRuleCall_2_1_0()); 
	    }
		lv_containedElements_3_0=ruleConcept		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getListElementSelectorRule());
	        }
       		add(
       			$current, 
       			"containedElements",
        		lv_containedElements_3_0, 
        		"Concept");
	        afterParserOrEnumRuleCall();
	    }

)
))?)
;





// Entry rule entryRuleConcept
entryRuleConcept returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getConceptRule()); }
	 iv_ruleConcept=ruleConcept 
	 { $current=$iv_ruleConcept.current; } 
	 EOF 
;

// Rule Concept
ruleConcept returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='All Concepts' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getAllConceptsKeyword_0());
    }

    |	otherlv_1='No Concepts' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getConceptAccess().getNoConceptsKeyword_1());
    }

    |(
(
		{ 
	        newCompositeNode(grammarAccess.getConceptAccess().getSelectionSelectedConceptParserRuleCall_2_0()); 
	    }
		lv_selection_2_0=ruleSelectedConcept		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getConceptRule());
	        }
       		add(
       			$current, 
       			"selection",
        		lv_selection_2_0, 
        		"SelectedConcept");
	        afterParserOrEnumRuleCall();
	    }

)
)*)
;





// Entry rule entryRuleSelectedConcept
entryRuleSelectedConcept returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getSelectedConceptRule()); }
	 iv_ruleSelectedConcept=ruleSelectedConcept 
	 { $current=$iv_ruleSelectedConcept.current; } 
	 EOF 
;

// Rule SelectedConcept
ruleSelectedConcept returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='concept' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getSelectedConceptAccess().getConceptKeyword_0());
    }
	otherlv_1='name' 
    {
    	newLeafNode(otherlv_1, grammarAccess.getSelectedConceptAccess().getNameKeyword_1());
    }
(
(
		lv_id_2_0=RULE_ID
		{
			newLeafNode(lv_id_2_0, grammarAccess.getSelectedConceptAccess().getIdIDTerminalRuleCall_2_0()); 
		}
		{
	        if ($current==null) {
	            $current = createModelElement(grammarAccess.getSelectedConceptRule());
	        }
       		setWithLastConsumed(
       			$current, 
       			"id",
        		lv_id_2_0, 
        		"ID");
	    }

)
))
;





// Entry rule entryRuleButton
entryRuleButton returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getButtonRule()); }
	 iv_ruleButton=ruleButton 
	 { $current=$iv_ruleButton.current; } 
	 EOF 
;

// Rule Button
ruleButton returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='Button' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getButtonAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getButtonRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleDataField
entryRuleDataField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getDataFieldRule()); }
	 iv_ruleDataField=ruleDataField 
	 { $current=$iv_ruleDataField.current; } 
	 EOF 
;

// Rule DataField
ruleDataField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='DataField' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getDataFieldAccess().getDataFieldKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getDataFieldAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getDataFieldRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleImageField
entryRuleImageField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getImageFieldRule()); }
	 iv_ruleImageField=ruleImageField 
	 { $current=$iv_ruleImageField.current; } 
	 EOF 
;

// Rule ImageField
ruleImageField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='ImageField' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getImageFieldAccess().getImageFieldKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getImageFieldAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getImageFieldRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleTextField
entryRuleTextField returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextFieldRule()); }
	 iv_ruleTextField=ruleTextField 
	 { $current=$iv_ruleTextField.current; } 
	 EOF 
;

// Rule TextField
ruleTextField returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TextField' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextFieldRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





// Entry rule entryRuleTextArea
entryRuleTextArea returns [EObject current=null] 
	:
	{ newCompositeNode(grammarAccess.getTextAreaRule()); }
	 iv_ruleTextArea=ruleTextArea 
	 { $current=$iv_ruleTextArea.current; } 
	 EOF 
;

// Rule TextArea
ruleTextArea returns [EObject current=null] 
    @init { enterRule(); 
    }
    @after { leaveRule(); }:
(	otherlv_0='TextArea' 
    {
    	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
    }
(
(
		{ 
	        newCompositeNode(grammarAccess.getTextAreaAccess().getLabelLabelParserRuleCall_1_0()); 
	    }
		lv_label_1_0=ruleLabel		{
	        if ($current==null) {
	            $current = createModelElementForParent(grammarAccess.getTextAreaRule());
	        }
       		set(
       			$current, 
       			"label",
        		lv_label_1_0, 
        		"Label");
	        afterParserOrEnumRuleCall();
	    }

)
)?)
;





RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;


