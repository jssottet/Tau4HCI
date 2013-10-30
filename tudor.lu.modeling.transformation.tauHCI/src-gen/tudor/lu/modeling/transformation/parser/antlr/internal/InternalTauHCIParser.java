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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTauHCIParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'task rule from'", "'and'", "'to'", "';'", "'specific rule from'", "'interactivelyValid'", "'domain rule from'", "'interactive'", "'notinteractive'", "'selection_1_n'", "'selection_n_n'", "'container'", "'input'", "'output'", "'command'", "'navigation'", "'Root'", "'abstract'", "'user'", "'system'", "'string'", "'text'", "'document'", "'date'", "'taskName'", "'Window'", "'with'", "'Panel'", "'ListElementSelector'", "'All Concepts'", "'No Concepts'", "'concept'", "'name'", "'Button'", "'DataField'", "'ImageField'", "'TextField'", "'TextArea'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalTauHCIParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTauHCIParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTauHCIParser.tokenNames; }
    public String getGrammarFileName() { return "../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g"; }



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



    // $ANTLR start "entryRuleModel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:67:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:68:2: (iv_ruleModel= ruleModel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:69:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel75);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel85); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:76:1: ruleModel returns [EObject current=null] : ( ( (lv_rules_0_0= ruleRule ) )* ( (lv_specificRules_1_0= ruleSpecific ) )* ( (lv_domainRules_2_0= ruleDomain ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;

        EObject lv_specificRules_1_0 = null;

        EObject lv_domainRules_2_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:79:28: ( ( ( (lv_rules_0_0= ruleRule ) )* ( (lv_specificRules_1_0= ruleSpecific ) )* ( (lv_domainRules_2_0= ruleDomain ) )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:80:1: ( ( (lv_rules_0_0= ruleRule ) )* ( (lv_specificRules_1_0= ruleSpecific ) )* ( (lv_domainRules_2_0= ruleDomain ) )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:80:1: ( ( (lv_rules_0_0= ruleRule ) )* ( (lv_specificRules_1_0= ruleSpecific ) )* ( (lv_domainRules_2_0= ruleDomain ) )* )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:80:2: ( (lv_rules_0_0= ruleRule ) )* ( (lv_specificRules_1_0= ruleSpecific ) )* ( (lv_domainRules_2_0= ruleDomain ) )*
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:80:2: ( (lv_rules_0_0= ruleRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:81:1: (lv_rules_0_0= ruleRule )
            	    {
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:81:1: (lv_rules_0_0= ruleRule )
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:82:3: lv_rules_0_0= ruleRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRule_in_ruleModel131);
            	    lv_rules_0_0=ruleRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rules",
            	            		lv_rules_0_0, 
            	            		"Rule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:98:3: ( (lv_specificRules_1_0= ruleSpecific ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:99:1: (lv_specificRules_1_0= ruleSpecific )
            	    {
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:99:1: (lv_specificRules_1_0= ruleSpecific )
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:100:3: lv_specificRules_1_0= ruleSpecific
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getSpecificRulesSpecificParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSpecific_in_ruleModel153);
            	    lv_specificRules_1_0=ruleSpecific();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"specificRules",
            	            		lv_specificRules_1_0, 
            	            		"Specific");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:116:3: ( (lv_domainRules_2_0= ruleDomain ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:117:1: (lv_domainRules_2_0= ruleDomain )
            	    {
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:117:1: (lv_domainRules_2_0= ruleDomain )
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:118:3: lv_domainRules_2_0= ruleDomain
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelAccess().getDomainRulesDomainParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDomain_in_ruleModel175);
            	    lv_domainRules_2_0=ruleDomain();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"domainRules",
            	            		lv_domainRules_2_0, 
            	            		"Domain");
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:142:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:143:2: (iv_ruleRule= ruleRule EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:144:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule212);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule222); 

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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:151:1: ruleRule returns [EObject current=null] : (otherlv_0= 'task rule from' ( (lv_auitype_1_0= ruleType ) ) ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )? otherlv_5= 'to' ( (lv_uielement_6_0= ruleUIElement ) ) otherlv_7= ';' ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_auitype_1_0 = null;

        AntlrDatatypeRuleToken lv_taskType_3_0 = null;

        AntlrDatatypeRuleToken lv_interactivelyValid_4_0 = null;

        EObject lv_uielement_6_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:154:28: ( (otherlv_0= 'task rule from' ( (lv_auitype_1_0= ruleType ) ) ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )? otherlv_5= 'to' ( (lv_uielement_6_0= ruleUIElement ) ) otherlv_7= ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:155:1: (otherlv_0= 'task rule from' ( (lv_auitype_1_0= ruleType ) ) ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )? otherlv_5= 'to' ( (lv_uielement_6_0= ruleUIElement ) ) otherlv_7= ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:155:1: (otherlv_0= 'task rule from' ( (lv_auitype_1_0= ruleType ) ) ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )? otherlv_5= 'to' ( (lv_uielement_6_0= ruleUIElement ) ) otherlv_7= ';' )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:155:3: otherlv_0= 'task rule from' ( (lv_auitype_1_0= ruleType ) ) ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )? otherlv_5= 'to' ( (lv_uielement_6_0= ruleUIElement ) ) otherlv_7= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRule259); 

                	newLeafNode(otherlv_0, grammarAccess.getRuleAccess().getTaskRuleFromKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:159:1: ( (lv_auitype_1_0= ruleType ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:160:1: (lv_auitype_1_0= ruleType )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:160:1: (lv_auitype_1_0= ruleType )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:161:3: lv_auitype_1_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getAuitypeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_ruleRule280);
            lv_auitype_1_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"auitype",
                    		lv_auitype_1_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:177:2: ( (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) ) | ( (lv_interactivelyValid_4_0= ruleValid ) ) )?
            int alt4=3;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==12) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=18 && LA4_0<=19)) ) {
                alt4=2;
            }
            switch (alt4) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:177:3: (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:177:3: (otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) ) )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:177:5: otherlv_2= 'and' ( (lv_taskType_3_0= ruleAUIType ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRule294); 

                        	newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getAndKeyword_2_0_0());
                        
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:181:1: ( (lv_taskType_3_0= ruleAUIType ) )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:182:1: (lv_taskType_3_0= ruleAUIType )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:182:1: (lv_taskType_3_0= ruleAUIType )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:183:3: lv_taskType_3_0= ruleAUIType
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getTaskTypeAUITypeParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAUIType_in_ruleRule315);
                    lv_taskType_3_0=ruleAUIType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"taskType",
                            		lv_taskType_3_0, 
                            		"AUIType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:200:6: ( (lv_interactivelyValid_4_0= ruleValid ) )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:200:6: ( (lv_interactivelyValid_4_0= ruleValid ) )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:201:1: (lv_interactivelyValid_4_0= ruleValid )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:201:1: (lv_interactivelyValid_4_0= ruleValid )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:202:3: lv_interactivelyValid_4_0= ruleValid
                    {
                     
                    	        newCompositeNode(grammarAccess.getRuleAccess().getInteractivelyValidValidParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValid_in_ruleRule343);
                    lv_interactivelyValid_4_0=ruleValid();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRuleRule());
                    	        }
                           		set(
                           			current, 
                           			"interactivelyValid",
                            		lv_interactivelyValid_4_0, 
                            		"Valid");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_ruleRule357); 

                	newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getToKeyword_3());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:222:1: ( (lv_uielement_6_0= ruleUIElement ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:223:1: (lv_uielement_6_0= ruleUIElement )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:223:1: (lv_uielement_6_0= ruleUIElement )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:224:3: lv_uielement_6_0= ruleUIElement
            {
             
            	        newCompositeNode(grammarAccess.getRuleAccess().getUielementUIElementParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleUIElement_in_ruleRule378);
            lv_uielement_6_0=ruleUIElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	        }
                   		set(
                   			current, 
                   			"uielement",
                    		lv_uielement_6_0, 
                    		"UIElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,14,FOLLOW_14_in_ruleRule390); 

                	newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSpecific"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:252:1: entryRuleSpecific returns [EObject current=null] : iv_ruleSpecific= ruleSpecific EOF ;
    public final EObject entryRuleSpecific() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpecific = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:253:2: (iv_ruleSpecific= ruleSpecific EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:254:2: iv_ruleSpecific= ruleSpecific EOF
            {
             newCompositeNode(grammarAccess.getSpecificRule()); 
            pushFollow(FOLLOW_ruleSpecific_in_entryRuleSpecific426);
            iv_ruleSpecific=ruleSpecific();

            state._fsp--;

             current =iv_ruleSpecific; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecific436); 

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
    // $ANTLR end "entryRuleSpecific"


    // $ANTLR start "ruleSpecific"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:261:1: ruleSpecific returns [EObject current=null] : (otherlv_0= 'specific rule from' ( (lv_taskName_1_0= RULE_STRING ) ) (otherlv_2= 'interactivelyValid' )? otherlv_3= 'to' ( (lv_uielement_4_0= ruleUIElement ) )* otherlv_5= ';' ) ;
    public final EObject ruleSpecific() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_taskName_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_uielement_4_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:264:28: ( (otherlv_0= 'specific rule from' ( (lv_taskName_1_0= RULE_STRING ) ) (otherlv_2= 'interactivelyValid' )? otherlv_3= 'to' ( (lv_uielement_4_0= ruleUIElement ) )* otherlv_5= ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:265:1: (otherlv_0= 'specific rule from' ( (lv_taskName_1_0= RULE_STRING ) ) (otherlv_2= 'interactivelyValid' )? otherlv_3= 'to' ( (lv_uielement_4_0= ruleUIElement ) )* otherlv_5= ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:265:1: (otherlv_0= 'specific rule from' ( (lv_taskName_1_0= RULE_STRING ) ) (otherlv_2= 'interactivelyValid' )? otherlv_3= 'to' ( (lv_uielement_4_0= ruleUIElement ) )* otherlv_5= ';' )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:265:3: otherlv_0= 'specific rule from' ( (lv_taskName_1_0= RULE_STRING ) ) (otherlv_2= 'interactivelyValid' )? otherlv_3= 'to' ( (lv_uielement_4_0= ruleUIElement ) )* otherlv_5= ';'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleSpecific473); 

                	newLeafNode(otherlv_0, grammarAccess.getSpecificAccess().getSpecificRuleFromKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:269:1: ( (lv_taskName_1_0= RULE_STRING ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:270:1: (lv_taskName_1_0= RULE_STRING )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:270:1: (lv_taskName_1_0= RULE_STRING )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:271:3: lv_taskName_1_0= RULE_STRING
            {
            lv_taskName_1_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSpecific490); 

            			newLeafNode(lv_taskName_1_0, grammarAccess.getSpecificAccess().getTaskNameSTRINGTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSpecificRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"taskName",
                    		lv_taskName_1_0, 
                    		"STRING");
            	    

            }


            }

            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:287:2: (otherlv_2= 'interactivelyValid' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:287:4: otherlv_2= 'interactivelyValid'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleSpecific508); 

                        	newLeafNode(otherlv_2, grammarAccess.getSpecificAccess().getInteractivelyValidKeyword_2());
                        

                    }
                    break;

            }

            otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleSpecific522); 

                	newLeafNode(otherlv_3, grammarAccess.getSpecificAccess().getToKeyword_3());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:295:1: ( (lv_uielement_4_0= ruleUIElement ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==36||(LA6_0>=38 && LA6_0<=39)||(LA6_0>=44 && LA6_0<=48)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:296:1: (lv_uielement_4_0= ruleUIElement )
            	    {
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:296:1: (lv_uielement_4_0= ruleUIElement )
            	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:297:3: lv_uielement_4_0= ruleUIElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSpecificAccess().getUielementUIElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleUIElement_in_ruleSpecific543);
            	    lv_uielement_4_0=ruleUIElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSpecificRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"uielement",
            	            		lv_uielement_4_0, 
            	            		"UIElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleSpecific556); 

                	newLeafNode(otherlv_5, grammarAccess.getSpecificAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleSpecific"


    // $ANTLR start "entryRuleDomain"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:325:1: entryRuleDomain returns [EObject current=null] : iv_ruleDomain= ruleDomain EOF ;
    public final EObject entryRuleDomain() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDomain = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:326:2: (iv_ruleDomain= ruleDomain EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:327:2: iv_ruleDomain= ruleDomain EOF
            {
             newCompositeNode(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain592);
            iv_ruleDomain=ruleDomain();

            state._fsp--;

             current =iv_ruleDomain; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain602); 

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
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:334:1: ruleDomain returns [EObject current=null] : (otherlv_0= 'domain rule from' ( (lv_domainType_1_0= ruleAttributeType ) ) otherlv_2= 'to' ( (lv_uielement_3_0= ruleUIElement ) ) otherlv_4= ';' ) ;
    public final EObject ruleDomain() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_domainType_1_0 = null;

        EObject lv_uielement_3_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:337:28: ( (otherlv_0= 'domain rule from' ( (lv_domainType_1_0= ruleAttributeType ) ) otherlv_2= 'to' ( (lv_uielement_3_0= ruleUIElement ) ) otherlv_4= ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:338:1: (otherlv_0= 'domain rule from' ( (lv_domainType_1_0= ruleAttributeType ) ) otherlv_2= 'to' ( (lv_uielement_3_0= ruleUIElement ) ) otherlv_4= ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:338:1: (otherlv_0= 'domain rule from' ( (lv_domainType_1_0= ruleAttributeType ) ) otherlv_2= 'to' ( (lv_uielement_3_0= ruleUIElement ) ) otherlv_4= ';' )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:338:3: otherlv_0= 'domain rule from' ( (lv_domainType_1_0= ruleAttributeType ) ) otherlv_2= 'to' ( (lv_uielement_3_0= ruleUIElement ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleDomain639); 

                	newLeafNode(otherlv_0, grammarAccess.getDomainAccess().getDomainRuleFromKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:342:1: ( (lv_domainType_1_0= ruleAttributeType ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:343:1: (lv_domainType_1_0= ruleAttributeType )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:343:1: (lv_domainType_1_0= ruleAttributeType )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:344:3: lv_domainType_1_0= ruleAttributeType
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getDomainTypeAttributeTypeParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeType_in_ruleDomain660);
            lv_domainType_1_0=ruleAttributeType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		set(
                   			current, 
                   			"domainType",
                    		lv_domainType_1_0, 
                    		"AttributeType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_13_in_ruleDomain672); 

                	newLeafNode(otherlv_2, grammarAccess.getDomainAccess().getToKeyword_2());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:364:1: ( (lv_uielement_3_0= ruleUIElement ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:365:1: (lv_uielement_3_0= ruleUIElement )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:365:1: (lv_uielement_3_0= ruleUIElement )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:366:3: lv_uielement_3_0= ruleUIElement
            {
             
            	        newCompositeNode(grammarAccess.getDomainAccess().getUielementUIElementParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleUIElement_in_ruleDomain693);
            lv_uielement_3_0=ruleUIElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDomainRule());
            	        }
                   		set(
                   			current, 
                   			"uielement",
                    		lv_uielement_3_0, 
                    		"UIElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_14_in_ruleDomain705); 

                	newLeafNode(otherlv_4, grammarAccess.getDomainAccess().getSemicolonKeyword_4());
                

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
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleValid"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:394:1: entryRuleValid returns [String current=null] : iv_ruleValid= ruleValid EOF ;
    public final String entryRuleValid() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValid = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:395:2: (iv_ruleValid= ruleValid EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:396:2: iv_ruleValid= ruleValid EOF
            {
             newCompositeNode(grammarAccess.getValidRule()); 
            pushFollow(FOLLOW_ruleValid_in_entryRuleValid742);
            iv_ruleValid=ruleValid();

            state._fsp--;

             current =iv_ruleValid.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValid753); 

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
    // $ANTLR end "entryRuleValid"


    // $ANTLR start "ruleValid"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:403:1: ruleValid returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'interactive' | kw= 'notinteractive' ) ;
    public final AntlrDatatypeRuleToken ruleValid() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:406:28: ( (kw= 'interactive' | kw= 'notinteractive' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:407:1: (kw= 'interactive' | kw= 'notinteractive' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:407:1: (kw= 'interactive' | kw= 'notinteractive' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:408:2: kw= 'interactive'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleValid791); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidAccess().getInteractiveKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:415:2: kw= 'notinteractive'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleValid810); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getValidAccess().getNotinteractiveKeyword_1()); 
                        

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
    // $ANTLR end "ruleValid"


    // $ANTLR start "entryRuleType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:430:1: entryRuleType returns [String current=null] : iv_ruleType= ruleType EOF ;
    public final String entryRuleType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleType = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:431:2: (iv_ruleType= ruleType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:432:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType853);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType864); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:439:1: ruleType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'selection_1_n' | kw= 'selection_n_n' | kw= 'container' | kw= 'input' | kw= 'output' | kw= 'command' | kw= 'navigation' | kw= 'Root' ) ;
    public final AntlrDatatypeRuleToken ruleType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:442:28: ( (kw= 'selection_1_n' | kw= 'selection_n_n' | kw= 'container' | kw= 'input' | kw= 'output' | kw= 'command' | kw= 'navigation' | kw= 'Root' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:443:1: (kw= 'selection_1_n' | kw= 'selection_n_n' | kw= 'container' | kw= 'input' | kw= 'output' | kw= 'command' | kw= 'navigation' | kw= 'Root' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:443:1: (kw= 'selection_1_n' | kw= 'selection_n_n' | kw= 'container' | kw= 'input' | kw= 'output' | kw= 'command' | kw= 'navigation' | kw= 'Root' )
            int alt8=8;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt8=1;
                }
                break;
            case 21:
                {
                alt8=2;
                }
                break;
            case 22:
                {
                alt8=3;
                }
                break;
            case 23:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 26:
                {
                alt8=7;
                }
                break;
            case 27:
                {
                alt8=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:444:2: kw= 'selection_1_n'
                    {
                    kw=(Token)match(input,20,FOLLOW_20_in_ruleType902); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getSelection_1_nKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:451:2: kw= 'selection_n_n'
                    {
                    kw=(Token)match(input,21,FOLLOW_21_in_ruleType921); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getSelection_n_nKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:458:2: kw= 'container'
                    {
                    kw=(Token)match(input,22,FOLLOW_22_in_ruleType940); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getContainerKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:465:2: kw= 'input'
                    {
                    kw=(Token)match(input,23,FOLLOW_23_in_ruleType959); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getInputKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:472:2: kw= 'output'
                    {
                    kw=(Token)match(input,24,FOLLOW_24_in_ruleType978); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getOutputKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:479:2: kw= 'command'
                    {
                    kw=(Token)match(input,25,FOLLOW_25_in_ruleType997); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getCommandKeyword_5()); 
                        

                    }
                    break;
                case 7 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:486:2: kw= 'navigation'
                    {
                    kw=(Token)match(input,26,FOLLOW_26_in_ruleType1016); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getNavigationKeyword_6()); 
                        

                    }
                    break;
                case 8 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:493:2: kw= 'Root'
                    {
                    kw=(Token)match(input,27,FOLLOW_27_in_ruleType1035); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getTypeAccess().getRootKeyword_7()); 
                        

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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAUIType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:506:1: entryRuleAUIType returns [String current=null] : iv_ruleAUIType= ruleAUIType EOF ;
    public final String entryRuleAUIType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAUIType = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:507:2: (iv_ruleAUIType= ruleAUIType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:508:2: iv_ruleAUIType= ruleAUIType EOF
            {
             newCompositeNode(grammarAccess.getAUITypeRule()); 
            pushFollow(FOLLOW_ruleAUIType_in_entryRuleAUIType1076);
            iv_ruleAUIType=ruleAUIType();

            state._fsp--;

             current =iv_ruleAUIType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAUIType1087); 

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
    // $ANTLR end "entryRuleAUIType"


    // $ANTLR start "ruleAUIType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:515:1: ruleAUIType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'abstract' | kw= 'interactive' | kw= 'user' | kw= 'system' ) ;
    public final AntlrDatatypeRuleToken ruleAUIType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:518:28: ( (kw= 'abstract' | kw= 'interactive' | kw= 'user' | kw= 'system' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:519:1: (kw= 'abstract' | kw= 'interactive' | kw= 'user' | kw= 'system' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:519:1: (kw= 'abstract' | kw= 'interactive' | kw= 'user' | kw= 'system' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt9=1;
                }
                break;
            case 18:
                {
                alt9=2;
                }
                break;
            case 29:
                {
                alt9=3;
                }
                break;
            case 30:
                {
                alt9=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:520:2: kw= 'abstract'
                    {
                    kw=(Token)match(input,28,FOLLOW_28_in_ruleAUIType1125); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAUITypeAccess().getAbstractKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:527:2: kw= 'interactive'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleAUIType1144); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAUITypeAccess().getInteractiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:534:2: kw= 'user'
                    {
                    kw=(Token)match(input,29,FOLLOW_29_in_ruleAUIType1163); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAUITypeAccess().getUserKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:541:2: kw= 'system'
                    {
                    kw=(Token)match(input,30,FOLLOW_30_in_ruleAUIType1182); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAUITypeAccess().getSystemKeyword_3()); 
                        

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
    // $ANTLR end "ruleAUIType"


    // $ANTLR start "entryRuleUIElement"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:554:1: entryRuleUIElement returns [EObject current=null] : iv_ruleUIElement= ruleUIElement EOF ;
    public final EObject entryRuleUIElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUIElement = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:555:2: (iv_ruleUIElement= ruleUIElement EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:556:2: iv_ruleUIElement= ruleUIElement EOF
            {
             newCompositeNode(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement1222);
            iv_ruleUIElement=ruleUIElement();

            state._fsp--;

             current =iv_ruleUIElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement1232); 

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
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:563:1: ruleUIElement returns [EObject current=null] : (this_Window_0= ruleWindow | this_ListElementSelector_1= ruleListElementSelector | this_Button_2= ruleButton | this_Panel_3= rulePanel | this_DataField_4= ruleDataField | this_ImageField_5= ruleImageField | this_TextField_6= ruleTextField | this_TextArea_7= ruleTextArea ) ;
    public final EObject ruleUIElement() throws RecognitionException {
        EObject current = null;

        EObject this_Window_0 = null;

        EObject this_ListElementSelector_1 = null;

        EObject this_Button_2 = null;

        EObject this_Panel_3 = null;

        EObject this_DataField_4 = null;

        EObject this_ImageField_5 = null;

        EObject this_TextField_6 = null;

        EObject this_TextArea_7 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:566:28: ( (this_Window_0= ruleWindow | this_ListElementSelector_1= ruleListElementSelector | this_Button_2= ruleButton | this_Panel_3= rulePanel | this_DataField_4= ruleDataField | this_ImageField_5= ruleImageField | this_TextField_6= ruleTextField | this_TextArea_7= ruleTextArea ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:567:1: (this_Window_0= ruleWindow | this_ListElementSelector_1= ruleListElementSelector | this_Button_2= ruleButton | this_Panel_3= rulePanel | this_DataField_4= ruleDataField | this_ImageField_5= ruleImageField | this_TextField_6= ruleTextField | this_TextArea_7= ruleTextArea )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:567:1: (this_Window_0= ruleWindow | this_ListElementSelector_1= ruleListElementSelector | this_Button_2= ruleButton | this_Panel_3= rulePanel | this_DataField_4= ruleDataField | this_ImageField_5= ruleImageField | this_TextField_6= ruleTextField | this_TextArea_7= ruleTextArea )
            int alt10=8;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt10=1;
                }
                break;
            case 39:
                {
                alt10=2;
                }
                break;
            case 44:
                {
                alt10=3;
                }
                break;
            case 38:
                {
                alt10=4;
                }
                break;
            case 45:
                {
                alt10=5;
                }
                break;
            case 46:
                {
                alt10=6;
                }
                break;
            case 47:
                {
                alt10=7;
                }
                break;
            case 48:
                {
                alt10=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:568:5: this_Window_0= ruleWindow
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getWindowParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleWindow_in_ruleUIElement1279);
                    this_Window_0=ruleWindow();

                    state._fsp--;

                     
                            current = this_Window_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:578:5: this_ListElementSelector_1= ruleListElementSelector
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getListElementSelectorParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleListElementSelector_in_ruleUIElement1306);
                    this_ListElementSelector_1=ruleListElementSelector();

                    state._fsp--;

                     
                            current = this_ListElementSelector_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:588:5: this_Button_2= ruleButton
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getButtonParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleButton_in_ruleUIElement1333);
                    this_Button_2=ruleButton();

                    state._fsp--;

                     
                            current = this_Button_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:598:5: this_Panel_3= rulePanel
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getPanelParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_rulePanel_in_ruleUIElement1360);
                    this_Panel_3=rulePanel();

                    state._fsp--;

                     
                            current = this_Panel_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:608:5: this_DataField_4= ruleDataField
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getDataFieldParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleDataField_in_ruleUIElement1387);
                    this_DataField_4=ruleDataField();

                    state._fsp--;

                     
                            current = this_DataField_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:618:5: this_ImageField_5= ruleImageField
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getImageFieldParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleImageField_in_ruleUIElement1414);
                    this_ImageField_5=ruleImageField();

                    state._fsp--;

                     
                            current = this_ImageField_5; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:628:5: this_TextField_6= ruleTextField
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getTextFieldParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleTextField_in_ruleUIElement1441);
                    this_TextField_6=ruleTextField();

                    state._fsp--;

                     
                            current = this_TextField_6; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:638:5: this_TextArea_7= ruleTextArea
                    {
                     
                            newCompositeNode(grammarAccess.getUIElementAccess().getTextAreaParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleTextArea_in_ruleUIElement1468);
                    this_TextArea_7=ruleTextArea();

                    state._fsp--;

                     
                            current = this_TextArea_7; 
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
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleAttributeType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:654:1: entryRuleAttributeType returns [String current=null] : iv_ruleAttributeType= ruleAttributeType EOF ;
    public final String entryRuleAttributeType() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAttributeType = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:655:2: (iv_ruleAttributeType= ruleAttributeType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:656:2: iv_ruleAttributeType= ruleAttributeType EOF
            {
             newCompositeNode(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType1504);
            iv_ruleAttributeType=ruleAttributeType();

            state._fsp--;

             current =iv_ruleAttributeType.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType1515); 

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
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:663:1: ruleAttributeType returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'string' | kw= 'text' | kw= 'document' | kw= 'date' ) ;
    public final AntlrDatatypeRuleToken ruleAttributeType() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:666:28: ( (kw= 'string' | kw= 'text' | kw= 'document' | kw= 'date' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:667:1: (kw= 'string' | kw= 'text' | kw= 'document' | kw= 'date' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:667:1: (kw= 'string' | kw= 'text' | kw= 'document' | kw= 'date' )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt11=1;
                }
                break;
            case 32:
                {
                alt11=2;
                }
                break;
            case 33:
                {
                alt11=3;
                }
                break;
            case 34:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:668:2: kw= 'string'
                    {
                    kw=(Token)match(input,31,FOLLOW_31_in_ruleAttributeType1553); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:675:2: kw= 'text'
                    {
                    kw=(Token)match(input,32,FOLLOW_32_in_ruleAttributeType1572); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getTextKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:682:2: kw= 'document'
                    {
                    kw=(Token)match(input,33,FOLLOW_33_in_ruleAttributeType1591); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDocumentKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:689:2: kw= 'date'
                    {
                    kw=(Token)match(input,34,FOLLOW_34_in_ruleAttributeType1610); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getAttributeTypeAccess().getDateKeyword_3()); 
                        

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
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleLabel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:702:1: entryRuleLabel returns [String current=null] : iv_ruleLabel= ruleLabel EOF ;
    public final String entryRuleLabel() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLabel = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:703:2: (iv_ruleLabel= ruleLabel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:704:2: iv_ruleLabel= ruleLabel EOF
            {
             newCompositeNode(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel1651);
            iv_ruleLabel=ruleLabel();

            state._fsp--;

             current =iv_ruleLabel.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel1662); 

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
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:711:1: ruleLabel returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | kw= 'taskName' ) ;
    public final AntlrDatatypeRuleToken ruleLabel() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:714:28: ( (this_STRING_0= RULE_STRING | kw= 'taskName' ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:715:1: (this_STRING_0= RULE_STRING | kw= 'taskName' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:715:1: (this_STRING_0= RULE_STRING | kw= 'taskName' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_STRING) ) {
                alt12=1;
            }
            else if ( (LA12_0==35) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:715:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLabel1702); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getLabelAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:724:2: kw= 'taskName'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleLabel1726); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getLabelAccess().getTaskNameKeyword_1()); 
                        

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
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleWindow"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:737:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:738:2: (iv_ruleWindow= ruleWindow EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:739:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_ruleWindow_in_entryRuleWindow1766);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindow1776); 

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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:746:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'Window' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_containedElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:749:28: ( (otherlv_0= 'Window' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:750:1: (otherlv_0= 'Window' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:750:1: (otherlv_0= 'Window' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:750:3: otherlv_0= 'Window' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_36_in_ruleWindow1813); 

                	newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getWindowKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:754:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING||LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:755:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:755:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:756:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getWindowAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleWindow1834);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getWindowRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleWindow1847); 

                	newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getWithKeyword_2());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:776:1: ( (lv_containedElements_3_0= ruleConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:777:1: (lv_containedElements_3_0= ruleConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:777:1: (lv_containedElements_3_0= ruleConcept )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:778:3: lv_containedElements_3_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getWindowAccess().getContainedElementsConceptParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_ruleWindow1868);
            lv_containedElements_3_0=ruleConcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWindowRule());
            	        }
                   		add(
                   			current, 
                   			"containedElements",
                    		lv_containedElements_3_0, 
                    		"Concept");
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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRulePanel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:802:1: entryRulePanel returns [EObject current=null] : iv_rulePanel= rulePanel EOF ;
    public final EObject entryRulePanel() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePanel = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:803:2: (iv_rulePanel= rulePanel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:804:2: iv_rulePanel= rulePanel EOF
            {
             newCompositeNode(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_rulePanel_in_entryRulePanel1904);
            iv_rulePanel=rulePanel();

            state._fsp--;

             current =iv_rulePanel; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePanel1914); 

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
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:811:1: rulePanel returns [EObject current=null] : (otherlv_0= 'Panel' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) ) ;
    public final EObject rulePanel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_containedElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:814:28: ( (otherlv_0= 'Panel' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:815:1: (otherlv_0= 'Panel' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:815:1: (otherlv_0= 'Panel' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:815:3: otherlv_0= 'Panel' ( (lv_label_1_0= ruleLabel ) )? otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_rulePanel1951); 

                	newLeafNode(otherlv_0, grammarAccess.getPanelAccess().getPanelKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:819:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING||LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:820:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:820:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:821:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getPanelAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_rulePanel1972);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPanelRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,37,FOLLOW_37_in_rulePanel1985); 

                	newLeafNode(otherlv_2, grammarAccess.getPanelAccess().getWithKeyword_2());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:841:1: ( (lv_containedElements_3_0= ruleConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:842:1: (lv_containedElements_3_0= ruleConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:842:1: (lv_containedElements_3_0= ruleConcept )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:843:3: lv_containedElements_3_0= ruleConcept
            {
             
            	        newCompositeNode(grammarAccess.getPanelAccess().getContainedElementsConceptParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleConcept_in_rulePanel2006);
            lv_containedElements_3_0=ruleConcept();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPanelRule());
            	        }
                   		add(
                   			current, 
                   			"containedElements",
                    		lv_containedElements_3_0, 
                    		"Concept");
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
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleListElementSelector"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:867:1: entryRuleListElementSelector returns [EObject current=null] : iv_ruleListElementSelector= ruleListElementSelector EOF ;
    public final EObject entryRuleListElementSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListElementSelector = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:868:2: (iv_ruleListElementSelector= ruleListElementSelector EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:869:2: iv_ruleListElementSelector= ruleListElementSelector EOF
            {
             newCompositeNode(grammarAccess.getListElementSelectorRule()); 
            pushFollow(FOLLOW_ruleListElementSelector_in_entryRuleListElementSelector2042);
            iv_ruleListElementSelector=ruleListElementSelector();

            state._fsp--;

             current =iv_ruleListElementSelector; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListElementSelector2052); 

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
    // $ANTLR end "entryRuleListElementSelector"


    // $ANTLR start "ruleListElementSelector"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:876:1: ruleListElementSelector returns [EObject current=null] : (otherlv_0= 'ListElementSelector' ( (lv_label_1_0= ruleLabel ) )? (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )? ) ;
    public final EObject ruleListElementSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;

        EObject lv_containedElements_3_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:879:28: ( (otherlv_0= 'ListElementSelector' ( (lv_label_1_0= ruleLabel ) )? (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:880:1: (otherlv_0= 'ListElementSelector' ( (lv_label_1_0= ruleLabel ) )? (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:880:1: (otherlv_0= 'ListElementSelector' ( (lv_label_1_0= ruleLabel ) )? (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:880:3: otherlv_0= 'ListElementSelector' ( (lv_label_1_0= ruleLabel ) )? (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )?
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleListElementSelector2089); 

                	newLeafNode(otherlv_0, grammarAccess.getListElementSelectorAccess().getListElementSelectorKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:884:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING||LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:885:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:885:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:886:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getListElementSelectorAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleListElementSelector2110);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListElementSelectorRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:902:3: (otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==37) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:902:5: otherlv_2= 'with' ( (lv_containedElements_3_0= ruleConcept ) )
                    {
                    otherlv_2=(Token)match(input,37,FOLLOW_37_in_ruleListElementSelector2124); 

                        	newLeafNode(otherlv_2, grammarAccess.getListElementSelectorAccess().getWithKeyword_2_0());
                        
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:906:1: ( (lv_containedElements_3_0= ruleConcept ) )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:907:1: (lv_containedElements_3_0= ruleConcept )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:907:1: (lv_containedElements_3_0= ruleConcept )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:908:3: lv_containedElements_3_0= ruleConcept
                    {
                     
                    	        newCompositeNode(grammarAccess.getListElementSelectorAccess().getContainedElementsConceptParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleConcept_in_ruleListElementSelector2145);
                    lv_containedElements_3_0=ruleConcept();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getListElementSelectorRule());
                    	        }
                           		add(
                           			current, 
                           			"containedElements",
                            		lv_containedElements_3_0, 
                            		"Concept");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleListElementSelector"


    // $ANTLR start "entryRuleConcept"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:932:1: entryRuleConcept returns [EObject current=null] : iv_ruleConcept= ruleConcept EOF ;
    public final EObject entryRuleConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConcept = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:933:2: (iv_ruleConcept= ruleConcept EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:934:2: iv_ruleConcept= ruleConcept EOF
            {
             newCompositeNode(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept2183);
            iv_ruleConcept=ruleConcept();

            state._fsp--;

             current =iv_ruleConcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept2193); 

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
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:941:1: ruleConcept returns [EObject current=null] : (otherlv_0= 'All Concepts' | otherlv_1= 'No Concepts' | ( (lv_selection_2_0= ruleSelectedConcept ) )* ) ;
    public final EObject ruleConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_selection_2_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:944:28: ( (otherlv_0= 'All Concepts' | otherlv_1= 'No Concepts' | ( (lv_selection_2_0= ruleSelectedConcept ) )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:945:1: (otherlv_0= 'All Concepts' | otherlv_1= 'No Concepts' | ( (lv_selection_2_0= ruleSelectedConcept ) )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:945:1: (otherlv_0= 'All Concepts' | otherlv_1= 'No Concepts' | ( (lv_selection_2_0= ruleSelectedConcept ) )* )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 41:
                {
                alt18=2;
                }
                break;
            case EOF:
            case 14:
            case 36:
            case 38:
            case 39:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:945:3: otherlv_0= 'All Concepts'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleConcept2230); 

                        	newLeafNode(otherlv_0, grammarAccess.getConceptAccess().getAllConceptsKeyword_0());
                        

                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:950:7: otherlv_1= 'No Concepts'
                    {
                    otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleConcept2248); 

                        	newLeafNode(otherlv_1, grammarAccess.getConceptAccess().getNoConceptsKeyword_1());
                        

                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:955:6: ( (lv_selection_2_0= ruleSelectedConcept ) )*
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:955:6: ( (lv_selection_2_0= ruleSelectedConcept ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==42) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:956:1: (lv_selection_2_0= ruleSelectedConcept )
                    	    {
                    	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:956:1: (lv_selection_2_0= ruleSelectedConcept )
                    	    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:957:3: lv_selection_2_0= ruleSelectedConcept
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConceptAccess().getSelectionSelectedConceptParserRuleCall_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleSelectedConcept_in_ruleConcept2275);
                    	    lv_selection_2_0=ruleSelectedConcept();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConceptRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"selection",
                    	            		lv_selection_2_0, 
                    	            		"SelectedConcept");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


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
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleSelectedConcept"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:981:1: entryRuleSelectedConcept returns [EObject current=null] : iv_ruleSelectedConcept= ruleSelectedConcept EOF ;
    public final EObject entryRuleSelectedConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectedConcept = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:982:2: (iv_ruleSelectedConcept= ruleSelectedConcept EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:983:2: iv_ruleSelectedConcept= ruleSelectedConcept EOF
            {
             newCompositeNode(grammarAccess.getSelectedConceptRule()); 
            pushFollow(FOLLOW_ruleSelectedConcept_in_entryRuleSelectedConcept2312);
            iv_ruleSelectedConcept=ruleSelectedConcept();

            state._fsp--;

             current =iv_ruleSelectedConcept; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectedConcept2322); 

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
    // $ANTLR end "entryRuleSelectedConcept"


    // $ANTLR start "ruleSelectedConcept"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:990:1: ruleSelectedConcept returns [EObject current=null] : (otherlv_0= 'concept' otherlv_1= 'name' ( (lv_id_2_0= RULE_ID ) ) ) ;
    public final EObject ruleSelectedConcept() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_id_2_0=null;

         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:993:28: ( (otherlv_0= 'concept' otherlv_1= 'name' ( (lv_id_2_0= RULE_ID ) ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:994:1: (otherlv_0= 'concept' otherlv_1= 'name' ( (lv_id_2_0= RULE_ID ) ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:994:1: (otherlv_0= 'concept' otherlv_1= 'name' ( (lv_id_2_0= RULE_ID ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:994:3: otherlv_0= 'concept' otherlv_1= 'name' ( (lv_id_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSelectedConcept2359); 

                	newLeafNode(otherlv_0, grammarAccess.getSelectedConceptAccess().getConceptKeyword_0());
                
            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSelectedConcept2371); 

                	newLeafNode(otherlv_1, grammarAccess.getSelectedConceptAccess().getNameKeyword_1());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1002:1: ( (lv_id_2_0= RULE_ID ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1003:1: (lv_id_2_0= RULE_ID )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1003:1: (lv_id_2_0= RULE_ID )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1004:3: lv_id_2_0= RULE_ID
            {
            lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSelectedConcept2388); 

            			newLeafNode(lv_id_2_0, grammarAccess.getSelectedConceptAccess().getIdIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSelectedConceptRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"id",
                    		lv_id_2_0, 
                    		"ID");
            	    

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
    // $ANTLR end "ruleSelectedConcept"


    // $ANTLR start "entryRuleButton"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1028:1: entryRuleButton returns [EObject current=null] : iv_ruleButton= ruleButton EOF ;
    public final EObject entryRuleButton() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleButton = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1029:2: (iv_ruleButton= ruleButton EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1030:2: iv_ruleButton= ruleButton EOF
            {
             newCompositeNode(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton2429);
            iv_ruleButton=ruleButton();

            state._fsp--;

             current =iv_ruleButton; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton2439); 

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
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1037:1: ruleButton returns [EObject current=null] : (otherlv_0= 'Button' ( (lv_label_1_0= ruleLabel ) )? ) ;
    public final EObject ruleButton() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1040:28: ( (otherlv_0= 'Button' ( (lv_label_1_0= ruleLabel ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1041:1: (otherlv_0= 'Button' ( (lv_label_1_0= ruleLabel ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1041:1: (otherlv_0= 'Button' ( (lv_label_1_0= ruleLabel ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1041:3: otherlv_0= 'Button' ( (lv_label_1_0= ruleLabel ) )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleButton2476); 

                	newLeafNode(otherlv_0, grammarAccess.getButtonAccess().getButtonKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1045:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING||LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1046:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1046:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1047:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getButtonAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleButton2497);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getButtonRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleDataField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1071:1: entryRuleDataField returns [EObject current=null] : iv_ruleDataField= ruleDataField EOF ;
    public final EObject entryRuleDataField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataField = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1072:2: (iv_ruleDataField= ruleDataField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1073:2: iv_ruleDataField= ruleDataField EOF
            {
             newCompositeNode(grammarAccess.getDataFieldRule()); 
            pushFollow(FOLLOW_ruleDataField_in_entryRuleDataField2534);
            iv_ruleDataField=ruleDataField();

            state._fsp--;

             current =iv_ruleDataField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataField2544); 

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
    // $ANTLR end "entryRuleDataField"


    // $ANTLR start "ruleDataField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1080:1: ruleDataField returns [EObject current=null] : (otherlv_0= 'DataField' ( (lv_label_1_0= ruleLabel ) )? ) ;
    public final EObject ruleDataField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1083:28: ( (otherlv_0= 'DataField' ( (lv_label_1_0= ruleLabel ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1084:1: (otherlv_0= 'DataField' ( (lv_label_1_0= ruleLabel ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1084:1: (otherlv_0= 'DataField' ( (lv_label_1_0= ruleLabel ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1084:3: otherlv_0= 'DataField' ( (lv_label_1_0= ruleLabel ) )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleDataField2581); 

                	newLeafNode(otherlv_0, grammarAccess.getDataFieldAccess().getDataFieldKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1088:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==35) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1089:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1089:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1090:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getDataFieldAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleDataField2602);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getDataFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleDataField"


    // $ANTLR start "entryRuleImageField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1114:1: entryRuleImageField returns [EObject current=null] : iv_ruleImageField= ruleImageField EOF ;
    public final EObject entryRuleImageField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImageField = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1115:2: (iv_ruleImageField= ruleImageField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1116:2: iv_ruleImageField= ruleImageField EOF
            {
             newCompositeNode(grammarAccess.getImageFieldRule()); 
            pushFollow(FOLLOW_ruleImageField_in_entryRuleImageField2639);
            iv_ruleImageField=ruleImageField();

            state._fsp--;

             current =iv_ruleImageField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageField2649); 

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
    // $ANTLR end "entryRuleImageField"


    // $ANTLR start "ruleImageField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1123:1: ruleImageField returns [EObject current=null] : (otherlv_0= 'ImageField' ( (lv_label_1_0= ruleLabel ) )? ) ;
    public final EObject ruleImageField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1126:28: ( (otherlv_0= 'ImageField' ( (lv_label_1_0= ruleLabel ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1127:1: (otherlv_0= 'ImageField' ( (lv_label_1_0= ruleLabel ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1127:1: (otherlv_0= 'ImageField' ( (lv_label_1_0= ruleLabel ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1127:3: otherlv_0= 'ImageField' ( (lv_label_1_0= ruleLabel ) )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_46_in_ruleImageField2686); 

                	newLeafNode(otherlv_0, grammarAccess.getImageFieldAccess().getImageFieldKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1131:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING||LA21_0==35) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1132:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1132:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1133:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getImageFieldAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleImageField2707);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getImageFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleImageField"


    // $ANTLR start "entryRuleTextField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1157:1: entryRuleTextField returns [EObject current=null] : iv_ruleTextField= ruleTextField EOF ;
    public final EObject entryRuleTextField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextField = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1158:2: (iv_ruleTextField= ruleTextField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1159:2: iv_ruleTextField= ruleTextField EOF
            {
             newCompositeNode(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField2744);
            iv_ruleTextField=ruleTextField();

            state._fsp--;

             current =iv_ruleTextField; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField2754); 

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
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1166:1: ruleTextField returns [EObject current=null] : (otherlv_0= 'TextField' ( (lv_label_1_0= ruleLabel ) )? ) ;
    public final EObject ruleTextField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1169:28: ( (otherlv_0= 'TextField' ( (lv_label_1_0= ruleLabel ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1170:1: (otherlv_0= 'TextField' ( (lv_label_1_0= ruleLabel ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1170:1: (otherlv_0= 'TextField' ( (lv_label_1_0= ruleLabel ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1170:3: otherlv_0= 'TextField' ( (lv_label_1_0= ruleLabel ) )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleTextField2791); 

                	newLeafNode(otherlv_0, grammarAccess.getTextFieldAccess().getTextFieldKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1174:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1175:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1175:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1176:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleTextField2812);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextFieldRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTextArea"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1200:1: entryRuleTextArea returns [EObject current=null] : iv_ruleTextArea= ruleTextArea EOF ;
    public final EObject entryRuleTextArea() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTextArea = null;


        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1201:2: (iv_ruleTextArea= ruleTextArea EOF )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1202:2: iv_ruleTextArea= ruleTextArea EOF
            {
             newCompositeNode(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_ruleTextArea_in_entryRuleTextArea2849);
            iv_ruleTextArea=ruleTextArea();

            state._fsp--;

             current =iv_ruleTextArea; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextArea2859); 

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
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1209:1: ruleTextArea returns [EObject current=null] : (otherlv_0= 'TextArea' ( (lv_label_1_0= ruleLabel ) )? ) ;
    public final EObject ruleTextArea() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_label_1_0 = null;


         enterRule(); 
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1212:28: ( (otherlv_0= 'TextArea' ( (lv_label_1_0= ruleLabel ) )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1213:1: (otherlv_0= 'TextArea' ( (lv_label_1_0= ruleLabel ) )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1213:1: (otherlv_0= 'TextArea' ( (lv_label_1_0= ruleLabel ) )? )
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1213:3: otherlv_0= 'TextArea' ( (lv_label_1_0= ruleLabel ) )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleTextArea2896); 

                	newLeafNode(otherlv_0, grammarAccess.getTextAreaAccess().getTextAreaKeyword_0());
                
            // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1217:1: ( (lv_label_1_0= ruleLabel ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING||LA23_0==35) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1218:1: (lv_label_1_0= ruleLabel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1218:1: (lv_label_1_0= ruleLabel )
                    // ../tudor.lu.modeling.transformation.tauHCI/src-gen/tudor/lu/modeling/transformation/parser/antlr/internal/InternalTauHCI.g:1219:3: lv_label_1_0= ruleLabel
                    {
                     
                    	        newCompositeNode(grammarAccess.getTextAreaAccess().getLabelLabelParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLabel_in_ruleTextArea2917);
                    lv_label_1_0=ruleLabel();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTextAreaRule());
                    	        }
                           		set(
                           			current, 
                           			"label",
                            		lv_label_1_0, 
                            		"Label");
                    	        afterParserOrEnumRuleCall();
                    	    

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
    // $ANTLR end "ruleTextArea"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_ruleModel131 = new BitSet(new long[]{0x0000000000028802L});
    public static final BitSet FOLLOW_ruleSpecific_in_ruleModel153 = new BitSet(new long[]{0x0000000000028002L});
    public static final BitSet FOLLOW_ruleDomain_in_ruleModel175 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRule259 = new BitSet(new long[]{0x000000000FF00000L});
    public static final BitSet FOLLOW_ruleType_in_ruleRule280 = new BitSet(new long[]{0x00000000000C3000L});
    public static final BitSet FOLLOW_12_in_ruleRule294 = new BitSet(new long[]{0x0000000070040000L});
    public static final BitSet FOLLOW_ruleAUIType_in_ruleRule315 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleValid_in_ruleRule343 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRule357 = new BitSet(new long[]{0x0001F0D000000000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleRule378 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleRule390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecific_in_entryRuleSpecific426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecific436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleSpecific473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSpecific490 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_16_in_ruleSpecific508 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleSpecific522 = new BitSet(new long[]{0x0001F0D000004000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleSpecific543 = new BitSet(new long[]{0x0001F0D000004000L});
    public static final BitSet FOLLOW_14_in_ruleSpecific556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleDomain639 = new BitSet(new long[]{0x0000000780000000L});
    public static final BitSet FOLLOW_ruleAttributeType_in_ruleDomain660 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleDomain672 = new BitSet(new long[]{0x0001F0D000000000L});
    public static final BitSet FOLLOW_ruleUIElement_in_ruleDomain693 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleDomain705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValid_in_entryRuleValid742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValid753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleValid791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleValid810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleType997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleType1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleType1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAUIType_in_entryRuleAUIType1076 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAUIType1087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAUIType1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAUIType1144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAUIType1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAUIType1182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement1222 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_ruleUIElement1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElementSelector_in_ruleUIElement1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_ruleUIElement1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_ruleUIElement1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataField_in_ruleUIElement1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageField_in_ruleUIElement1414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_ruleUIElement1441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextArea_in_ruleUIElement1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType1504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType1515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAttributeType1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAttributeType1572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleAttributeType1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleAttributeType1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel1651 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel1662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLabel1702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleLabel1726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_entryRuleWindow1766 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindow1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleWindow1813 = new BitSet(new long[]{0x0000002800000010L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleWindow1834 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleWindow1847 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleWindow1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_entryRulePanel1904 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePanel1914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rulePanel1951 = new BitSet(new long[]{0x0000002800000010L});
    public static final BitSet FOLLOW_ruleLabel_in_rulePanel1972 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_rulePanel1985 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleConcept_in_rulePanel2006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElementSelector_in_entryRuleListElementSelector2042 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListElementSelector2052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleListElementSelector2089 = new BitSet(new long[]{0x0000002800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleListElementSelector2110 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_37_in_ruleListElementSelector2124 = new BitSet(new long[]{0x0000070000000000L});
    public static final BitSet FOLLOW_ruleConcept_in_ruleListElementSelector2145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept2183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleConcept2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleConcept2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectedConcept_in_ruleConcept2275 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_ruleSelectedConcept_in_entryRuleSelectedConcept2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectedConcept2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSelectedConcept2359 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSelectedConcept2371 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSelectedConcept2388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton2429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton2439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleButton2476 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleButton2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataField_in_entryRuleDataField2534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataField2544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleDataField2581 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleDataField2602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageField_in_entryRuleImageField2639 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageField2649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleImageField2686 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleImageField2707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField2744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField2754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTextField2791 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleTextField2812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea2849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextArea2859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTextArea2896 = new BitSet(new long[]{0x0000000800000012L});
    public static final BitSet FOLLOW_ruleLabel_in_ruleTextArea2917 = new BitSet(new long[]{0x0000000000000002L});

}