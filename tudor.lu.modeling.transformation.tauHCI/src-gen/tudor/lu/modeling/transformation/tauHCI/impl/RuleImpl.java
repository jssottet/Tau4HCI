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

import tudor.lu.modeling.transformation.tauHCI.Rule;
import tudor.lu.modeling.transformation.tauHCI.TauHCIPackage;
import tudor.lu.modeling.transformation.tauHCI.UIElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl#getAuitype <em>Auitype</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl#getTaskType <em>Task Type</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl#getInteractivelyValid <em>Interactively Valid</em>}</li>
 *   <li>{@link tudor.lu.modeling.transformation.tauHCI.impl.RuleImpl#getUielement <em>Uielement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RuleImpl extends MinimalEObjectImpl.Container implements Rule
{
  /**
   * The default value of the '{@link #getAuitype() <em>Auitype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuitype()
   * @generated
   * @ordered
   */
  protected static final String AUITYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAuitype() <em>Auitype</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAuitype()
   * @generated
   * @ordered
   */
  protected String auitype = AUITYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskType()
   * @generated
   * @ordered
   */
  protected static final String TASK_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTaskType() <em>Task Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTaskType()
   * @generated
   * @ordered
   */
  protected String taskType = TASK_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getInteractivelyValid() <em>Interactively Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractivelyValid()
   * @generated
   * @ordered
   */
  protected static final String INTERACTIVELY_VALID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInteractivelyValid() <em>Interactively Valid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInteractivelyValid()
   * @generated
   * @ordered
   */
  protected String interactivelyValid = INTERACTIVELY_VALID_EDEFAULT;

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
  protected RuleImpl()
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
    return TauHCIPackage.Literals.RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAuitype()
  {
    return auitype;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAuitype(String newAuitype)
  {
    String oldAuitype = auitype;
    auitype = newAuitype;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.RULE__AUITYPE, oldAuitype, auitype));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTaskType()
  {
    return taskType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTaskType(String newTaskType)
  {
    String oldTaskType = taskType;
    taskType = newTaskType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.RULE__TASK_TYPE, oldTaskType, taskType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInteractivelyValid()
  {
    return interactivelyValid;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInteractivelyValid(String newInteractivelyValid)
  {
    String oldInteractivelyValid = interactivelyValid;
    interactivelyValid = newInteractivelyValid;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.RULE__INTERACTIVELY_VALID, oldInteractivelyValid, interactivelyValid));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TauHCIPackage.RULE__UIELEMENT, oldUielement, newUielement);
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
        msgs = ((InternalEObject)uielement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TauHCIPackage.RULE__UIELEMENT, null, msgs);
      if (newUielement != null)
        msgs = ((InternalEObject)newUielement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TauHCIPackage.RULE__UIELEMENT, null, msgs);
      msgs = basicSetUielement(newUielement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TauHCIPackage.RULE__UIELEMENT, newUielement, newUielement));
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
      case TauHCIPackage.RULE__UIELEMENT:
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
      case TauHCIPackage.RULE__AUITYPE:
        return getAuitype();
      case TauHCIPackage.RULE__TASK_TYPE:
        return getTaskType();
      case TauHCIPackage.RULE__INTERACTIVELY_VALID:
        return getInteractivelyValid();
      case TauHCIPackage.RULE__UIELEMENT:
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
      case TauHCIPackage.RULE__AUITYPE:
        setAuitype((String)newValue);
        return;
      case TauHCIPackage.RULE__TASK_TYPE:
        setTaskType((String)newValue);
        return;
      case TauHCIPackage.RULE__INTERACTIVELY_VALID:
        setInteractivelyValid((String)newValue);
        return;
      case TauHCIPackage.RULE__UIELEMENT:
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
      case TauHCIPackage.RULE__AUITYPE:
        setAuitype(AUITYPE_EDEFAULT);
        return;
      case TauHCIPackage.RULE__TASK_TYPE:
        setTaskType(TASK_TYPE_EDEFAULT);
        return;
      case TauHCIPackage.RULE__INTERACTIVELY_VALID:
        setInteractivelyValid(INTERACTIVELY_VALID_EDEFAULT);
        return;
      case TauHCIPackage.RULE__UIELEMENT:
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
      case TauHCIPackage.RULE__AUITYPE:
        return AUITYPE_EDEFAULT == null ? auitype != null : !AUITYPE_EDEFAULT.equals(auitype);
      case TauHCIPackage.RULE__TASK_TYPE:
        return TASK_TYPE_EDEFAULT == null ? taskType != null : !TASK_TYPE_EDEFAULT.equals(taskType);
      case TauHCIPackage.RULE__INTERACTIVELY_VALID:
        return INTERACTIVELY_VALID_EDEFAULT == null ? interactivelyValid != null : !INTERACTIVELY_VALID_EDEFAULT.equals(interactivelyValid);
      case TauHCIPackage.RULE__UIELEMENT:
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
    result.append(" (auitype: ");
    result.append(auitype);
    result.append(", taskType: ");
    result.append(taskType);
    result.append(", interactivelyValid: ");
    result.append(interactivelyValid);
    result.append(')');
    return result.toString();
  }

} //RuleImpl
