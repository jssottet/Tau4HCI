/**
 * <copyright>
 * </copyright>
 *

 */
package tudor.lu.modeling.transformation.tauHCI.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tudor.lu.modeling.transformation.tauHCI.Domain;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;
import tudor.lu.modeling.transformation.tauHCI.UIElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl#getDomainType <em>Domain Type</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.DomainImpl#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends MinimalEObjectImpl.Container implements Domain
{
  /**
   * The default value of the '{@link #getDomainType() <em>Domain Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainType()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomainType()
   * @generated
   * @ordered
   */
  protected String domainType = DOMAIN_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getUielement() <em>Uielement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUielement()
   * @generated
   * @ordered
   */
  protected UIElement uielement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TauHCIPackage.Literals.DOMAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDomainType()
  {
    return domainType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDomainType(String newDomainType)
  {
    String oldDomainType = domainType;
    domainType = newDomainType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.DOMAIN__DOMAIN_TYPE, oldDomainType, domainType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UIElement getUielement()
  {
    return uielement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUielement(UIElement newUielement, NotificationChain msgs)
  {
    UIElement oldUielement = uielement;
    uielement = newUielement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TauHCIPackage.DOMAIN__UIELEMENT, oldUielement, newUielement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUielement(UIElement newUielement)
  {
    if (newUielement != uielement)
    {
      NotificationChain msgs = null;
      if (uielement != null)
        msgs = ((InternalEObject)uielement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TauHCIPackage.DOMAIN__UIELEMENT, null, msgs);
      if (newUielement != null)
        msgs = ((InternalEObject)newUielement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TauHCIPackage.DOMAIN__UIELEMENT, null, msgs);
      msgs = basicSetUielement(newUielement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.DOMAIN__UIELEMENT, newUielement, newUielement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TauHCIPackage.DOMAIN__UIELEMENT:
        return basicSetUielement(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TauHCIPackage.DOMAIN__DOMAIN_TYPE:
        return getDomainType();
      case TauHCIPackage.DOMAIN__UIELEMENT:
        return getUielement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TauHCIPackage.DOMAIN__DOMAIN_TYPE:
        setDomainType((String)newValue);
        return;
      case TauHCIPackage.DOMAIN__UIELEMENT:
        setUielement((UIElement)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TauHCIPackage.DOMAIN__DOMAIN_TYPE:
        setDomainType(DOMAIN_TYPE_EDEFAULT);
        return;
      case TauHCIPackage.DOMAIN__UIELEMENT:
        setUielement((UIElement)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TauHCIPackage.DOMAIN__DOMAIN_TYPE:
        return DOMAIN_TYPE_EDEFAULT == null ? domainType != null : !DOMAIN_TYPE_EDEFAULT.equals(domainType);
      case TauHCIPackage.DOMAIN__UIELEMENT:
        return uielement != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (domainType: ");
    result.append(domainType);
    result.append(')');
    return result.toString();
  }

} //DomainImpl
