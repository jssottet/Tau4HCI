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
 * A representation of the model object '<em><b>Concept</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Concept#getSelection <em>Selection</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getConcept()
 * @model
 * @generated
 */
public interface Concept extends EObject
{
  /**
   * Returns the value of the '<em><b>Selection</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.SelectedConcept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Selection</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selection</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getConcept_Selection()
   * @model containment="true"
   * @generated
   */
  EList<SelectedConcept> getSelection();

} // Concept
