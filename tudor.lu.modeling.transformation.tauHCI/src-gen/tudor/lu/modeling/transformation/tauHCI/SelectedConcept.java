/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Selected Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getSelectedConcept()
 * @model
 * @generated
 */
public interface SelectedConcept extends EObject
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getSelectedConcept_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

} // SelectedConcept
