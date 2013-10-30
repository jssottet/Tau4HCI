/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import tudor.lu.modeling.transformation.tauHCI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage
 * @generated
 */
public class TauHCIAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TauHCIPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TauHCIAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TauHCIPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TauHCISwitch<Adapter> modelSwitch =
    new TauHCISwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseRule(Rule object)
      {
        return createRuleAdapter();
      }
      @Override
      public Adapter caseSpecific(Specific object)
      {
        return createSpecificAdapter();
      }
      @Override
      public Adapter caseDomain(Domain object)
      {
        return createDomainAdapter();
      }
      @Override
      public Adapter caseUIElement(UIElement object)
      {
        return createUIElementAdapter();
      }
      @Override
      public Adapter caseWindow(Window object)
      {
        return createWindowAdapter();
      }
      @Override
      public Adapter casePanel(Panel object)
      {
        return createPanelAdapter();
      }
      @Override
      public Adapter caseListElementSelector(ListElementSelector object)
      {
        return createListElementSelectorAdapter();
      }
      @Override
      public Adapter caseConcept(Concept object)
      {
        return createConceptAdapter();
      }
      @Override
      public Adapter caseSelectedConcept(SelectedConcept object)
      {
        return createSelectedConceptAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseDataField(DataField object)
      {
        return createDataFieldAdapter();
      }
      @Override
      public Adapter caseImageField(ImageField object)
      {
        return createImageFieldAdapter();
      }
      @Override
      public Adapter caseTextField(TextField object)
      {
        return createTextFieldAdapter();
      }
      @Override
      public Adapter caseTextArea(TextArea object)
      {
        return createTextAreaAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Rule <em>Rule</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Rule
   * @generated
   */
  public Adapter createRuleAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Specific <em>Specific</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Specific
   * @generated
   */
  public Adapter createSpecificAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Domain <em>Domain</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Domain
   * @generated
   */
  public Adapter createDomainAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.UIElement <em>UI Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.UIElement
   * @generated
   */
  public Adapter createUIElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Window <em>Window</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Window
   * @generated
   */
  public Adapter createWindowAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Panel <em>Panel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Panel
   * @generated
   */
  public Adapter createPanelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.ListElementSelector <em>List Element Selector</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.ListElementSelector
   * @generated
   */
  public Adapter createListElementSelectorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Concept
   * @generated
   */
  public Adapter createConceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept <em>Selected Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.SelectedConcept
   * @generated
   */
  public Adapter createSelectedConceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.DataField <em>Data Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.DataField
   * @generated
   */
  public Adapter createDataFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.ImageField <em>Image Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.ImageField
   * @generated
   */
  public Adapter createImageFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.TextField <em>Text Field</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.TextField
   * @generated
   */
  public Adapter createTextFieldAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link tudor.lu.modeling.transformation.tauHCI.TextArea <em>Text Area</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see tudor.lu.modeling.transformation.tauHCI.TextArea
   * @generated
   */
  public Adapter createTextAreaAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TauHCIAdapterFactory
