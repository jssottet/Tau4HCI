package tudor.lu.modeling.transformation.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import tudor.lu.modeling.transformation.services.TauHCIGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalTauHCIParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'interactive'", "'notinteractive'", "'selection_1_n'", "'selection_n_n'", "'container'", "'input'", "'output'", "'command'", "'navigation'", "'Root'", "'abstract'", "'user'", "'system'", "'string'", "'text'", "'document'", "'date'", "'taskName'", "'All Concepts'", "'No Concepts'", "'task rule from'", "'to'", "';'", "'and'", "'specific rule from'", "'interactivelyValid'", "'domain rule from'", "'Window'", "'with'", "'Panel'", "'ListElementSelector'", "'concept'", "'name'", "'Button'", "'DataField'", "'ImageField'", "'TextField'", "'TextArea'"
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
    public String getGrammarFileName() { return "../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g"; }


     
     	private TauHCIGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(TauHCIGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleModel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:60:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:61:1: ( ruleModel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:62:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_ruleModel_in_entryRuleModel61);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModel68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:69:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:73:2: ( ( ( rule__Model__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:74:1: ( ( rule__Model__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:74:1: ( ( rule__Model__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:75:1: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:76:1: ( rule__Model__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:76:2: rule__Model__Group__0
            {
            pushFollow(FOLLOW_rule__Model__Group__0_in_ruleModel94);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleRule"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:88:1: entryRuleRule : ruleRule EOF ;
    public final void entryRuleRule() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:89:1: ( ruleRule EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:90:1: ruleRule EOF
            {
             before(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_ruleRule_in_entryRuleRule121);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getRuleRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRule128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:97:1: ruleRule : ( ( rule__Rule__Group__0 ) ) ;
    public final void ruleRule() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:101:2: ( ( ( rule__Rule__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:102:1: ( ( rule__Rule__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:102:1: ( ( rule__Rule__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:103:1: ( rule__Rule__Group__0 )
            {
             before(grammarAccess.getRuleAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:104:1: ( rule__Rule__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:104:2: rule__Rule__Group__0
            {
            pushFollow(FOLLOW_rule__Rule__Group__0_in_ruleRule154);
            rule__Rule__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleSpecific"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:116:1: entryRuleSpecific : ruleSpecific EOF ;
    public final void entryRuleSpecific() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:117:1: ( ruleSpecific EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:118:1: ruleSpecific EOF
            {
             before(grammarAccess.getSpecificRule()); 
            pushFollow(FOLLOW_ruleSpecific_in_entryRuleSpecific181);
            ruleSpecific();

            state._fsp--;

             after(grammarAccess.getSpecificRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSpecific188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSpecific"


    // $ANTLR start "ruleSpecific"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:125:1: ruleSpecific : ( ( rule__Specific__Group__0 ) ) ;
    public final void ruleSpecific() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:129:2: ( ( ( rule__Specific__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:130:1: ( ( rule__Specific__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:130:1: ( ( rule__Specific__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:131:1: ( rule__Specific__Group__0 )
            {
             before(grammarAccess.getSpecificAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:132:1: ( rule__Specific__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:132:2: rule__Specific__Group__0
            {
            pushFollow(FOLLOW_rule__Specific__Group__0_in_ruleSpecific214);
            rule__Specific__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSpecificAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSpecific"


    // $ANTLR start "entryRuleDomain"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:144:1: entryRuleDomain : ruleDomain EOF ;
    public final void entryRuleDomain() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:145:1: ( ruleDomain EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:146:1: ruleDomain EOF
            {
             before(grammarAccess.getDomainRule()); 
            pushFollow(FOLLOW_ruleDomain_in_entryRuleDomain241);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getDomainRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDomain248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDomain"


    // $ANTLR start "ruleDomain"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:153:1: ruleDomain : ( ( rule__Domain__Group__0 ) ) ;
    public final void ruleDomain() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:157:2: ( ( ( rule__Domain__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:158:1: ( ( rule__Domain__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:158:1: ( ( rule__Domain__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:159:1: ( rule__Domain__Group__0 )
            {
             before(grammarAccess.getDomainAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:160:1: ( rule__Domain__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:160:2: rule__Domain__Group__0
            {
            pushFollow(FOLLOW_rule__Domain__Group__0_in_ruleDomain274);
            rule__Domain__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDomain"


    // $ANTLR start "entryRuleValid"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:172:1: entryRuleValid : ruleValid EOF ;
    public final void entryRuleValid() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:173:1: ( ruleValid EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:174:1: ruleValid EOF
            {
             before(grammarAccess.getValidRule()); 
            pushFollow(FOLLOW_ruleValid_in_entryRuleValid301);
            ruleValid();

            state._fsp--;

             after(grammarAccess.getValidRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValid308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValid"


    // $ANTLR start "ruleValid"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:181:1: ruleValid : ( ( rule__Valid__Alternatives ) ) ;
    public final void ruleValid() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:185:2: ( ( ( rule__Valid__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:186:1: ( ( rule__Valid__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:186:1: ( ( rule__Valid__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:187:1: ( rule__Valid__Alternatives )
            {
             before(grammarAccess.getValidAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:188:1: ( rule__Valid__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:188:2: rule__Valid__Alternatives
            {
            pushFollow(FOLLOW_rule__Valid__Alternatives_in_ruleValid334);
            rule__Valid__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValidAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValid"


    // $ANTLR start "entryRuleType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:202:1: entryRuleType : ruleType EOF ;
    public final void entryRuleType() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:203:1: ( ruleType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:204:1: ruleType EOF
            {
             before(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType363);
            ruleType();

            state._fsp--;

             after(grammarAccess.getTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType370); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:211:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:215:2: ( ( ( rule__Type__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:216:1: ( ( rule__Type__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:216:1: ( ( rule__Type__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:217:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:218:1: ( rule__Type__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:218:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType396);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleAUIType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:230:1: entryRuleAUIType : ruleAUIType EOF ;
    public final void entryRuleAUIType() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:231:1: ( ruleAUIType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:232:1: ruleAUIType EOF
            {
             before(grammarAccess.getAUITypeRule()); 
            pushFollow(FOLLOW_ruleAUIType_in_entryRuleAUIType423);
            ruleAUIType();

            state._fsp--;

             after(grammarAccess.getAUITypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAUIType430); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAUIType"


    // $ANTLR start "ruleAUIType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:239:1: ruleAUIType : ( ( rule__AUIType__Alternatives ) ) ;
    public final void ruleAUIType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:243:2: ( ( ( rule__AUIType__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:244:1: ( ( rule__AUIType__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:244:1: ( ( rule__AUIType__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:245:1: ( rule__AUIType__Alternatives )
            {
             before(grammarAccess.getAUITypeAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:246:1: ( rule__AUIType__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:246:2: rule__AUIType__Alternatives
            {
            pushFollow(FOLLOW_rule__AUIType__Alternatives_in_ruleAUIType456);
            rule__AUIType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAUITypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAUIType"


    // $ANTLR start "entryRuleUIElement"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:258:1: entryRuleUIElement : ruleUIElement EOF ;
    public final void entryRuleUIElement() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:259:1: ( ruleUIElement EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:260:1: ruleUIElement EOF
            {
             before(grammarAccess.getUIElementRule()); 
            pushFollow(FOLLOW_ruleUIElement_in_entryRuleUIElement483);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getUIElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleUIElement490); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUIElement"


    // $ANTLR start "ruleUIElement"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:267:1: ruleUIElement : ( ( rule__UIElement__Alternatives ) ) ;
    public final void ruleUIElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:271:2: ( ( ( rule__UIElement__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:272:1: ( ( rule__UIElement__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:272:1: ( ( rule__UIElement__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:273:1: ( rule__UIElement__Alternatives )
            {
             before(grammarAccess.getUIElementAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:274:1: ( rule__UIElement__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:274:2: rule__UIElement__Alternatives
            {
            pushFollow(FOLLOW_rule__UIElement__Alternatives_in_ruleUIElement516);
            rule__UIElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUIElementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUIElement"


    // $ANTLR start "entryRuleAttributeType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:286:1: entryRuleAttributeType : ruleAttributeType EOF ;
    public final void entryRuleAttributeType() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:287:1: ( ruleAttributeType EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:288:1: ruleAttributeType EOF
            {
             before(grammarAccess.getAttributeTypeRule()); 
            pushFollow(FOLLOW_ruleAttributeType_in_entryRuleAttributeType543);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getAttributeTypeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeType550); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeType"


    // $ANTLR start "ruleAttributeType"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:295:1: ruleAttributeType : ( ( rule__AttributeType__Alternatives ) ) ;
    public final void ruleAttributeType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:299:2: ( ( ( rule__AttributeType__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:300:1: ( ( rule__AttributeType__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:300:1: ( ( rule__AttributeType__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:301:1: ( rule__AttributeType__Alternatives )
            {
             before(grammarAccess.getAttributeTypeAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:302:1: ( rule__AttributeType__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:302:2: rule__AttributeType__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType576);
            rule__AttributeType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeType"


    // $ANTLR start "entryRuleLabel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:314:1: entryRuleLabel : ruleLabel EOF ;
    public final void entryRuleLabel() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:315:1: ( ruleLabel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:316:1: ruleLabel EOF
            {
             before(grammarAccess.getLabelRule()); 
            pushFollow(FOLLOW_ruleLabel_in_entryRuleLabel603);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getLabelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLabel610); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLabel"


    // $ANTLR start "ruleLabel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:323:1: ruleLabel : ( ( rule__Label__Alternatives ) ) ;
    public final void ruleLabel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:327:2: ( ( ( rule__Label__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:328:1: ( ( rule__Label__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:328:1: ( ( rule__Label__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:329:1: ( rule__Label__Alternatives )
            {
             before(grammarAccess.getLabelAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:330:1: ( rule__Label__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:330:2: rule__Label__Alternatives
            {
            pushFollow(FOLLOW_rule__Label__Alternatives_in_ruleLabel636);
            rule__Label__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLabelAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLabel"


    // $ANTLR start "entryRuleWindow"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:342:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:343:1: ( ruleWindow EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:344:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_ruleWindow_in_entryRuleWindow663);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleWindow670); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:351:1: ruleWindow : ( ( rule__Window__Group__0 ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:355:2: ( ( ( rule__Window__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:356:1: ( ( rule__Window__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:356:1: ( ( rule__Window__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:357:1: ( rule__Window__Group__0 )
            {
             before(grammarAccess.getWindowAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:358:1: ( rule__Window__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:358:2: rule__Window__Group__0
            {
            pushFollow(FOLLOW_rule__Window__Group__0_in_ruleWindow696);
            rule__Window__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRulePanel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:370:1: entryRulePanel : rulePanel EOF ;
    public final void entryRulePanel() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:371:1: ( rulePanel EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:372:1: rulePanel EOF
            {
             before(grammarAccess.getPanelRule()); 
            pushFollow(FOLLOW_rulePanel_in_entryRulePanel723);
            rulePanel();

            state._fsp--;

             after(grammarAccess.getPanelRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePanel730); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePanel"


    // $ANTLR start "rulePanel"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:379:1: rulePanel : ( ( rule__Panel__Group__0 ) ) ;
    public final void rulePanel() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:383:2: ( ( ( rule__Panel__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:384:1: ( ( rule__Panel__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:384:1: ( ( rule__Panel__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:385:1: ( rule__Panel__Group__0 )
            {
             before(grammarAccess.getPanelAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:386:1: ( rule__Panel__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:386:2: rule__Panel__Group__0
            {
            pushFollow(FOLLOW_rule__Panel__Group__0_in_rulePanel756);
            rule__Panel__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePanel"


    // $ANTLR start "entryRuleListElementSelector"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:398:1: entryRuleListElementSelector : ruleListElementSelector EOF ;
    public final void entryRuleListElementSelector() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:399:1: ( ruleListElementSelector EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:400:1: ruleListElementSelector EOF
            {
             before(grammarAccess.getListElementSelectorRule()); 
            pushFollow(FOLLOW_ruleListElementSelector_in_entryRuleListElementSelector783);
            ruleListElementSelector();

            state._fsp--;

             after(grammarAccess.getListElementSelectorRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleListElementSelector790); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListElementSelector"


    // $ANTLR start "ruleListElementSelector"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:407:1: ruleListElementSelector : ( ( rule__ListElementSelector__Group__0 ) ) ;
    public final void ruleListElementSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:411:2: ( ( ( rule__ListElementSelector__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:412:1: ( ( rule__ListElementSelector__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:412:1: ( ( rule__ListElementSelector__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:413:1: ( rule__ListElementSelector__Group__0 )
            {
             before(grammarAccess.getListElementSelectorAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:414:1: ( rule__ListElementSelector__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:414:2: rule__ListElementSelector__Group__0
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group__0_in_ruleListElementSelector816);
            rule__ListElementSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListElementSelectorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListElementSelector"


    // $ANTLR start "entryRuleConcept"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:426:1: entryRuleConcept : ruleConcept EOF ;
    public final void entryRuleConcept() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:427:1: ( ruleConcept EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:428:1: ruleConcept EOF
            {
             before(grammarAccess.getConceptRule()); 
            pushFollow(FOLLOW_ruleConcept_in_entryRuleConcept843);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getConceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleConcept850); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConcept"


    // $ANTLR start "ruleConcept"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:435:1: ruleConcept : ( ( rule__Concept__Alternatives ) ) ;
    public final void ruleConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:439:2: ( ( ( rule__Concept__Alternatives ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:440:1: ( ( rule__Concept__Alternatives ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:440:1: ( ( rule__Concept__Alternatives ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:441:1: ( rule__Concept__Alternatives )
            {
             before(grammarAccess.getConceptAccess().getAlternatives()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:442:1: ( rule__Concept__Alternatives )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:442:2: rule__Concept__Alternatives
            {
            pushFollow(FOLLOW_rule__Concept__Alternatives_in_ruleConcept876);
            rule__Concept__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConceptAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConcept"


    // $ANTLR start "entryRuleSelectedConcept"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:454:1: entryRuleSelectedConcept : ruleSelectedConcept EOF ;
    public final void entryRuleSelectedConcept() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:455:1: ( ruleSelectedConcept EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:456:1: ruleSelectedConcept EOF
            {
             before(grammarAccess.getSelectedConceptRule()); 
            pushFollow(FOLLOW_ruleSelectedConcept_in_entryRuleSelectedConcept903);
            ruleSelectedConcept();

            state._fsp--;

             after(grammarAccess.getSelectedConceptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSelectedConcept910); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectedConcept"


    // $ANTLR start "ruleSelectedConcept"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:463:1: ruleSelectedConcept : ( ( rule__SelectedConcept__Group__0 ) ) ;
    public final void ruleSelectedConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:467:2: ( ( ( rule__SelectedConcept__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:468:1: ( ( rule__SelectedConcept__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:468:1: ( ( rule__SelectedConcept__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:469:1: ( rule__SelectedConcept__Group__0 )
            {
             before(grammarAccess.getSelectedConceptAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:470:1: ( rule__SelectedConcept__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:470:2: rule__SelectedConcept__Group__0
            {
            pushFollow(FOLLOW_rule__SelectedConcept__Group__0_in_ruleSelectedConcept936);
            rule__SelectedConcept__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSelectedConceptAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectedConcept"


    // $ANTLR start "entryRuleButton"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:482:1: entryRuleButton : ruleButton EOF ;
    public final void entryRuleButton() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:483:1: ( ruleButton EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:484:1: ruleButton EOF
            {
             before(grammarAccess.getButtonRule()); 
            pushFollow(FOLLOW_ruleButton_in_entryRuleButton963);
            ruleButton();

            state._fsp--;

             after(grammarAccess.getButtonRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleButton970); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleButton"


    // $ANTLR start "ruleButton"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:491:1: ruleButton : ( ( rule__Button__Group__0 ) ) ;
    public final void ruleButton() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:495:2: ( ( ( rule__Button__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:496:1: ( ( rule__Button__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:496:1: ( ( rule__Button__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:497:1: ( rule__Button__Group__0 )
            {
             before(grammarAccess.getButtonAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:498:1: ( rule__Button__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:498:2: rule__Button__Group__0
            {
            pushFollow(FOLLOW_rule__Button__Group__0_in_ruleButton996);
            rule__Button__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getButtonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleButton"


    // $ANTLR start "entryRuleDataField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:510:1: entryRuleDataField : ruleDataField EOF ;
    public final void entryRuleDataField() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:511:1: ( ruleDataField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:512:1: ruleDataField EOF
            {
             before(grammarAccess.getDataFieldRule()); 
            pushFollow(FOLLOW_ruleDataField_in_entryRuleDataField1023);
            ruleDataField();

            state._fsp--;

             after(grammarAccess.getDataFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDataField1030); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataField"


    // $ANTLR start "ruleDataField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:519:1: ruleDataField : ( ( rule__DataField__Group__0 ) ) ;
    public final void ruleDataField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:523:2: ( ( ( rule__DataField__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:524:1: ( ( rule__DataField__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:524:1: ( ( rule__DataField__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:525:1: ( rule__DataField__Group__0 )
            {
             before(grammarAccess.getDataFieldAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:526:1: ( rule__DataField__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:526:2: rule__DataField__Group__0
            {
            pushFollow(FOLLOW_rule__DataField__Group__0_in_ruleDataField1056);
            rule__DataField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDataFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataField"


    // $ANTLR start "entryRuleImageField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:538:1: entryRuleImageField : ruleImageField EOF ;
    public final void entryRuleImageField() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:539:1: ( ruleImageField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:540:1: ruleImageField EOF
            {
             before(grammarAccess.getImageFieldRule()); 
            pushFollow(FOLLOW_ruleImageField_in_entryRuleImageField1083);
            ruleImageField();

            state._fsp--;

             after(grammarAccess.getImageFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleImageField1090); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleImageField"


    // $ANTLR start "ruleImageField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:547:1: ruleImageField : ( ( rule__ImageField__Group__0 ) ) ;
    public final void ruleImageField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:551:2: ( ( ( rule__ImageField__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:552:1: ( ( rule__ImageField__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:552:1: ( ( rule__ImageField__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:553:1: ( rule__ImageField__Group__0 )
            {
             before(grammarAccess.getImageFieldAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:554:1: ( rule__ImageField__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:554:2: rule__ImageField__Group__0
            {
            pushFollow(FOLLOW_rule__ImageField__Group__0_in_ruleImageField1116);
            rule__ImageField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getImageFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImageField"


    // $ANTLR start "entryRuleTextField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:566:1: entryRuleTextField : ruleTextField EOF ;
    public final void entryRuleTextField() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:567:1: ( ruleTextField EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:568:1: ruleTextField EOF
            {
             before(grammarAccess.getTextFieldRule()); 
            pushFollow(FOLLOW_ruleTextField_in_entryRuleTextField1143);
            ruleTextField();

            state._fsp--;

             after(grammarAccess.getTextFieldRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextField1150); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextField"


    // $ANTLR start "ruleTextField"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:575:1: ruleTextField : ( ( rule__TextField__Group__0 ) ) ;
    public final void ruleTextField() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:579:2: ( ( ( rule__TextField__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:580:1: ( ( rule__TextField__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:580:1: ( ( rule__TextField__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:581:1: ( rule__TextField__Group__0 )
            {
             before(grammarAccess.getTextFieldAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:582:1: ( rule__TextField__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:582:2: rule__TextField__Group__0
            {
            pushFollow(FOLLOW_rule__TextField__Group__0_in_ruleTextField1176);
            rule__TextField__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextFieldAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextField"


    // $ANTLR start "entryRuleTextArea"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:594:1: entryRuleTextArea : ruleTextArea EOF ;
    public final void entryRuleTextArea() throws RecognitionException {
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:595:1: ( ruleTextArea EOF )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:596:1: ruleTextArea EOF
            {
             before(grammarAccess.getTextAreaRule()); 
            pushFollow(FOLLOW_ruleTextArea_in_entryRuleTextArea1203);
            ruleTextArea();

            state._fsp--;

             after(grammarAccess.getTextAreaRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTextArea1210); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTextArea"


    // $ANTLR start "ruleTextArea"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:603:1: ruleTextArea : ( ( rule__TextArea__Group__0 ) ) ;
    public final void ruleTextArea() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:607:2: ( ( ( rule__TextArea__Group__0 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:608:1: ( ( rule__TextArea__Group__0 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:608:1: ( ( rule__TextArea__Group__0 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:609:1: ( rule__TextArea__Group__0 )
            {
             before(grammarAccess.getTextAreaAccess().getGroup()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:610:1: ( rule__TextArea__Group__0 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:610:2: rule__TextArea__Group__0
            {
            pushFollow(FOLLOW_rule__TextArea__Group__0_in_ruleTextArea1236);
            rule__TextArea__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTextAreaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTextArea"


    // $ANTLR start "rule__Rule__Alternatives_2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:622:1: rule__Rule__Alternatives_2 : ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__InteractivelyValidAssignment_2_1 ) ) );
    public final void rule__Rule__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:626:1: ( ( ( rule__Rule__Group_2_0__0 ) ) | ( ( rule__Rule__InteractivelyValidAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:627:1: ( ( rule__Rule__Group_2_0__0 ) )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:627:1: ( ( rule__Rule__Group_2_0__0 ) )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:628:1: ( rule__Rule__Group_2_0__0 )
                    {
                     before(grammarAccess.getRuleAccess().getGroup_2_0()); 
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:629:1: ( rule__Rule__Group_2_0__0 )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:629:2: rule__Rule__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__Rule__Group_2_0__0_in_rule__Rule__Alternatives_21272);
                    rule__Rule__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:633:6: ( ( rule__Rule__InteractivelyValidAssignment_2_1 ) )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:633:6: ( ( rule__Rule__InteractivelyValidAssignment_2_1 ) )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:634:1: ( rule__Rule__InteractivelyValidAssignment_2_1 )
                    {
                     before(grammarAccess.getRuleAccess().getInteractivelyValidAssignment_2_1()); 
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:635:1: ( rule__Rule__InteractivelyValidAssignment_2_1 )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:635:2: rule__Rule__InteractivelyValidAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__Rule__InteractivelyValidAssignment_2_1_in_rule__Rule__Alternatives_21290);
                    rule__Rule__InteractivelyValidAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRuleAccess().getInteractivelyValidAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Alternatives_2"


    // $ANTLR start "rule__Valid__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:644:1: rule__Valid__Alternatives : ( ( 'interactive' ) | ( 'notinteractive' ) );
    public final void rule__Valid__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:648:1: ( ( 'interactive' ) | ( 'notinteractive' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:649:1: ( 'interactive' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:649:1: ( 'interactive' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:650:1: 'interactive'
                    {
                     before(grammarAccess.getValidAccess().getInteractiveKeyword_0()); 
                    match(input,11,FOLLOW_11_in_rule__Valid__Alternatives1324); 
                     after(grammarAccess.getValidAccess().getInteractiveKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:657:6: ( 'notinteractive' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:657:6: ( 'notinteractive' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:658:1: 'notinteractive'
                    {
                     before(grammarAccess.getValidAccess().getNotinteractiveKeyword_1()); 
                    match(input,12,FOLLOW_12_in_rule__Valid__Alternatives1344); 
                     after(grammarAccess.getValidAccess().getNotinteractiveKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Valid__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:671:1: rule__Type__Alternatives : ( ( 'selection_1_n' ) | ( 'selection_n_n' ) | ( 'container' ) | ( 'input' ) | ( 'output' ) | ( 'command' ) | ( 'navigation' ) | ( 'Root' ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:675:1: ( ( 'selection_1_n' ) | ( 'selection_n_n' ) | ( 'container' ) | ( 'input' ) | ( 'output' ) | ( 'command' ) | ( 'navigation' ) | ( 'Root' ) )
            int alt3=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt3=1;
                }
                break;
            case 14:
                {
                alt3=2;
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            case 17:
                {
                alt3=5;
                }
                break;
            case 18:
                {
                alt3=6;
                }
                break;
            case 19:
                {
                alt3=7;
                }
                break;
            case 20:
                {
                alt3=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:676:1: ( 'selection_1_n' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:676:1: ( 'selection_1_n' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:677:1: 'selection_1_n'
                    {
                     before(grammarAccess.getTypeAccess().getSelection_1_nKeyword_0()); 
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1380); 
                     after(grammarAccess.getTypeAccess().getSelection_1_nKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:684:6: ( 'selection_n_n' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:684:6: ( 'selection_n_n' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:685:1: 'selection_n_n'
                    {
                     before(grammarAccess.getTypeAccess().getSelection_n_nKeyword_1()); 
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1400); 
                     after(grammarAccess.getTypeAccess().getSelection_n_nKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:692:6: ( 'container' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:692:6: ( 'container' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:693:1: 'container'
                    {
                     before(grammarAccess.getTypeAccess().getContainerKeyword_2()); 
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1420); 
                     after(grammarAccess.getTypeAccess().getContainerKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:700:6: ( 'input' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:700:6: ( 'input' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:701:1: 'input'
                    {
                     before(grammarAccess.getTypeAccess().getInputKeyword_3()); 
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1440); 
                     after(grammarAccess.getTypeAccess().getInputKeyword_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:708:6: ( 'output' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:708:6: ( 'output' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:709:1: 'output'
                    {
                     before(grammarAccess.getTypeAccess().getOutputKeyword_4()); 
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives1460); 
                     after(grammarAccess.getTypeAccess().getOutputKeyword_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:716:6: ( 'command' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:716:6: ( 'command' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:717:1: 'command'
                    {
                     before(grammarAccess.getTypeAccess().getCommandKeyword_5()); 
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives1480); 
                     after(grammarAccess.getTypeAccess().getCommandKeyword_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:724:6: ( 'navigation' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:724:6: ( 'navigation' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:725:1: 'navigation'
                    {
                     before(grammarAccess.getTypeAccess().getNavigationKeyword_6()); 
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives1500); 
                     after(grammarAccess.getTypeAccess().getNavigationKeyword_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:732:6: ( 'Root' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:732:6: ( 'Root' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:733:1: 'Root'
                    {
                     before(grammarAccess.getTypeAccess().getRootKeyword_7()); 
                    match(input,20,FOLLOW_20_in_rule__Type__Alternatives1520); 
                     after(grammarAccess.getTypeAccess().getRootKeyword_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__AUIType__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:745:1: rule__AUIType__Alternatives : ( ( 'abstract' ) | ( 'interactive' ) | ( 'user' ) | ( 'system' ) );
    public final void rule__AUIType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:749:1: ( ( 'abstract' ) | ( 'interactive' ) | ( 'user' ) | ( 'system' ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt4=1;
                }
                break;
            case 11:
                {
                alt4=2;
                }
                break;
            case 22:
                {
                alt4=3;
                }
                break;
            case 23:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:750:1: ( 'abstract' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:750:1: ( 'abstract' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:751:1: 'abstract'
                    {
                     before(grammarAccess.getAUITypeAccess().getAbstractKeyword_0()); 
                    match(input,21,FOLLOW_21_in_rule__AUIType__Alternatives1555); 
                     after(grammarAccess.getAUITypeAccess().getAbstractKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:758:6: ( 'interactive' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:758:6: ( 'interactive' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:759:1: 'interactive'
                    {
                     before(grammarAccess.getAUITypeAccess().getInteractiveKeyword_1()); 
                    match(input,11,FOLLOW_11_in_rule__AUIType__Alternatives1575); 
                     after(grammarAccess.getAUITypeAccess().getInteractiveKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:766:6: ( 'user' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:766:6: ( 'user' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:767:1: 'user'
                    {
                     before(grammarAccess.getAUITypeAccess().getUserKeyword_2()); 
                    match(input,22,FOLLOW_22_in_rule__AUIType__Alternatives1595); 
                     after(grammarAccess.getAUITypeAccess().getUserKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:774:6: ( 'system' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:774:6: ( 'system' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:775:1: 'system'
                    {
                     before(grammarAccess.getAUITypeAccess().getSystemKeyword_3()); 
                    match(input,23,FOLLOW_23_in_rule__AUIType__Alternatives1615); 
                     after(grammarAccess.getAUITypeAccess().getSystemKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AUIType__Alternatives"


    // $ANTLR start "rule__UIElement__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:787:1: rule__UIElement__Alternatives : ( ( ruleWindow ) | ( ruleListElementSelector ) | ( ruleButton ) | ( rulePanel ) | ( ruleDataField ) | ( ruleImageField ) | ( ruleTextField ) | ( ruleTextArea ) );
    public final void rule__UIElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:791:1: ( ( ruleWindow ) | ( ruleListElementSelector ) | ( ruleButton ) | ( rulePanel ) | ( ruleDataField ) | ( ruleImageField ) | ( ruleTextField ) | ( ruleTextArea ) )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 38:
                {
                alt5=1;
                }
                break;
            case 41:
                {
                alt5=2;
                }
                break;
            case 44:
                {
                alt5=3;
                }
                break;
            case 40:
                {
                alt5=4;
                }
                break;
            case 45:
                {
                alt5=5;
                }
                break;
            case 46:
                {
                alt5=6;
                }
                break;
            case 47:
                {
                alt5=7;
                }
                break;
            case 48:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:792:1: ( ruleWindow )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:792:1: ( ruleWindow )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:793:1: ruleWindow
                    {
                     before(grammarAccess.getUIElementAccess().getWindowParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleWindow_in_rule__UIElement__Alternatives1649);
                    ruleWindow();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getWindowParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:798:6: ( ruleListElementSelector )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:798:6: ( ruleListElementSelector )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:799:1: ruleListElementSelector
                    {
                     before(grammarAccess.getUIElementAccess().getListElementSelectorParserRuleCall_1()); 
                    pushFollow(FOLLOW_ruleListElementSelector_in_rule__UIElement__Alternatives1666);
                    ruleListElementSelector();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getListElementSelectorParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:804:6: ( ruleButton )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:804:6: ( ruleButton )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:805:1: ruleButton
                    {
                     before(grammarAccess.getUIElementAccess().getButtonParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleButton_in_rule__UIElement__Alternatives1683);
                    ruleButton();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getButtonParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:810:6: ( rulePanel )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:810:6: ( rulePanel )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:811:1: rulePanel
                    {
                     before(grammarAccess.getUIElementAccess().getPanelParserRuleCall_3()); 
                    pushFollow(FOLLOW_rulePanel_in_rule__UIElement__Alternatives1700);
                    rulePanel();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getPanelParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:816:6: ( ruleDataField )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:816:6: ( ruleDataField )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:817:1: ruleDataField
                    {
                     before(grammarAccess.getUIElementAccess().getDataFieldParserRuleCall_4()); 
                    pushFollow(FOLLOW_ruleDataField_in_rule__UIElement__Alternatives1717);
                    ruleDataField();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getDataFieldParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:822:6: ( ruleImageField )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:822:6: ( ruleImageField )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:823:1: ruleImageField
                    {
                     before(grammarAccess.getUIElementAccess().getImageFieldParserRuleCall_5()); 
                    pushFollow(FOLLOW_ruleImageField_in_rule__UIElement__Alternatives1734);
                    ruleImageField();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getImageFieldParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:828:6: ( ruleTextField )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:828:6: ( ruleTextField )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:829:1: ruleTextField
                    {
                     before(grammarAccess.getUIElementAccess().getTextFieldParserRuleCall_6()); 
                    pushFollow(FOLLOW_ruleTextField_in_rule__UIElement__Alternatives1751);
                    ruleTextField();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getTextFieldParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:834:6: ( ruleTextArea )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:834:6: ( ruleTextArea )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:835:1: ruleTextArea
                    {
                     before(grammarAccess.getUIElementAccess().getTextAreaParserRuleCall_7()); 
                    pushFollow(FOLLOW_ruleTextArea_in_rule__UIElement__Alternatives1768);
                    ruleTextArea();

                    state._fsp--;

                     after(grammarAccess.getUIElementAccess().getTextAreaParserRuleCall_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UIElement__Alternatives"


    // $ANTLR start "rule__AttributeType__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:845:1: rule__AttributeType__Alternatives : ( ( 'string' ) | ( 'text' ) | ( 'document' ) | ( 'date' ) );
    public final void rule__AttributeType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:849:1: ( ( 'string' ) | ( 'text' ) | ( 'document' ) | ( 'date' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt6=1;
                }
                break;
            case 25:
                {
                alt6=2;
                }
                break;
            case 26:
                {
                alt6=3;
                }
                break;
            case 27:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:850:1: ( 'string' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:850:1: ( 'string' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:851:1: 'string'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 
                    match(input,24,FOLLOW_24_in_rule__AttributeType__Alternatives1801); 
                     after(grammarAccess.getAttributeTypeAccess().getStringKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:858:6: ( 'text' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:858:6: ( 'text' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:859:1: 'text'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getTextKeyword_1()); 
                    match(input,25,FOLLOW_25_in_rule__AttributeType__Alternatives1821); 
                     after(grammarAccess.getAttributeTypeAccess().getTextKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:866:6: ( 'document' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:866:6: ( 'document' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:867:1: 'document'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDocumentKeyword_2()); 
                    match(input,26,FOLLOW_26_in_rule__AttributeType__Alternatives1841); 
                     after(grammarAccess.getAttributeTypeAccess().getDocumentKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:874:6: ( 'date' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:874:6: ( 'date' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:875:1: 'date'
                    {
                     before(grammarAccess.getAttributeTypeAccess().getDateKeyword_3()); 
                    match(input,27,FOLLOW_27_in_rule__AttributeType__Alternatives1861); 
                     after(grammarAccess.getAttributeTypeAccess().getDateKeyword_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeType__Alternatives"


    // $ANTLR start "rule__Label__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:887:1: rule__Label__Alternatives : ( ( RULE_STRING ) | ( 'taskName' ) );
    public final void rule__Label__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:891:1: ( ( RULE_STRING ) | ( 'taskName' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==28) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:892:1: ( RULE_STRING )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:892:1: ( RULE_STRING )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:893:1: RULE_STRING
                    {
                     before(grammarAccess.getLabelAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Label__Alternatives1895); 
                     after(grammarAccess.getLabelAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:898:6: ( 'taskName' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:898:6: ( 'taskName' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:899:1: 'taskName'
                    {
                     before(grammarAccess.getLabelAccess().getTaskNameKeyword_1()); 
                    match(input,28,FOLLOW_28_in_rule__Label__Alternatives1913); 
                     after(grammarAccess.getLabelAccess().getTaskNameKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Label__Alternatives"


    // $ANTLR start "rule__Concept__Alternatives"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:911:1: rule__Concept__Alternatives : ( ( 'All Concepts' ) | ( 'No Concepts' ) | ( ( rule__Concept__SelectionAssignment_2 )* ) );
    public final void rule__Concept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:915:1: ( ( 'All Concepts' ) | ( 'No Concepts' ) | ( ( rule__Concept__SelectionAssignment_2 )* ) )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt9=1;
                }
                break;
            case 30:
                {
                alt9=2;
                }
                break;
            case EOF:
            case 33:
            case 38:
            case 40:
            case 41:
            case 42:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
                {
                alt9=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:916:1: ( 'All Concepts' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:916:1: ( 'All Concepts' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:917:1: 'All Concepts'
                    {
                     before(grammarAccess.getConceptAccess().getAllConceptsKeyword_0()); 
                    match(input,29,FOLLOW_29_in_rule__Concept__Alternatives1948); 
                     after(grammarAccess.getConceptAccess().getAllConceptsKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:924:6: ( 'No Concepts' )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:924:6: ( 'No Concepts' )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:925:1: 'No Concepts'
                    {
                     before(grammarAccess.getConceptAccess().getNoConceptsKeyword_1()); 
                    match(input,30,FOLLOW_30_in_rule__Concept__Alternatives1968); 
                     after(grammarAccess.getConceptAccess().getNoConceptsKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:932:6: ( ( rule__Concept__SelectionAssignment_2 )* )
                    {
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:932:6: ( ( rule__Concept__SelectionAssignment_2 )* )
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:933:1: ( rule__Concept__SelectionAssignment_2 )*
                    {
                     before(grammarAccess.getConceptAccess().getSelectionAssignment_2()); 
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:934:1: ( rule__Concept__SelectionAssignment_2 )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==42) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:934:2: rule__Concept__SelectionAssignment_2
                    	    {
                    	    pushFollow(FOLLOW_rule__Concept__SelectionAssignment_2_in_rule__Concept__Alternatives1987);
                    	    rule__Concept__SelectionAssignment_2();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                     after(grammarAccess.getConceptAccess().getSelectionAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:945:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:949:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:950:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02019);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02022);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:957:1: rule__Model__Group__0__Impl : ( ( rule__Model__RulesAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:961:1: ( ( ( rule__Model__RulesAssignment_0 )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:962:1: ( ( rule__Model__RulesAssignment_0 )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:962:1: ( ( rule__Model__RulesAssignment_0 )* )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:963:1: ( rule__Model__RulesAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getRulesAssignment_0()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:964:1: ( rule__Model__RulesAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==31) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:964:2: rule__Model__RulesAssignment_0
            	    {
            	    pushFollow(FOLLOW_rule__Model__RulesAssignment_0_in_rule__Model__Group__0__Impl2049);
            	    rule__Model__RulesAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getRulesAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:974:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:978:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:979:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12080);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12083);
            rule__Model__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:986:1: rule__Model__Group__1__Impl : ( ( rule__Model__SpecificRulesAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:990:1: ( ( ( rule__Model__SpecificRulesAssignment_1 )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:991:1: ( ( rule__Model__SpecificRulesAssignment_1 )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:991:1: ( ( rule__Model__SpecificRulesAssignment_1 )* )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:992:1: ( rule__Model__SpecificRulesAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getSpecificRulesAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:993:1: ( rule__Model__SpecificRulesAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==35) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:993:2: rule__Model__SpecificRulesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__Model__SpecificRulesAssignment_1_in_rule__Model__Group__1__Impl2110);
            	    rule__Model__SpecificRulesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSpecificRulesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1003:1: rule__Model__Group__2 : rule__Model__Group__2__Impl ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1007:1: ( rule__Model__Group__2__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1008:2: rule__Model__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22141);
            rule__Model__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1014:1: rule__Model__Group__2__Impl : ( ( rule__Model__DomainRulesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1018:1: ( ( ( rule__Model__DomainRulesAssignment_2 )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1019:1: ( ( rule__Model__DomainRulesAssignment_2 )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1019:1: ( ( rule__Model__DomainRulesAssignment_2 )* )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1020:1: ( rule__Model__DomainRulesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getDomainRulesAssignment_2()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1021:1: ( rule__Model__DomainRulesAssignment_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==37) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1021:2: rule__Model__DomainRulesAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__Model__DomainRulesAssignment_2_in_rule__Model__Group__2__Impl2168);
            	    rule__Model__DomainRulesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getDomainRulesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1037:1: rule__Rule__Group__0 : rule__Rule__Group__0__Impl rule__Rule__Group__1 ;
    public final void rule__Rule__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1041:1: ( rule__Rule__Group__0__Impl rule__Rule__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1042:2: rule__Rule__Group__0__Impl rule__Rule__Group__1
            {
            pushFollow(FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02205);
            rule__Rule__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02208);
            rule__Rule__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0"


    // $ANTLR start "rule__Rule__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1049:1: rule__Rule__Group__0__Impl : ( 'task rule from' ) ;
    public final void rule__Rule__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1053:1: ( ( 'task rule from' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1054:1: ( 'task rule from' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1054:1: ( 'task rule from' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1055:1: 'task rule from'
            {
             before(grammarAccess.getRuleAccess().getTaskRuleFromKeyword_0()); 
            match(input,31,FOLLOW_31_in_rule__Rule__Group__0__Impl2236); 
             after(grammarAccess.getRuleAccess().getTaskRuleFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__0__Impl"


    // $ANTLR start "rule__Rule__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1068:1: rule__Rule__Group__1 : rule__Rule__Group__1__Impl rule__Rule__Group__2 ;
    public final void rule__Rule__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1072:1: ( rule__Rule__Group__1__Impl rule__Rule__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1073:2: rule__Rule__Group__1__Impl rule__Rule__Group__2
            {
            pushFollow(FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12267);
            rule__Rule__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12270);
            rule__Rule__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1"


    // $ANTLR start "rule__Rule__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1080:1: rule__Rule__Group__1__Impl : ( ( rule__Rule__AuitypeAssignment_1 ) ) ;
    public final void rule__Rule__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1084:1: ( ( ( rule__Rule__AuitypeAssignment_1 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1085:1: ( ( rule__Rule__AuitypeAssignment_1 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1085:1: ( ( rule__Rule__AuitypeAssignment_1 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1086:1: ( rule__Rule__AuitypeAssignment_1 )
            {
             before(grammarAccess.getRuleAccess().getAuitypeAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1087:1: ( rule__Rule__AuitypeAssignment_1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1087:2: rule__Rule__AuitypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Rule__AuitypeAssignment_1_in_rule__Rule__Group__1__Impl2297);
            rule__Rule__AuitypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getAuitypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__1__Impl"


    // $ANTLR start "rule__Rule__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1097:1: rule__Rule__Group__2 : rule__Rule__Group__2__Impl rule__Rule__Group__3 ;
    public final void rule__Rule__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1101:1: ( rule__Rule__Group__2__Impl rule__Rule__Group__3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1102:2: rule__Rule__Group__2__Impl rule__Rule__Group__3
            {
            pushFollow(FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22327);
            rule__Rule__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22330);
            rule__Rule__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2"


    // $ANTLR start "rule__Rule__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1109:1: rule__Rule__Group__2__Impl : ( ( rule__Rule__Alternatives_2 )? ) ;
    public final void rule__Rule__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1113:1: ( ( ( rule__Rule__Alternatives_2 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1114:1: ( ( rule__Rule__Alternatives_2 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1114:1: ( ( rule__Rule__Alternatives_2 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1115:1: ( rule__Rule__Alternatives_2 )?
            {
             before(grammarAccess.getRuleAccess().getAlternatives_2()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1116:1: ( rule__Rule__Alternatives_2 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=11 && LA13_0<=12)||LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1116:2: rule__Rule__Alternatives_2
                    {
                    pushFollow(FOLLOW_rule__Rule__Alternatives_2_in_rule__Rule__Group__2__Impl2357);
                    rule__Rule__Alternatives_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRuleAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__2__Impl"


    // $ANTLR start "rule__Rule__Group__3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1126:1: rule__Rule__Group__3 : rule__Rule__Group__3__Impl rule__Rule__Group__4 ;
    public final void rule__Rule__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1130:1: ( rule__Rule__Group__3__Impl rule__Rule__Group__4 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1131:2: rule__Rule__Group__3__Impl rule__Rule__Group__4
            {
            pushFollow(FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32388);
            rule__Rule__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32391);
            rule__Rule__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3"


    // $ANTLR start "rule__Rule__Group__3__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1138:1: rule__Rule__Group__3__Impl : ( 'to' ) ;
    public final void rule__Rule__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1142:1: ( ( 'to' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1143:1: ( 'to' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1143:1: ( 'to' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1144:1: 'to'
            {
             before(grammarAccess.getRuleAccess().getToKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Rule__Group__3__Impl2419); 
             after(grammarAccess.getRuleAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__3__Impl"


    // $ANTLR start "rule__Rule__Group__4"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1157:1: rule__Rule__Group__4 : rule__Rule__Group__4__Impl rule__Rule__Group__5 ;
    public final void rule__Rule__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1161:1: ( rule__Rule__Group__4__Impl rule__Rule__Group__5 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1162:2: rule__Rule__Group__4__Impl rule__Rule__Group__5
            {
            pushFollow(FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42450);
            rule__Rule__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42453);
            rule__Rule__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4"


    // $ANTLR start "rule__Rule__Group__4__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1169:1: rule__Rule__Group__4__Impl : ( ( rule__Rule__UielementAssignment_4 ) ) ;
    public final void rule__Rule__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1173:1: ( ( ( rule__Rule__UielementAssignment_4 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1174:1: ( ( rule__Rule__UielementAssignment_4 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1174:1: ( ( rule__Rule__UielementAssignment_4 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1175:1: ( rule__Rule__UielementAssignment_4 )
            {
             before(grammarAccess.getRuleAccess().getUielementAssignment_4()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1176:1: ( rule__Rule__UielementAssignment_4 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1176:2: rule__Rule__UielementAssignment_4
            {
            pushFollow(FOLLOW_rule__Rule__UielementAssignment_4_in_rule__Rule__Group__4__Impl2480);
            rule__Rule__UielementAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getUielementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__4__Impl"


    // $ANTLR start "rule__Rule__Group__5"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1186:1: rule__Rule__Group__5 : rule__Rule__Group__5__Impl ;
    public final void rule__Rule__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1190:1: ( rule__Rule__Group__5__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1191:2: rule__Rule__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52510);
            rule__Rule__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5"


    // $ANTLR start "rule__Rule__Group__5__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1197:1: rule__Rule__Group__5__Impl : ( ';' ) ;
    public final void rule__Rule__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1201:1: ( ( ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1202:1: ( ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1202:1: ( ';' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1203:1: ';'
            {
             before(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Rule__Group__5__Impl2538); 
             after(grammarAccess.getRuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group__5__Impl"


    // $ANTLR start "rule__Rule__Group_2_0__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1228:1: rule__Rule__Group_2_0__0 : rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 ;
    public final void rule__Rule__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1232:1: ( rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1233:2: rule__Rule__Group_2_0__0__Impl rule__Rule__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__Rule__Group_2_0__0__Impl_in_rule__Rule__Group_2_0__02581);
            rule__Rule__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Rule__Group_2_0__1_in_rule__Rule__Group_2_0__02584);
            rule__Rule__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__0"


    // $ANTLR start "rule__Rule__Group_2_0__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1240:1: rule__Rule__Group_2_0__0__Impl : ( 'and' ) ;
    public final void rule__Rule__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1244:1: ( ( 'and' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1245:1: ( 'and' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1245:1: ( 'and' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1246:1: 'and'
            {
             before(grammarAccess.getRuleAccess().getAndKeyword_2_0_0()); 
            match(input,34,FOLLOW_34_in_rule__Rule__Group_2_0__0__Impl2612); 
             after(grammarAccess.getRuleAccess().getAndKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__0__Impl"


    // $ANTLR start "rule__Rule__Group_2_0__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1259:1: rule__Rule__Group_2_0__1 : rule__Rule__Group_2_0__1__Impl ;
    public final void rule__Rule__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1263:1: ( rule__Rule__Group_2_0__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1264:2: rule__Rule__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Rule__Group_2_0__1__Impl_in_rule__Rule__Group_2_0__12643);
            rule__Rule__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__1"


    // $ANTLR start "rule__Rule__Group_2_0__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1270:1: rule__Rule__Group_2_0__1__Impl : ( ( rule__Rule__TaskTypeAssignment_2_0_1 ) ) ;
    public final void rule__Rule__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1274:1: ( ( ( rule__Rule__TaskTypeAssignment_2_0_1 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1275:1: ( ( rule__Rule__TaskTypeAssignment_2_0_1 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1275:1: ( ( rule__Rule__TaskTypeAssignment_2_0_1 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1276:1: ( rule__Rule__TaskTypeAssignment_2_0_1 )
            {
             before(grammarAccess.getRuleAccess().getTaskTypeAssignment_2_0_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1277:1: ( rule__Rule__TaskTypeAssignment_2_0_1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1277:2: rule__Rule__TaskTypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__Rule__TaskTypeAssignment_2_0_1_in_rule__Rule__Group_2_0__1__Impl2670);
            rule__Rule__TaskTypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRuleAccess().getTaskTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__Group_2_0__1__Impl"


    // $ANTLR start "rule__Specific__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1291:1: rule__Specific__Group__0 : rule__Specific__Group__0__Impl rule__Specific__Group__1 ;
    public final void rule__Specific__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1295:1: ( rule__Specific__Group__0__Impl rule__Specific__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1296:2: rule__Specific__Group__0__Impl rule__Specific__Group__1
            {
            pushFollow(FOLLOW_rule__Specific__Group__0__Impl_in_rule__Specific__Group__02704);
            rule__Specific__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specific__Group__1_in_rule__Specific__Group__02707);
            rule__Specific__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__0"


    // $ANTLR start "rule__Specific__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1303:1: rule__Specific__Group__0__Impl : ( 'specific rule from' ) ;
    public final void rule__Specific__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1307:1: ( ( 'specific rule from' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1308:1: ( 'specific rule from' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1308:1: ( 'specific rule from' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1309:1: 'specific rule from'
            {
             before(grammarAccess.getSpecificAccess().getSpecificRuleFromKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Specific__Group__0__Impl2735); 
             after(grammarAccess.getSpecificAccess().getSpecificRuleFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__0__Impl"


    // $ANTLR start "rule__Specific__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1322:1: rule__Specific__Group__1 : rule__Specific__Group__1__Impl rule__Specific__Group__2 ;
    public final void rule__Specific__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1326:1: ( rule__Specific__Group__1__Impl rule__Specific__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1327:2: rule__Specific__Group__1__Impl rule__Specific__Group__2
            {
            pushFollow(FOLLOW_rule__Specific__Group__1__Impl_in_rule__Specific__Group__12766);
            rule__Specific__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specific__Group__2_in_rule__Specific__Group__12769);
            rule__Specific__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__1"


    // $ANTLR start "rule__Specific__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1334:1: rule__Specific__Group__1__Impl : ( ( rule__Specific__TaskNameAssignment_1 ) ) ;
    public final void rule__Specific__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1338:1: ( ( ( rule__Specific__TaskNameAssignment_1 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1339:1: ( ( rule__Specific__TaskNameAssignment_1 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1339:1: ( ( rule__Specific__TaskNameAssignment_1 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1340:1: ( rule__Specific__TaskNameAssignment_1 )
            {
             before(grammarAccess.getSpecificAccess().getTaskNameAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1341:1: ( rule__Specific__TaskNameAssignment_1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1341:2: rule__Specific__TaskNameAssignment_1
            {
            pushFollow(FOLLOW_rule__Specific__TaskNameAssignment_1_in_rule__Specific__Group__1__Impl2796);
            rule__Specific__TaskNameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSpecificAccess().getTaskNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__1__Impl"


    // $ANTLR start "rule__Specific__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1351:1: rule__Specific__Group__2 : rule__Specific__Group__2__Impl rule__Specific__Group__3 ;
    public final void rule__Specific__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1355:1: ( rule__Specific__Group__2__Impl rule__Specific__Group__3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1356:2: rule__Specific__Group__2__Impl rule__Specific__Group__3
            {
            pushFollow(FOLLOW_rule__Specific__Group__2__Impl_in_rule__Specific__Group__22826);
            rule__Specific__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specific__Group__3_in_rule__Specific__Group__22829);
            rule__Specific__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__2"


    // $ANTLR start "rule__Specific__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1363:1: rule__Specific__Group__2__Impl : ( ( 'interactivelyValid' )? ) ;
    public final void rule__Specific__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1367:1: ( ( ( 'interactivelyValid' )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1368:1: ( ( 'interactivelyValid' )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1368:1: ( ( 'interactivelyValid' )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1369:1: ( 'interactivelyValid' )?
            {
             before(grammarAccess.getSpecificAccess().getInteractivelyValidKeyword_2()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1370:1: ( 'interactivelyValid' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1371:2: 'interactivelyValid'
                    {
                    match(input,36,FOLLOW_36_in_rule__Specific__Group__2__Impl2858); 

                    }
                    break;

            }

             after(grammarAccess.getSpecificAccess().getInteractivelyValidKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__2__Impl"


    // $ANTLR start "rule__Specific__Group__3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1382:1: rule__Specific__Group__3 : rule__Specific__Group__3__Impl rule__Specific__Group__4 ;
    public final void rule__Specific__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1386:1: ( rule__Specific__Group__3__Impl rule__Specific__Group__4 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1387:2: rule__Specific__Group__3__Impl rule__Specific__Group__4
            {
            pushFollow(FOLLOW_rule__Specific__Group__3__Impl_in_rule__Specific__Group__32891);
            rule__Specific__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specific__Group__4_in_rule__Specific__Group__32894);
            rule__Specific__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__3"


    // $ANTLR start "rule__Specific__Group__3__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1394:1: rule__Specific__Group__3__Impl : ( 'to' ) ;
    public final void rule__Specific__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1398:1: ( ( 'to' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1399:1: ( 'to' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1399:1: ( 'to' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1400:1: 'to'
            {
             before(grammarAccess.getSpecificAccess().getToKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__Specific__Group__3__Impl2922); 
             after(grammarAccess.getSpecificAccess().getToKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__3__Impl"


    // $ANTLR start "rule__Specific__Group__4"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1413:1: rule__Specific__Group__4 : rule__Specific__Group__4__Impl rule__Specific__Group__5 ;
    public final void rule__Specific__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1417:1: ( rule__Specific__Group__4__Impl rule__Specific__Group__5 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1418:2: rule__Specific__Group__4__Impl rule__Specific__Group__5
            {
            pushFollow(FOLLOW_rule__Specific__Group__4__Impl_in_rule__Specific__Group__42953);
            rule__Specific__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Specific__Group__5_in_rule__Specific__Group__42956);
            rule__Specific__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__4"


    // $ANTLR start "rule__Specific__Group__4__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1425:1: rule__Specific__Group__4__Impl : ( ( rule__Specific__UielementAssignment_4 )* ) ;
    public final void rule__Specific__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1429:1: ( ( ( rule__Specific__UielementAssignment_4 )* ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1430:1: ( ( rule__Specific__UielementAssignment_4 )* )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1430:1: ( ( rule__Specific__UielementAssignment_4 )* )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1431:1: ( rule__Specific__UielementAssignment_4 )*
            {
             before(grammarAccess.getSpecificAccess().getUielementAssignment_4()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1432:1: ( rule__Specific__UielementAssignment_4 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38||(LA15_0>=40 && LA15_0<=41)||(LA15_0>=44 && LA15_0<=48)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1432:2: rule__Specific__UielementAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__Specific__UielementAssignment_4_in_rule__Specific__Group__4__Impl2983);
            	    rule__Specific__UielementAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getSpecificAccess().getUielementAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__4__Impl"


    // $ANTLR start "rule__Specific__Group__5"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1442:1: rule__Specific__Group__5 : rule__Specific__Group__5__Impl ;
    public final void rule__Specific__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1446:1: ( rule__Specific__Group__5__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1447:2: rule__Specific__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Specific__Group__5__Impl_in_rule__Specific__Group__53014);
            rule__Specific__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__5"


    // $ANTLR start "rule__Specific__Group__5__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1453:1: rule__Specific__Group__5__Impl : ( ';' ) ;
    public final void rule__Specific__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1457:1: ( ( ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1458:1: ( ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1458:1: ( ';' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1459:1: ';'
            {
             before(grammarAccess.getSpecificAccess().getSemicolonKeyword_5()); 
            match(input,33,FOLLOW_33_in_rule__Specific__Group__5__Impl3042); 
             after(grammarAccess.getSpecificAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__Group__5__Impl"


    // $ANTLR start "rule__Domain__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1484:1: rule__Domain__Group__0 : rule__Domain__Group__0__Impl rule__Domain__Group__1 ;
    public final void rule__Domain__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1488:1: ( rule__Domain__Group__0__Impl rule__Domain__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1489:2: rule__Domain__Group__0__Impl rule__Domain__Group__1
            {
            pushFollow(FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03085);
            rule__Domain__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03088);
            rule__Domain__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0"


    // $ANTLR start "rule__Domain__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1496:1: rule__Domain__Group__0__Impl : ( 'domain rule from' ) ;
    public final void rule__Domain__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1500:1: ( ( 'domain rule from' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1501:1: ( 'domain rule from' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1501:1: ( 'domain rule from' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1502:1: 'domain rule from'
            {
             before(grammarAccess.getDomainAccess().getDomainRuleFromKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Domain__Group__0__Impl3116); 
             after(grammarAccess.getDomainAccess().getDomainRuleFromKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__0__Impl"


    // $ANTLR start "rule__Domain__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1515:1: rule__Domain__Group__1 : rule__Domain__Group__1__Impl rule__Domain__Group__2 ;
    public final void rule__Domain__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1519:1: ( rule__Domain__Group__1__Impl rule__Domain__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1520:2: rule__Domain__Group__1__Impl rule__Domain__Group__2
            {
            pushFollow(FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13147);
            rule__Domain__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13150);
            rule__Domain__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1"


    // $ANTLR start "rule__Domain__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1527:1: rule__Domain__Group__1__Impl : ( ( rule__Domain__DomainTypeAssignment_1 ) ) ;
    public final void rule__Domain__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1531:1: ( ( ( rule__Domain__DomainTypeAssignment_1 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1532:1: ( ( rule__Domain__DomainTypeAssignment_1 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1532:1: ( ( rule__Domain__DomainTypeAssignment_1 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1533:1: ( rule__Domain__DomainTypeAssignment_1 )
            {
             before(grammarAccess.getDomainAccess().getDomainTypeAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1534:1: ( rule__Domain__DomainTypeAssignment_1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1534:2: rule__Domain__DomainTypeAssignment_1
            {
            pushFollow(FOLLOW_rule__Domain__DomainTypeAssignment_1_in_rule__Domain__Group__1__Impl3177);
            rule__Domain__DomainTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getDomainTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__1__Impl"


    // $ANTLR start "rule__Domain__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1544:1: rule__Domain__Group__2 : rule__Domain__Group__2__Impl rule__Domain__Group__3 ;
    public final void rule__Domain__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1548:1: ( rule__Domain__Group__2__Impl rule__Domain__Group__3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1549:2: rule__Domain__Group__2__Impl rule__Domain__Group__3
            {
            pushFollow(FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23207);
            rule__Domain__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23210);
            rule__Domain__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2"


    // $ANTLR start "rule__Domain__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1556:1: rule__Domain__Group__2__Impl : ( 'to' ) ;
    public final void rule__Domain__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1560:1: ( ( 'to' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1561:1: ( 'to' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1561:1: ( 'to' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1562:1: 'to'
            {
             before(grammarAccess.getDomainAccess().getToKeyword_2()); 
            match(input,32,FOLLOW_32_in_rule__Domain__Group__2__Impl3238); 
             after(grammarAccess.getDomainAccess().getToKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__2__Impl"


    // $ANTLR start "rule__Domain__Group__3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1575:1: rule__Domain__Group__3 : rule__Domain__Group__3__Impl rule__Domain__Group__4 ;
    public final void rule__Domain__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1579:1: ( rule__Domain__Group__3__Impl rule__Domain__Group__4 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1580:2: rule__Domain__Group__3__Impl rule__Domain__Group__4
            {
            pushFollow(FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33269);
            rule__Domain__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33272);
            rule__Domain__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3"


    // $ANTLR start "rule__Domain__Group__3__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1587:1: rule__Domain__Group__3__Impl : ( ( rule__Domain__UielementAssignment_3 ) ) ;
    public final void rule__Domain__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1591:1: ( ( ( rule__Domain__UielementAssignment_3 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1592:1: ( ( rule__Domain__UielementAssignment_3 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1592:1: ( ( rule__Domain__UielementAssignment_3 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1593:1: ( rule__Domain__UielementAssignment_3 )
            {
             before(grammarAccess.getDomainAccess().getUielementAssignment_3()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1594:1: ( rule__Domain__UielementAssignment_3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1594:2: rule__Domain__UielementAssignment_3
            {
            pushFollow(FOLLOW_rule__Domain__UielementAssignment_3_in_rule__Domain__Group__3__Impl3299);
            rule__Domain__UielementAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDomainAccess().getUielementAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__3__Impl"


    // $ANTLR start "rule__Domain__Group__4"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1604:1: rule__Domain__Group__4 : rule__Domain__Group__4__Impl ;
    public final void rule__Domain__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1608:1: ( rule__Domain__Group__4__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1609:2: rule__Domain__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43329);
            rule__Domain__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4"


    // $ANTLR start "rule__Domain__Group__4__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1615:1: rule__Domain__Group__4__Impl : ( ';' ) ;
    public final void rule__Domain__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1619:1: ( ( ';' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1620:1: ( ';' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1620:1: ( ';' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1621:1: ';'
            {
             before(grammarAccess.getDomainAccess().getSemicolonKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__Domain__Group__4__Impl3357); 
             after(grammarAccess.getDomainAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__Group__4__Impl"


    // $ANTLR start "rule__Window__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1644:1: rule__Window__Group__0 : rule__Window__Group__0__Impl rule__Window__Group__1 ;
    public final void rule__Window__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1648:1: ( rule__Window__Group__0__Impl rule__Window__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1649:2: rule__Window__Group__0__Impl rule__Window__Group__1
            {
            pushFollow(FOLLOW_rule__Window__Group__0__Impl_in_rule__Window__Group__03398);
            rule__Window__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Window__Group__1_in_rule__Window__Group__03401);
            rule__Window__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0"


    // $ANTLR start "rule__Window__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1656:1: rule__Window__Group__0__Impl : ( 'Window' ) ;
    public final void rule__Window__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1660:1: ( ( 'Window' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1661:1: ( 'Window' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1661:1: ( 'Window' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1662:1: 'Window'
            {
             before(grammarAccess.getWindowAccess().getWindowKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Window__Group__0__Impl3429); 
             after(grammarAccess.getWindowAccess().getWindowKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__0__Impl"


    // $ANTLR start "rule__Window__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1675:1: rule__Window__Group__1 : rule__Window__Group__1__Impl rule__Window__Group__2 ;
    public final void rule__Window__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1679:1: ( rule__Window__Group__1__Impl rule__Window__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1680:2: rule__Window__Group__1__Impl rule__Window__Group__2
            {
            pushFollow(FOLLOW_rule__Window__Group__1__Impl_in_rule__Window__Group__13460);
            rule__Window__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Window__Group__2_in_rule__Window__Group__13463);
            rule__Window__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1"


    // $ANTLR start "rule__Window__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1687:1: rule__Window__Group__1__Impl : ( ( rule__Window__LabelAssignment_1 )? ) ;
    public final void rule__Window__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1691:1: ( ( ( rule__Window__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1692:1: ( ( rule__Window__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1692:1: ( ( rule__Window__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1693:1: ( rule__Window__LabelAssignment_1 )?
            {
             before(grammarAccess.getWindowAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1694:1: ( rule__Window__LabelAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING||LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1694:2: rule__Window__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Window__LabelAssignment_1_in_rule__Window__Group__1__Impl3490);
                    rule__Window__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWindowAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__1__Impl"


    // $ANTLR start "rule__Window__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1704:1: rule__Window__Group__2 : rule__Window__Group__2__Impl rule__Window__Group__3 ;
    public final void rule__Window__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1708:1: ( rule__Window__Group__2__Impl rule__Window__Group__3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1709:2: rule__Window__Group__2__Impl rule__Window__Group__3
            {
            pushFollow(FOLLOW_rule__Window__Group__2__Impl_in_rule__Window__Group__23521);
            rule__Window__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Window__Group__3_in_rule__Window__Group__23524);
            rule__Window__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2"


    // $ANTLR start "rule__Window__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1716:1: rule__Window__Group__2__Impl : ( 'with' ) ;
    public final void rule__Window__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1720:1: ( ( 'with' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1721:1: ( 'with' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1721:1: ( 'with' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1722:1: 'with'
            {
             before(grammarAccess.getWindowAccess().getWithKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Window__Group__2__Impl3552); 
             after(grammarAccess.getWindowAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__2__Impl"


    // $ANTLR start "rule__Window__Group__3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1735:1: rule__Window__Group__3 : rule__Window__Group__3__Impl ;
    public final void rule__Window__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1739:1: ( rule__Window__Group__3__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1740:2: rule__Window__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Window__Group__3__Impl_in_rule__Window__Group__33583);
            rule__Window__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3"


    // $ANTLR start "rule__Window__Group__3__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1746:1: rule__Window__Group__3__Impl : ( ( rule__Window__ContainedElementsAssignment_3 ) ) ;
    public final void rule__Window__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1750:1: ( ( ( rule__Window__ContainedElementsAssignment_3 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1751:1: ( ( rule__Window__ContainedElementsAssignment_3 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1751:1: ( ( rule__Window__ContainedElementsAssignment_3 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1752:1: ( rule__Window__ContainedElementsAssignment_3 )
            {
             before(grammarAccess.getWindowAccess().getContainedElementsAssignment_3()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1753:1: ( rule__Window__ContainedElementsAssignment_3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1753:2: rule__Window__ContainedElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__Window__ContainedElementsAssignment_3_in_rule__Window__Group__3__Impl3610);
            rule__Window__ContainedElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getContainedElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group__3__Impl"


    // $ANTLR start "rule__Panel__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1771:1: rule__Panel__Group__0 : rule__Panel__Group__0__Impl rule__Panel__Group__1 ;
    public final void rule__Panel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1775:1: ( rule__Panel__Group__0__Impl rule__Panel__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1776:2: rule__Panel__Group__0__Impl rule__Panel__Group__1
            {
            pushFollow(FOLLOW_rule__Panel__Group__0__Impl_in_rule__Panel__Group__03648);
            rule__Panel__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Panel__Group__1_in_rule__Panel__Group__03651);
            rule__Panel__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0"


    // $ANTLR start "rule__Panel__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1783:1: rule__Panel__Group__0__Impl : ( 'Panel' ) ;
    public final void rule__Panel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1787:1: ( ( 'Panel' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1788:1: ( 'Panel' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1788:1: ( 'Panel' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1789:1: 'Panel'
            {
             before(grammarAccess.getPanelAccess().getPanelKeyword_0()); 
            match(input,40,FOLLOW_40_in_rule__Panel__Group__0__Impl3679); 
             after(grammarAccess.getPanelAccess().getPanelKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__0__Impl"


    // $ANTLR start "rule__Panel__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1802:1: rule__Panel__Group__1 : rule__Panel__Group__1__Impl rule__Panel__Group__2 ;
    public final void rule__Panel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1806:1: ( rule__Panel__Group__1__Impl rule__Panel__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1807:2: rule__Panel__Group__1__Impl rule__Panel__Group__2
            {
            pushFollow(FOLLOW_rule__Panel__Group__1__Impl_in_rule__Panel__Group__13710);
            rule__Panel__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Panel__Group__2_in_rule__Panel__Group__13713);
            rule__Panel__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1"


    // $ANTLR start "rule__Panel__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1814:1: rule__Panel__Group__1__Impl : ( ( rule__Panel__LabelAssignment_1 )? ) ;
    public final void rule__Panel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1818:1: ( ( ( rule__Panel__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1819:1: ( ( rule__Panel__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1819:1: ( ( rule__Panel__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1820:1: ( rule__Panel__LabelAssignment_1 )?
            {
             before(grammarAccess.getPanelAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1821:1: ( rule__Panel__LabelAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING||LA17_0==28) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1821:2: rule__Panel__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Panel__LabelAssignment_1_in_rule__Panel__Group__1__Impl3740);
                    rule__Panel__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPanelAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__1__Impl"


    // $ANTLR start "rule__Panel__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1831:1: rule__Panel__Group__2 : rule__Panel__Group__2__Impl rule__Panel__Group__3 ;
    public final void rule__Panel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1835:1: ( rule__Panel__Group__2__Impl rule__Panel__Group__3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1836:2: rule__Panel__Group__2__Impl rule__Panel__Group__3
            {
            pushFollow(FOLLOW_rule__Panel__Group__2__Impl_in_rule__Panel__Group__23771);
            rule__Panel__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Panel__Group__3_in_rule__Panel__Group__23774);
            rule__Panel__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2"


    // $ANTLR start "rule__Panel__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1843:1: rule__Panel__Group__2__Impl : ( 'with' ) ;
    public final void rule__Panel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1847:1: ( ( 'with' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1848:1: ( 'with' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1848:1: ( 'with' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1849:1: 'with'
            {
             before(grammarAccess.getPanelAccess().getWithKeyword_2()); 
            match(input,39,FOLLOW_39_in_rule__Panel__Group__2__Impl3802); 
             after(grammarAccess.getPanelAccess().getWithKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__2__Impl"


    // $ANTLR start "rule__Panel__Group__3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1862:1: rule__Panel__Group__3 : rule__Panel__Group__3__Impl ;
    public final void rule__Panel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1866:1: ( rule__Panel__Group__3__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1867:2: rule__Panel__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Panel__Group__3__Impl_in_rule__Panel__Group__33833);
            rule__Panel__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3"


    // $ANTLR start "rule__Panel__Group__3__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1873:1: rule__Panel__Group__3__Impl : ( ( rule__Panel__ContainedElementsAssignment_3 ) ) ;
    public final void rule__Panel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1877:1: ( ( ( rule__Panel__ContainedElementsAssignment_3 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1878:1: ( ( rule__Panel__ContainedElementsAssignment_3 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1878:1: ( ( rule__Panel__ContainedElementsAssignment_3 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1879:1: ( rule__Panel__ContainedElementsAssignment_3 )
            {
             before(grammarAccess.getPanelAccess().getContainedElementsAssignment_3()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1880:1: ( rule__Panel__ContainedElementsAssignment_3 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1880:2: rule__Panel__ContainedElementsAssignment_3
            {
            pushFollow(FOLLOW_rule__Panel__ContainedElementsAssignment_3_in_rule__Panel__Group__3__Impl3860);
            rule__Panel__ContainedElementsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPanelAccess().getContainedElementsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__Group__3__Impl"


    // $ANTLR start "rule__ListElementSelector__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1898:1: rule__ListElementSelector__Group__0 : rule__ListElementSelector__Group__0__Impl rule__ListElementSelector__Group__1 ;
    public final void rule__ListElementSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1902:1: ( rule__ListElementSelector__Group__0__Impl rule__ListElementSelector__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1903:2: rule__ListElementSelector__Group__0__Impl rule__ListElementSelector__Group__1
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group__0__Impl_in_rule__ListElementSelector__Group__03898);
            rule__ListElementSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListElementSelector__Group__1_in_rule__ListElementSelector__Group__03901);
            rule__ListElementSelector__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__0"


    // $ANTLR start "rule__ListElementSelector__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1910:1: rule__ListElementSelector__Group__0__Impl : ( 'ListElementSelector' ) ;
    public final void rule__ListElementSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1914:1: ( ( 'ListElementSelector' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1915:1: ( 'ListElementSelector' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1915:1: ( 'ListElementSelector' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1916:1: 'ListElementSelector'
            {
             before(grammarAccess.getListElementSelectorAccess().getListElementSelectorKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__ListElementSelector__Group__0__Impl3929); 
             after(grammarAccess.getListElementSelectorAccess().getListElementSelectorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__0__Impl"


    // $ANTLR start "rule__ListElementSelector__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1929:1: rule__ListElementSelector__Group__1 : rule__ListElementSelector__Group__1__Impl rule__ListElementSelector__Group__2 ;
    public final void rule__ListElementSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1933:1: ( rule__ListElementSelector__Group__1__Impl rule__ListElementSelector__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1934:2: rule__ListElementSelector__Group__1__Impl rule__ListElementSelector__Group__2
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group__1__Impl_in_rule__ListElementSelector__Group__13960);
            rule__ListElementSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListElementSelector__Group__2_in_rule__ListElementSelector__Group__13963);
            rule__ListElementSelector__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__1"


    // $ANTLR start "rule__ListElementSelector__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1941:1: rule__ListElementSelector__Group__1__Impl : ( ( rule__ListElementSelector__LabelAssignment_1 )? ) ;
    public final void rule__ListElementSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1945:1: ( ( ( rule__ListElementSelector__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1946:1: ( ( rule__ListElementSelector__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1946:1: ( ( rule__ListElementSelector__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1947:1: ( rule__ListElementSelector__LabelAssignment_1 )?
            {
             before(grammarAccess.getListElementSelectorAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1948:1: ( rule__ListElementSelector__LabelAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING||LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1948:2: rule__ListElementSelector__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ListElementSelector__LabelAssignment_1_in_rule__ListElementSelector__Group__1__Impl3990);
                    rule__ListElementSelector__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListElementSelectorAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__1__Impl"


    // $ANTLR start "rule__ListElementSelector__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1958:1: rule__ListElementSelector__Group__2 : rule__ListElementSelector__Group__2__Impl ;
    public final void rule__ListElementSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1962:1: ( rule__ListElementSelector__Group__2__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1963:2: rule__ListElementSelector__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group__2__Impl_in_rule__ListElementSelector__Group__24021);
            rule__ListElementSelector__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__2"


    // $ANTLR start "rule__ListElementSelector__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1969:1: rule__ListElementSelector__Group__2__Impl : ( ( rule__ListElementSelector__Group_2__0 )? ) ;
    public final void rule__ListElementSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1973:1: ( ( ( rule__ListElementSelector__Group_2__0 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1974:1: ( ( rule__ListElementSelector__Group_2__0 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1974:1: ( ( rule__ListElementSelector__Group_2__0 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1975:1: ( rule__ListElementSelector__Group_2__0 )?
            {
             before(grammarAccess.getListElementSelectorAccess().getGroup_2()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1976:1: ( rule__ListElementSelector__Group_2__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1976:2: rule__ListElementSelector__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__ListElementSelector__Group_2__0_in_rule__ListElementSelector__Group__2__Impl4048);
                    rule__ListElementSelector__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getListElementSelectorAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group__2__Impl"


    // $ANTLR start "rule__ListElementSelector__Group_2__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1992:1: rule__ListElementSelector__Group_2__0 : rule__ListElementSelector__Group_2__0__Impl rule__ListElementSelector__Group_2__1 ;
    public final void rule__ListElementSelector__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1996:1: ( rule__ListElementSelector__Group_2__0__Impl rule__ListElementSelector__Group_2__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:1997:2: rule__ListElementSelector__Group_2__0__Impl rule__ListElementSelector__Group_2__1
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group_2__0__Impl_in_rule__ListElementSelector__Group_2__04085);
            rule__ListElementSelector__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ListElementSelector__Group_2__1_in_rule__ListElementSelector__Group_2__04088);
            rule__ListElementSelector__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group_2__0"


    // $ANTLR start "rule__ListElementSelector__Group_2__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2004:1: rule__ListElementSelector__Group_2__0__Impl : ( 'with' ) ;
    public final void rule__ListElementSelector__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2008:1: ( ( 'with' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2009:1: ( 'with' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2009:1: ( 'with' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2010:1: 'with'
            {
             before(grammarAccess.getListElementSelectorAccess().getWithKeyword_2_0()); 
            match(input,39,FOLLOW_39_in_rule__ListElementSelector__Group_2__0__Impl4116); 
             after(grammarAccess.getListElementSelectorAccess().getWithKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group_2__0__Impl"


    // $ANTLR start "rule__ListElementSelector__Group_2__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2023:1: rule__ListElementSelector__Group_2__1 : rule__ListElementSelector__Group_2__1__Impl ;
    public final void rule__ListElementSelector__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2027:1: ( rule__ListElementSelector__Group_2__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2028:2: rule__ListElementSelector__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__ListElementSelector__Group_2__1__Impl_in_rule__ListElementSelector__Group_2__14147);
            rule__ListElementSelector__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group_2__1"


    // $ANTLR start "rule__ListElementSelector__Group_2__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2034:1: rule__ListElementSelector__Group_2__1__Impl : ( ( rule__ListElementSelector__ContainedElementsAssignment_2_1 ) ) ;
    public final void rule__ListElementSelector__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2038:1: ( ( ( rule__ListElementSelector__ContainedElementsAssignment_2_1 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2039:1: ( ( rule__ListElementSelector__ContainedElementsAssignment_2_1 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2039:1: ( ( rule__ListElementSelector__ContainedElementsAssignment_2_1 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2040:1: ( rule__ListElementSelector__ContainedElementsAssignment_2_1 )
            {
             before(grammarAccess.getListElementSelectorAccess().getContainedElementsAssignment_2_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2041:1: ( rule__ListElementSelector__ContainedElementsAssignment_2_1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2041:2: rule__ListElementSelector__ContainedElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__ListElementSelector__ContainedElementsAssignment_2_1_in_rule__ListElementSelector__Group_2__1__Impl4174);
            rule__ListElementSelector__ContainedElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getListElementSelectorAccess().getContainedElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__Group_2__1__Impl"


    // $ANTLR start "rule__SelectedConcept__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2055:1: rule__SelectedConcept__Group__0 : rule__SelectedConcept__Group__0__Impl rule__SelectedConcept__Group__1 ;
    public final void rule__SelectedConcept__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2059:1: ( rule__SelectedConcept__Group__0__Impl rule__SelectedConcept__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2060:2: rule__SelectedConcept__Group__0__Impl rule__SelectedConcept__Group__1
            {
            pushFollow(FOLLOW_rule__SelectedConcept__Group__0__Impl_in_rule__SelectedConcept__Group__04208);
            rule__SelectedConcept__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectedConcept__Group__1_in_rule__SelectedConcept__Group__04211);
            rule__SelectedConcept__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__0"


    // $ANTLR start "rule__SelectedConcept__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2067:1: rule__SelectedConcept__Group__0__Impl : ( 'concept' ) ;
    public final void rule__SelectedConcept__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2071:1: ( ( 'concept' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2072:1: ( 'concept' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2072:1: ( 'concept' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2073:1: 'concept'
            {
             before(grammarAccess.getSelectedConceptAccess().getConceptKeyword_0()); 
            match(input,42,FOLLOW_42_in_rule__SelectedConcept__Group__0__Impl4239); 
             after(grammarAccess.getSelectedConceptAccess().getConceptKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__0__Impl"


    // $ANTLR start "rule__SelectedConcept__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2086:1: rule__SelectedConcept__Group__1 : rule__SelectedConcept__Group__1__Impl rule__SelectedConcept__Group__2 ;
    public final void rule__SelectedConcept__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2090:1: ( rule__SelectedConcept__Group__1__Impl rule__SelectedConcept__Group__2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2091:2: rule__SelectedConcept__Group__1__Impl rule__SelectedConcept__Group__2
            {
            pushFollow(FOLLOW_rule__SelectedConcept__Group__1__Impl_in_rule__SelectedConcept__Group__14270);
            rule__SelectedConcept__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SelectedConcept__Group__2_in_rule__SelectedConcept__Group__14273);
            rule__SelectedConcept__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__1"


    // $ANTLR start "rule__SelectedConcept__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2098:1: rule__SelectedConcept__Group__1__Impl : ( 'name' ) ;
    public final void rule__SelectedConcept__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2102:1: ( ( 'name' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2103:1: ( 'name' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2103:1: ( 'name' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2104:1: 'name'
            {
             before(grammarAccess.getSelectedConceptAccess().getNameKeyword_1()); 
            match(input,43,FOLLOW_43_in_rule__SelectedConcept__Group__1__Impl4301); 
             after(grammarAccess.getSelectedConceptAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__1__Impl"


    // $ANTLR start "rule__SelectedConcept__Group__2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2117:1: rule__SelectedConcept__Group__2 : rule__SelectedConcept__Group__2__Impl ;
    public final void rule__SelectedConcept__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2121:1: ( rule__SelectedConcept__Group__2__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2122:2: rule__SelectedConcept__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SelectedConcept__Group__2__Impl_in_rule__SelectedConcept__Group__24332);
            rule__SelectedConcept__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__2"


    // $ANTLR start "rule__SelectedConcept__Group__2__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2128:1: rule__SelectedConcept__Group__2__Impl : ( ( rule__SelectedConcept__IdAssignment_2 ) ) ;
    public final void rule__SelectedConcept__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2132:1: ( ( ( rule__SelectedConcept__IdAssignment_2 ) ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2133:1: ( ( rule__SelectedConcept__IdAssignment_2 ) )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2133:1: ( ( rule__SelectedConcept__IdAssignment_2 ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2134:1: ( rule__SelectedConcept__IdAssignment_2 )
            {
             before(grammarAccess.getSelectedConceptAccess().getIdAssignment_2()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2135:1: ( rule__SelectedConcept__IdAssignment_2 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2135:2: rule__SelectedConcept__IdAssignment_2
            {
            pushFollow(FOLLOW_rule__SelectedConcept__IdAssignment_2_in_rule__SelectedConcept__Group__2__Impl4359);
            rule__SelectedConcept__IdAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectedConceptAccess().getIdAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__Group__2__Impl"


    // $ANTLR start "rule__Button__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2151:1: rule__Button__Group__0 : rule__Button__Group__0__Impl rule__Button__Group__1 ;
    public final void rule__Button__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2155:1: ( rule__Button__Group__0__Impl rule__Button__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2156:2: rule__Button__Group__0__Impl rule__Button__Group__1
            {
            pushFollow(FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__04395);
            rule__Button__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Button__Group__1_in_rule__Button__Group__04398);
            rule__Button__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0"


    // $ANTLR start "rule__Button__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2163:1: rule__Button__Group__0__Impl : ( 'Button' ) ;
    public final void rule__Button__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2167:1: ( ( 'Button' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2168:1: ( 'Button' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2168:1: ( 'Button' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2169:1: 'Button'
            {
             before(grammarAccess.getButtonAccess().getButtonKeyword_0()); 
            match(input,44,FOLLOW_44_in_rule__Button__Group__0__Impl4426); 
             after(grammarAccess.getButtonAccess().getButtonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__0__Impl"


    // $ANTLR start "rule__Button__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2182:1: rule__Button__Group__1 : rule__Button__Group__1__Impl ;
    public final void rule__Button__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2186:1: ( rule__Button__Group__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2187:2: rule__Button__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__14457);
            rule__Button__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1"


    // $ANTLR start "rule__Button__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2193:1: rule__Button__Group__1__Impl : ( ( rule__Button__LabelAssignment_1 )? ) ;
    public final void rule__Button__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2197:1: ( ( ( rule__Button__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2198:1: ( ( rule__Button__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2198:1: ( ( rule__Button__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2199:1: ( rule__Button__LabelAssignment_1 )?
            {
             before(grammarAccess.getButtonAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2200:1: ( rule__Button__LabelAssignment_1 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING||LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2200:2: rule__Button__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Button__LabelAssignment_1_in_rule__Button__Group__1__Impl4484);
                    rule__Button__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getButtonAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__Group__1__Impl"


    // $ANTLR start "rule__DataField__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2214:1: rule__DataField__Group__0 : rule__DataField__Group__0__Impl rule__DataField__Group__1 ;
    public final void rule__DataField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2218:1: ( rule__DataField__Group__0__Impl rule__DataField__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2219:2: rule__DataField__Group__0__Impl rule__DataField__Group__1
            {
            pushFollow(FOLLOW_rule__DataField__Group__0__Impl_in_rule__DataField__Group__04519);
            rule__DataField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__DataField__Group__1_in_rule__DataField__Group__04522);
            rule__DataField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__0"


    // $ANTLR start "rule__DataField__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2226:1: rule__DataField__Group__0__Impl : ( 'DataField' ) ;
    public final void rule__DataField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2230:1: ( ( 'DataField' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2231:1: ( 'DataField' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2231:1: ( 'DataField' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2232:1: 'DataField'
            {
             before(grammarAccess.getDataFieldAccess().getDataFieldKeyword_0()); 
            match(input,45,FOLLOW_45_in_rule__DataField__Group__0__Impl4550); 
             after(grammarAccess.getDataFieldAccess().getDataFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__0__Impl"


    // $ANTLR start "rule__DataField__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2245:1: rule__DataField__Group__1 : rule__DataField__Group__1__Impl ;
    public final void rule__DataField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2249:1: ( rule__DataField__Group__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2250:2: rule__DataField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__DataField__Group__1__Impl_in_rule__DataField__Group__14581);
            rule__DataField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__1"


    // $ANTLR start "rule__DataField__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2256:1: rule__DataField__Group__1__Impl : ( ( rule__DataField__LabelAssignment_1 )? ) ;
    public final void rule__DataField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2260:1: ( ( ( rule__DataField__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2261:1: ( ( rule__DataField__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2261:1: ( ( rule__DataField__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2262:1: ( rule__DataField__LabelAssignment_1 )?
            {
             before(grammarAccess.getDataFieldAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2263:1: ( rule__DataField__LabelAssignment_1 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING||LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2263:2: rule__DataField__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__DataField__LabelAssignment_1_in_rule__DataField__Group__1__Impl4608);
                    rule__DataField__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getDataFieldAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__Group__1__Impl"


    // $ANTLR start "rule__ImageField__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2277:1: rule__ImageField__Group__0 : rule__ImageField__Group__0__Impl rule__ImageField__Group__1 ;
    public final void rule__ImageField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2281:1: ( rule__ImageField__Group__0__Impl rule__ImageField__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2282:2: rule__ImageField__Group__0__Impl rule__ImageField__Group__1
            {
            pushFollow(FOLLOW_rule__ImageField__Group__0__Impl_in_rule__ImageField__Group__04643);
            rule__ImageField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ImageField__Group__1_in_rule__ImageField__Group__04646);
            rule__ImageField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageField__Group__0"


    // $ANTLR start "rule__ImageField__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2289:1: rule__ImageField__Group__0__Impl : ( 'ImageField' ) ;
    public final void rule__ImageField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2293:1: ( ( 'ImageField' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2294:1: ( 'ImageField' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2294:1: ( 'ImageField' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2295:1: 'ImageField'
            {
             before(grammarAccess.getImageFieldAccess().getImageFieldKeyword_0()); 
            match(input,46,FOLLOW_46_in_rule__ImageField__Group__0__Impl4674); 
             after(grammarAccess.getImageFieldAccess().getImageFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageField__Group__0__Impl"


    // $ANTLR start "rule__ImageField__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2308:1: rule__ImageField__Group__1 : rule__ImageField__Group__1__Impl ;
    public final void rule__ImageField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2312:1: ( rule__ImageField__Group__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2313:2: rule__ImageField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__ImageField__Group__1__Impl_in_rule__ImageField__Group__14705);
            rule__ImageField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageField__Group__1"


    // $ANTLR start "rule__ImageField__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2319:1: rule__ImageField__Group__1__Impl : ( ( rule__ImageField__LabelAssignment_1 )? ) ;
    public final void rule__ImageField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2323:1: ( ( ( rule__ImageField__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2324:1: ( ( rule__ImageField__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2324:1: ( ( rule__ImageField__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2325:1: ( rule__ImageField__LabelAssignment_1 )?
            {
             before(grammarAccess.getImageFieldAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2326:1: ( rule__ImageField__LabelAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING||LA22_0==28) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2326:2: rule__ImageField__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ImageField__LabelAssignment_1_in_rule__ImageField__Group__1__Impl4732);
                    rule__ImageField__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getImageFieldAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageField__Group__1__Impl"


    // $ANTLR start "rule__TextField__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2340:1: rule__TextField__Group__0 : rule__TextField__Group__0__Impl rule__TextField__Group__1 ;
    public final void rule__TextField__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2344:1: ( rule__TextField__Group__0__Impl rule__TextField__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2345:2: rule__TextField__Group__0__Impl rule__TextField__Group__1
            {
            pushFollow(FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04767);
            rule__TextField__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04770);
            rule__TextField__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0"


    // $ANTLR start "rule__TextField__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2352:1: rule__TextField__Group__0__Impl : ( 'TextField' ) ;
    public final void rule__TextField__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2356:1: ( ( 'TextField' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2357:1: ( 'TextField' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2357:1: ( 'TextField' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2358:1: 'TextField'
            {
             before(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 
            match(input,47,FOLLOW_47_in_rule__TextField__Group__0__Impl4798); 
             after(grammarAccess.getTextFieldAccess().getTextFieldKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__0__Impl"


    // $ANTLR start "rule__TextField__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2371:1: rule__TextField__Group__1 : rule__TextField__Group__1__Impl ;
    public final void rule__TextField__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2375:1: ( rule__TextField__Group__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2376:2: rule__TextField__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14829);
            rule__TextField__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1"


    // $ANTLR start "rule__TextField__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2382:1: rule__TextField__Group__1__Impl : ( ( rule__TextField__LabelAssignment_1 )? ) ;
    public final void rule__TextField__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2386:1: ( ( ( rule__TextField__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2387:1: ( ( rule__TextField__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2387:1: ( ( rule__TextField__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2388:1: ( rule__TextField__LabelAssignment_1 )?
            {
             before(grammarAccess.getTextFieldAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2389:1: ( rule__TextField__LabelAssignment_1 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_STRING||LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2389:2: rule__TextField__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TextField__LabelAssignment_1_in_rule__TextField__Group__1__Impl4856);
                    rule__TextField__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextFieldAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__Group__1__Impl"


    // $ANTLR start "rule__TextArea__Group__0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2403:1: rule__TextArea__Group__0 : rule__TextArea__Group__0__Impl rule__TextArea__Group__1 ;
    public final void rule__TextArea__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2407:1: ( rule__TextArea__Group__0__Impl rule__TextArea__Group__1 )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2408:2: rule__TextArea__Group__0__Impl rule__TextArea__Group__1
            {
            pushFollow(FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__04891);
            rule__TextArea__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__04894);
            rule__TextArea__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0"


    // $ANTLR start "rule__TextArea__Group__0__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2415:1: rule__TextArea__Group__0__Impl : ( 'TextArea' ) ;
    public final void rule__TextArea__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2419:1: ( ( 'TextArea' ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2420:1: ( 'TextArea' )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2420:1: ( 'TextArea' )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2421:1: 'TextArea'
            {
             before(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 
            match(input,48,FOLLOW_48_in_rule__TextArea__Group__0__Impl4922); 
             after(grammarAccess.getTextAreaAccess().getTextAreaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__0__Impl"


    // $ANTLR start "rule__TextArea__Group__1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2434:1: rule__TextArea__Group__1 : rule__TextArea__Group__1__Impl ;
    public final void rule__TextArea__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2438:1: ( rule__TextArea__Group__1__Impl )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2439:2: rule__TextArea__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__14953);
            rule__TextArea__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1"


    // $ANTLR start "rule__TextArea__Group__1__Impl"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2445:1: rule__TextArea__Group__1__Impl : ( ( rule__TextArea__LabelAssignment_1 )? ) ;
    public final void rule__TextArea__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2449:1: ( ( ( rule__TextArea__LabelAssignment_1 )? ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2450:1: ( ( rule__TextArea__LabelAssignment_1 )? )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2450:1: ( ( rule__TextArea__LabelAssignment_1 )? )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2451:1: ( rule__TextArea__LabelAssignment_1 )?
            {
             before(grammarAccess.getTextAreaAccess().getLabelAssignment_1()); 
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2452:1: ( rule__TextArea__LabelAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_STRING||LA24_0==28) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2452:2: rule__TextArea__LabelAssignment_1
                    {
                    pushFollow(FOLLOW_rule__TextArea__LabelAssignment_1_in_rule__TextArea__Group__1__Impl4980);
                    rule__TextArea__LabelAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTextAreaAccess().getLabelAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__Group__1__Impl"


    // $ANTLR start "rule__Model__RulesAssignment_0"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2467:1: rule__Model__RulesAssignment_0 : ( ruleRule ) ;
    public final void rule__Model__RulesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2471:1: ( ( ruleRule ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2472:1: ( ruleRule )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2472:1: ( ruleRule )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2473:1: ruleRule
            {
             before(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRule_in_rule__Model__RulesAssignment_05020);
            ruleRule();

            state._fsp--;

             after(grammarAccess.getModelAccess().getRulesRuleParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__RulesAssignment_0"


    // $ANTLR start "rule__Model__SpecificRulesAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2482:1: rule__Model__SpecificRulesAssignment_1 : ( ruleSpecific ) ;
    public final void rule__Model__SpecificRulesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2486:1: ( ( ruleSpecific ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2487:1: ( ruleSpecific )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2487:1: ( ruleSpecific )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2488:1: ruleSpecific
            {
             before(grammarAccess.getModelAccess().getSpecificRulesSpecificParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSpecific_in_rule__Model__SpecificRulesAssignment_15051);
            ruleSpecific();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSpecificRulesSpecificParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SpecificRulesAssignment_1"


    // $ANTLR start "rule__Model__DomainRulesAssignment_2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2497:1: rule__Model__DomainRulesAssignment_2 : ( ruleDomain ) ;
    public final void rule__Model__DomainRulesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2501:1: ( ( ruleDomain ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2502:1: ( ruleDomain )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2502:1: ( ruleDomain )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2503:1: ruleDomain
            {
             before(grammarAccess.getModelAccess().getDomainRulesDomainParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleDomain_in_rule__Model__DomainRulesAssignment_25082);
            ruleDomain();

            state._fsp--;

             after(grammarAccess.getModelAccess().getDomainRulesDomainParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DomainRulesAssignment_2"


    // $ANTLR start "rule__Rule__AuitypeAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2512:1: rule__Rule__AuitypeAssignment_1 : ( ruleType ) ;
    public final void rule__Rule__AuitypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2516:1: ( ( ruleType ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2517:1: ( ruleType )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2517:1: ( ruleType )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2518:1: ruleType
            {
             before(grammarAccess.getRuleAccess().getAuitypeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__Rule__AuitypeAssignment_15113);
            ruleType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getAuitypeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__AuitypeAssignment_1"


    // $ANTLR start "rule__Rule__TaskTypeAssignment_2_0_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2527:1: rule__Rule__TaskTypeAssignment_2_0_1 : ( ruleAUIType ) ;
    public final void rule__Rule__TaskTypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2531:1: ( ( ruleAUIType ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2532:1: ( ruleAUIType )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2532:1: ( ruleAUIType )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2533:1: ruleAUIType
            {
             before(grammarAccess.getRuleAccess().getTaskTypeAUITypeParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleAUIType_in_rule__Rule__TaskTypeAssignment_2_0_15144);
            ruleAUIType();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getTaskTypeAUITypeParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__TaskTypeAssignment_2_0_1"


    // $ANTLR start "rule__Rule__InteractivelyValidAssignment_2_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2542:1: rule__Rule__InteractivelyValidAssignment_2_1 : ( ruleValid ) ;
    public final void rule__Rule__InteractivelyValidAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2546:1: ( ( ruleValid ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2547:1: ( ruleValid )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2547:1: ( ruleValid )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2548:1: ruleValid
            {
             before(grammarAccess.getRuleAccess().getInteractivelyValidValidParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleValid_in_rule__Rule__InteractivelyValidAssignment_2_15175);
            ruleValid();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getInteractivelyValidValidParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__InteractivelyValidAssignment_2_1"


    // $ANTLR start "rule__Rule__UielementAssignment_4"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2557:1: rule__Rule__UielementAssignment_4 : ( ruleUIElement ) ;
    public final void rule__Rule__UielementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2561:1: ( ( ruleUIElement ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2562:1: ( ruleUIElement )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2562:1: ( ruleUIElement )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2563:1: ruleUIElement
            {
             before(grammarAccess.getRuleAccess().getUielementUIElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUIElement_in_rule__Rule__UielementAssignment_45206);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getRuleAccess().getUielementUIElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Rule__UielementAssignment_4"


    // $ANTLR start "rule__Specific__TaskNameAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2572:1: rule__Specific__TaskNameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Specific__TaskNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2576:1: ( ( RULE_STRING ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2577:1: ( RULE_STRING )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2577:1: ( RULE_STRING )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2578:1: RULE_STRING
            {
             before(grammarAccess.getSpecificAccess().getTaskNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Specific__TaskNameAssignment_15237); 
             after(grammarAccess.getSpecificAccess().getTaskNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__TaskNameAssignment_1"


    // $ANTLR start "rule__Specific__UielementAssignment_4"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2587:1: rule__Specific__UielementAssignment_4 : ( ruleUIElement ) ;
    public final void rule__Specific__UielementAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2591:1: ( ( ruleUIElement ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2592:1: ( ruleUIElement )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2592:1: ( ruleUIElement )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2593:1: ruleUIElement
            {
             before(grammarAccess.getSpecificAccess().getUielementUIElementParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleUIElement_in_rule__Specific__UielementAssignment_45268);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getSpecificAccess().getUielementUIElementParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Specific__UielementAssignment_4"


    // $ANTLR start "rule__Domain__DomainTypeAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2602:1: rule__Domain__DomainTypeAssignment_1 : ( ruleAttributeType ) ;
    public final void rule__Domain__DomainTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2606:1: ( ( ruleAttributeType ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2607:1: ( ruleAttributeType )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2607:1: ( ruleAttributeType )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2608:1: ruleAttributeType
            {
             before(grammarAccess.getDomainAccess().getDomainTypeAttributeTypeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeType_in_rule__Domain__DomainTypeAssignment_15299);
            ruleAttributeType();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getDomainTypeAttributeTypeParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__DomainTypeAssignment_1"


    // $ANTLR start "rule__Domain__UielementAssignment_3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2617:1: rule__Domain__UielementAssignment_3 : ( ruleUIElement ) ;
    public final void rule__Domain__UielementAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2621:1: ( ( ruleUIElement ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2622:1: ( ruleUIElement )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2622:1: ( ruleUIElement )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2623:1: ruleUIElement
            {
             before(grammarAccess.getDomainAccess().getUielementUIElementParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleUIElement_in_rule__Domain__UielementAssignment_35330);
            ruleUIElement();

            state._fsp--;

             after(grammarAccess.getDomainAccess().getUielementUIElementParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Domain__UielementAssignment_3"


    // $ANTLR start "rule__Window__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2632:1: rule__Window__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Window__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2636:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2637:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2637:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2638:1: ruleLabel
            {
             before(grammarAccess.getWindowAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Window__LabelAssignment_15361);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__LabelAssignment_1"


    // $ANTLR start "rule__Window__ContainedElementsAssignment_3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2647:1: rule__Window__ContainedElementsAssignment_3 : ( ruleConcept ) ;
    public final void rule__Window__ContainedElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2651:1: ( ( ruleConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2652:1: ( ruleConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2652:1: ( ruleConcept )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2653:1: ruleConcept
            {
             before(grammarAccess.getWindowAccess().getContainedElementsConceptParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Window__ContainedElementsAssignment_35392);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getWindowAccess().getContainedElementsConceptParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__ContainedElementsAssignment_3"


    // $ANTLR start "rule__Panel__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2662:1: rule__Panel__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Panel__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2666:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2667:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2667:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2668:1: ruleLabel
            {
             before(grammarAccess.getPanelAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Panel__LabelAssignment_15423);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__LabelAssignment_1"


    // $ANTLR start "rule__Panel__ContainedElementsAssignment_3"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2677:1: rule__Panel__ContainedElementsAssignment_3 : ( ruleConcept ) ;
    public final void rule__Panel__ContainedElementsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2681:1: ( ( ruleConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2682:1: ( ruleConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2682:1: ( ruleConcept )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2683:1: ruleConcept
            {
             before(grammarAccess.getPanelAccess().getContainedElementsConceptParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__Panel__ContainedElementsAssignment_35454);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getPanelAccess().getContainedElementsConceptParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Panel__ContainedElementsAssignment_3"


    // $ANTLR start "rule__ListElementSelector__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2692:1: rule__ListElementSelector__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__ListElementSelector__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2696:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2697:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2697:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2698:1: ruleLabel
            {
             before(grammarAccess.getListElementSelectorAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__ListElementSelector__LabelAssignment_15485);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getListElementSelectorAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__LabelAssignment_1"


    // $ANTLR start "rule__ListElementSelector__ContainedElementsAssignment_2_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2707:1: rule__ListElementSelector__ContainedElementsAssignment_2_1 : ( ruleConcept ) ;
    public final void rule__ListElementSelector__ContainedElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2711:1: ( ( ruleConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2712:1: ( ruleConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2712:1: ( ruleConcept )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2713:1: ruleConcept
            {
             before(grammarAccess.getListElementSelectorAccess().getContainedElementsConceptParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleConcept_in_rule__ListElementSelector__ContainedElementsAssignment_2_15516);
            ruleConcept();

            state._fsp--;

             after(grammarAccess.getListElementSelectorAccess().getContainedElementsConceptParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListElementSelector__ContainedElementsAssignment_2_1"


    // $ANTLR start "rule__Concept__SelectionAssignment_2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2722:1: rule__Concept__SelectionAssignment_2 : ( ruleSelectedConcept ) ;
    public final void rule__Concept__SelectionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2726:1: ( ( ruleSelectedConcept ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2727:1: ( ruleSelectedConcept )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2727:1: ( ruleSelectedConcept )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2728:1: ruleSelectedConcept
            {
             before(grammarAccess.getConceptAccess().getSelectionSelectedConceptParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleSelectedConcept_in_rule__Concept__SelectionAssignment_25547);
            ruleSelectedConcept();

            state._fsp--;

             after(grammarAccess.getConceptAccess().getSelectionSelectedConceptParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Concept__SelectionAssignment_2"


    // $ANTLR start "rule__SelectedConcept__IdAssignment_2"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2737:1: rule__SelectedConcept__IdAssignment_2 : ( RULE_ID ) ;
    public final void rule__SelectedConcept__IdAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2741:1: ( ( RULE_ID ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2742:1: ( RULE_ID )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2742:1: ( RULE_ID )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2743:1: RULE_ID
            {
             before(grammarAccess.getSelectedConceptAccess().getIdIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SelectedConcept__IdAssignment_25578); 
             after(grammarAccess.getSelectedConceptAccess().getIdIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectedConcept__IdAssignment_2"


    // $ANTLR start "rule__Button__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2752:1: rule__Button__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__Button__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2756:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2757:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2757:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2758:1: ruleLabel
            {
             before(grammarAccess.getButtonAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__Button__LabelAssignment_15609);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getButtonAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Button__LabelAssignment_1"


    // $ANTLR start "rule__DataField__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2767:1: rule__DataField__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__DataField__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2771:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2772:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2772:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2773:1: ruleLabel
            {
             before(grammarAccess.getDataFieldAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__DataField__LabelAssignment_15640);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getDataFieldAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataField__LabelAssignment_1"


    // $ANTLR start "rule__ImageField__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2782:1: rule__ImageField__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__ImageField__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2786:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2787:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2787:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2788:1: ruleLabel
            {
             before(grammarAccess.getImageFieldAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__ImageField__LabelAssignment_15671);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getImageFieldAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ImageField__LabelAssignment_1"


    // $ANTLR start "rule__TextField__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2797:1: rule__TextField__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__TextField__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2801:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2802:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2802:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2803:1: ruleLabel
            {
             before(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__TextField__LabelAssignment_15702);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextField__LabelAssignment_1"


    // $ANTLR start "rule__TextArea__LabelAssignment_1"
    // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2812:1: rule__TextArea__LabelAssignment_1 : ( ruleLabel ) ;
    public final void rule__TextArea__LabelAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2816:1: ( ( ruleLabel ) )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2817:1: ( ruleLabel )
            {
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2817:1: ( ruleLabel )
            // ../tudor.lu.modeling.transformation.tauHCI.ui/src-gen/tudor/lu/modeling/transformation/ui/contentassist/antlr/internal/InternalTauHCI.g:2818:1: ruleLabel
            {
             before(grammarAccess.getTextAreaAccess().getLabelLabelParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleLabel_in_rule__TextArea__LabelAssignment_15733);
            ruleLabel();

            state._fsp--;

             after(grammarAccess.getTextAreaAccess().getLabelLabelParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TextArea__LabelAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModel_in_entryRuleModel61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModel68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0_in_ruleModel94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_entryRuleRule121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRule128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0_in_ruleRule154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecific_in_entryRuleSpecific181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSpecific188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__0_in_ruleSpecific214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_entryRuleDomain241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDomain248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0_in_ruleDomain274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValid_in_entryRuleValid301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValid308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Valid__Alternatives_in_ruleValid334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAUIType_in_entryRuleAUIType423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAUIType430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AUIType__Alternatives_in_ruleAUIType456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_entryRuleUIElement483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUIElement490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UIElement__Alternatives_in_ruleUIElement516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_entryRuleAttributeType543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeType550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeType__Alternatives_in_ruleAttributeType576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_entryRuleLabel603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLabel610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Label__Alternatives_in_ruleLabel636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_entryRuleWindow663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWindow670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Group__0_in_ruleWindow696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_entryRulePanel723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePanel730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__0_in_rulePanel756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElementSelector_in_entryRuleListElementSelector783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleListElementSelector790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__0_in_ruleListElementSelector816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_entryRuleConcept843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConcept850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__Alternatives_in_ruleConcept876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectedConcept_in_entryRuleSelectedConcept903 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSelectedConcept910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__0_in_ruleSelectedConcept936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_entryRuleButton963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleButton970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0_in_ruleButton996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataField_in_entryRuleDataField1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDataField1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataField__Group__0_in_ruleDataField1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageField_in_entryRuleImageField1083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImageField1090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageField__Group__0_in_ruleImageField1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_entryRuleTextField1143 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextField1150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0_in_ruleTextField1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextArea_in_entryRuleTextArea1203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTextArea1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextArea__Group__0_in_ruleTextArea1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2_0__0_in_rule__Rule__Alternatives_21272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__InteractivelyValidAssignment_2_1_in_rule__Rule__Alternatives_21290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Valid__Alternatives1324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Valid__Alternatives1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives1460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives1480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives1500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Alternatives1520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__AUIType__Alternatives1555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__AUIType__Alternatives1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__AUIType__Alternatives1595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__AUIType__Alternatives1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWindow_in_rule__UIElement__Alternatives1649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleListElementSelector_in_rule__UIElement__Alternatives1666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleButton_in_rule__UIElement__Alternatives1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePanel_in_rule__UIElement__Alternatives1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDataField_in_rule__UIElement__Alternatives1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImageField_in_rule__UIElement__Alternatives1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextField_in_rule__UIElement__Alternatives1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTextArea_in_rule__UIElement__Alternatives1768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__AttributeType__Alternatives1801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__AttributeType__Alternatives1821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__AttributeType__Alternatives1841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttributeType__Alternatives1861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Label__Alternatives1895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Label__Alternatives1913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Concept__Alternatives1948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Concept__Alternatives1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Concept__SelectionAssignment_2_in_rule__Concept__Alternatives1987 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__Model__Group__0__Impl_in_rule__Model__Group__02019 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_rule__Model__Group__1_in_rule__Model__Group__02022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__RulesAssignment_0_in_rule__Model__Group__0__Impl2049 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__Model__Group__1__Impl_in_rule__Model__Group__12080 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_rule__Model__Group__2_in_rule__Model__Group__12083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__SpecificRulesAssignment_1_in_rule__Model__Group__1__Impl2110 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__Model__Group__2__Impl_in_rule__Model__Group__22141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Model__DomainRulesAssignment_2_in_rule__Model__Group__2__Impl2168 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__0__Impl_in_rule__Rule__Group__02205 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_rule__Rule__Group__1_in_rule__Rule__Group__02208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Rule__Group__0__Impl2236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__1__Impl_in_rule__Rule__Group__12267 = new BitSet(new long[]{0x0000000500001800L});
    public static final BitSet FOLLOW_rule__Rule__Group__2_in_rule__Rule__Group__12270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__AuitypeAssignment_1_in_rule__Rule__Group__1__Impl2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__2__Impl_in_rule__Rule__Group__22327 = new BitSet(new long[]{0x0000000500001800L});
    public static final BitSet FOLLOW_rule__Rule__Group__3_in_rule__Rule__Group__22330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Alternatives_2_in_rule__Rule__Group__2__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__3__Impl_in_rule__Rule__Group__32388 = new BitSet(new long[]{0x0001F34000000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__4_in_rule__Rule__Group__32391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Rule__Group__3__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__4__Impl_in_rule__Rule__Group__42450 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Rule__Group__5_in_rule__Rule__Group__42453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__UielementAssignment_4_in_rule__Rule__Group__4__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group__5__Impl_in_rule__Rule__Group__52510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Rule__Group__5__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2_0__0__Impl_in_rule__Rule__Group_2_0__02581 = new BitSet(new long[]{0x0000000000E00800L});
    public static final BitSet FOLLOW_rule__Rule__Group_2_0__1_in_rule__Rule__Group_2_0__02584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Rule__Group_2_0__0__Impl2612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__Group_2_0__1__Impl_in_rule__Rule__Group_2_0__12643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Rule__TaskTypeAssignment_2_0_1_in_rule__Rule__Group_2_0__1__Impl2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__0__Impl_in_rule__Specific__Group__02704 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Specific__Group__1_in_rule__Specific__Group__02707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Specific__Group__0__Impl2735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__1__Impl_in_rule__Specific__Group__12766 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_rule__Specific__Group__2_in_rule__Specific__Group__12769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__TaskNameAssignment_1_in_rule__Specific__Group__1__Impl2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__2__Impl_in_rule__Specific__Group__22826 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_rule__Specific__Group__3_in_rule__Specific__Group__22829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Specific__Group__2__Impl2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__3__Impl_in_rule__Specific__Group__32891 = new BitSet(new long[]{0x0001F34200000000L});
    public static final BitSet FOLLOW_rule__Specific__Group__4_in_rule__Specific__Group__32894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Specific__Group__3__Impl2922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__4__Impl_in_rule__Specific__Group__42953 = new BitSet(new long[]{0x0001F34200000000L});
    public static final BitSet FOLLOW_rule__Specific__Group__5_in_rule__Specific__Group__42956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Specific__UielementAssignment_4_in_rule__Specific__Group__4__Impl2983 = new BitSet(new long[]{0x0001F34000000002L});
    public static final BitSet FOLLOW_rule__Specific__Group__5__Impl_in_rule__Specific__Group__53014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Specific__Group__5__Impl3042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__0__Impl_in_rule__Domain__Group__03085 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__1_in_rule__Domain__Group__03088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Domain__Group__0__Impl3116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__1__Impl_in_rule__Domain__Group__13147 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__2_in_rule__Domain__Group__13150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__DomainTypeAssignment_1_in_rule__Domain__Group__1__Impl3177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__2__Impl_in_rule__Domain__Group__23207 = new BitSet(new long[]{0x0001F34000000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__3_in_rule__Domain__Group__23210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__Domain__Group__2__Impl3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__3__Impl_in_rule__Domain__Group__33269 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Domain__Group__4_in_rule__Domain__Group__33272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__UielementAssignment_3_in_rule__Domain__Group__3__Impl3299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Domain__Group__4__Impl_in_rule__Domain__Group__43329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Domain__Group__4__Impl3357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Group__0__Impl_in_rule__Window__Group__03398 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__Window__Group__1_in_rule__Window__Group__03401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Window__Group__0__Impl3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Group__1__Impl_in_rule__Window__Group__13460 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__Window__Group__2_in_rule__Window__Group__13463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__LabelAssignment_1_in_rule__Window__Group__1__Impl3490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Group__2__Impl_in_rule__Window__Group__23521 = new BitSet(new long[]{0x0000040060000000L});
    public static final BitSet FOLLOW_rule__Window__Group__3_in_rule__Window__Group__23524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Window__Group__2__Impl3552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__Group__3__Impl_in_rule__Window__Group__33583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Window__ContainedElementsAssignment_3_in_rule__Window__Group__3__Impl3610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__0__Impl_in_rule__Panel__Group__03648 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__Panel__Group__1_in_rule__Panel__Group__03651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Panel__Group__0__Impl3679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__1__Impl_in_rule__Panel__Group__13710 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__Panel__Group__2_in_rule__Panel__Group__13713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__LabelAssignment_1_in_rule__Panel__Group__1__Impl3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__2__Impl_in_rule__Panel__Group__23771 = new BitSet(new long[]{0x0000040060000000L});
    public static final BitSet FOLLOW_rule__Panel__Group__3_in_rule__Panel__Group__23774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Panel__Group__2__Impl3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__Group__3__Impl_in_rule__Panel__Group__33833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Panel__ContainedElementsAssignment_3_in_rule__Panel__Group__3__Impl3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__0__Impl_in_rule__ListElementSelector__Group__03898 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__1_in_rule__ListElementSelector__Group__03901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__ListElementSelector__Group__0__Impl3929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__1__Impl_in_rule__ListElementSelector__Group__13960 = new BitSet(new long[]{0x0000008010000010L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__2_in_rule__ListElementSelector__Group__13963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__LabelAssignment_1_in_rule__ListElementSelector__Group__1__Impl3990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group__2__Impl_in_rule__ListElementSelector__Group__24021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group_2__0_in_rule__ListElementSelector__Group__2__Impl4048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group_2__0__Impl_in_rule__ListElementSelector__Group_2__04085 = new BitSet(new long[]{0x0000040060000000L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group_2__1_in_rule__ListElementSelector__Group_2__04088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__ListElementSelector__Group_2__0__Impl4116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__Group_2__1__Impl_in_rule__ListElementSelector__Group_2__14147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ListElementSelector__ContainedElementsAssignment_2_1_in_rule__ListElementSelector__Group_2__1__Impl4174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__0__Impl_in_rule__SelectedConcept__Group__04208 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__1_in_rule__SelectedConcept__Group__04211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__SelectedConcept__Group__0__Impl4239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__1__Impl_in_rule__SelectedConcept__Group__14270 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__2_in_rule__SelectedConcept__Group__14273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_rule__SelectedConcept__Group__1__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectedConcept__Group__2__Impl_in_rule__SelectedConcept__Group__24332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SelectedConcept__IdAssignment_2_in_rule__SelectedConcept__Group__2__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__0__Impl_in_rule__Button__Group__04395 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__Button__Group__1_in_rule__Button__Group__04398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_rule__Button__Group__0__Impl4426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__Group__1__Impl_in_rule__Button__Group__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Button__LabelAssignment_1_in_rule__Button__Group__1__Impl4484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataField__Group__0__Impl_in_rule__DataField__Group__04519 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__DataField__Group__1_in_rule__DataField__Group__04522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_rule__DataField__Group__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataField__Group__1__Impl_in_rule__DataField__Group__14581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__DataField__LabelAssignment_1_in_rule__DataField__Group__1__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageField__Group__0__Impl_in_rule__ImageField__Group__04643 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__ImageField__Group__1_in_rule__ImageField__Group__04646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_rule__ImageField__Group__0__Impl4674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageField__Group__1__Impl_in_rule__ImageField__Group__14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ImageField__LabelAssignment_1_in_rule__ImageField__Group__1__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__0__Impl_in_rule__TextField__Group__04767 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__TextField__Group__1_in_rule__TextField__Group__04770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_rule__TextField__Group__0__Impl4798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__Group__1__Impl_in_rule__TextField__Group__14829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextField__LabelAssignment_1_in_rule__TextField__Group__1__Impl4856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextArea__Group__0__Impl_in_rule__TextArea__Group__04891 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_rule__TextArea__Group__1_in_rule__TextArea__Group__04894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_rule__TextArea__Group__0__Impl4922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextArea__Group__1__Impl_in_rule__TextArea__Group__14953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__TextArea__LabelAssignment_1_in_rule__TextArea__Group__1__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRule_in_rule__Model__RulesAssignment_05020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecific_in_rule__Model__SpecificRulesAssignment_15051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDomain_in_rule__Model__DomainRulesAssignment_25082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__Rule__AuitypeAssignment_15113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAUIType_in_rule__Rule__TaskTypeAssignment_2_0_15144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValid_in_rule__Rule__InteractivelyValidAssignment_2_15175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_rule__Rule__UielementAssignment_45206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Specific__TaskNameAssignment_15237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_rule__Specific__UielementAssignment_45268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeType_in_rule__Domain__DomainTypeAssignment_15299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUIElement_in_rule__Domain__UielementAssignment_35330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Window__LabelAssignment_15361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Window__ContainedElementsAssignment_35392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Panel__LabelAssignment_15423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__Panel__ContainedElementsAssignment_35454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__ListElementSelector__LabelAssignment_15485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConcept_in_rule__ListElementSelector__ContainedElementsAssignment_2_15516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSelectedConcept_in_rule__Concept__SelectionAssignment_25547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SelectedConcept__IdAssignment_25578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__Button__LabelAssignment_15609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__DataField__LabelAssignment_15640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__ImageField__LabelAssignment_15671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__TextField__LabelAssignment_15702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLabel_in_rule__TextArea__LabelAssignment_15733 = new BitSet(new long[]{0x0000000000000002L});

}