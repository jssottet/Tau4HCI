/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Domain#getDomainType <em>Domain Type</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.Domain#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject
{
  /**
   * Returns the value of the '<em><b>Domain Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Domain Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain Type</em>' attribute.
   * @see #setDomainType(String)
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getDomain_DomainType()
   * @model
   * @generated
   */
  String getDomainType();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Domain#getDomainType <em>Domain Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain Type</em>' attribute.
   * @see #getDomainType()
   * @generated
   */
  void setDomainType(String value);

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
   * @see tudor.lu.modeling.transformation.tauHCI.TauHCIPackage#getDomain_Uielement()
   * @model containment="true"
   * @generated
   */
  UIElement getUielement();

  /**
   * Sets the value of the '{@link tudor.lu.modeling.transformation.tauHCI.Domain#getUielement <em>Uielement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uielement</em>' containment reference.
   * @see #getUielement()
   * @generated
   */
  void setUielement(UIElement value);

} // Domain
