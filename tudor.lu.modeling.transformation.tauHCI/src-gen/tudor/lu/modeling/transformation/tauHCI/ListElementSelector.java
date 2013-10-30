/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element Selector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.ListElementSelector#getContainedElements <em>Contained Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getListElementSelector()
 * @model
 * @generated
 */
public interface ListElementSelector extends UIElement
{
  /**
   * Returns the value of the '<em><b>Contained Elements</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.Concept}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contained Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contained Elements</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getListElementSelector_ContainedElements()
   * @model containment="true"
   * @generated
   */
  EList<Concept> getContainedElements();

} // ListElementSelector
