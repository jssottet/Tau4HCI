/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIFactory
 * @model kind="package"
 * @generated
 */
public interface TauHCIPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tauHCI";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.lu.tudor/modeling/transformation/TauHCI";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tauHCI";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TauHCIPackage eINSTANCE = tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl.init();

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__RULES = 0;

  /**
   * The feature id for the '<em><b>Specific Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__SPECIFIC_RULES = 1;

  /**
   * The feature id for the '<em><b>Domain Rules</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__DOMAIN_RULES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl <em>Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getRule()
   * @generated
   */
  int RULE = 1;

  /**
   * The feature id for the '<em><b>Auitype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__AUITYPE = 0;

  /**
   * The feature id for the '<em><b>Task Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__TASK_TYPE = 1;

  /**
   * The feature id for the '<em><b>Interactively Valid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__INTERACTIVELY_VALID = 2;

  /**
   * The feature id for the '<em><b>Uielement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE__UIELEMENT = 3;

  /**
   * The number of structural features of the '<em>Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RULE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl <em>Specific</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getSpecific()
   * @generated
   */
  int SPECIFIC = 2;

  /**
   * The feature id for the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC__TASK_NAME = 0;

  /**
   * The feature id for the '<em><b>Uielement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC__UIELEMENT = 1;

  /**
   * The number of structural features of the '<em>Specific</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SPECIFIC_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl <em>Domain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getDomain()
   * @generated
   */
  int DOMAIN = 3;

  /**
   * The feature id for the '<em><b>Domain Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__DOMAIN_TYPE = 0;

  /**
   * The feature id for the '<em><b>Uielement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN__UIELEMENT = 1;

  /**
   * The number of structural features of the '<em>Domain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.UIElementImpl <em>UI Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.UIElementImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getUIElement()
   * @generated
   */
  int UI_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT__LABEL = 0;

  /**
   * The number of structural features of the '<em>UI Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UI_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.WindowImpl <em>Window</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.WindowImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getWindow()
   * @generated
   */
  int WINDOW = 5;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__LABEL = UI_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW__CONTAINED_ELEMENTS = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Window</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WINDOW_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.PanelImpl <em>Panel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.PanelImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getPanel()
   * @generated
   */
  int PANEL = 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL__LABEL = UI_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL__CONTAINED_ELEMENTS = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Panel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PANEL_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ListElementSelectorImpl <em>List Element Selector</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.ListElementSelectorImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getListElementSelector()
   * @generated
   */
  int LIST_ELEMENT_SELECTOR = 7;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT_SELECTOR__LABEL = UI_ELEMENT__LABEL;

  /**
   * The feature id for the '<em><b>Contained Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT_SELECTOR__CONTAINED_ELEMENTS = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>List Element Selector</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LIST_ELEMENT_SELECTOR_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ConceptImpl <em>Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.ConceptImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getConcept()
   * @generated
   */
  int CONCEPT = 8;

  /**
   * The feature id for the '<em><b>Selection</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT__SELECTION = 0;

  /**
   * The number of structural features of the '<em>Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONCEPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.SelectedConceptImpl <em>Selected Concept</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.SelectedConceptImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getSelectedConcept()
   * @generated
   */
  int SELECTED_CONCEPT = 9;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTED_CONCEPT__ID = 0;

  /**
   * The number of structural features of the '<em>Selected Concept</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECTED_CONCEPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.ButtonImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 10;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__LABEL = UI_ELEMENT__LABEL;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.DataFieldImpl <em>Data Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.DataFieldImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getDataField()
   * @generated
   */
  int DATA_FIELD = 11;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FIELD__LABEL = UI_ELEMENT__LABEL;

  /**
   * The number of structural features of the '<em>Data Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_FIELD_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ImageFieldImpl <em>Image Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.ImageFieldImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getImageField()
   * @generated
   */
  int IMAGE_FIELD = 12;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FIELD__LABEL = UI_ELEMENT__LABEL;

  /**
   * The number of structural features of the '<em>Image Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FIELD_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.TextFieldImpl <em>Text Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TextFieldImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getTextField()
   * @generated
   */
  int TEXT_FIELD = 13;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD__LABEL = UI_ELEMENT__LABEL;

  /**
   * The number of structural features of the '<em>Text Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_FIELD_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.TextAreaImpl <em>Text Area</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TextAreaImpl
   * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getTextArea()
   * @generated
   */
  int TEXT_AREA = 14;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_AREA__LABEL = UI_ELEMENT__LABEL;

  /**
   * The number of structural features of the '<em>Text Area</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEXT_AREA_FEATURE_COUNT = UI_ELEMENT_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Model#getRules <em>Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Rules</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Model#getRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Rules();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Model#getSpecificRules <em>Specific Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Specific Rules</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Model#getSpecificRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_SpecificRules();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Model#getDomainRules <em>Domain Rules</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Domain Rules</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Model#getDomainRules()
   * @see #getModel()
   * @generated
   */
  EReference getModel_DomainRules();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rule</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule
   * @generated
   */
  EClass getRule();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getAuitype <em>Auitype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Auitype</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule#getAuitype()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_Auitype();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getTaskType <em>Task Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Type</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule#getTaskType()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_TaskType();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getInteractivelyValid <em>Interactively Valid</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interactively Valid</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule#getInteractivelyValid()
   * @see #getRule()
   * @generated
   */
  EAttribute getRule_InteractivelyValid();

  /**
   * Returns the meta object for the containment reference '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getUielement <em>Uielement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uielement</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule#getUielement()
   * @see #getRule()
   * @generated
   */
  EReference getRule_Uielement();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Specific <em>Specific</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Specific</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Specific
   * @generated
   */
  EClass getSpecific();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.Specific#getTaskName <em>Task Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Task Name</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Specific#getTaskName()
   * @see #getSpecific()
   * @generated
   */
  EAttribute getSpecific_TaskName();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Specific#getUielement <em>Uielement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Uielement</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Specific#getUielement()
   * @see #getSpecific()
   * @generated
   */
  EReference getSpecific_Uielement();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domain</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Domain
   * @generated
   */
  EClass getDomain();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.Domain#getDomainType <em>Domain Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Domain Type</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Domain#getDomainType()
   * @see #getDomain()
   * @generated
   */
  EAttribute getDomain_DomainType();

  /**
   * Returns the meta object for the containment reference '{@link tudor.lu.modeling.transformation.tauHCI.Domain#getUielement <em>Uielement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Uielement</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Domain#getUielement()
   * @see #getDomain()
   * @generated
   */
  EReference getDomain_Uielement();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.UIElement <em>UI Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>UI Element</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.UIElement
   * @generated
   */
  EClass getUIElement();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.UIElement#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.UIElement#getLabel()
   * @see #getUIElement()
   * @generated
   */
  EAttribute getUIElement_Label();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Window</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Window
   * @generated
   */
  EClass getWindow();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Window#getContainedElements <em>Contained Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Window#getContainedElements()
   * @see #getWindow()
   * @generated
   */
  EReference getWindow_ContainedElements();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Panel <em>Panel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Panel</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Panel
   * @generated
   */
  EClass getPanel();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Panel#getContainedElements <em>Contained Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Panel#getContainedElements()
   * @see #getPanel()
   * @generated
   */
  EReference getPanel_ContainedElements();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.ListElementSelector <em>List Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>List Element Selector</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.ListElementSelector
   * @generated
   */
  EClass getListElementSelector();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.ListElementSelector#getContainedElements <em>Contained Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contained Elements</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.ListElementSelector#getContainedElements()
   * @see #getListElementSelector()
   * @generated
   */
  EReference getListElementSelector_ContainedElements();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Concept
   * @generated
   */
  EClass getConcept();

  /**
   * Returns the meta object for the containment reference list '{@link tudor.lu.modeling.transformation.tauHCI.Concept#getSelection <em>Selection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Selection</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Concept#getSelection()
   * @see #getConcept()
   * @generated
   */
  EReference getConcept_Selection();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept <em>Selected Concept</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Selected Concept</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.SelectedConcept
   * @generated
   */
  EClass getSelectedConcept();

  /**
   * Returns the meta object for the attribute '{@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.SelectedConcept#getId()
   * @see #getSelectedConcept()
   * @generated
   */
  EAttribute getSelectedConcept_Id();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.DataField <em>Data Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Field</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.DataField
   * @generated
   */
  EClass getDataField();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.ImageField <em>Image Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image Field</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.ImageField
   * @generated
   */
  EClass getImageField();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Field</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.TextField
   * @generated
   */
  EClass getTextField();

  /**
   * Returns the meta object for class '{@link tudor.lu.modeling.transformation.tauHCI.TextArea <em>Text Area</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Text Area</em>'.
   * @see tudor.lu.modeling.transformation.tauHCI.TextArea
   * @generated
   */
  EClass getTextArea();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TauHCIFactory getTauHCIFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.ModelImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__RULES = eINSTANCE.getModel_Rules();

    /**
     * The meta object literal for the '<em><b>Specific Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__SPECIFIC_RULES = eINSTANCE.getModel_SpecificRules();

    /**
     * The meta object literal for the '<em><b>Domain Rules</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__DOMAIN_RULES = eINSTANCE.getModel_DomainRules();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl <em>Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getRule()
     * @generated
     */
    EClass RULE = eINSTANCE.getRule();

    /**
     * The meta object literal for the '<em><b>Auitype</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__AUITYPE = eINSTANCE.getRule_Auitype();

    /**
     * The meta object literal for the '<em><b>Task Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__TASK_TYPE = eINSTANCE.getRule_TaskType();

    /**
     * The meta object literal for the '<em><b>Interactively Valid</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RULE__INTERACTIVELY_VALID = eINSTANCE.getRule_InteractivelyValid();

    /**
     * The meta object literal for the '<em><b>Uielement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RULE__UIELEMENT = eINSTANCE.getRule_Uielement();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl <em>Specific</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.SpecificImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getSpecific()
     * @generated
     */
    EClass SPECIFIC = eINSTANCE.getSpecific();

    /**
     * The meta object literal for the '<em><b>Task Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SPECIFIC__TASK_NAME = eINSTANCE.getSpecific_TaskName();

    /**
     * The meta object literal for the '<em><b>Uielement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SPECIFIC__UIELEMENT = eINSTANCE.getSpecific_Uielement();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl <em>Domain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getDomain()
     * @generated
     */
    EClass DOMAIN = eINSTANCE.getDomain();

    /**
     * The meta object literal for the '<em><b>Domain Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAIN__DOMAIN_TYPE = eINSTANCE.getDomain_DomainType();

    /**
     * The meta object literal for the '<em><b>Uielement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAIN__UIELEMENT = eINSTANCE.getDomain_Uielement();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.UIElementImpl <em>UI Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.UIElementImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getUIElement()
     * @generated
     */
    EClass UI_ELEMENT = eINSTANCE.getUIElement();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UI_ELEMENT__LABEL = eINSTANCE.getUIElement_Label();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.WindowImpl <em>Window</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.WindowImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getWindow()
     * @generated
     */
    EClass WINDOW = eINSTANCE.getWindow();

    /**
     * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference WINDOW__CONTAINED_ELEMENTS = eINSTANCE.getWindow_ContainedElements();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.PanelImpl <em>Panel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.PanelImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getPanel()
     * @generated
     */
    EClass PANEL = eINSTANCE.getPanel();

    /**
     * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PANEL__CONTAINED_ELEMENTS = eINSTANCE.getPanel_ContainedElements();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ListElementSelectorImpl <em>List Element Selector</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.ListElementSelectorImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getListElementSelector()
     * @generated
     */
    EClass LIST_ELEMENT_SELECTOR = eINSTANCE.getListElementSelector();

    /**
     * The meta object literal for the '<em><b>Contained Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LIST_ELEMENT_SELECTOR__CONTAINED_ELEMENTS = eINSTANCE.getListElementSelector_ContainedElements();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ConceptImpl <em>Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.ConceptImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getConcept()
     * @generated
     */
    EClass CONCEPT = eINSTANCE.getConcept();

    /**
     * The meta object literal for the '<em><b>Selection</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONCEPT__SELECTION = eINSTANCE.getConcept_Selection();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.SelectedConceptImpl <em>Selected Concept</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.SelectedConceptImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getSelectedConcept()
     * @generated
     */
    EClass SELECTED_CONCEPT = eINSTANCE.getSelectedConcept();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECTED_CONCEPT__ID = eINSTANCE.getSelectedConcept_Id();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.ButtonImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.DataFieldImpl <em>Data Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.DataFieldImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getDataField()
     * @generated
     */
    EClass DATA_FIELD = eINSTANCE.getDataField();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.ImageFieldImpl <em>Image Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.ImageFieldImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getImageField()
     * @generated
     */
    EClass IMAGE_FIELD = eINSTANCE.getImageField();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.TextFieldImpl <em>Text Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TextFieldImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getTextField()
     * @generated
     */
    EClass TEXT_FIELD = eINSTANCE.getTextField();

    /**
     * The meta object literal for the '{@link tudor.lu.modeling.transformation.tauHCI.impl.TextAreaImpl <em>Text Area</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TextAreaImpl
     * @see tudor.lu.modeling.transformation.tauHCI.impl.TauHCIPackageImpl#getTextArea()
     * @generated
     */
    EClass TEXT_AREA = eINSTANCE.getTextArea();

  }

} //TauHCIPackage
