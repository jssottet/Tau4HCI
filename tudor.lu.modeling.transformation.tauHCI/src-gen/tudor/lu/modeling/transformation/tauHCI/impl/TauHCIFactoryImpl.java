/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import tudor.lu.modeling.transformation.tauHCI.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TauHCIFactoryImpl extends EFactoryImpl implements TauHCIFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TauHCIFactory init()
  {
    try
    {
      TauHCIFactory theTauHCIFactory = (TauHCIFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.lu.tudor/modeling/transformation/TauHCI"); 
      if (theTauHCIFactory != null)
      {
        return theTauHCIFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TauHCIFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TauHCIFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TauHCIPackage.MODEL: return createModel();
      case TauHCIPackage.RULE: return createRule();
      case TauHCIPackage.SPECIFIC: return createSpecific();
      case TauHCIPackage.DOMAIN: return createDomain();
      case TauHCIPackage.UI_ELEMENT: return createUIElement();
      case TauHCIPackage.WINDOW: return createWindow();
      case TauHCIPackage.PANEL: return createPanel();
      case TauHCIPackage.LIST_ELEMENT_SELECTOR: return createListElementSelector();
      case TauHCIPackage.CONCEPT: return createConcept();
      case TauHCIPackage.SELECTED_CONCEPT: return createSelectedConcept();
      case TauHCIPackage.BUTTON: return createButton();
      case TauHCIPackage.DATA_FIELD: return createDataField();
      case TauHCIPackage.IMAGE_FIELD: return createImageField();
      case TauHCIPackage.TEXT_FIELD: return createTextField();
      case TauHCIPackage.TEXT_AREA: return createTextArea();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Specific createSpecific()
  {
    SpecificImpl specific = new SpecificImpl();
    return specific;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domain createDomain()
  {
    DomainImpl domain = new DomainImpl();
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIElement createUIElement()
  {
    UIElementImpl uiElement = new UIElementImpl();
    return uiElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Window createWindow()
  {
    WindowImpl window = new WindowImpl();
    return window;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Panel createPanel()
  {
    PanelImpl panel = new PanelImpl();
    return panel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListElementSelector createListElementSelector()
  {
    ListElementSelectorImpl listElementSelector = new ListElementSelectorImpl();
    return listElementSelector;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept createConcept()
  {
    ConceptImpl concept = new ConceptImpl();
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SelectedConcept createSelectedConcept()
  {
    SelectedConceptImpl selectedConcept = new SelectedConceptImpl();
    return selectedConcept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataField createDataField()
  {
    DataFieldImpl dataField = new DataFieldImpl();
    return dataField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ImageField createImageField()
  {
    ImageFieldImpl imageField = new ImageFieldImpl();
    return imageField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextField createTextField()
  {
    TextFieldImpl textField = new TextFieldImpl();
    return textField;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TextArea createTextArea()
  {
    TextAreaImpl textArea = new TextAreaImpl();
    return textArea;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TauHCIPackage getTauHCIPackage()
  {
    return (TauHCIPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TauHCIPackage getPackage()
  {
    return TauHCIPackage.eINSTANCE;
  }

} //TauHCIFactoryImpl
