package tudor.lu.modeling.transformation.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import tudor.lu.modeling.transformation.services.TauHCIGrammarAccess;
import tudor.lu.modeling.transformation.tauHCI.Button;
import tudor.lu.modeling.transformation.tauHCI.Concept;
import tudor.lu.modeling.transformation.tauHCI.DataField;
import tudor.lu.modeling.transformation.tauHCI.Domain;
import tudor.lu.modeling.transformation.tauHCI.ImageField;
import tudor.lu.modeling.transformation.tauHCI.ListElementSelector;
import tudor.lu.modeling.transformation.tauHCI.Model;
import tudor.lu.modeling.transformation.tauHCI.Panel;
import tudor.lu.modeling.transformation.tauHCI.Rule;
import tudor.lu.modeling.transformation.tauHCI.SelectedConcept;
import tudor.lu.modeling.transformation.tauHCI.Specific;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;
import tudor.lu.modeling.transformation.tauHCI.TextArea;
import tudor.lu.modeling.transformation.tauHCI.TextField;
import tudor.lu.modeling.transformation.tauHCI.Window;

@SuppressWarnings("restriction")
public class AbstractTauHCISemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected TauHCIGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == TauHCIPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case TauHCIPackage.BUTTON:
				if(context == grammarAccess.getButtonRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_Button(context, (Button) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.CONCEPT:
				if(context == grammarAccess.getConceptRule()) {
					sequence_Concept(context, (Concept) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.DATA_FIELD:
				if(context == grammarAccess.getDataFieldRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_DataField(context, (DataField) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.DOMAIN:
				if(context == grammarAccess.getDomainRule()) {
					sequence_Domain(context, (Domain) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.IMAGE_FIELD:
				if(context == grammarAccess.getImageFieldRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_ImageField(context, (ImageField) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.LIST_ELEMENT_SELECTOR:
				if(context == grammarAccess.getListElementSelectorRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_ListElementSelector(context, (ListElementSelector) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.MODEL:
				if(context == grammarAccess.getModelRule()) {
					sequence_Model(context, (Model) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.PANEL:
				if(context == grammarAccess.getPanelRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_Panel(context, (Panel) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.RULE:
				if(context == grammarAccess.getRuleRule()) {
					sequence_Rule(context, (Rule) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.SELECTED_CONCEPT:
				if(context == grammarAccess.getSelectedConceptRule()) {
					sequence_SelectedConcept(context, (SelectedConcept) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.SPECIFIC:
				if(context == grammarAccess.getSpecificRule()) {
					sequence_Specific(context, (Specific) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.TEXT_AREA:
				if(context == grammarAccess.getTextAreaRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_TextArea(context, (TextArea) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.TEXT_FIELD:
				if(context == grammarAccess.getTextFieldRule() ||
				   context == grammarAccess.getUIElementRule()) {
					sequence_TextField(context, (TextField) semanticObject); 
					return; 
				}
				else break;
			case TauHCIPackage.WINDOW:
				if(context == grammarAccess.getUIElementRule() ||
				   context == grammarAccess.getWindowRule()) {
					sequence_Window(context, (Window) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     label=Label
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getButtonAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     selection+=SelectedConcept*
	 *
	 * Features:
	 *    selection[0, *]
	 */
	protected void sequence_Concept(EObject context, Concept semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     label=Label
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_DataField(EObject context, DataField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataFieldAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (domainType=AttributeType uielement=UIElement)
	 *
	 * Features:
	 *    domainType[1, 1]
	 *    uielement[1, 1]
	 */
	protected void sequence_Domain(EObject context, Domain semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.DOMAIN__DOMAIN_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.DOMAIN__DOMAIN_TYPE));
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.DOMAIN__UIELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.DOMAIN__UIELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDomainAccess().getDomainTypeAttributeTypeParserRuleCall_1_0(), semanticObject.getDomainType());
		feeder.accept(grammarAccess.getDomainAccess().getUielementUIElementParserRuleCall_3_0(), semanticObject.getUielement());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     label=Label
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_ImageField(EObject context, ImageField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImageFieldAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? containedElements+=Concept?)
	 *
	 * Features:
	 *    label[0, 1]
	 *    containedElements[0, 1]
	 */
	protected void sequence_ListElementSelector(EObject context, ListElementSelector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rules+=Rule* specificRules+=Specific* domainRules+=Domain*)
	 *
	 * Features:
	 *    rules[0, *]
	 *    specificRules[0, *]
	 *    domainRules[0, *]
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? containedElements+=Concept)
	 *
	 * Features:
	 *    label[0, 1]
	 *    containedElements[1, 1]
	 */
	protected void sequence_Panel(EObject context, Panel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (auitype=Type (taskType=AUIType | interactivelyValid=Valid)? uielement=UIElement)
	 *
	 * Features:
	 *    auitype[1, 1]
	 *    taskType[0, 1]
	 *         EXCLUDE_IF_SET interactivelyValid
	 *    interactivelyValid[0, 1]
	 *         EXCLUDE_IF_SET taskType
	 *    uielement[1, 1]
	 */
	protected void sequence_Rule(EObject context, Rule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ID
	 *
	 * Features:
	 *    id[1, 1]
	 */
	protected void sequence_SelectedConcept(EObject context, SelectedConcept semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.SELECTED_CONCEPT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.SELECTED_CONCEPT__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSelectedConceptAccess().getIdIDTerminalRuleCall_2_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (taskName=STRING uielement+=UIElement*)
	 *
	 * Features:
	 *    taskName[1, 1]
	 *    uielement[0, *]
	 */
	protected void sequence_Specific(EObject context, Specific semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     label=Label
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_TextArea(EObject context, TextArea semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextAreaAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     label=Label
	 *
	 * Features:
	 *    label[1, 1]
	 */
	protected void sequence_TextField(EObject context, TextField semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, TauHCIPackage.Literals.UI_ELEMENT__LABEL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTextFieldAccess().getLabelLabelParserRuleCall_1_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (label=Label? containedElements+=Concept)
	 *
	 * Features:
	 *    label[0, 1]
	 *    containedElements[1, 1]
	 */
	protected void sequence_Window(EObject context, Window semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
