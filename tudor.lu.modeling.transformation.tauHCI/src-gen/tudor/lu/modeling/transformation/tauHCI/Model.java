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
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Model#getRules <em>Rules</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Model#getSpecificRules <em>Specific Rules</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Model#getDomainRules <em>Domain Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.Rule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getModel_Rules()
   * @model containment="true"
   * @generated
   */
  EList<Rule> getRules();

  /**
   * Returns the value of the '<em><b>Specific Rules</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.Specific}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specific Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specific Rules</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getModel_SpecificRules()
   * @model containment="true"
   * @generated
   */
  EList<Specific> getSpecificRules();

  /**
   * Returns the value of the '<em><b>Domain Rules</b></em>' containment reference list.
   * The list contents are of type {@link tudor.lu.modeling.transformation.tauHCI.Domain}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Rules</em>' containment reference list.
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getModel_DomainRules()
   * @model containment="true"
   * @generated
   */
  EList<Domain> getDomainRules();

} // Model
