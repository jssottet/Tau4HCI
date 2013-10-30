/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specific</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Specific#getTaskName <em>Task Name</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Specific#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getSpecific()
 * @model
 * @generated
 */
public interface Specific extends EObject
{
  /**
   * Returns the value of the '<em><b>Task Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Task Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Task Name</em>' attribute.
   * @see #setTaskName(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getSpecific_TaskName()
   * @model
   * @generated
   */
  String getTaskName();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Specific#getTaskName <em>Task Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Task Name</em>' attribute.
   * @see #getTaskName()
   * @generated
   */
  void setTaskName(String value);

  /**
   * Returns the value of the '<em><b>Uielement</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.UIElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uielement</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uielement</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getSpecific_Uielement()
   * @model containment="true"
   * @generated
   */
  EList<UIElement> getUielement();

} // Specific
