package tudor.lu.modeling.transformation.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import tudor.lu.modeling.transformation.services.TauHCIGrammarAccess;

@SuppressWarnings("restriction")
public class AbstractTauHCISyntacticSequencer extends AbstractSyntacticSequencer {

	protected TauHCIGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Concept_AllConceptsKeyword_0_or_NoConceptsKeyword_1;
	protected AbstractElementAlias match_Specific_InteractivelyValidKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (TauHCIGrammarAccess) access;
		match_Concept_AllConceptsKeyword_0_or_NoConceptsKeyword_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConceptAccess().getAllConceptsKeyword_0()), new TokenAlias(false, false, grammarAccess.getConceptAccess().getNoConceptsKeyword_1()));
		match_Specific_InteractivelyValidKeyword_2_q = new TokenAlias(true, false, grammarAccess.getSpecificAccess().getInteractivelyValidKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_Concept_AllConceptsKeyword_0_or_NoConceptsKeyword_1.equals(syntax))
				emit_Concept_AllConceptsKeyword_0_or_NoConceptsKeyword_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Specific_InteractivelyValidKeyword_2_q.equals(syntax))
				emit_Specific_InteractivelyValidKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     'All Concepts' | 'No Concepts'
	 */
	protected void emit_Concept_AllConceptsKeyword_0_or_NoConceptsKeyword_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     'interactivelyValid'?
	 */
	protected void emit_Specific_InteractivelyValidKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
