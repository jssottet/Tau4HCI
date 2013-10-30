/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Rule#getAuitype <em>Auitype</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Rule#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Rule#getInteractivelyValid <em>Interactively Valid</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Rule#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Auitype</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Auitype</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Auitype</em>' attribute.
   * @see #setAuitype(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getRule_Auitype()
   * @model
   * @generated
   */
  String getAuitype();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getAuitype <em>Auitype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Auitype</em>' attribute.
   * @see #getAuitype()
   * @generated
   */
  void setAuitype(String value);

  /**
   * Returns the value of the '<em><b>Task Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Type</em>' attribute.
   * @see #setTaskType(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getRule_TaskType()
   * @model
   * @generated
   */
  String getTaskType();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getTaskType <em>Task Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Type</em>' attribute.
   * @see #getTaskType()
   * @generated
   */
  void setTaskType(String value);

  /**
   * Returns the value of the '<em><b>Interactively Valid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interactively Valid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interactively Valid</em>' attribute.
   * @see #setInteractivelyValid(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getRule_InteractivelyValid()
   * @model
   * @generated
   */
  String getInteractivelyValid();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getInteractivelyValid <em>Interactively Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interactively Valid</em>' attribute.
   * @see #getInteractivelyValid()
   * @generated
   */
  void setInteractivelyValid(String value);

  /**
   * Returns the value of the '<em><b>Uielement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uielement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uielement</em>' containment reference.
   * @see #setUielement(UIElement)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getRule_Uielement()
   * @model containment="true"
   * @generated
   */
  UIElement getUielement();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Rule#getUielement <em>Uielement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uielement</em>' containment reference.
   * @see #getUielement()
   * @generated
   */
  void setUielement(UIElement value);

} // Rule
