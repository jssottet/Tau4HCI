/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage
 * @generated
 */
public interface TauHCIFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TauHCIFactory eINSTANCE = tudor.lu.modeling.transformation.tauHCI.impl.TauHCIFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns a new object of class '<em>Specific</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Specific</em>'.
   * @generated
   */
  Specific createSpecific();

  /**
   * Returns a new object of class '<em>Domain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domain</em>'.
   * @generated
   */
  Domain createDomain();

  /**
   * Returns a new object of class '<em>UI Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>UI Element</em>'.
   * @generated
   */
  UIElement createUIElement();

  /**
   * Returns a new object of class '<em>Window</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Window</em>'.
   * @generated
   */
  Window createWindow();

  /**
   * Returns a new object of class '<em>Panel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Panel</em>'.
   * @generated
   */
  Panel createPanel();

  /**
   * Returns a new object of class '<em>List Element Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Element Selector</em>'.
   * @generated
   */
  ListElementSelector createListElementSelector();

  /**
   * Returns a new object of class '<em>Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept</em>'.
   * @generated
   */
  Concept createConcept();

  /**
   * Returns a new object of class '<em>Selected Concept</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selected Concept</em>'.
   * @generated
   */
  SelectedConcept createSelectedConcept();

  /**
   * Returns a new object of class '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Button</em>'.
   * @generated
   */
  Button createButton();

  /**
   * Returns a new object of class '<em>Data Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Field</em>'.
   * @generated
   */
  DataField createDataField();

  /**
   * Returns a new object of class '<em>Image Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Image Field</em>'.
   * @generated
   */
  ImageField createImageField();

  /**
   * Returns a new object of class '<em>Text Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Field</em>'.
   * @generated
   */
  TextField createTextField();

  /**
   * Returns a new object of class '<em>Text Area</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Text Area</em>'.
   * @generated
   */
  TextArea createTextArea();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  TauHCIPackage getTauHCIPackage();

} //TauHCIFactory
