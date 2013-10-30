/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import tudor.lu.modeling.transformation.tauHCI.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage
 * @generated
 */
public class TauHCISwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TauHCIPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TauHCISwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TauHCIPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TauHCIPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.RULE:
      {
        Rule rule = (Rule)theEObject;
        T result = caseRule(rule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.SPECIFIC:
      {
        Specific specific = (Specific)theEObject;
        T result = caseSpecific(specific);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.DOMAIN:
      {
        Domain domain = (Domain)theEObject;
        T result = caseDomain(domain);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.UI_ELEMENT:
      {
        UIElement uiElement = (UIElement)theEObject;
        T result = caseUIElement(uiElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.WINDOW:
      {
        Window window = (Window)theEObject;
        T result = caseWindow(window);
        if (result == null) result = caseUIElement(window);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.PANEL:
      {
        Panel panel = (Panel)theEObject;
        T result = casePanel(panel);
        if (result == null) result = caseUIElement(panel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.LIST_ELEMENT_SELECTOR:
      {
        ListElementSelector listElementSelector = (ListElementSelector)theEObject;
        T result = caseListElementSelector(listElementSelector);
        if (result == null) result = caseUIElement(listElementSelector);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.CONCEPT:
      {
        Concept concept = (Concept)theEObject;
        T result = caseConcept(concept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.SELECTED_CONCEPT:
      {
        SelectedConcept selectedConcept = (SelectedConcept)theEObject;
        T result = caseSelectedConcept(selectedConcept);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseUIElement(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.DATA_FIELD:
      {
        DataField dataField = (DataField)theEObject;
        T result = caseDataField(dataField);
        if (result == null) result = caseUIElement(dataField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.IMAGE_FIELD:
      {
        ImageField imageField = (ImageField)theEObject;
        T result = caseImageField(imageField);
        if (result == null) result = caseUIElement(imageField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.TEXT_FIELD:
      {
        TextField textField = (TextField)theEObject;
        T result = caseTextField(textField);
        if (result == null) result = caseUIElement(textField);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TauHCIPackage.TEXT_AREA:
      {
        TextArea textArea = (TextArea)theEObject;
        T result = caseTextArea(textArea);
        if (result == null) result = caseUIElement(textArea);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRule(Rule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Specific</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Specific</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpecific(Specific object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Domain</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDomain(Domain object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>UI Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>UI Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUIElement(UIElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Window</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Window</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWindow(Window object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Panel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Panel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePanel(Panel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>List Element Selector</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>List Element Selector</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseListElementSelector(ListElementSelector object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConcept(Concept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Selected Concept</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Selected Concept</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelectedConcept(SelectedConcept object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataField(DataField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImageField(ImageField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Field</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Field</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextField(TextField object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Text Area</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Text Area</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTextArea(TextArea object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TauHCISwitch
